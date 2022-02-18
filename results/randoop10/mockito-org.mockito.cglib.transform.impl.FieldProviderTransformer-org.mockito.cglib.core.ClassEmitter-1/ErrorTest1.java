import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "g.mockito.cglib.core.ClassEmitter");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int14 = type13.getSort();
        int int15 = type13.getSize();
        boolean boolean16 = signature12.equals((java.lang.Object) type13);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Type[] typeArray30 = signature28.getArgumentTypes();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class((int) (short) 0, 158, "g/mockito/cglib/core/ClassEmitter", type13, typeArray30, "int");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter7.getSuperType();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        java.lang.String str13 = type12.getClassName();
        int int14 = type12.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = signature22.getName();
        org.mockito.asm.Type[] typeArray25 = signature22.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.begin_class(4, 100, "JZ(JC)Z", type12, typeArray25, "short");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter1.visitAnnotation("", true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "(JC)V", "char", "Z(JC)Z", "V" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(105, (-1), "LS;", "(JC)Z", "Z(JC)Z", strArray17);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) 1);
        int int4 = type0.getOpcode(7);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("(JC)V", false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "V");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int11 = type0.getSort();
        int int13 = type0.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type0.getDimensions();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.end_class();
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitEnd();
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(130, 1, "(JC)LJ;", "double", "(JC)Lorg/mockito/asm/Type;", strArray11);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter8.visitAnnotation("LJ;", true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("g/mockito/cglib/core/ClassEmitter", "S");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter0.visitAnnotation("boolean", false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(2);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter4.visitAnnotation("(JC)Lorg/mockito/asm/Type;", true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "(JC)S", "J", "LJ;", "L(JC)C;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(3, 158, "Z", "org/mockito/cglib/core/ClassEmitter", "boolean", strArray12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        boolean boolean12 = type9.equals((java.lang.Object) 155);
        java.lang.String str13 = type9.getClassName();
        java.lang.String str14 = type9.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = signature22.getName();
        org.mockito.asm.Type[] typeArray25 = signature22.getArgumentTypes();
        java.lang.String str26 = signature22.getDescriptor();
        org.mockito.asm.Type type27 = signature22.getReturnType();
        org.mockito.asm.Type[] typeArray28 = signature22.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.begin_class((int) ' ', 155, "org.mockito.cglib.core.ClassEmitter", type9, typeArray28, "void");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("D", "org/mockito/cglib/core/ClassEmitter(JC)C", "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("", "g.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter1.visitField(128, "C", "Lg/mockito/cglib/core/ClassEmitter;", "[Lorg/mockito/asm/Type;", (java.lang.Object) type11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("D");
        boolean boolean6 = type0.equals((java.lang.Object) "D");
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter4.getSuperType();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        java.lang.Class<?> wildcardClass12 = classEmitter7.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(96, "int", type17, (java.lang.Object) classEmitter26);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type type13 = signature12.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(128, 96, "(JC)S", type13, typeArray37, "(JC)V");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray16 = new java.lang.String[] { "void", "S", "g.mockito.cglib.core.ClassEmitter", "LJ;", "org/mockito/cglib/core/ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(9, 104, "JZ(JC)Z", "org/mockito/cglib/core/Signature", "org/mockito/asm/Type", strArray16);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitOuterClass("", "int", "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z(JC)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Z", type10, typeArray15);
        org.mockito.asm.Type type17 = signature16.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter2.visitField((int) '4', "(JC)L(JC)C;", "[Lorg/mockito/asm/Type;", "short", (java.lang.Object) type17);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.getDescriptor();
        java.lang.String str17 = signature14.toString();
        java.lang.String str18 = signature14.getName();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        org.mockito.asm.Type[] typeArray20 = signature14.getArgumentTypes();
        org.mockito.asm.Type type21 = signature14.getReturnType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        int int34 = type23.getSort();
        int int35 = type23.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("Z", type37, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type23, typeArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(8, 3, "", type21, typeArray42, "(JC)D");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = classEmitter8.getSuperType();
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classAdapter5.visitAnnotation("(JC)S", false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitEnd();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str12 = type11.getInternalName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type11, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class((int) (byte) 0, (int) (short) -1, "J", type23, typeArray34, "LS;");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter3.visitAnnotation("Z", true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("(JC)LJ;", "org/mockito/asm/Type");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("Z", type5, typeArray10);
        org.mockito.asm.Type[] typeArray12 = signature11.getArgumentTypes();
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type16, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type1, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type1.getInternalName();
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.getDescriptor();
        java.lang.String str17 = signature14.toString();
        java.lang.String str18 = signature14.getName();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        int int20 = type19.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type22, typeArray34);
        java.lang.String str37 = signature36.getName();
        org.mockito.asm.Type[] typeArray38 = signature36.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(10, (int) (short) 1, "double", type19, typeArray38, "org/mockito/asm/Type");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visit((int) (short) 10, 124, "double", "(JC)L(JC)C;", "org/mockito/cglib/core/Signature", strArray9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter2.getSuperType();
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = fieldProviderTransformer0.getStaticHook();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L(JC)C;", "L(JC)C;");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Z", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        int int16 = type5.getDimensions();
        java.lang.String str17 = type5.getInternalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(2, "(JC)LJ;", type5, (java.lang.Object) "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (byte) 1, 108, "[Lorg/mockito/asm/Type;", "J", "(JC)D", strArray9);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray17 = new java.lang.String[] { "(JC)LJ;", "org/mockito/cglib/core/ClassEmitter", "boolean", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visit(112, 7, "C", "(JC)S", "(JC)J", strArray17);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter2.getAccess();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter1.visitAnnotation("double", true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        java.lang.Class<?> wildcardClass15 = type8.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classAdapter1.visitField((int) (byte) 10, "Lg/mockito/cglib/core/ClassEmitter;", "C", "boolean", (java.lang.Object) wildcardClass15);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = signature14.getDescriptor();
        java.lang.String str17 = signature14.toString();
        java.lang.String str18 = signature14.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(JC)C");
        boolean boolean21 = signature14.equals((java.lang.Object) type20);
        java.lang.String str22 = type20.getInternalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter2.visitField((int) '#', "", "Lorg/mockito/cglib/core/ClassEmitter;", "(JC)D", (java.lang.Object) str22);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitInnerClass("Z(JC)Z", "(JC)J", "g.mockito.cglib.core.ClassEmitter", 157);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = fieldProviderTransformer0.getClassType();
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("(JC)V", "Lorg/mockito/asm/Type;", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("boolean", "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("(JC)J", false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("org/mockito/cglib/core/Signature", "g/mockito/cglib/core/ClassEmitter", "", (int) (short) 0);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter6.visitAnnotation("C", false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray11 = new java.lang.String[] { "g/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter", "Lmockito/cglib/core/ClassEmitter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((int) 'a', 0, "C", "LJ;", "short", strArray11);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(7, 1, "org/mockito/cglib/core/Signature", "(JC)V", "hi!", strArray9);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode((int) (byte) 1);
        int int16 = type12.getOpcode(7);
        java.lang.String str17 = type12.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        java.lang.String str27 = signature25.getDescriptor();
        java.lang.String str28 = signature25.toString();
        java.lang.String str29 = signature25.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field((int) (short) 100, "(JC)D", type12, (java.lang.Object) signature25);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visitEnd();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = fieldProviderTransformer0.getSuperType();
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor16 = classAdapter1.visitField(128, "(JC)LJ;", "V", "LJ;", (java.lang.Object) classEmitter11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "JZ(JC)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(108, 15, "org/mockito/cglib/core/ClassEmitter(JC)C", "Lorg/mockito/asm/Type;", "D", strArray13);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter1.visitAnnotation("Lorg/mockito/cglib/core/ClassEmitter;", true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(JC)S", "Lmockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter0.visitAnnotation("short", true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray17 = new java.lang.String[] { "S", "(JC)S", "(JC)S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(3, 104, "Lorg/mockito/asm/Type;", "org/mockito/cglib/core/ClassEmitter", "JZ(JC)Z", strArray17);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitSource("(JC)D", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter0.getSuperType();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        boolean boolean22 = type10.equals((java.lang.Object) type21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type24.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("Z", type29, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type24, typeArray36);
        int int40 = type24.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field((int) (byte) 100, "mockito/cglib/core/ClassEmitter", type21, (java.lang.Object) (short) -1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("Lmockito/cglib/core/ClassEmitter;", "int");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter12.getClassType();
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = signature18.getDescriptor();
        java.lang.String str21 = signature18.toString();
        java.lang.String str22 = signature18.getDescriptor();
        org.mockito.asm.Type type23 = signature18.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor24 = fieldProviderTransformer0.visitField((int) '#', "[Lorg/mockito/asm/Type;", "Z(JC)Z", "(JC)J", (java.lang.Object) type23);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("char", "V", "org/mockito/cglib/core/ClassEmitter(JC)C", 112);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("I", true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter7.visitAnnotation("S", true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter16.visitOuterClass("(JC)L(JC)C;", "(JC)J", "Z");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("(JC)S", "C", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("Lmockito/cglib/core/ClassEmitter;", "(JC)Z", "(JC)Lorg/mockito/asm/Type;", (-1));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass8 = classEmitter7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter2.visitField(105, "(JC)C", "L(JC)C;", "g.mockito.cglib.core.ClassEmitter", (java.lang.Object) wildcardClass8);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) ' ', (int) (short) 0, "Lmockito/cglib/core/ClassEmitter;", "LJ;", "g/mockito/cglib/core/ClassEmitter", strArray14);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("I", "char");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("long", "org/mockito/cglib/core/ClassEmitter", "(JC)Z");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter9.getClassType();
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.end_class();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("V", "g/mockito/cglib/core/ClassEmitter", "double", 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str12 = type11.getInternalName();
        int int14 = type11.getOpcode(0);
        java.lang.String str15 = type11.getInternalName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type17, typeArray29);
        java.lang.String str32 = signature31.toString();
        java.lang.String str33 = signature31.getDescriptor();
        org.mockito.asm.Type[] typeArray34 = signature31.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(0, 130, "J", type11, typeArray34, "JZ(JC)Z");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitSource("(JC)L(JC)C;", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("C", "Z", "long");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classAdapter7.visitAnnotation("", true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("S", "J");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("g/mockito/cglib/core/ClassEmitter", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "LJ;", 128);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = type0.equals((java.lang.Object) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("(JC)Lorg/mockito/cglib/core/ClassEmitter;", "Z", "char");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("JZ(JC)Z", true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray16 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "D" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(0, (int) (byte) 10, "(JC)L(JC)C;", "(JC)L(JC)C;", "", strArray16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("int", "(JC)Lorg/mockito/asm/Type;", "(JC)S", (int) (short) 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.String str17 = type6.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        java.lang.String str30 = type19.getClassName();
        int int32 = type19.getOpcode((int) (short) -1);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = signature40.getDescriptor();
        java.lang.String str43 = signature40.toString();
        java.lang.String str44 = signature40.getName();
        org.mockito.asm.Type type45 = signature40.getReturnType();
        org.mockito.asm.Type[] typeArray46 = signature40.getArgumentTypes();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("LJ;", type19, typeArray46);
        org.mockito.asm.Type type48 = signature47.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(124, "Lorg/mockito/asm/Type;", type6, (java.lang.Object) signature47);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("Z", "(JC)Lorg/mockito/asm/Type;", "", 3);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitEnd();
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass8 = classEmitter7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = type9.getElementType();
        boolean boolean12 = type10.equals((java.lang.Object) "(JC)L(JC)C;");
        java.lang.String str13 = type10.toString();
        java.lang.String str14 = type10.getDescriptor();
        int int15 = type10.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(6, "booleanZ", type6, (java.lang.Object) int15);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) 155);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitOuterClass("", "V", "(JC)LJ;");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("D", "", "Z");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor11 = classAdapter5.visitField((int) (short) 0, "long", "LJ;", "org/mockito/cglib/core/Signature", (java.lang.Object) "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("void", true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type21 = type20.getElementType();
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(JC)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.begin_class(108, 6, "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", type21, typeArray24, "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("Z");
        java.lang.String str6 = type5.getClassName();
        boolean boolean8 = type5.equals((java.lang.Object) 5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        int int21 = type10.getSort();
        int int22 = type10.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type10, typeArray29);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = signature31.getDescriptor();
        java.lang.String str34 = signature31.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(104, "I", type5, (java.lang.Object) signature31);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = fieldProviderTransformer3.visitAnnotation("char", false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = signature20.getDescriptor();
        java.lang.String str23 = signature20.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        boolean boolean28 = signature20.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = signature20.getReturnType();
        boolean boolean31 = type29.equals((java.lang.Object) "hi!");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type38, typeArray43);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type33, typeArray45);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class((int) (short) -1, 101, "boolean", type29, typeArray48, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray14 = new java.lang.String[] { "I", "(JC)J" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(2, 156, "Lg/mockito/cglib/core/ClassEmitter;", "short", "LS;", strArray14);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("char", "(JC)LJ;", "hi!");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "void" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visit(96, 157, "short", "org.mockito.cglib.core.ClassEmitter", "org/mockito/asm/Type", strArray12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass7 = classEmitter6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = type8.getElementType();
        boolean boolean11 = type9.equals((java.lang.Object) "(JC)L(JC)C;");
        org.mockito.asm.Type type12 = type9.getElementType();
        int int13 = type12.getSize();
        org.mockito.asm.Type type14 = type12.getElementType();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer18.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter16.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(154, "double", type12, (java.lang.Object) classEmitter16);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter16.visitField(116, "booleanZ", "V", "C", (java.lang.Object) 2);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.end_class();
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("double", "org/mockito/cglib/core/ClassEmitter", "LJ;");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classAdapter1.visitAnnotation("Lg/mockito/cglib/core/ClassEmitter;", true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("longD", "(JC)S");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray14 = new java.lang.String[] { "I", "hi!", "V", "(JC)D", "S", "S" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(15, 156, "", "LJ;", "g.mockito.cglib.core.ClassEmitter", strArray14);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitOuterClass("V", "mockito/cglib/core/ClassEmitter", "double");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JC)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "double", "J", "double" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(1, (int) '#', "(JC)J", "LS;", "", strArray13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray14 = new java.lang.String[] { "Lg/mockito/cglib/core/ClassEmitter;", "int", "double", "booleanZ", "Lg/mockito/cglib/core/ClassEmitter;", "longD" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit((int) '4', 104, "(JC)Z", "void", "Lorg/mockito/asm/Type;", strArray14);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter4.visitAnnotation("Lorg/mockito/asm/Type;", false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Z", type20, typeArray25);
        org.mockito.asm.Type[] typeArray27 = signature26.getArgumentTypes();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        java.lang.String str29 = type18.getClassName();
        int int31 = type18.getOpcode((int) (short) -1);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("Z", type33, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        java.lang.String str41 = signature39.getDescriptor();
        java.lang.String str42 = signature39.toString();
        java.lang.String str43 = signature39.getName();
        org.mockito.asm.Type type44 = signature39.getReturnType();
        org.mockito.asm.Type[] typeArray45 = signature39.getArgumentTypes();
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("LJ;", type18, typeArray45);
        org.mockito.asm.Type type47 = signature46.getReturnType();
        java.lang.String str48 = type47.toString();
        boolean boolean49 = type7.equals((java.lang.Object) type47);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("Z", type55, typeArray60);
        org.mockito.asm.Type type62 = signature61.getReturnType();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(100, (int) (byte) -1, "(JC)Lorg/mockito/cglib/core/ClassEmitter;", type7, typeArray63, "long");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSort();
        int int12 = type9.getSort();
        org.mockito.asm.Type[] typeArray14 = org.mockito.asm.Type.getArgumentTypes("(JC)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class((int) (short) 100, (int) (short) 100, "org/mockito/asm/Type", type9, typeArray14, "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getClassType();
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitInnerClass("", "long", "V", 100);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter10.visitOuterClass("(JC)Lorg/mockito/cglib/core/ClassEmitter;", "hi!", "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitEnd();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("int", true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(JC)D", "(JC)V", "J", (int) ' ');
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSort();
        int int13 = type10.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type19, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("Z", type35, typeArray40);
        org.mockito.asm.Type[] typeArray42 = signature41.getArgumentTypes();
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", type30, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("Z", type15, typeArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.begin_class(157, (int) (short) 0, "LS;", type10, typeArray42, "L(JC)C;");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("S", "g.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classAdapter3.visitAnnotation("V", false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("S", false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classAdapter1.visitAnnotation("void", false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("boolean", "Z");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitEnd();
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = fieldProviderTransformer0.visitAnnotation("(JC)L(JC)C;", true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("D");
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getClassName();
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type14.getOpcode((int) (byte) 1);
        int int18 = type14.getOpcode(7);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str22 = type21.getInternalName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type21, typeArray31);
        java.lang.Class<?> wildcardClass33 = typeArray31.getClass();
        boolean boolean34 = type14.equals((java.lang.Object) wildcardClass33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.asm.Type.getArgumentTypes("(JC)C");
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.begin_class(124, (int) (byte) 0, "g.mockito.cglib.core.ClassEmitter", type10, typeArray36, "org/mockito/asm/Type");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray21 = new java.lang.String[] { "g.mockito.cglib.core.ClassEmitter", "org/mockito/asm/Type", "[Lorg/mockito/asm/Type;", "Lmockito/cglib/core/ClassEmitter;", "(JC)LJ;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visit(156, 100, "(JC)Lorg/mockito/asm/Type;", "double", "(JC)Z", strArray21);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = signature24.getDescriptor();
        org.mockito.asm.Type type29 = signature24.getReturnType();
        java.lang.String str30 = signature24.getDescriptor();
        boolean boolean32 = signature24.equals((java.lang.Object) 153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter4.visitField((int) (byte) 100, "(JC)V", "[Lorg/mockito/asm/Type;", "Lmockito/cglib/core/ClassEmitter;", (java.lang.Object) signature24);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        boolean boolean16 = type9.equals((java.lang.Object) classAdapter15);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo26 = fieldProviderTransformer25.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        java.lang.Class<?> wildcardClass28 = classEmitter23.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor33 = classEmitter0.visitField(4, "(JC)LJ;", "LLorg/mockito/cglib/core/ClassEmitter;;", "g.mockito.cglib.core.ClassEmitter", (java.lang.Object) wildcardClass28);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter12.visitEnd();
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray27 = new java.lang.String[] { "org/mockito/cglib/core/ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "org/mockito/asm/Type", "V", "void" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visit(6, (int) (byte) 0, "D", "mockito/cglib/core/ClassEmitter", "", strArray27);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) (byte) 10, 0, "", "[Lorg/mockito/asm/Type;", "J", strArray11);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("Z", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "LS;", 105);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(7, (int) 'a', "(JC)LJ;", "(JC)LJ;", "(JC)Z", strArray7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray14 = new java.lang.String[] { "LS;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(134, (int) (byte) 0, "hi!", "C", "char", strArray14);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visitOuterClass("JZ(JC)Z", "(JC)S", "(JC)L(JC)C;");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassInfo classInfo20 = fieldProviderTransformer16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter4.visitField(157, "I", "Z", "(JC)Lorg/mockito/asm/Type;", (java.lang.Object) classEmitter24);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("org/mockito/cglib/core/ClassEmitter(JC)C", "booleanZ");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("LJ;", "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("J", "Z(JC)Z");
        java.lang.String str14 = signature13.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter6.visitField(157, "LJ;", "JZ(JC)Z", "Z", (java.lang.Object) signature13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter1.visitField((int) (short) -1, "double", "JZ(JC)Z", "char", (java.lang.Object) '#');
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = fieldProviderTransformer0.visitAnnotation("LS;", false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        int int30 = type19.getDimensions();
        java.lang.String str31 = type19.getInternalName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type38, typeArray43);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type33, typeArray45);
        int int49 = type33.getOpcode((int) (short) -1);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str51 = type50.getClassName();
        boolean boolean52 = type33.equals((java.lang.Object) type50);
        boolean boolean53 = type19.equals((java.lang.Object) type33);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type57, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("Z", type55, typeArray60);
        org.mockito.asm.Type[] typeArray62 = signature61.getArgumentTypes();
        java.lang.Class<?> wildcardClass63 = signature61.getClass();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        java.lang.String str65 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field((int) (byte) 1, "(JC)LJ;", type33, (java.lang.Object) wildcardClass63);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter3.getAccess();
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter1.getStaticHook();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(130, "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", type4, (java.lang.Object) classEmitter6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("LJ;", true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("(JC)C", "", "longD");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("org.mockito.cglib.core.ClassEmitter", "(JC)L(JC)C;");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass15 = classEmitter14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = type16.getElementType();
        boolean boolean19 = type17.equals((java.lang.Object) "(JC)L(JC)C;");
        org.mockito.asm.Type type20 = type17.getElementType();
        int int21 = type20.getSize();
        org.mockito.asm.Type type22 = type20.getElementType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        int int35 = type24.getSort();
        int int36 = type24.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type38, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type24, typeArray43);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        java.lang.String str47 = signature45.getDescriptor();
        java.lang.String str48 = signature45.toString();
        org.mockito.asm.Type[] typeArray49 = signature45.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class(130, (-1), "LS;", type20, typeArray49, "int");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("short", "", "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(JC)Z", "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type14.getOpcode((int) (byte) 1);
        int int18 = type14.getOpcode(7);
        java.lang.String str19 = type14.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Z", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        boolean boolean39 = signature28.equals((java.lang.Object) signature37);
        java.lang.String str40 = signature28.getName();
        org.mockito.asm.Type type41 = signature28.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("Z", type43, typeArray48);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        java.lang.String str51 = signature49.getDescriptor();
        java.lang.String str52 = signature49.toString();
        java.lang.String str53 = signature49.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("(JC)C");
        boolean boolean56 = signature49.equals((java.lang.Object) type55);
        org.mockito.asm.Type[] typeArray57 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type41, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(2, (int) (short) -1, "C", type14, typeArray57, "mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer9.visitSource("(JC)S", "Z");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("char", false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "org/mockito/cglib/core/Signature", "g.mockito.cglib.core.ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit((-1), 112, "Lorg/mockito/asm/Type;", "Z(JC)Z", "org/mockito/cglib/core/ClassEmitter(JC)C", strArray10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L(JC)C;", "", "V");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("g.mockito.cglib.core.ClassEmitter", true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter12.visitEnd();
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = fieldProviderTransformer3.getClassType();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        org.mockito.asm.Type type23 = signature19.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type26.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Z", type31, typeArray36);
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type26, typeArray38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type42.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("Z", type47, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type42, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("S", type26, typeArray54);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor59 = classEmitter5.visitField((int) (byte) 0, "C", "[Lorg/mockito/asm/Type;", "void", (java.lang.Object) type23);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("(JC)Lorg/mockito/cglib/core/ClassEmitter;", false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) 155);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter9.getClassType();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter1.getClassType();
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter2.visitInnerClass("J", "(JC)LJ;", "booleanZ", 130);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("booleanZ", "J", "longD", 4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        java.lang.String[] strArray22 = new java.lang.String[] { "double" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visit(112, 108, "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "mockito/cglib/core/ClassEmitter", "", strArray22);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        boolean boolean11 = type8.equals((java.lang.Object) 155);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        boolean boolean19 = type8.equals((java.lang.Object) classEmitter17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        java.lang.String str30 = signature27.toString();
        org.mockito.asm.Type type31 = signature27.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass33 = classEmitter32.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        boolean boolean35 = signature27.equals((java.lang.Object) type34);
        org.mockito.asm.Type type36 = type34.getElementType();
        int int38 = type36.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(9, "S", type8, (java.lang.Object) int38);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        boolean boolean16 = type9.equals((java.lang.Object) classAdapter15);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classAdapter15.visitAnnotation("L(JC)C;", true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type16 = type15.getElementType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        java.lang.String str26 = signature24.getDescriptor();
        java.lang.String str27 = signature24.toString();
        java.lang.String str28 = signature24.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("(JC)C");
        boolean boolean31 = signature24.equals((java.lang.Object) type30);
        org.mockito.asm.Type[] typeArray32 = signature24.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class((int) (short) 10, (int) (byte) 100, "LLorg/mockito/cglib/core/ClassEmitter;;", type15, typeArray32, "(JC)C");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        java.lang.String[] strArray15 = new java.lang.String[] { "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) 'a', (int) (short) 0, "longD", "C", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", strArray15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = fieldProviderTransformer0.visitAnnotation("double", false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("hi!", "double", "mockito/cglib/core/ClassEmitter", (int) (short) 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("(JC)V", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "(JC)LJ;", (int) (byte) 10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "g/mockito/cglib/core/ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(155, (int) (byte) 1, "J", "char", "void", strArray14);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitInnerClass("(JC)D", "mockito/cglib/core/ClassEmitter", "short", 155);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.end_class();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("char", "double", "", (int) (short) 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type1.getElementType();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.getStaticHook();
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("g/mockito/cglib/core/ClassEmitter", "(JC)S", "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) 155);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = type0.equals((java.lang.Object) classEmitter9);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type18 = type17.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter9.visitField((int) (byte) 10, "org/mockito/cglib/core/Signature", "(JC)L(JC)C;", "JZ(JC)Z", (java.lang.Object) type17);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Z", type7, typeArray12);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        boolean boolean17 = signature13.equals((java.lang.Object) 104);
        boolean boolean19 = signature13.equals((java.lang.Object) 112);
        java.lang.String str20 = signature13.getDescriptor();
        java.lang.String str21 = signature13.getName();
        org.mockito.asm.Type type22 = signature13.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.asm.Type type34 = signature33.getReturnType();
        java.lang.String str35 = signature33.getName();
        org.mockito.asm.Type[] typeArray36 = signature33.getArgumentTypes();
        org.mockito.asm.Type type37 = signature33.getReturnType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type40.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("Z", type45, typeArray50);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray52);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type40, typeArray52);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int58 = type56.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str62 = type61.toString();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str64 = type63.getClassName();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type63, type65 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("Z", type61, typeArray66);
        org.mockito.asm.Type[] typeArray68 = signature67.getArgumentTypes();
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type56, typeArray68);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("S", type40, typeArray68);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray68);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("", type24, typeArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(116, 124, "mockito/cglib/core/ClassEmitter", type22, typeArray68, "(JC)D");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = fieldProviderTransformer5.getAccess();
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("J");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = type10.getInternalName();
        int int12 = type10.getDimensions();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass15 = classEmitter14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("longD", type17, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(108, (-1), "g/mockito/cglib/core/ClassEmitter", type10, typeArray31, "Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray23 = new java.lang.String[] { "C" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visit(126, 0, "char", "long", "(JC)L(JC)L(JC)C;;", strArray23);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray18 = new java.lang.String[] { "short", "J", "short", "LJ;(JC)C", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) (byte) 1, 0, "LS;", "org/mockito/cglib/core/Signature", "char", strArray18);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("(JC)L(JC)L(JC)C;;", true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("g/mockito/cglib/core/ClassEmitter", "(JC)LJ;", "LJ;(JC)C", 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("booleanZ", "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "booleanZ", 134);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter2.getAccess();
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) 'a', 11, "Lmockito/cglib/core/ClassEmitter;", "short", "g/mockito/cglib/core/ClassEmitter", strArray10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter1.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;", "L(JC)C;", "org/mockito/cglib/core/Signature" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(112, 100, "", "(JC)V", "mockito/cglib/core/ClassEmitter", strArray16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass14 = classEmitter13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor18 = fieldProviderTransformer0.visitField((int) '#', "(JC)V", "Lorg/mockito/cglib/core/ClassEmitter;", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", (java.lang.Object) wildcardClass14);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("org/mockito/cglib/core/ClassEmitter", false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter2.getSuperType();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(154, (int) (short) 10, "void", "Z", "(JC)C", strArray11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("JZ(JC)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("LJ;(JC)C", "void");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classAdapter4.visitAnnotation("(JC)LJ;", true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("long", "short", "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter15.getStaticHook();
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = fieldProviderTransformer0.visitAnnotation("int", true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitInnerClass("mockito/cglib/core/ClassEmitter", "D", "(JC)LJ;", (int) (short) 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitOuterClass("C", "(JC)D", "booleanZ");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Z", type12, typeArray17);
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        int int21 = type10.getSize();
        int int23 = type10.getOpcode((-1));
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass25 = classEmitter24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(130, "", type10, (java.lang.Object) str31);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("long", "LS;", "Z(JC)Z", 154);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = signature24.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field((int) (byte) 0, "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", type26, (java.lang.Object) 0.0f);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter4.visitAnnotation("hi!", true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "(JC)LJ;", "org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/cglib/core/ClassEmitter;", "(JC)S", "org/mockito/cglib/core/ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(124, (int) (short) 100, "", "", "(JC)V", strArray14);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer20 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field(5, "[Lorg/mockito/asm/Type;", type19, (java.lang.Object) classEmitter25);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo13 = fieldProviderTransformer12.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        java.lang.Class<?> wildcardClass15 = classEmitter10.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode((int) (byte) 1);
        int int21 = type17.getOpcode(7);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str25 = type24.getInternalName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type24, typeArray34);
        java.lang.Class<?> wildcardClass36 = typeArray34.getClass();
        boolean boolean37 = type17.equals((java.lang.Object) wildcardClass36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(JC)C");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(157, 52, "D", type16, typeArray39, "Z(JC)Z");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getSuperType();
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter7.getAccess();
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(JC)Lorg/mockito/asm/Type;", "LLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter8.getSuperType();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type type21 = signature20.getReturnType();
        org.mockito.asm.Type type22 = signature20.getReturnType();
        boolean boolean24 = signature20.equals((java.lang.Object) 104);
        boolean boolean26 = signature20.equals((java.lang.Object) 112);
        java.lang.String str27 = signature20.getDescriptor();
        java.lang.String str28 = signature20.getName();
        org.mockito.asm.Type type29 = signature20.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("Z", type32, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray37);
        java.lang.String str40 = type30.getClassName();
        java.lang.String str41 = type30.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("J");
        java.lang.String str44 = type43.getInternalName();
        boolean boolean45 = type30.equals((java.lang.Object) type43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type47.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("Z", type52, typeArray57);
        org.mockito.asm.Type[] typeArray59 = signature58.getArgumentTypes();
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("", type47, typeArray59);
        java.lang.String str62 = signature61.getName();
        org.mockito.asm.Type[] typeArray63 = signature61.getArgumentTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class(116, 11, "V", type29, typeArray63, "g.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter12.getStaticHook();
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        java.lang.String[] strArray32 = new java.lang.String[] { "longD", "hi!", "(JC)Z", "org/mockito/cglib/core/ClassEmitter(JC)C", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visit((int) (short) 100, 7, "org/mockito/cglib/core/ClassEmitter(JC)C", "g/mockito/cglib/core/ClassEmitter", "(JC)Z", strArray32);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("short", "(JC)LZ(JC)Z;", "(JC)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("JZ(JC)Z", true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("Z", type7, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        int int16 = type5.getDimensions();
        java.lang.String str17 = type5.getInternalName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type19, typeArray31);
        int int35 = type19.getOpcode((int) (short) -1);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getClassName();
        boolean boolean38 = type19.equals((java.lang.Object) type36);
        boolean boolean39 = type5.equals((java.lang.Object) type19);
        org.mockito.asm.Type[] typeArray41 = org.mockito.asm.Type.getArgumentTypes("(JC)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) 'a', (int) (short) 0, "booleanZ", type19, typeArray41, "boolean");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("long", "");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visit(96, (int) (byte) 0, "(JC)LJ;", "L(JC)C;", "I", strArray21);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = classEmitter8.getClassType();
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org/mockito/cglib/core/ClassEmitter", "short");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter6.getStaticHook();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray15 = new java.lang.String[] { "char", "[Lorg/mockito/asm/Type;", "hi!", "Z(JC)Z", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visit(153, 96, "org/mockito/cglib/core/Signature", "Z(JC)Z", "", strArray15);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visitOuterClass("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "C", "(JC)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        org.mockito.asm.Type type33 = signature31.getReturnType();
        java.lang.String str34 = signature31.toString();
        org.mockito.asm.Type type35 = signature31.getReturnType();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("Z", type37, typeArray42);
        org.mockito.asm.Type type44 = signature43.getReturnType();
        org.mockito.asm.Type[] typeArray45 = signature43.getArgumentTypes();
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray45);
        java.lang.String str47 = type35.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass49 = classEmitter48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field(130, "Z", type35, (java.lang.Object) wildcardClass49);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = classEmitter19.getSuperType();
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitInnerClass("(JC)J", "longD", "[Lorg/mockito/asm/Type;", 101);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("short", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", "Z", 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter20.visitInnerClass("(JC)S", "I", "V", 104);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("short", "L(JC)C;", "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("(JC)C");
        int int20 = type19.getSort();
        int int21 = type19.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo26 = fieldProviderTransformer25.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer28 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer31 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo32 = fieldProviderTransformer31.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        fieldProviderTransformer25.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field(3, "(ZSZ)J", type19, (java.lang.Object) fieldProviderTransformer25);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        java.lang.String[] strArray17 = new java.lang.String[] { "long", "hi!", "D" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(8, (int) (byte) -1, "long", "mockito/cglib/core/ClassEmitter", "LLorg/mockito/cglib/core/ClassEmitter;;", strArray17);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "(JC)S", "V");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass9 = classEmitter8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter3.visitField(53, "(JC)L(JC)L(JC)C;;", "LJ;", "g.mockito.cglib.core.ClassEmitter", (java.lang.Object) str12);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        java.lang.String str10 = signature7.toString();
        org.mockito.asm.Type type11 = signature7.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type[] typeArray21 = signature19.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray21);
        java.lang.String str23 = type11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type11.getInternalName();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(JC)LZ(JC)Z;", "(JC)Lorg/mockito/asm/Type;", "(JC)V", 10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter2);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Lg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;");
        java.lang.String str11 = signature10.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor12 = classAdapter3.visitField(156, "org.mockito.cglib.core.ClassEmitter", "(JC)L(JC)C;", "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", (java.lang.Object) signature10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitInnerClass("org/mockito/cglib/core/Signature", "org/mockito/cglib/core/Signature", "org/mockito/asm/Type", (int) ' ');
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type13, typeArray25);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("Z", type33, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        java.lang.String str41 = signature39.getName();
        org.mockito.asm.Type[] typeArray42 = signature39.getArgumentTypes();
        org.mockito.asm.Type type43 = signature39.getReturnType();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type46.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type55 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("Z", type51, typeArray56);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type46, typeArray58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type62.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.toString();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str70 = type69.getClassName();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type69, type71 };
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("Z", type67, typeArray72);
        org.mockito.asm.Type[] typeArray74 = signature73.getArgumentTypes();
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray74);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("", type62, typeArray74);
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("S", type46, typeArray74);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray74);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("", type30, typeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(158, (int) '4', "[Lorg/mockito/asm/Type;", type28, typeArray74, "LJ;");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray17 = new java.lang.String[] { "V", "org/mockito/cglib/core/ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(1, 108, "(JC)Lorg/mockito/asm/Type;", "(JC)Z", "(JC)S", strArray17);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitEnd();
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "int", "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        boolean boolean30 = signature19.equals((java.lang.Object) signature28);
        java.lang.String str31 = signature19.getName();
        org.mockito.asm.Type type32 = signature19.getReturnType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = signature40.getDescriptor();
        java.lang.String str43 = signature40.toString();
        java.lang.String str44 = signature40.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getObjectType("(JC)C");
        boolean boolean47 = signature40.equals((java.lang.Object) type46);
        org.mockito.asm.Type[] typeArray48 = signature40.getArgumentTypes();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type32, typeArray48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type55 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("Z", type51, typeArray56);
        org.mockito.asm.Type type58 = signature57.getReturnType();
        java.lang.String str59 = signature57.getName();
        org.mockito.asm.Type[] typeArray60 = signature57.getArgumentTypes();
        java.lang.String str61 = signature57.getDescriptor();
        org.mockito.asm.Type type62 = signature57.getReturnType();
        java.lang.String str63 = signature57.getDescriptor();
        org.mockito.asm.Type[] typeArray64 = signature57.getArgumentTypes();
        java.lang.String str65 = signature57.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(0, "org/mockito/cglib/core/ClassEmitter", type32, (java.lang.Object) str65);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("", "(JC)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        java.lang.String str13 = type11.toString();
        int int14 = type11.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer18.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        boolean boolean21 = type11.equals((java.lang.Object) classEmitter16);
        org.mockito.asm.Type[] typeArray23 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray23);
        int int25 = type11.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass27 = classEmitter26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(6, "C", type11, (java.lang.Object) wildcardClass27);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = classEmitter5.getAccess();
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) 155);
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int11 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org/mockito/cglib/core/ClassEmitter(JC)C", "org.mockito.cglib.core.ClassEmitter", "void", 11);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("Z", false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("boolean", "Z");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("(ZSZ)J", "org/mockito/cglib/core/ClassEmitter", "longD", 126);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("(JC)D", true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Z", type22, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        java.lang.String str30 = signature28.getDescriptor();
        org.mockito.asm.Type[] typeArray31 = signature28.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = signature28.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.begin_class(9, 0, "LLorg/mockito/cglib/core/ClassEmitter;;", type20, typeArray32, "double");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visitOuterClass("S", "Lorg/mockito/asm/Type;", "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getClassType();
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(JC)V", "LS;", "org/mockito/cglib/core/Signature", 3);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("(JC)LZ(JC)Z;", "long", "(JC)V");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        java.lang.String str10 = signature7.toString();
        org.mockito.asm.Type type11 = signature7.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass13 = classEmitter12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        boolean boolean15 = signature7.equals((java.lang.Object) type14);
        org.mockito.asm.Type type16 = type14.getElementType();
        int int18 = type16.getOpcode(108);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean26 = type16.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("S", "g/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Lg/mockito/cglib/core/ClassEmitter;", "(JC)L(JC)C;");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass20 = classEmitter19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = type21.getElementType();
        boolean boolean24 = type22.equals((java.lang.Object) "(JC)L(JC)C;");
        java.lang.String str25 = type22.toString();
        java.lang.String str26 = type22.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.declare_field((int) (short) 100, "mockito/cglib/core/ClassEmitter", type18, (java.lang.Object) type22);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visit(124, 0, "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "", "org/mockito/asm/Type", strArray15);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type0.getDimensions();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.toString();
        java.lang.String str14 = type12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field((int) '4', "org/mockito/asm/Type", type11, (java.lang.Object) str14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classAdapter17.visitAnnotation("int", false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("(JC)D", "void", "Lorg/mockito/cglib/core/Signature;", 2);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(JC)Lorg/mockito/asm/Type;", "org/mockito/asm/Type", "org/mockito/asm/Type", 15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type15, typeArray20);
        org.mockito.asm.Type[] typeArray22 = signature21.getArgumentTypes();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        int int24 = type13.getSort();
        int int25 = type13.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type13, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("J");
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type38, typeArray43);
        org.mockito.asm.Type[] typeArray45 = signature44.getArgumentTypes();
        java.lang.String str46 = signature44.getDescriptor();
        java.lang.String str47 = signature44.toString();
        java.lang.String str48 = signature44.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("(JC)C");
        boolean boolean51 = signature44.equals((java.lang.Object) type50);
        org.mockito.asm.Type[] typeArray52 = signature44.getArgumentTypes();
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class((int) (byte) 1, (int) (byte) 0, "Lg/mockito/cglib/core/ClassEmitter;", type13, typeArray52, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer10.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = fieldProviderTransformer0.getClassType();
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitSource("(JC)J", "(JC)LJ;");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray16 = new java.lang.String[] { "L(JC)C;", "(JC)V", "double", "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)LZ(JC)Z;", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit((int) '#', 153, "Z(JC)Z", "(JC)J", "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", strArray16);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitSource("(JC)Lorg/mockito/cglib/core/ClassEmitter;", "Z(JC)Z");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("(JC)Lorg/mockito/cglib/core/ClassEmitter;", "long", "JZ(JC)Z");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitInnerClass("void", "V", "boolean", (int) (byte) -1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = fieldProviderTransformer13.visitAnnotation("Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z", false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        java.lang.String str22 = signature19.toString();
        org.mockito.asm.Type type23 = signature19.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass25 = classEmitter24.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        boolean boolean27 = signature19.equals((java.lang.Object) type26);
        int int28 = type26.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Z", type30, typeArray35);
        org.mockito.asm.Type type37 = signature36.getReturnType();
        java.lang.String str38 = signature36.getName();
        org.mockito.asm.Type[] typeArray39 = signature36.getArgumentTypes();
        java.lang.String str40 = signature36.getDescriptor();
        org.mockito.asm.Type type41 = signature36.getReturnType();
        java.lang.String str42 = signature36.getDescriptor();
        org.mockito.asm.Type[] typeArray43 = signature36.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class(96, 52, "LJ;(JC)C", type26, typeArray43, "L(JC)C;");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("(JC)L(JC)C;", false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass13 = classEmitter12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = type14.getElementType();
        boolean boolean17 = type15.equals((java.lang.Object) "(JC)L(JC)C;");
        int int18 = type15.getDimensions();
        int int19 = type15.getDimensions();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type[] typeArray28 = signature27.getArgumentTypes();
        java.lang.String str29 = signature27.getDescriptor();
        java.lang.String str30 = signature27.toString();
        java.lang.String str31 = signature27.getName();
        org.mockito.asm.Type type32 = signature27.getReturnType();
        org.mockito.asm.Type[] typeArray33 = signature27.getArgumentTypes();
        org.mockito.asm.Type type34 = signature27.getReturnType();
        java.lang.String str35 = type34.getDescriptor();
        java.lang.String str36 = type34.getDescriptor();
        int int38 = type34.getOpcode(108);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field((int) ' ', "org.mockito.cglib.core.ClassEmitter", type15, (java.lang.Object) type34);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        java.lang.String str11 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "(JC)Lorg/mockito/cglib/core/ClassEmitter;", "D", "(JC)LZ(JC)Z;", "booleanZ" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(2, 9, "(JC)Lorg/mockito/asm/Type;", "(JC)L(JC)C;", "(JC)L(JC)C;", strArray16);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitSource("S", "longD");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("D", "LJ;(JC)C");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitOuterClass("int", "LS;", "LJ;");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("JZ(JC)Z", true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer21 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo22 = fieldProviderTransformer21.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer21);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer9.visitInnerClass("Lorg/mockito/cglib/core/Signature;", "void", "Lorg/mockito/cglib/core/ClassEmitter;", 116);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 6);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        java.lang.String str22 = signature19.toString();
        org.mockito.asm.Type type23 = signature19.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        org.mockito.asm.Type[] typeArray33 = signature31.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(126, 0, "int", type9, typeArray33, "L(JC)C;");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass7 = classEmitter6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor13 = fieldProviderTransformer0.visitField(158, "LJ;", "C", "(JC)C", (java.lang.Object) type12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray18 = new java.lang.String[] { "booleanZ", "Z", "J", "(JC)V", "(JC)D", "org/mockito/asm/Type" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(9, (int) (short) 0, "short", "org/mockito/cglib/core/ClassEmitter", "longD", strArray18);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter9.visitField((int) ' ', "[Lorg/mockito/asm/Type;", "Lorg/mockito/cglib/core/Signature;", "org.mockito.cglib.core.ClassEmitter", (java.lang.Object) "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor18 = classAdapter12.visitField((int) (byte) 1, "Lorg/mockito/cglib/core/Signature;", "Lg/mockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/Signature", (java.lang.Object) 11);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        org.mockito.asm.Type type9 = signature7.getReturnType();
        java.lang.String str10 = signature7.toString();
        org.mockito.asm.Type type11 = signature7.getReturnType();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass13 = classEmitter12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        boolean boolean15 = signature7.equals((java.lang.Object) type14);
        org.mockito.asm.Type type16 = signature7.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type16.getElementType();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass14 = classEmitter13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = type15.getElementType();
        boolean boolean18 = type16.equals((java.lang.Object) "(JC)L(JC)C;");
        org.mockito.asm.Type type19 = type16.getElementType();
        int int20 = type19.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Z", type27, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type22, typeArray34);
        java.lang.String str37 = signature36.toString();
        java.lang.String str38 = signature36.getDescriptor();
        org.mockito.asm.Type[] typeArray39 = signature36.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(124, (int) (byte) 100, "", type19, typeArray39, "(JC)Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitInnerClass("Lmockito/cglib/core/ClassEmitter;", "org/mockito/cglib/core/ClassEmitter(JC)C", "(JC)S", 53);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitEnd();
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("S", "short", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", 4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("double", "D", "(JC)C");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("char", "LJ;(JC)C", "org.mockito.cglib.core.ClassEmitter");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.end_class();
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter1.getClassType();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type8, typeArray13);
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.String str16 = signature14.getName();
        org.mockito.asm.Type[] typeArray17 = signature14.getArgumentTypes();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str22 = type21.getInternalName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("Z", type24, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type21, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(105, 105, "(JC)LJ;", type18, typeArray31, "I");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("LLorg/mockito/cglib/core/ClassEmitter;;", "Lmockito/cglib/core/ClassEmitter;", "short");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(JC)Lorg/mockito/asm/Type;", "I");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(JC)D");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Z", type14, typeArray19);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type9, typeArray21);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(0, 105, "(JC)Z", type7, typeArray24, "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter1.visitOuterClass("org/mockito/cglib/core/Signature", "(JC)S", "(JC)J");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter1.visitAnnotation("C", true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray14 = new java.lang.String[] { "Lmockito/cglib/core/ClassEmitter;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit((-1), (int) 'a', "Lorg/mockito/asm/Type;", "J", "org/mockito/cglib/core/Signature", strArray14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classEmitter14.visitAnnotation("(JC)L(JC)C;", true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitInnerClass("mockito/cglib/core/ClassEmitter", "(JC)L(JC)L(JC)C;;", "LLorg/mockito/cglib/core/ClassEmitter;;", (int) (short) -1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter17.visitEnd();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = fieldProviderTransformer3.getAccess();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("D");
        java.lang.String str21 = type20.getClassName();
        java.lang.String str22 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Z", type26, typeArray31);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray33);
        java.lang.String str35 = type24.getClassName();
        int int37 = type24.getOpcode((int) (short) -1);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("Z", type39, typeArray44);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        java.lang.String str47 = signature45.getDescriptor();
        java.lang.String str48 = signature45.toString();
        java.lang.String str49 = signature45.getName();
        org.mockito.asm.Type type50 = signature45.getReturnType();
        org.mockito.asm.Type[] typeArray51 = signature45.getArgumentTypes();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("LJ;", type24, typeArray51);
        org.mockito.asm.Type[] typeArray53 = signature52.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.declare_field(158, "Lorg/mockito/asm/Type;", type20, (java.lang.Object) typeArray53);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(JC)D", "(JC)S");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int3 = type2.getSize();
        int int4 = type2.getSize();
        int int5 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type2.getDimensions();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visitSource("Z(JC)Z", "(JC)LJ;");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        java.lang.Class<?> wildcardClass20 = classEmitter15.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        int int23 = type22.getDimensions();
        int int24 = type22.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter0.visitField(109, "S", "(JC)L(JC)L(JC)C;;", "LJ;(JC)C", (java.lang.Object) int24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter3.getAccess();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) 155);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = type0.equals((java.lang.Object) classEmitter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter9.getStaticHook();
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        java.lang.String[] strArray23 = new java.lang.String[] { "int", "LLorg/mockito/cglib/core/ClassEmitter;;", "(JC)LJ;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visit((int) (byte) -1, (-1), "(JC)D", "hi!", "Lmockito/cglib/core/ClassEmitter;", strArray23);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        java.lang.String str15 = type13.toString();
        int int16 = type13.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer20 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer20.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        boolean boolean23 = type13.equals((java.lang.Object) classEmitter18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.asm.Type.getArgumentTypes("(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        int int27 = type13.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("S");
        java.lang.String str31 = type30.getInternalName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("Z", type33, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.ClassEmitter", type30, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.begin_class(155, 100, "org/mockito/cglib/core/ClassEmitter", type13, typeArray40, "(JC)S");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter9.getSuperType();
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visitInnerClass("(JC)J", "(JC)Lorg/mockito/asm/Type;", "(JC)Z", 128);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray13 = new java.lang.String[] { "(JC)L(JC)L(JC)C;;", "LJ;(JC)C" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) ' ', 9, "booleanZ", "", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", strArray13);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter4.getSuperType();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int3 = type2.getSize();
        int int4 = type2.getSize();
        int int5 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Z", type9, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        int int18 = type7.getSort();
        int int19 = type7.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Z", type21, typeArray26);
        org.mockito.asm.Type type28 = signature27.getReturnType();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        java.lang.String str30 = signature27.toString();
        org.mockito.asm.Type type31 = signature27.getReturnType();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("Z", type33, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type7, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = type2.getInternalName();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("S", "(JC)LZ(JC)Z;");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray16 = new java.lang.String[] { "I", "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(116, 160, "long", "booleanZ", "(JC)Lorg/mockito/cglib/core/ClassEmitter;", strArray16);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("(JC)Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "LLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter9.visitInnerClass("Z", "(JC)C", "Z(JC)Z", (int) (byte) 10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visitEnd();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(JC)C;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter1.visitAnnotation("(JC)V", false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int3 = type2.getSize();
        int int4 = type2.getSize();
        int int5 = type2.getSize();
        int int6 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "Lg/mockito/cglib/core/ClassEmitter;", "LJ;(JC)C", "J", "short" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit((int) (short) -1, 155, "LJ;", "L(JC)C;", "(JC)C", strArray13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("D", "V", "double");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        java.lang.String[] strArray18 = new java.lang.String[] { "long", "double", "mockito/cglib/core/ClassEmitter", "(JC)Lorg/mockito/asm/Type;", "[Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(3, (int) (short) 10, "org/mockito/cglib/core/Signature", "char", "J", strArray18);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter1);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(0, 153, "Lg/mockito/cglib/core/ClassEmitter;", "(JC)LZ(JC)Z;", "(JC)Lorg/mockito/asm/Type;", strArray9);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitInnerClass("", "[Lorg/mockito/asm/Type;", "(JC)Z", (int) (byte) 100);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        java.lang.String[] strArray23 = new java.lang.String[] { "LLorg/mockito/cglib/core/ClassEmitter;;", "g.mockito.cglib.core.ClassEmitter" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visit((int) ' ', 128, "LJ;(JC)C", "", "Lorg/mockito/asm/Type;", strArray23);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/cglib/core/ClassEmitter(JC)C");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("Z", type3, typeArray8);
        org.mockito.asm.Type[] typeArray10 = signature9.getArgumentTypes();
        java.lang.String str11 = signature9.getDescriptor();
        java.lang.String str12 = signature9.toString();
        java.lang.String str13 = signature9.getDescriptor();
        org.mockito.asm.Type type14 = signature9.getReturnType();
        boolean boolean15 = type1.equals((java.lang.Object) type14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter1.getStaticHook();
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.visitInnerClass("g.mockito.cglib.core.ClassEmitter", "boolean", "V", 134);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type20, typeArray32);
        int int36 = type20.getOpcode((int) (short) -1);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getClassName();
        boolean boolean39 = type20.equals((java.lang.Object) type37);
        int int40 = type20.getSize();
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(JC)L(JC)C;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.begin_class(11, (-1), "", type20, typeArray42, "[Lorg/mockito/asm/Type;");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        int int7 = type6.getSize();
        java.lang.String str8 = type6.getClassName();
        int int9 = type6.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(5, "org/mockito/cglib/core/ClassEmitter", type6, (java.lang.Object) 157);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter16.visitEnd();
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int11 = type0.getSort();
        int int12 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type0.getElementType();
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("", true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter22 = classEmitter5.getStaticHook();
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter0.getAccess();
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "org/mockito/cglib/core/ClassEmitter(JC)C", "Z(JC)Z");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classEmitter1.visitAnnotation("(JC)Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type[] typeArray22 = signature19.getArgumentTypes();
        java.lang.String str23 = signature19.getDescriptor();
        org.mockito.asm.Type type24 = signature19.getReturnType();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("char", "Lg/mockito/cglib/core/ClassEmitter;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(39, "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", type24, (java.lang.Object) "Lg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer8.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Z", type17, typeArray22);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        java.lang.Class<?> wildcardClass25 = signature23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("Z", type28, typeArray33);
        org.mockito.asm.Type type35 = signature34.getReturnType();
        org.mockito.asm.Type type36 = signature34.getReturnType();
        java.lang.String str37 = signature34.toString();
        java.lang.String str38 = signature34.getDescriptor();
        java.lang.String str39 = signature34.toString();
        org.mockito.asm.Type type40 = signature34.getReturnType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("Z", type43, typeArray48);
        org.mockito.asm.Type[] typeArray50 = signature49.getArgumentTypes();
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer8.begin_class(39, (int) (byte) 0, "V", type26, typeArray50, "(JC)C");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "Z");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter3.visitField(130, "D", "C", "LS;", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("org/mockito/cglib/core/ClassEmitter", "C", "short");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter7.visitOuterClass("boolean", "C", "(JC)D");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("Z", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getDescriptor();
        boolean boolean11 = signature7.equals((java.lang.Object) "(JC)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        boolean boolean17 = signature7.equals((java.lang.Object) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visitEnd();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter2.getAccess();
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = fieldProviderTransformer0.visitAnnotation("(JC)J", true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass10 = classEmitter9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = type11.getElementType();
        boolean boolean14 = type12.equals((java.lang.Object) "(JC)L(JC)C;");
        org.mockito.asm.Type type15 = type12.getElementType();
        int int16 = type15.getSize();
        org.mockito.asm.Type type17 = type15.getElementType();
        org.mockito.asm.Type type18 = type17.getElementType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("Z", type25, typeArray30);
        org.mockito.asm.Type[] typeArray32 = signature31.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type20, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class((int) (short) -1, 134, "V", type18, typeArray32, "Lorg/mockito/cglib/core/ClassEmitter;Z(JC)Z");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        java.lang.String[] strArray13 = new java.lang.String[] { "LLorg/mockito/cglib/core/ClassEmitter;;", "J", "", "(JC)S", "(JC)Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "LLorg/mockito/cglib/core/ClassEmitter;;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visit(158, 0, "Lorg/mockito/cglib/core/Signature;", "char", "(JC)Z", strArray13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray12 = new java.lang.String[] { "(ZSZ)J", "org/mockito/cglib/core/Signature" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) ' ', 96, "(JC)L(JC)L(JC)C;;", "LLorg/mockito/cglib/core/ClassEmitter;;", "char", strArray12);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("J", "Z");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType("Z");
        java.lang.String str11 = type10.getDescriptor();
        int int12 = type10.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("(JC)C");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type[] typeArray25 = signature24.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type29.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray41);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type29, typeArray41);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Z", type14, typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray41);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(JC)L(JC)C;");
        int int49 = type47.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(157, "S", type10, (java.lang.Object) type47);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("g.mockito.cglib.core.ClassEmitter", "(JC)C");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor20 = fieldProviderTransformer9.visitField((int) 'a', "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", "Lorg/mockito/cglib/core/ClassEmitter;", "LJ;(JC)C", (java.lang.Object) classAdapter18);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Z", type2, typeArray7);
        org.mockito.asm.Type[] typeArray9 = signature8.getArgumentTypes();
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int11 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter8.getClassInfo();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Z", type18, typeArray23);
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type[] typeArray27 = signature24.getArgumentTypes();
        java.lang.String str28 = signature24.getDescriptor();
        org.mockito.asm.Type type29 = signature24.getReturnType();
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Z", type34, typeArray39);
        org.mockito.asm.Type[] typeArray41 = signature40.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray41);
        java.lang.String str43 = type32.getClassName();
        int int45 = type32.getOpcode((int) (short) -1);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type49, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("Z", type47, typeArray52);
        org.mockito.asm.Type[] typeArray54 = signature53.getArgumentTypes();
        java.lang.String str55 = signature53.getDescriptor();
        java.lang.String str56 = signature53.toString();
        java.lang.String str57 = signature53.getName();
        org.mockito.asm.Type type58 = signature53.getReturnType();
        org.mockito.asm.Type[] typeArray59 = signature53.getArgumentTypes();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("LJ;", type32, typeArray59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.declare_field(128, "org/mockito/asm/Type", type29, (java.lang.Object) signature60);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        java.lang.String str21 = type19.toString();
        java.lang.String str22 = type19.toString();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "JZ(JC)Z");
        boolean boolean26 = type19.equals((java.lang.Object) signature25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str30 = type29.toString();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("Z", type29, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray34);
        java.lang.String str37 = type27.getClassName();
        java.lang.String str38 = type27.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("J");
        java.lang.String str41 = type40.getInternalName();
        boolean boolean42 = type27.equals((java.lang.Object) type40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type51, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("Z", type49, typeArray54);
        org.mockito.asm.Type[] typeArray56 = signature55.getArgumentTypes();
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray56);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type44, typeArray56);
        java.lang.String str59 = signature58.getName();
        org.mockito.asm.Type[] typeArray60 = signature58.getArgumentTypes();
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer3.begin_class((int) (byte) -1, 52, "JZ(JC)Z", type19, typeArray60, "double");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer5.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer5.visit(105, 134, "Z(JC)Z", "I", "g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", strArray16);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer8.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter24);
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor27 = fieldProviderTransformer8.visitField(134, "org/mockito/cglib/core/ClassEmitter", "(JC)Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;", "double", (java.lang.Object) classAdapter24);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = fieldProviderTransformer3.visitAnnotation("longD", false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = classAdapter13.visitAnnotation("g.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;", false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Z", type6, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type1, typeArray13);
        java.lang.String str16 = signature15.getName();
        org.mockito.asm.Type[] typeArray17 = signature15.getArgumentTypes();
        java.lang.String str18 = signature15.getName();
        org.mockito.asm.Type type19 = signature15.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSize();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter13.end_class();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("JZ(JC)Z", "(JC)D");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = classEmitter14.getSuperType();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = fieldProviderTransformer0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("double", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("(JC)L(JC)C;", "mockito.cglib.core.ClassEmitter", "(ZSZ)J");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = classEmitter16.getClassType();
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = type0.equals((java.lang.Object) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitOuterClass("C", "Lorg/mockito/cglib/core/ClassEmitter;", "mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitInnerClass("(JC)LJ;", "long", "org/mockito/cglib/core/ClassEmitter(JC)C", (int) ' ');
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitEnd();
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitSource("(JC)I", "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer21 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo22 = fieldProviderTransformer21.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer21);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getReturnType("Z(JC)Z");
        int int31 = type29.getOpcode(124);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class<?> wildcardClass33 = classEmitter32.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        int int41 = type40.getSort();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type47, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("Z", type45, typeArray50);
        org.mockito.asm.Type[] typeArray52 = signature51.getArgumentTypes();
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray52);
        int int54 = type43.getSort();
        int int55 = type43.getSize();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str58 = type57.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type59, type61 };
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Z", type57, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/ClassEmitter", type43, typeArray62);
        org.mockito.asm.Type[] typeArray65 = signature64.getArgumentTypes();
        java.lang.String str66 = signature64.getDescriptor();
        java.lang.String str67 = signature64.toString();
        org.mockito.asm.Type[] typeArray68 = signature64.getArgumentTypes();
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer9.begin_class(52, 128, "org/mockito/cglib/core/ClassEmitter", type29, typeArray68, "Lg.mockito.cglib.core.ClassEmitterLorg/mockito/cglib/core/ClassEmitter;;");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = classEmitter15.getAccess();
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter9);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray18 = new java.lang.String[] { "(JC)Lorg/mockito/asm/Type;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(116, 15, "double", "LLorg/mockito/cglib/core/ClassEmitter;;", "LLorg/mockito/cglib/core/ClassEmitter;;", strArray18);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.String[] strArray18 = new java.lang.String[] { "g/mockito/cglib/core/ClassEmitter", "g.mockito.cglib.core.ClassEmitter", "org/mockito/cglib/core/ClassEmitter(JC)C", "longD", "LLorg/mockito/cglib/core/ClassEmitter;;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(124, 15, "g.mockito.cglib.core.ClassEmitter", "org/mockito/asm/Type", "Lmockito/cglib/core/ClassEmitter;", strArray18);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("(JC)L(JC)L(JC)C;;", false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visit(8, (int) (byte) 1, "(JC)Z", "LLorg/mockito/cglib/core/ClassEmitter;;", "org/mockito/cglib/core/ClassEmitter(JC)C", strArray23);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }
}


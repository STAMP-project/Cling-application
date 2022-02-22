import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(153, 153, "L2088475627", "L(ZZZZ)J;", "L1720336327", strArray9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        classEmitter11.visitOuterClass("L2106100863", "L1647590983L1511509336", "(ZZS)Lorg.mockito.cglib.core.ClassEmitter;");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        org.mockito.asm.Type type46 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((int) (short) 0, type48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int52 = type51.getSort();
        int int54 = type51.getOpcode(100);
        int int55 = type51.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str58 = type57.toString();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type59.getSort();
        int int62 = type59.getOpcode(100);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type48, type51, type56, type57, type59 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray63);
        java.lang.String str65 = type46.toString();
        org.mockito.cglib.core.Local local66 = new org.mockito.cglib.core.Local(0, type46);
        int int67 = local66.getIndex();
        org.mockito.asm.Type type68 = local66.getType();
        org.mockito.asm.Type type69 = local66.getType();
        int int71 = type69.getOpcode((int) 'a');
        boolean boolean72 = signature42.equals((java.lang.Object) type69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int73 = type69.getDimensions();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "L1656806444L189054299" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(0, 158, "", "L1164048796", "(ZZS)Lorg.mockito.cglib.core.ClassEmitter;", strArray10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = classEmitter6.getAccess();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", type2, typeArray5);
        java.lang.String str7 = signature6.getName();
        java.lang.String str8 = signature6.getName();
        org.mockito.asm.Type type9 = signature6.getReturnType();
        java.lang.String str10 = signature6.getDescriptor();
        java.lang.String str11 = signature6.toString();
        org.mockito.asm.Type type12 = signature6.getReturnType();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(4, type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type12.getDimensions();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter4.visitAnnotation("org/mockito/cglib/transform/impl/FieldProviderTransformer", true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        classEmitter9.visitEnd();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        fieldProviderTransformer0.visitSource("Lorg/mockito/cglib/core/ClassEmitter;", "g/mockito/cglib/core/Signature");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        boolean boolean4 = type0.equals((java.lang.Object) str3);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        int int11 = type9.getOpcode(153);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) 0, type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSort();
        int int20 = type17.getOpcode(100);
        int int21 = type17.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type25.getSort();
        int int28 = type25.getOpcode(100);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type14, type17, type22, type23, type25 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("L1773924246", type9, typeArray29);
        int int33 = type9.getOpcode(126);
        boolean boolean34 = type0.equals((java.lang.Object) 126);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type0.getDimensions();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(100);
        int int7 = type3.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type10, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("char", type3, typeArray13);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = signature16.getDescriptor();
        java.lang.String str19 = signature16.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature16.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type1.getElementType();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitEnd();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        classEmitter13.visitOuterClass("L1529951450", "", "L480303271");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter4.visitAnnotation("L302811802", true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        int int9 = type1.getOpcode((int) (byte) 10);
        java.lang.String str10 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray15 = new java.lang.String[] { "L2141501698L1030334456", "L1435246451", "L498696058", "L1081832005", "L1057130297", "L1123017197" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(8, 138, "L440114643", "L1048200783", "", strArray15);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer0.getClassInfo();
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
        org.mockito.asm.Type type44 = signature43.getReturnType();
        java.lang.Class<?> wildcardClass45 = signature43.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type49 = type48.getElementType();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type[] typeArray54 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("", type51, typeArray54);
        java.lang.String str56 = signature55.getName();
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean61 = signature59.equals((java.lang.Object) 100.0f);
        java.lang.String str62 = signature59.getName();
        java.lang.String str63 = signature59.getDescriptor();
        boolean boolean64 = signature55.equals((java.lang.Object) signature59);
        java.lang.String str65 = signature55.getName();
        org.mockito.asm.Type[] typeArray66 = signature55.getArgumentTypes();
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("L1016281187", type48, typeArray66);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("L139491627", "LL1076182119;");
        org.mockito.asm.Type type72 = signature71.getReturnType();
        org.mockito.asm.Type type73 = signature71.getReturnType();
        org.mockito.cglib.core.Local local74 = new org.mockito.cglib.core.Local((int) (byte) -1, type73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field((int) '#', "L1775458916", type48, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/Local");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str7 = type6.getDescriptor();
        boolean boolean9 = type6.equals((java.lang.Object) 10);
        int int10 = type6.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.toString();
        java.lang.String str15 = type13.toString();
        int int16 = type13.getSort();
        boolean boolean18 = type13.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean24 = type21.equals((java.lang.Object) type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSort();
        int int29 = type26.getOpcode(100);
        int int31 = type26.getOpcode(104);
        int int33 = type26.getOpcode(10);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((int) (short) 0, type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSort();
        int int42 = type39.getOpcode(100);
        int int43 = type39.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSort();
        int int50 = type47.getOpcode(100);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type36, type39, type44, type45, type47 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("L1750106643", type26, typeArray51);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type21, typeArray51);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("B", type13, typeArray51);
        java.lang.String str56 = signature55.getName();
        boolean boolean57 = type6.equals((java.lang.Object) str56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(0, "L1011435787", type4, (java.lang.Object) str56);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.getDescriptor();
        java.lang.String str8 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type1.getInternalName();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitEnd();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        java.lang.String str12 = type0.getDescriptor();
        java.lang.String str13 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean15 = signature13.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass16 = signature13.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((int) (short) 0, type21);
        org.mockito.asm.Type type24 = local23.getType();
        java.lang.Class<?> wildcardClass25 = local23.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        int int31 = type29.getOpcode(56);
        java.lang.String str32 = type29.getClassName();
        int int33 = type29.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean38 = type35.equals((java.lang.Object) type37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(100);
        int int45 = type40.getOpcode(104);
        int int47 = type40.getOpcode(10);
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
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("L1750106643", type40, typeArray65);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type35, typeArray65);
        java.lang.String str69 = signature68.getName();
        java.lang.String str70 = signature68.getDescriptor();
        java.lang.String str71 = signature68.toString();
        org.mockito.asm.Type[] typeArray72 = signature68.getArgumentTypes();
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("L341159242", type29, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field(0, "L2025443287", type18, (java.lang.Object) "L341159242");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        classEmitter7.visitInnerClass("L1454237692", "L652788525", "L508503767", 107);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("B(ZZFJZ)J", "LL527022196;");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter5.visitEnd();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        org.mockito.asm.Label label43 = new org.mockito.asm.Label();
        java.lang.Object obj44 = label43.info;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean48 = type45.equals((java.lang.Object) "(ZZFJZ)C");
        label43.info = type45;
        java.lang.Object obj50 = label43.info;
        java.lang.String str51 = label43.toString();
        java.lang.Object obj52 = label43.info;
        java.lang.Object obj53 = label43.info;
        java.lang.Object obj54 = label43.info;
        java.lang.String str55 = label43.toString();
        java.lang.String str56 = label43.toString();
        boolean boolean57 = signature42.equals((java.lang.Object) label43);
        org.mockito.asm.Type type58 = signature42.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type58.getDimensions();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        int int9 = type1.getOpcode(9);
        java.lang.String str10 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int94 = type41.getDimensions();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(100);
        int int7 = type3.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type10.getSize();
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type10, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("char", type3, typeArray13);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = signature16.getDescriptor();
        java.lang.String str19 = signature16.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature16.getArgumentTypes();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray20);
        java.lang.String str22 = type1.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        int int27 = type25.getOpcode(153);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(100);
        int int37 = type33.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type41.getSort();
        int int44 = type41.getOpcode(100);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type30, type33, type38, type39, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1773924246", type25, typeArray45);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray45);
        java.lang.String str49 = type1.getClassName();
        int int51 = type1.getOpcode(105);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type1.getInternalName();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        java.lang.String str49 = type2.getInternalName();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1733290921", "L1260680264", "LI;", "L1830056390", "L206641327", "L1757941828" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter3.visit(135, 0, "L1393130543", "L589766077", "J", strArray15);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        boolean boolean7 = type2.equals((java.lang.Object) local6);
        int int8 = local6.getIndex();
        int int9 = local6.getIndex();
        org.mockito.asm.Type type10 = local6.getType();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((int) 'a', type10);
        int int13 = type10.getOpcode(124);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type10.getInternalName();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
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
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(100);
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(124, type36);
        boolean boolean41 = signature34.equals((java.lang.Object) type36);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("(ZZZZ)J");
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        boolean boolean46 = type36.equals((java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type36.getDimensions();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local(7, type1);
        int int5 = local4.getIndex();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.toString();
        java.lang.String str6 = type4.toString();
        int int7 = type4.getSort();
        boolean boolean9 = type4.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type4);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean15 = type12.equals((java.lang.Object) type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type17.getSort();
        int int20 = type17.getOpcode(100);
        int int22 = type17.getOpcode(104);
        int int24 = type17.getOpcode(10);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) 0, type27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int31 = type30.getSort();
        int int33 = type30.getOpcode(100);
        int int34 = type30.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type38.getSort();
        int int41 = type38.getOpcode(100);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type27, type30, type35, type36, type38 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("L1750106643", type17, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type12, typeArray42);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("B", type4, typeArray42);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean49 = signature46.equals((java.lang.Object) "C");
        org.mockito.asm.Type type50 = signature46.getReturnType();
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local(124, type50);
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((int) '#', type50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = type50.getElementType();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (byte) 1, type1);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter5.getAccess();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        int int68 = type48.getDimensions();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        java.lang.String str37 = type36.getInternalName();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        label0.info = type5;
        java.lang.String str7 = type5.getDescriptor();
        java.lang.String str8 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type5.getInternalName();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        java.lang.String str7 = type2.getClassName();
        int int8 = type2.getSort();
        int int9 = type2.getSize();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(116, type2);
        java.lang.String str11 = type2.toString();
        java.lang.String str12 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type2.getDimensions();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        org.mockito.asm.Type type9 = local7.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        classEmitter8.visitSource("LL1700624831;", "L943118629");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitEnd();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZS)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
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
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean55 = signature52.equals((java.lang.Object) "C");
        org.mockito.asm.Type type56 = signature52.getReturnType();
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean61 = signature59.equals((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass62 = signature59.getClass();
        java.lang.String str63 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        java.lang.String str64 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        java.lang.String str65 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass62);
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        java.lang.String str67 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass62);
        boolean boolean68 = signature52.equals((java.lang.Object) wildcardClass62);
        java.lang.String str69 = signature52.getName();
        org.mockito.asm.Type type70 = signature52.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor71 = classAdapter3.visitField(0, "L2018549890", "Lg/mockito/cglib/core/ClassEmitter;", "(ZZFJZ)D", (java.lang.Object) type70);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        classEmitter11.visitOuterClass("L1771266253", "g/mockito/cglib/core/Local", "L2100947922");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        java.lang.String str46 = type44.getInternalName();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.toString();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((int) (short) 0, type8);
        org.mockito.asm.Type type11 = local10.getType();
        java.lang.Class<?> wildcardClass12 = local10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(100);
        int int21 = type16.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer22.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        boolean boolean26 = type16.equals((java.lang.Object) classEmitter25);
        boolean boolean27 = type14.equals((java.lang.Object) type16);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean32 = type29.equals((java.lang.Object) type31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSort();
        int int37 = type34.getOpcode(100);
        int int39 = type34.getOpcode(104);
        int int41 = type34.getOpcode(10);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((int) (short) 0, type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int48 = type47.getSort();
        int int50 = type47.getOpcode(100);
        int int51 = type47.getSize();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str54 = type53.toString();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = type55.getSort();
        int int58 = type55.getOpcode(100);
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type44, type47, type52, type53, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray59);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("L1750106643", type34, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type29, typeArray59);
        java.lang.String str63 = signature62.toString();
        boolean boolean65 = signature62.equals((java.lang.Object) (short) 0);
        java.lang.String str66 = signature62.getDescriptor();
        java.lang.String str67 = signature62.getDescriptor();
        org.mockito.asm.Type type68 = signature62.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.declare_field(154, "L781303720", type14, (java.lang.Object) type68);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(100);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type1);
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.toString();
        java.lang.String str8 = type1.toString();
        java.lang.String str9 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type1.getDimensions();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        java.lang.String str12 = type10.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type10.getInternalName();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L958779540", false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean11 = type8.equals((java.lang.Object) type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(100);
        int int18 = type13.getOpcode(104);
        int int20 = type13.getOpcode(10);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) 0, type23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type26.getSort();
        int int29 = type26.getOpcode(100);
        int int30 = type26.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str33 = type32.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type34.getSort();
        int int37 = type34.getOpcode(100);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type23, type26, type31, type32, type34 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1750106643", type13, typeArray38);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type8, typeArray38);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type5, typeArray38);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray43);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local(104, type1);
        org.mockito.asm.Type type46 = local45.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type46.getInternalName();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        classEmitter11.visitInnerClass("(ZZFJZ)L(ZZZZ)J;", "LLorg/mockito/asm/Label;;", "L711339210", 9);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        classEmitter8.visitInnerClass("(ZZFJZ)Lorg/mockito/cglib/core/Local;", "L1379293463", "L536627845", (int) ' ');
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str9 = signature8.getName();
        boolean boolean11 = signature8.equals((java.lang.Object) (byte) 100);
        boolean boolean12 = type5.equals((java.lang.Object) (byte) 100);
        label0.info = boolean12;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        label0.info = classAdapter21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitInnerClass("L702534717", "L657847988", "L1942888291", 11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        int int7 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.String[] strArray21 = new java.lang.String[] { "L741876461" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visit(116, (int) (short) 1, "L711339210", "L358177745", "", strArray21);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
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
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getDescriptor();
        boolean boolean24 = type20.equals((java.lang.Object) str23);
        int int25 = type20.getSort();
        int int26 = type20.getSize();
        int int27 = type20.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        int int32 = type30.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type36.getSort();
        java.lang.String str38 = type36.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((int) (short) 0, type42);
        java.lang.String str45 = type42.toString();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type35, type36, type39, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("D", type30, typeArray46);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.toString();
        org.mockito.cglib.core.Local local55 = new org.mockito.cglib.core.Local((int) (short) 0, type53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type56.getSort();
        int int59 = type56.getOpcode(100);
        int int60 = type56.getSize();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str63 = type62.toString();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int65 = type64.getSort();
        int int67 = type64.getOpcode(100);
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type53, type56, type61, type62, type64 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("L1750106643", type49, typeArray68);
        org.mockito.asm.Type type71 = signature70.getReturnType();
        org.mockito.asm.Type type72 = signature70.getReturnType();
        java.lang.String str73 = signature70.toString();
        org.mockito.asm.Type[] typeArray74 = signature70.getArgumentTypes();
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("L269740822", type20, typeArray74);
        org.mockito.asm.Type type76 = signature75.getReturnType();
        java.lang.String str77 = signature75.getName();
        boolean boolean78 = type6.equals((java.lang.Object) signature75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str79 = type6.getInternalName();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = fieldProviderTransformer1.getSuperType();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L947476816", "L136409919", "L2095027814");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter2 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitOuterClass("313178346(ZZFJZ)Lorg.mockito.cglib.core.ClassEmitter", "L1040622309", "L879787609");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1113927926", "L365532013");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("L1526141452");
        java.lang.String str6 = type5.getInternalName();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Object obj9 = label7.info;
        java.lang.Object obj10 = label7.info;
        java.lang.String str11 = label7.toString();
        java.lang.String str12 = label7.toString();
        java.lang.String str13 = label7.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.toString();
        java.lang.String str18 = type16.toString();
        int int19 = type16.getSort();
        boolean boolean21 = type16.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean27 = type24.equals((java.lang.Object) type26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(100);
        int int34 = type29.getOpcode(104);
        int int36 = type29.getOpcode(10);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((int) (short) 0, type39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type42.getSort();
        int int45 = type42.getOpcode(100);
        int int46 = type42.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type50.getSort();
        int int53 = type50.getOpcode(100);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type39, type42, type47, type48, type50 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("L1750106643", type29, typeArray54);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type24, typeArray54);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("B", type16, typeArray54);
        java.lang.String str59 = signature58.toString();
        java.lang.String str60 = signature58.toString();
        java.lang.String str61 = signature58.getDescriptor();
        label7.info = signature58;
        org.mockito.asm.Type[] typeArray63 = signature58.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.begin_class(117, (int) ' ', "L543239891", type5, typeArray63, "L302093098");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
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
        java.lang.String str12 = type11.getInternalName();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/ClassEmitter");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) (short) 0, type4);
        boolean boolean7 = type2.equals((java.lang.Object) local6);
        int int8 = local6.getIndex();
        int int9 = local6.getIndex();
        org.mockito.asm.Type type10 = local6.getType();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(54, type10);
        int int13 = type10.getOpcode(96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type10.getElementType();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZFJZ)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("L1115176874", "");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean15 = type12.equals((java.lang.Object) "(ZZFJZ)C");
        label10.info = type12;
        java.lang.Object obj17 = label10.info;
        java.lang.String str18 = label10.toString();
        java.lang.Class<?> wildcardClass19 = label10.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter5.visitField(0, "(ZZFJZ)LL2137196794;", "Lorg/mockito/cglib/transform/impl/FieldProviderTransformer;", "L1805257916", (java.lang.Object) wildcardClass19);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("char(ZZFJZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = type1.getSize();
        java.lang.String str5 = type1.toString();
        int int7 = type1.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
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
        classEmitter9.visitEnd();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        org.mockito.asm.Type type6 = local3.getType();
        org.mockito.asm.Type type7 = local3.getType();
        int int8 = local3.getIndex();
        org.mockito.asm.Type type9 = local3.getType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) (short) 0, type12);
        int int15 = local14.getIndex();
        int int16 = local14.getIndex();
        int int17 = local14.getIndex();
        org.mockito.asm.Type type18 = local14.getType();
        org.mockito.asm.Type type19 = local14.getType();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(12, type19);
        boolean boolean21 = type9.equals((java.lang.Object) 12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type9.getInternalName();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D(ZZZZ)Z");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        java.lang.String str7 = type5.toString();
        int int8 = type5.getSort();
        boolean boolean10 = type5.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/core/Signature;");
        boolean boolean16 = type13.equals((java.lang.Object) type15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type18.getSort();
        int int21 = type18.getOpcode(100);
        int int23 = type18.getOpcode(104);
        int int25 = type18.getOpcode(10);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((int) (short) 0, type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type31.getSort();
        int int34 = type31.getOpcode(100);
        int int35 = type31.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type39.getSort();
        int int42 = type39.getOpcode(100);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type28, type31, type36, type37, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1750106643", type18, typeArray43);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/Signature", type13, typeArray43);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("B", type5, typeArray43);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getReturnType("C");
        boolean boolean50 = signature47.equals((java.lang.Object) "C");
        org.mockito.asm.Type type51 = signature47.getReturnType();
        org.mockito.asm.Type type52 = signature47.getReturnType();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSort();
        int int57 = type54.getOpcode(100);
        int int58 = type54.getSize();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.CHAR_TYPE;
        int int62 = type61.getSize();
        org.mockito.asm.Type[] typeArray64 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type61, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray64);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("char", type54, typeArray64);
        org.mockito.asm.Type[] typeArray68 = signature67.getArgumentTypes();
        java.lang.String str69 = signature67.getDescriptor();
        java.lang.String str70 = signature67.getDescriptor();
        org.mockito.asm.Type[] typeArray71 = signature67.getArgumentTypes();
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("L1511509336", type52, typeArray71);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int74 = type1.getDimensions();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("C");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(35, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type2.getElementType();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1750106643", "hi!");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer3.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        boolean boolean8 = signature2.equals((java.lang.Object) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter6.getSuperType();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int74 = type1.getDimensions();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray12 = new java.lang.String[] { "L1935987851", "L407981434", "L685568331" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(104, 12, "org/mockito/cglib/core/Local", "L48971253", "L1700624831(ZZFJZ)Lg/mockito/cglib/core/Signature;", strArray12);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Object obj2 = label0.info;
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str9 = signature8.getName();
        boolean boolean11 = signature8.equals((java.lang.Object) (byte) 100);
        boolean boolean12 = type5.equals((java.lang.Object) (byte) 100);
        label0.info = boolean12;
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        label0.info = classAdapter21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter21.visitOuterClass("L578795900", "L2141501698(ZZFJZ)Z", "L1528740554");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter5.getAccess();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(ZZZZ)J;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type3.getSize();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", type3, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getName();
        java.lang.String str10 = signature7.getName();
        org.mockito.asm.Type type11 = signature7.getReturnType();
        boolean boolean12 = type1.equals((java.lang.Object) signature7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
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
        org.mockito.asm.Type type13 = classEmitter8.getClassType();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L2016744456", "L1210106811");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        int int7 = type1.getOpcode((int) '#');
        int int9 = type1.getOpcode(121);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        int int7 = type0.getOpcode(10);
        int int8 = type0.getSort();
        int int10 = type0.getOpcode(113);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitInnerClass("(ZZFJZ)LL1595451715;", "L1201055211", "Lorg/mockito/asm/Type;", 58);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.end_class();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
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
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.end_class();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
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
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.String[] strArray25 = new java.lang.String[] { "L391593941", "L1771813576", "L241773718", "L1199362812", "L711339210" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visit(0, 6, "L1567723954", "L151012075", "L1132214694", strArray25);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass13 = signature12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType("LL(ZZZZ)J;;");
        int int20 = type18.getOpcode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(108, "L2145386889", type15, (java.lang.Object) type18);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        int int4 = type0.getSort();
        int int5 = type0.getSort();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
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
        int int40 = type1.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type1.getElementType();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter7.visitAnnotation("L1786888613", false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
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
        org.mockito.asm.Type[] typeArray69 = org.mockito.asm.Type.getArgumentTypes("(ZZZZ)Z");
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray69);
        java.lang.String str71 = type48.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str72 = type48.getInternalName();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer1.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "L1203438101", "L286972761" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visit((int) (byte) -1, 56, "L620346254", "L28933589", "L1058157057", strArray13);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        boolean boolean6 = type1.equals((java.lang.Object) 'a');
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(0, type1);
        int int8 = local7.getIndex();
        org.mockito.asm.Type type9 = local7.getType();
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type9.getInternalName();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZFJZ)F");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
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
        classEmitter9.visitOuterClass("g.mockito.cglib.core.Local", "L404074784L855552472", "L1358051592L1880321789");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
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
        boolean boolean24 = type20.equals((java.lang.Object) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type20.getDimensions();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        int int4 = local3.getIndex();
        int int5 = local3.getIndex();
        int int6 = local3.getIndex();
        int int7 = local3.getIndex();
        org.mockito.asm.Type type8 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "L2136092216", "L155857222", "L160722198", "L2141863763", "Lorg/mockito/asm/Label;", "L785139817" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(128, 107, "L1455205572", "L1115230094", "L1743626135", strArray16);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
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
        int int44 = type1.getDimensions();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(126, type2);
        int int6 = type2.getSize();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "J");
        java.lang.String str10 = signature9.toString();
        boolean boolean11 = type2.equals((java.lang.Object) str10);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(11, type2);
        java.lang.String str13 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type2.getElementType();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
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
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean4 = type1.equals((java.lang.Object) "(ZZFJZ)C");
        int int6 = type1.getOpcode(2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(155, type1);
        org.mockito.asm.Type type8 = local7.getType();
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type8.getInternalName();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type3);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        int int9 = type7.getOpcode(158);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(153, type7);
        org.mockito.asm.Type type11 = local10.getType();
        org.mockito.asm.Type type12 = local10.getType();
        org.mockito.asm.Type type13 = local10.getType();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(126, type13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type13.getElementType();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classEmitter11.visitAnnotation("L506572023", true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        boolean boolean4 = signature2.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer5 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer5.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer5);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean10 = signature2.equals((java.lang.Object) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter11.visit((int) (short) 10, 107, "L136141152", "long", "L1646386141", strArray17);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
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
        classEmitter11.visitSource("L1830056390", "L579744730");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean3 = type0.equals((java.lang.Object) "(ZZFJZ)C");
        int int5 = type0.getOpcode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
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
        int int18 = type17.getSort();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(128, type17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        int int23 = type21.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSort();
        java.lang.String str29 = type27.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (short) 0, type33);
        java.lang.String str36 = type33.toString();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type26, type27, type30, type33 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("D", type21, typeArray37);
        java.lang.String str40 = signature39.getName();
        org.mockito.asm.Type[] typeArray41 = signature39.getArgumentTypes();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type17.getDimensions();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "(ZZS)LB(ZZFJZ)J;", "L552226463" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(97, 156, "org.mockito.cglib.transform.impl.FieldProviderTransformer", "L1101030874", "", strArray17);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer1.visitEnd();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        int int4 = type1.getSort();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) (short) 0, type1);
        org.mockito.asm.Type type6 = local5.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "L1139062361", "Z", "L136141152L2102178846", "L1361929648", "L531782908" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(120, 0, "L236162590", "L1271229830", "L1075101392", strArray13);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        java.lang.String str4 = type2.getDescriptor();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(126, type2);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (short) 0, type16);
        java.lang.String str19 = type16.toString();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type10, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L1992383529", type6, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type6.getInternalName();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
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
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type2.getSort();
        int int5 = type2.getOpcode(100);
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(124, type2);
        org.mockito.asm.Type type7 = local6.getType();
        int int8 = local6.getIndex();
        org.mockito.asm.Type type9 = local6.getType();
        org.mockito.asm.Type type10 = local6.getType();
        org.mockito.asm.Type type11 = local6.getType();
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(7, type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type11.getDimensions();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L954062820", "L1664310589", "L1123017197", 172);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZFJZ)I");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(ZZS)Lorg/mockito/cglib/core/ClassEmitter;");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) '4', type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type3.getDimensions();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fieldProviderTransformer0.visitEnd();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
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
        java.lang.String str48 = type47.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type49 = type47.getElementType();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        boolean boolean4 = type0.equals((java.lang.Object) 124);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str10 = type9.toString();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        java.lang.Class<?> wildcardClass13 = type9.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str22 = type21.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type24.getSort();
        java.lang.String str26 = type24.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 0, type30);
        java.lang.String str33 = type30.toString();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type23, type24, type27, type30 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("D", type18, typeArray34);
        java.lang.String str37 = signature36.getName();
        org.mockito.asm.Type[] typeArray38 = signature36.getArgumentTypes();
        java.lang.String str39 = signature36.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.declare_field(130, "L1210106811", type16, (java.lang.Object) signature36);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "J");
        java.lang.String str4 = signature3.toString();
        java.lang.String str5 = signature3.getDescriptor();
        java.lang.String str6 = signature3.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean8 = signature3.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        int int10 = type7.getSize();
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSort();
        java.lang.String str21 = type19.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((int) (short) 0, type25);
        java.lang.String str28 = type25.toString();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type18, type19, type22, type25 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("D", type13, typeArray29);
        java.lang.String str32 = signature31.getName();
        org.mockito.asm.Type[] typeArray33 = signature31.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray33);
        org.mockito.cglib.core.Local local35 = new org.mockito.cglib.core.Local((int) (byte) 10, type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type7.getInternalName();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type45 = type44.getElementType();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
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
        org.mockito.asm.Type type45 = signature42.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type45.getElementType();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter1.getSuperType();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZFJZ)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
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
        java.lang.String str37 = signature34.getName();
        java.lang.String str38 = signature34.getName();
        org.mockito.asm.Type type39 = signature34.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type39.getDimensions();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSort();
        boolean boolean5 = type0.equals((java.lang.Object) 'a');
        int int6 = type0.getSort();
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
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
        java.lang.String str10 = type9.getInternalName();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = type48.getDimensions();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
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
        java.lang.String str62 = signature44.getName();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer63 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer64 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer63.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer64);
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) fieldProviderTransformer64);
        boolean boolean67 = signature44.equals((java.lang.Object) fieldProviderTransformer64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = fieldProviderTransformer64.visitAnnotation("L1356705684", true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B(ZZFJZ)J");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("L1622913470");
        boolean boolean4 = type1.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
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
        int int13 = classEmitter4.getAccess();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter4.visitInnerClass("L599001847", "LLorg/mockito/cglib/core/Signature;;", "L1850934014", 135);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
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
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.String[] strArray23 = new java.lang.String[] { "L238006702", "L596956658", "L1610306519" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter14.visit(153, 124, "L1894055386", "L976989219", "L1822429019", strArray23);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
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
        java.lang.String str35 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type1.getElementType();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classAdapter6.visitInnerClass("L1557733909", "L304007725", "L1100039235", 11);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        boolean boolean5 = type2.equals((java.lang.Object) "(ZZFJZ)C");
        int int7 = type2.getOpcode(2);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(155, type2);
        int int10 = type2.getOpcode((int) (byte) 10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type12.getSize();
        java.lang.String str14 = type12.getDescriptor();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(126, type12);
        int int16 = type12.getSize();
        java.lang.String str17 = type12.getClassName();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass21 = signature20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.toString();
        java.lang.String str26 = type24.toString();
        boolean boolean28 = type24.equals((java.lang.Object) 124);
        int int29 = type24.getSort();
        int int31 = type24.getOpcode(9);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(100);
        int int38 = type33.getOpcode(104);
        int int40 = type33.getOpcode(10);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((int) (short) 0, type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int47 = type46.getSort();
        int int49 = type46.getOpcode(100);
        int int50 = type46.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str53 = type52.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type54.getSort();
        int int57 = type54.getOpcode(100);
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type43, type46, type51, type52, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray58);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("L1750106643", type33, typeArray58);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray58);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray58);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("L1057211825", type2, typeArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int65 = type2.getDimensions();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZZZZ)J");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
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
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = classEmitter11.getSuperType();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
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
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("L139491627", "LL1076182119;");
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (byte) -1, type21);
        int int23 = type21.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.declare_field(113, "L755349636", type21, (java.lang.Object) (short) -1);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(ZZFJZ)C");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", type1, typeArray4);
        java.lang.String str6 = signature5.getName();
        java.lang.String str7 = signature5.toString();
        org.mockito.asm.Type[] typeArray8 = signature5.getArgumentTypes();
        java.lang.String str9 = signature5.toString();
        org.mockito.asm.Type type10 = signature5.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type10.getElementType();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitEnd();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(100);
        int int5 = type0.getOpcode(104);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        boolean boolean10 = type0.equals((java.lang.Object) classEmitter9);
        int int11 = type0.getSort();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass15 = signature14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = type17.getElementType();
        java.lang.String str20 = type17.getClassName();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass24 = signature23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        boolean boolean29 = type17.equals((java.lang.Object) str28);
        boolean boolean30 = type0.equals((java.lang.Object) str28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type0.getElementType();
    }
}


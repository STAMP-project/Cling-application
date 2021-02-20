import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter10.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter10.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter10.visitInnerClass("", "hi!", "hi!", 1);
        int int31 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(9, "", "hi!", "", (java.lang.Object) "");
        int int39 = classWriter1.newUTF8("hi!");
        int int41 = classWriter1.newClass("hi!");
        int int46 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 7 + "'", int46 == 7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", false);
        int int12 = classWriter1.newNameType("", "hi!");
        int int15 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        byte[] byteArray10 = classWriter1.toByteArray();
        int int14 = classWriter1.newField("hi!", "hi!", "hi!");
        int int18 = classWriter1.newField("", "", "");
        java.lang.Class<?> wildcardClass19 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int46 = classWriter29.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor58 = classWriter52.visitMethod(0, "hi!", "", "hi!", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter29.visitMethod(7, "", "hi!", "hi!", strArray57);
        classWriter1.visit(8, 8, "hi!", "", "hi!", strArray57);
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 11 + "'", int46 == 11);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(annotationVisitor63);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int13 = classWriter1.newMethod("", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("hi!", "", "", (-1));
        classWriter1.visitSource("hi!", "hi!");
        int int21 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int24 = classWriter1.newNameType("hi!", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter32.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter32.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter32.visitInnerClass("", "hi!", "hi!", 1);
        int int53 = classWriter32.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj58 = null;
        org.mockito.asm.FieldVisitor fieldVisitor59 = classWriter32.visitField(10, "", "", "", obj58);
        int int61 = classWriter32.newClass("");
        classWriter32.visitSource("", "hi!");
        int int69 = classWriter32.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray80 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter75.visitMethod(0, "hi!", "", "hi!", strArray80);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter32.visitMethod(2, "hi!", "hi!", "hi!", strArray80);
        classWriter1.visit((int) '#', 3, "", "", "", strArray80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        byte[] byteArray11 = classWriter1.toByteArray();
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        int int52 = classWriter1.newField("hi!", "hi!", "hi!");
        int int54 = classWriter1.newClass("");
        byte[] byteArray55 = classWriter1.toByteArray();
        int int60 = classWriter1.newMethod("hi!", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-54, -2, -70, -66, 0, 0, 0, 10, 0, 15, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 12, 0, 1, 0, 1, 9, 0, 6, 0, 7, 9, 0, 4, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 100, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 2, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 4, 0, 4, 0, 3, 0, 14, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15 + "'", int60 == 15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "", "hi!", false);
        int int20 = classWriter1.newUTF8("hi!");
        int int23 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter((int) '4');
        int int32 = classWriter29.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter29.visitMethod((int) 'a', "hi!", "", "hi!", strArray43);
        classWriter1.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray43);
        int int48 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        byte[] byteArray53 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-54, -2, -70, -66, -1, -1, -1, -1, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 8, 0, 1, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 35, 0, 4, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1, 0, 2, 0, 5, 0, 0, 0, 2, 0, 1, 0, 6, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        int int17 = classWriter1.newNameType("hi!", "hi!");
        int int19 = classWriter1.newClass("hi!");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int6 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        int int15 = classWriter1.newField("", "hi!", "");
        int int17 = classWriter1.newUTF8("hi!");
        int int21 = classWriter1.newField("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        int int22 = classWriter1.newClass("");
        java.lang.String[] strArray27 = null;
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter1.visitMethod((int) '4', "", "hi!", "", strArray27);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNotNull(methodVisitor28);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int5 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "hi!", "", 11);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int31 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) -1);
        int int32 = classWriter1.newNameType("", "");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        classWriter1.visit((int) (short) 100, 11, "", "hi!", "", strArray68);
        classWriter1.visitSource("hi!", "");
        int int77 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 4 + "'", int77 == 4);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) ' ');
        int int24 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        int int17 = classWriter1.newNameType("", "");
        int int20 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter26.newConst((java.lang.Object) 1);
        classWriter26.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor35 = classWriter26.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int37 = classWriter26.newUTF8("");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter43.newMethod("", "", "", true);
        int int53 = classWriter43.newMethod("hi!", "hi!", "hi!", false);
        int int57 = classWriter43.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter(0);
        int int66 = classWriter64.newConst((java.lang.Object) 1);
        int int71 = classWriter64.newMethod("", "", "", true);
        int int76 = classWriter64.newMethod("hi!", "hi!", "hi!", false);
        int int81 = classWriter64.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter87 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray92 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter87.visitMethod(0, "hi!", "", "hi!", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter64.visitMethod(7, "", "hi!", "hi!", strArray92);
        classWriter43.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter26.visitMethod((int) (byte) -1, "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor97 = classWriter1.visitMethod((int) (short) 100, "hi!", "", "", strArray92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 9 + "'", int76 == 9);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 11 + "'", int81 == 11);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter5.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter5.visitOuterClass("", "hi!", "hi!");
        int int18 = classWriter5.newNameType("", "hi!");
        byte[] byteArray19 = classWriter5.toByteArray();
        byte[] byteArray20 = classWriter5.toByteArray();
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newUTF8("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter27.visitMethod(2, "hi!", "hi!", "hi!", strArray37);
        classWriter5.visit(0, 4, "hi!", "", "hi!", strArray37);
        int int40 = classWriter1.newConst((java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter49.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter49.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter49.visitInnerClass("", "hi!", "hi!", 1);
        int int70 = classWriter49.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj75 = null;
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter49.visitField(10, "", "", "", obj75);
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = classWriter49.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor80 = classWriter1.visitField((int) (byte) 10, "", "", "", (java.lang.Object) false);
        int int82 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 8 + "'", int70 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5 + "'", int82 == 5);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter4 = new org.mockito.asm.ClassWriter((int) '4');
        int int7 = classWriter4.newNameType("", "hi!");
        classWriter4.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter4.visitAnnotation("", true);
        int int17 = classWriter4.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter4.visitAnnotation("", true);
        classWriter4.visitSource("", "");
        int int25 = classWriter4.newClass("");
        java.lang.String[] strArray30 = null;
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter4.visitMethod((int) '4', "", "hi!", "", strArray30);
        int int32 = classWriter1.newConst((java.lang.Object) '4');
        int int34 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        org.mockito.asm.MethodVisitor methodVisitor35 = classWriter19.visitMethod((int) 'a', "hi!", "", "hi!", strArray33);
        int int36 = classWriter1.newConst((java.lang.Object) "hi!");
        int int39 = classWriter1.newNameType("", "");
        int int42 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray52 = null;
        classWriter1.visit((int) (byte) 1, 0, "hi!", "", "", strArray52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        int int16 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor25 = classWriter19.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter19.visitOuterClass("", "hi!", "hi!");
        int int34 = classWriter19.newMethod("hi!", "hi!", "", true);
        classWriter19.visitOuterClass("", "", "hi!");
        classWriter19.visitSource("", "");
        int int45 = classWriter19.newField("", "", "");
        classWriter19.visitOuterClass("", "", "");
        int int52 = classWriter19.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classWriter19.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        classWriter19.visit((int) (short) 1, (int) (byte) 10, "", "", "", strArray67);
        java.lang.Class<?> wildcardClass70 = classWriter19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int71 = classWriter1.newConst((java.lang.Object) classWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1cff0c8f");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11 + "'", int45 == 11);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        int int92 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("hi!", "", "", 13);
        int int99 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter(0);
        int int30 = classWriter28.newClass("");
        classWriter28.visitSource("hi!", "");
        int int38 = classWriter28.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = classWriter28.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray56 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor57 = classWriter51.visitMethod(0, "hi!", "", "hi!", strArray56);
        classWriter28.visit((int) (byte) 100, 0, "", "", "hi!", strArray56);
        classWriter1.visit((int) '#', 15, "hi!", "", "", strArray56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(methodVisitor57);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int23 = classWriter1.newClass("hi!");
        int int28 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter30.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter30.visitMethod(4, "", "hi!", "hi!", strArray46);
        int int52 = classWriter30.newField("hi!", "", "hi!");
        classWriter30.visitOuterClass("hi!", "", "");
        classWriter30.visitEnd();
        classWriter30.visitEnd();
        int int60 = classWriter30.newUTF8("");
        classWriter30.visitOuterClass("hi!", "", "hi!");
        classWriter30.visitInnerClass("hi!", "hi!", "hi!", 5);
        int int70 = classWriter1.newConst((java.lang.Object) "hi!");
        int int74 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        int int46 = classWriter33.newNameType("hi!", "");
        int int47 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitSource("hi!", "");
        int int53 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter17.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter17.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int32 = classWriter17.newField("hi!", "hi!", "hi!");
        int int37 = classWriter17.newMethod("", "", "", false);
        int int41 = classWriter17.newField("", "hi!", "hi!");
        classWriter17.visitEnd();
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int65 = classWriter48.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter48.visitMethod(7, "", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter17.visitMethod((int) (byte) 100, "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter1.visitMethod((-1), "", "", "", strArray76);
        java.lang.Class<?> wildcardClass81 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 11 + "'", int41 == 11);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        classWriter1.visitEnd();
        byte[] byteArray33 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newClass("");
        classWriter39.visitSource("hi!", "");
        int int49 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter39.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        classWriter39.visit((int) (byte) 100, 0, "", "", "hi!", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod(12, "hi!", "", "", strArray67);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) ' ');
        org.mockito.asm.ClassWriter classWriter3 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter3.newNameType("", "hi!");
        byte[] byteArray7 = classWriter3.toByteArray();
        int int9 = classWriter3.newClass("hi!");
        java.lang.String[] strArray15 = null;
        classWriter3.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray15);
        int int17 = classWriter1.newConst((java.lang.Object) "");
        int int19 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitEnd();
        int int11 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", true);
        int int14 = classWriter1.newMethod("", "", "hi!", false);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int29 = classWriter21.newConst((java.lang.Object) 10.0d);
        int int31 = classWriter21.newClass("hi!");
        classWriter21.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int51 = classWriter49.newConst((java.lang.Object) 1);
        int int56 = classWriter49.newMethod("", "", "", true);
        int int61 = classWriter49.newMethod("hi!", "hi!", "hi!", false);
        int int62 = classWriter41.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        int int72 = classWriter69.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter78 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter78.visitMethod(0, "hi!", "", "hi!", strArray83);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter69.visitMethod((int) 'a', "hi!", "", "hi!", strArray83);
        classWriter41.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray83);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter21.visitMethod(4, "hi!", "", "", strArray83);
        classWriter1.visit(4, 1, "", "hi!", "hi!", strArray83);
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = classWriter1.visitAnnotation("", false);
        java.lang.String[] strArray97 = null;
        classWriter1.visit(16, 7, "", "hi!", "", strArray97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 9 + "'", int61 == 9);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int18 = classWriter1.newField("hi!", "", "hi!");
        int int21 = classWriter1.newNameType("", "");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        int int28 = classWriter1.newNameType("hi!", "");
        classWriter1.visitInnerClass("", "", "hi!", (int) (byte) 0);
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newClass("");
        classWriter35.visitOuterClass("", "hi!", "");
        int int45 = classWriter35.newField("hi!", "", "");
        int int47 = classWriter35.newUTF8("");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = classWriter1.newConst((java.lang.Object) classWriter35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2babe2ed");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter20.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter20.visitMethod(4, "", "hi!", "hi!", strArray36);
        byte[] byteArray39 = classWriter20.toByteArray();
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter(0);
        int int47 = classWriter45.newConst((java.lang.Object) 1);
        int int52 = classWriter45.newMethod("", "", "", true);
        int int57 = classWriter45.newMethod("hi!", "hi!", "hi!", false);
        int int62 = classWriter45.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter45.visitMethod(7, "", "hi!", "hi!", strArray73);
        byte[] byteArray76 = classWriter45.toByteArray();
        int int78 = classWriter45.newClass("");
        org.mockito.asm.FieldVisitor fieldVisitor79 = classWriter20.visitField(15, "hi!", "", "", (java.lang.Object) "");
        int int80 = classWriter1.newConst((java.lang.Object) 15);
        classWriter1.visitEnd();
        int int83 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 6, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 11 + "'", int62 == 11);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 6 + "'", int83 == 6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        byte[] byteArray10 = classWriter1.toByteArray();
        int int14 = classWriter1.newField("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newConst((java.lang.Object) 1);
        int int27 = classWriter20.newMethod("hi!", "hi!", "", true);
        byte[] byteArray28 = classWriter20.toByteArray();
        classWriter20.visitInnerClass("", "hi!", "", (int) (short) 1);
        org.mockito.asm.FieldVisitor fieldVisitor34 = classWriter1.visitField(0, "", "", "", (java.lang.Object) "");
        int int36 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(100);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitInnerClass("", "", "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("hi!", "hi!", "hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        classWriter1.visitInnerClass("", "", "", (int) (short) -1);
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        int int31 = classWriter28.newNameType("", "hi!");
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter28.visitAnnotation("", true);
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int54 = classWriter49.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter49.visitMethod(4, "", "hi!", "hi!", strArray65);
        classWriter28.visit(10, (int) (byte) 100, "", "", "", strArray65);
        int int72 = classWriter28.newField("", "", "");
        int int73 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        int int81 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 11 + "'", int73 == 11);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 8 + "'", int81 == 8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("", "hi!", "");
        int int25 = classWriter1.newField("hi!", "", "");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int33 = classWriter1.newField("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter35.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter35.visitAnnotation("hi!", true);
        classWriter35.visitSource("", "");
        int int46 = classWriter35.newUTF8("hi!");
        int int47 = classWriter1.newConst((java.lang.Object) int46);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 11 + "'", int47 == 11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        int int11 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitOuterClass("hi!", "", "");
        int int21 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        int int75 = classWriter1.newMethod("", "hi!", "", true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int3 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(8);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter(0);
        int int16 = classWriter14.newClass("");
        classWriter14.visitSource("hi!", "");
        byte[] byteArray20 = classWriter14.toByteArray();
        int int24 = classWriter14.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        int int34 = classWriter31.newNameType("", "hi!");
        classWriter31.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        classWriter31.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray59);
        classWriter14.visit((-1), (int) (byte) 1, "hi!", "", "", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter8.visitMethod(2, "", "hi!", "hi!", strArray59);
        classWriter1.visit(0, 3, "hi!", "hi!", "hi!", strArray59);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter((int) '4');
        int int78 = classWriter75.newNameType("", "hi!");
        classWriter75.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = classWriter75.visitAnnotation("", true);
        int int88 = classWriter75.newNameType("hi!", "");
        int int90 = classWriter75.newClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor91 = classWriter1.visitField(15, "hi!", "", "hi!", (java.lang.Object) classWriter75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2f5e0f2d");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 6 + "'", int88 == 6);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 4 + "'", int90 == 4);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        int int24 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor36 = classWriter30.visitMethod(0, "hi!", "", "hi!", strArray35);
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter1.visitMethod((int) ' ', "", "hi!", "hi!", strArray35);
        classWriter1.visitInnerClass("", "hi!", "", 1);
        int int47 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 7 + "'", int47 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor50);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 1);
        int int10 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(4);
        classWriter16.visitOuterClass("hi!", "", "hi!");
        classWriter16.visitSource("hi!", "hi!");
        classWriter16.visitSource("hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor27 = classWriter1.visitField(9, "hi!", "hi!", "", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor27);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter(0);
        int int22 = classWriter20.newClass("");
        classWriter20.visitSource("hi!", "");
        byte[] byteArray26 = classWriter20.toByteArray();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter32.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        classWriter44.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        int int61 = classWriter58.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter58.visitMethod((int) 'a', "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter32.visitMethod(7, "", "", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter20.visitMethod(9, "hi!", "hi!", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod(4, "hi!", "hi!", "hi!", strArray72);
        int int81 = classWriter1.newNameType("hi!", "hi!");
        int int85 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 8 + "'", int85 == 8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "", "hi!", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        int int22 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 12, 0, 2, 0, 1, 10, 0, 3, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("hi!", false);
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int12 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("hi!", "");
        int int57 = classWriter1.newMethod("", "hi!", "", false);
        int int61 = classWriter1.newField("", "hi!", "");
        int int63 = classWriter1.newClass("hi!");
        int int65 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "hi!", 0);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 7, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 4, 0, 3, 0, 5, 0, 8, 0, 0, 0, 10, 0, 1, 0, 3, 0, 6, 0, 2, 0, 0]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "", "", (int) (byte) 100);
        classWriter1.visitEnd();
        int int16 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter4 = new org.mockito.asm.ClassWriter((-1));
        classWriter4.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray14 = null;
        classWriter4.visit(9, (int) '#', "", "", "", strArray14);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter21.newConst((java.lang.Object) 1);
        int int28 = classWriter21.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter4.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int30 = classWriter1.newConst((java.lang.Object) 100);
        int int34 = classWriter1.newField("", "", "");
        classWriter1.visitOuterClass("", "", "");
        int int41 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter47.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter47.visitMethod(4, "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter1.visitMethod((int) '#', "hi!", "", "", strArray73);
        int int82 = classWriter1.newMethod("hi!", "", "hi!", false);
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.Attribute attribute86 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 9 + "'", int82 == 9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        int int52 = classWriter1.newField("hi!", "hi!", "hi!");
        int int54 = classWriter1.newClass("");
        byte[] byteArray55 = classWriter1.toByteArray();
        int int58 = classWriter1.newNameType("hi!", "hi!");
        int int60 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-54, -2, -70, -66, 0, 0, 0, 10, 0, 15, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 12, 0, 1, 0, 1, 9, 0, 6, 0, 7, 9, 0, 4, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 100, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 2, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 4, 0, 4, 0, 3, 0, 14, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter15.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        classWriter27.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        int int44 = classWriter41.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter50.visitMethod(0, "hi!", "", "hi!", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor57 = classWriter41.visitMethod((int) 'a', "hi!", "", "hi!", strArray55);
        classWriter27.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter15.visitMethod(7, "", "", "", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter1.visitMethod((int) (short) 10, "hi!", "", "", strArray55);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(methodVisitor57);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newClass("hi!");
        int int14 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        byte[] byteArray10 = classWriter1.toByteArray();
        int int14 = classWriter1.newField("hi!", "hi!", "hi!");
        int int18 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter24.visitInnerClass("", "", "hi!", 2);
        int int33 = classWriter24.newField("hi!", "", "");
        int int35 = classWriter24.newUTF8("");
        int int38 = classWriter24.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter24.visitAnnotation("hi!", true);
        classWriter24.visitInnerClass("hi!", "", "", 4);
        int int48 = classWriter24.newUTF8("hi!");
        int int52 = classWriter24.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter1.visitField(12, "", "", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor53);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int5 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter7.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter7.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter7.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int26 = classWriter7.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter7.visitAnnotation("", false);
        int int30 = classWriter1.newConst((java.lang.Object) "");
        int int32 = classWriter1.newUTF8("");
        int int34 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(13);
        int int3 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        int int11 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter13.newConst((java.lang.Object) 1);
        int int20 = classWriter13.newMethod("hi!", "hi!", "", true);
        classWriter13.visitSource("", "");
        int int26 = classWriter13.newNameType("hi!", "hi!");
        int int31 = classWriter13.newMethod("", "hi!", "", false);
        int int32 = classWriter1.newConst((java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter1.visitAnnotation("", false);
        int int43 = classWriter1.newMethod("", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) '4');
        int int11 = classWriter8.newNameType("", "hi!");
        classWriter8.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        int int25 = classWriter22.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter22.visitMethod((int) 'a', "hi!", "", "hi!", strArray36);
        classWriter8.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray36);
        int int44 = classWriter8.newMethod("hi!", "hi!", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter8.visitAnnotation("", false);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = classWriter1.newConst((java.lang.Object) annotationVisitor47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@5cc90ec5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor47);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 10);
        classWriter1.visitOuterClass("", "", "hi!");
        byte[] byteArray40 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter42.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = classWriter42.visitAnnotation("hi!", true);
        int int52 = classWriter42.newField("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classWriter42.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = classWriter42.visitAnnotation("", false);
        int int59 = classWriter1.newConst((java.lang.Object) false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 3, 104, 105, 33, 1, 0, 0, 8, 0, 1, 7, 0, 2, 12, 0, 2, 0, 2, 9, 0, 4, 0, 5, 7, 0, 1, 12, 0, 1, 0, 1, 9, 0, 7, 0, 8, 12, 0, 2, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 2, 0, 12, 0, 0, 0, 4, 0, 4, 0, 10, 0, 13, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 14 + "'", int59 == 14);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int29 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        int int40 = classWriter35.newClass("");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter47.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter47.visitOuterClass("", "hi!", "hi!");
        int int60 = classWriter47.newNameType("", "hi!");
        byte[] byteArray61 = classWriter47.toByteArray();
        byte[] byteArray62 = classWriter47.toByteArray();
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter(0);
        int int71 = classWriter69.newUTF8("hi!");
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter69.visitMethod(2, "hi!", "hi!", "hi!", strArray79);
        classWriter47.visit(0, 4, "hi!", "", "hi!", strArray79);
        classWriter35.visit((int) ' ', 4, "", "", "hi!", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter1.visitMethod((int) (byte) 0, "", "", "", strArray79);
        int int85 = classWriter1.newClass("");
        int int90 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 9 + "'", int85 == 9);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 12 + "'", int90 == 12);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        byte[] byteArray9 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 1);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        classWriter1.visitOuterClass("", "", "");
        int int44 = classWriter1.newMethod("hi!", "hi!", "", true);
        byte[] byteArray45 = classWriter1.toByteArray();
        int int49 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 16, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 7, 0, 1, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 11, 0, 12, 0, 14, 0, 4, 0, 12, 0, 12, 0, 3, 0, 4, 0, 12, 0, 4, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 10, 0, 0, 0, 2, 0, 2, 0, 11, 0, 0, 0, 4, 0, 4, 0, 13]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        int int18 = classWriter15.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter15.visitMethod((int) 'a', "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray29);
        org.mockito.asm.FieldVisitor fieldVisitor38 = classWriter1.visitField(12, "hi!", "hi!", "", (java.lang.Object) 0.0f);
        byte[] byteArray39 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 4, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 10, 0, 6, 0, 6, 0, 0, 0, 1, 0, 12, 0, 2, 0, 2, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 2, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter10.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter10.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter10.visitInnerClass("", "hi!", "hi!", 1);
        int int31 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(9, "", "hi!", "", (java.lang.Object) "");
        int int39 = classWriter1.newUTF8("hi!");
        int int41 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter26.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor40 = classWriter34.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        classWriter46.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        int int63 = classWriter60.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter60.visitMethod((int) 'a', "hi!", "", "hi!", strArray74);
        classWriter46.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter34.visitMethod(7, "", "", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter26.visitMethod((int) (short) 10, "hi!", "", "", strArray74);
        classWriter1.visit(11, 6, "hi!", "", "", strArray74);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(5);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classWriter1.visitAnnotation("hi!", false);
        int int11 = classWriter1.newNameType("", "");
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter22.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int37 = classWriter34.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter43.visitMethod(0, "hi!", "", "hi!", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter34.visitMethod((int) 'a', "hi!", "", "hi!", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter22.visitMethod(4, "hi!", "hi!", "hi!", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter1.visitMethod(2, "", "", "", strArray48);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) (byte) 0);
        classWriter58.visitSource("hi!", "hi!");
        int int66 = classWriter58.newMethod("", "", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = classWriter58.visitAnnotation("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor70 = classWriter1.visitField(0, "", "hi!", "", (java.lang.Object) classWriter58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@39e70f87");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor69);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        classWriter1.visitInnerClass("", "", "hi!", 11);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int25 = classWriter1.newMethod("hi!", "", "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int33 = classWriter31.newConst((java.lang.Object) 1);
        int int38 = classWriter31.newMethod("", "", "", true);
        int int43 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int48 = classWriter31.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter31.visitMethod(7, "", "hi!", "hi!", strArray59);
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = classWriter31.visitAnnotation("", true);
        int int66 = classWriter31.newClass("hi!");
        int int67 = classWriter1.newConst((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11 + "'", int48 == 11);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 7 + "'", int66 == 7);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 7 + "'", int67 == 7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        byte[] byteArray15 = classWriter1.toByteArray();
        int int18 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 3, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 8, 0, 0, 0, 4, 0, 2, 0, 4, 0, 9, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 4);
        classWriter1.visitInnerClass("", "", "hi!", (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter(0);
        int int19 = classWriter17.newConst((java.lang.Object) 1);
        int int24 = classWriter17.newMethod("", "", "", true);
        int int29 = classWriter17.newMethod("hi!", "hi!", "hi!", false);
        classWriter17.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter35.visitMethod((int) 'a', "hi!", "", "hi!", strArray49);
        int int52 = classWriter17.newConst((java.lang.Object) "hi!");
        int int55 = classWriter17.newNameType("", "");
        int int58 = classWriter17.newNameType("", "hi!");
        int int61 = classWriter17.newNameType("hi!", "hi!");
        int int62 = classWriter1.newConst((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 11 + "'", int58 == 11);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6 + "'", int62 == 6);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor21 = classWriter1.visitMethod(9, "", "hi!", "hi!", strArray20);
        int int24 = classWriter1.newNameType("", "hi!");
        int int26 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodVisitor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        int int18 = classWriter1.newField("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter24.visitEnd();
        int int27 = classWriter24.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter24.visitAnnotation("", false);
        classWriter24.visitOuterClass("", "hi!", "");
        int int36 = classWriter24.newUTF8("");
        classWriter24.visitInnerClass("hi!", "hi!", "", 7);
        byte[] byteArray42 = classWriter24.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter1.visitField(0, "", "", "", (java.lang.Object) classWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@229aea0c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 7, 0, 3, 12, 0, 1, 0, 3, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 6, 0, 0, 0, 4, 0, 4, 0, 5, 0, 7, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 7, 0, 8, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int8 = classWriter1.newNameType("hi!", "");
        byte[] byteArray9 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newConst((java.lang.Object) 1);
        int int19 = classWriter15.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int30 = classWriter25.newMethod("", "", "", true);
        int int35 = classWriter25.newMethod("hi!", "hi!", "hi!", false);
        int int39 = classWriter25.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter46.newConst((java.lang.Object) 1);
        int int53 = classWriter46.newMethod("", "", "", true);
        int int58 = classWriter46.newMethod("hi!", "hi!", "hi!", false);
        int int63 = classWriter46.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter46.visitMethod(7, "", "hi!", "hi!", strArray74);
        classWriter25.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter15.visitMethod((int) (byte) 100, "hi!", "", "hi!", strArray74);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor79 = classWriter1.visitMethod(14, "hi!", "", "", strArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 3, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 11 + "'", int63 == 11);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("", "hi!");
        int int11 = classWriter1.newClass("");
        byte[] byteArray12 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 1, 0, 5, 0, 0, 0, 3, 104, 105, 33]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        int int24 = classWriter1.newNameType("", "");
        byte[] byteArray25 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass26 = byteArray25.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 32, 0, 8, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 1, 1, 0, 0, 7, 0, 3, 7, 0, 1, 12, 0, 3, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 2, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 0, 0, 2, 0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("hi!", "", "", 4);
        int int25 = classWriter1.newUTF8("hi!");
        int int27 = classWriter1.newClass("hi!");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int33 = classWriter31.newConst((java.lang.Object) 1);
        int int38 = classWriter31.newMethod("", "", "", true);
        int int43 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter31.newField("", "", "");
        int int48 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int36 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitOuterClass("", "", "");
        int int44 = classWriter1.newField("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        int int14 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        int int17 = classWriter1.newNameType("hi!", "hi!");
        int int19 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int30 = classWriter25.newMethod("", "", "", true);
        int int35 = classWriter25.newMethod("hi!", "hi!", "hi!", false);
        int int39 = classWriter25.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter46.newConst((java.lang.Object) 1);
        int int53 = classWriter46.newMethod("", "", "", true);
        int int58 = classWriter46.newMethod("hi!", "hi!", "hi!", false);
        int int63 = classWriter46.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter69.visitMethod(0, "hi!", "", "hi!", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter46.visitMethod(7, "", "hi!", "hi!", strArray74);
        classWriter25.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) (short) 100, "", "hi!", "hi!", strArray74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 11 + "'", int63 == 11);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        int int39 = classWriter1.newNameType("", "");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        byte[] byteArray14 = classWriter1.toByteArray();
        byte[] byteArray15 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "", "", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 7, 0, 3, 0, 2, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 7, 0, 3, 0, 2, -1, -1]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newClass("");
        classWriter18.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        byte[] byteArray25 = classWriter1.toByteArray();
        byte[] byteArray26 = classWriter1.toByteArray();
        int int28 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 8, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 8, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newClass("");
        int int31 = classWriter27.newConst((java.lang.Object) 10L);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) int31);
        int int34 = classWriter1.newUTF8("hi!");
        int int37 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter15.visitInnerClass("", "", "hi!", 2);
        int int24 = classWriter15.newField("hi!", "", "");
        int int26 = classWriter15.newUTF8("");
        int int29 = classWriter15.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter15.visitAnnotation("hi!", true);
        int int37 = classWriter15.newMethod("", "hi!", "hi!", false);
        classWriter15.visitInnerClass("hi!", "", "", (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = classWriter15.visitAnnotation("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter1.visitField(1, "hi!", "hi!", "hi!", (java.lang.Object) classWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@59c02024");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newClass("hi!");
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("", "hi!", "", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        int int24 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter(0);
        int int30 = classWriter28.newConst((java.lang.Object) 1);
        int int35 = classWriter28.newMethod("", "", "", true);
        int int40 = classWriter28.newMethod("hi!", "hi!", "hi!", false);
        classWriter28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        int int63 = classWriter28.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter(0);
        int int67 = classWriter65.newUTF8("hi!");
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter65.visitMethod(2, "hi!", "hi!", "hi!", strArray75);
        byte[] byteArray77 = classWriter65.toByteArray();
        int int82 = classWriter65.newMethod("", "", "hi!", false);
        int int83 = classWriter28.newConst((java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor84 = classWriter1.visitField(7, "hi!", "", "hi!", (java.lang.Object) "hi!");
        int int88 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor84);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter22.visitEnd();
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((-1));
        classWriter25.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray35 = null;
        classWriter25.visit(9, (int) '#', "", "", "", strArray35);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newConst((java.lang.Object) 1);
        int int49 = classWriter42.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor50 = classWriter25.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int51 = classWriter22.newConst((java.lang.Object) 100);
        int int52 = classWriter18.newConst((java.lang.Object) int51);
        int int55 = classWriter18.newNameType("hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor56 = classWriter1.visitField(8, "", "hi!", "", (java.lang.Object) "hi!");
        int int58 = classWriter1.newClass("hi!");
        int int62 = classWriter1.newField("hi!", "", "");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int15 = classWriter1.newField("", "hi!", "");
        int int18 = classWriter1.newNameType("", "hi!");
        int int23 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((-1));
        classWriter30.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor40 = classWriter30.visitField(8, "hi!", "", "", (java.lang.Object) "");
        classWriter30.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = classWriter1.newConst((java.lang.Object) classWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2bef9e90");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor40);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int32 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int43 = classWriter41.newClass("hi!");
        classWriter41.visitEnd();
        int int47 = classWriter41.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int55 = classWriter53.newUTF8("");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter(0);
        int int64 = classWriter62.newConst((java.lang.Object) 1);
        int int69 = classWriter62.newMethod("", "", "", true);
        int int74 = classWriter62.newMethod("hi!", "hi!", "hi!", false);
        int int79 = classWriter62.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter62.visitMethod(7, "", "hi!", "hi!", strArray90);
        classWriter53.visit(2, 7, "hi!", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter41.visitMethod((int) '#', "", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor95 = classWriter1.visitMethod((int) (short) 0, "", "", "hi!", strArray90);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 9 + "'", int74 == 9);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 11 + "'", int79 == 11);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor9);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        classWriter1.visitOuterClass("", "", "");
        int int44 = classWriter1.newMethod("", "", "hi!", false);
        int int49 = classWriter1.newMethod("hi!", "", "hi!", false);
        int int51 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 14 + "'", int44 == 14);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(8);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter(0);
        int int16 = classWriter14.newClass("");
        classWriter14.visitSource("hi!", "");
        byte[] byteArray20 = classWriter14.toByteArray();
        int int24 = classWriter14.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        int int34 = classWriter31.newNameType("", "hi!");
        classWriter31.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        classWriter31.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray59);
        classWriter14.visit((-1), (int) (byte) 1, "hi!", "", "", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter8.visitMethod(2, "", "hi!", "hi!", strArray59);
        classWriter1.visit(0, 3, "hi!", "hi!", "hi!", strArray59);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newConst((java.lang.Object) (short) 1);
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classWriter1.visitAnnotation("hi!", true);
        int int29 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int29 = classWriter1.newField("", "", "");
        int int34 = classWriter1.newMethod("", "hi!", "", true);
        int int36 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 13 + "'", int34 == 13);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        int int33 = classWriter23.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter23.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        classWriter23.visit((int) (byte) 100, 0, "", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        classWriter23.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(10, "", "", "hi!", strArray65);
        int int72 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter1.visitAnnotation("hi!", false);
        byte[] byteArray76 = classWriter1.toByteArray();
        int int81 = classWriter1.newMethod("hi!", "", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 11 + "'", int72 == 11);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 15, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 12, 0, 4, 0, 4, 9, 0, 7, 0, 8, 12, 0, 4, 0, 2, 9, 0, 7, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 4, 0, 4, 0, 1, 0, 12, 0, 0, 0, 2, 0, 2, 0, 2, 0, 13, 0, 0, 0, 10, 0, 1, 0, 7, 0, 3, 0, 2, -1, -1, 0, 14, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 15 + "'", int81 == 15);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        byte[] byteArray11 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((-1));
        classWriter13.visitOuterClass("", "", "hi!");
        int int21 = classWriter13.newField("", "", "");
        classWriter13.visitSource("", "");
        classWriter13.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter32.newMethod("", "", "", true);
        classWriter32.visitEnd();
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        classWriter45.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classWriter45.visitAnnotation("", true);
        classWriter45.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter(0);
        int int71 = classWriter66.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter66.visitMethod(4, "", "hi!", "hi!", strArray82);
        classWriter45.visit(10, (int) (byte) 100, "", "", "", strArray82);
        classWriter32.visit((int) '4', (int) '#', "", "", "", strArray82);
        classWriter13.visit((int) (short) 10, 3, "", "", "", strArray82);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = classWriter1.newConst((java.lang.Object) strArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@7da9ea7b");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 4 + "'", int71 == 4);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        int int4 = classWriter1.newNameType("", "");
        int int8 = classWriter1.newField("", "hi!", "hi!");
        byte[] byteArray9 = classWriter1.toByteArray();
        int int13 = classWriter1.newField("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 12, 0, 1, 0, 1, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 4, 0, 4, 9, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor16);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int9 = classWriter1.newField("hi!", "hi!", "");
        int int12 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        java.lang.String[] strArray20 = null;
        classWriter1.visit(0, 7, "hi!", "hi!", "", strArray20);
        byte[] byteArray22 = classWriter1.toByteArray();
        int int25 = classWriter1.newNameType("", "hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 7, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "hi!");
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newUTF8("hi!");
        org.mockito.asm.Attribute attribute35 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 9, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 3, 104, 105, 33, 0, 12, 0, 0, 0, 4, 0, 6, 0, 3]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        classWriter1.visitOuterClass("", "", "");
        int int44 = classWriter1.newMethod("", "", "hi!", false);
        org.mockito.asm.Attribute attribute45 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 14 + "'", int44 == 14);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int20 = classWriter1.newUTF8("hi!");
        int int22 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int27 = classWriter1.newClass("hi!");
        int int30 = classWriter1.newNameType("hi!", "");
        int int33 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newUTF8("");
        int int11 = classWriter1.newNameType("hi!", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        int int14 = classWriter1.newNameType("hi!", "hi!");
        int int16 = classWriter1.newUTF8("hi!");
        int int20 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray84);
        int int87 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5 + "'", int87 == 5);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int30 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitSource("", "");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!" };
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter1.visitMethod(3, "", "", "", strArray41);
        int int47 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("hi!", "hi!", "hi!");
        byte[] byteArray17 = classWriter1.toByteArray();
        classWriter1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 9, 0, 6, 0, 7, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 9, 0, 0, 0, 2, 0, 4, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int30 = classWriter1.newMethod("hi!", "", "", false);
        int int34 = classWriter1.newField("hi!", "", "hi!");
        int int37 = classWriter1.newNameType("hi!", "hi!");
        int int40 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter46.newConst((java.lang.Object) 1);
        int int53 = classWriter46.newMethod("hi!", "hi!", "", true);
        classWriter46.visitInnerClass("hi!", "", "", (-1));
        classWriter46.visitSource("hi!", "hi!");
        classWriter46.visitSource("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter1.visitField(7, "hi!", "", "hi!", (java.lang.Object) classWriter46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@40680483");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 6 + "'", int53 == 6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter7 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor13 = classWriter7.visitMethod(0, "hi!", "", "hi!", strArray12);
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newConst((java.lang.Object) 1);
        int int22 = classWriter15.newMethod("", "", "", true);
        int int27 = classWriter15.newMethod("hi!", "hi!", "hi!", false);
        int int28 = classWriter7.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter35.visitMethod((int) 'a', "hi!", "", "hi!", strArray49);
        classWriter7.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray49);
        int int54 = classWriter7.newUTF8("hi!");
        int int55 = classWriter1.newConst((java.lang.Object) int54);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = classWriter1.visitAnnotation("", true);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodVisitor13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor58);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        byte[] byteArray37 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 6, 0, 7, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 10, 0, 1, 0, 1, 0, 2, 0, 9, 0, 0, 0, 2, 0, 4, 0, 10, 0, 0, 0, 2, 0, 1, 0, 10, 0, 1, 0, 1, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 11, 0, 0, 0, 2, 0, 1, 0, 12, 0, 0, 0, 3, 104, 105, 33, 0, 13, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newUTF8("");
        int int11 = classWriter1.newNameType("hi!", "");
        int int13 = classWriter1.newUTF8("hi!");
        java.lang.Class<?> wildcardClass14 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter1.visitAnnotation("hi!", true);
        int int42 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray47 = null;
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter1.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray47);
        int int52 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 12 + "'", int52 == 12);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitInnerClass("", "", "", (-1));
        int int13 = classWriter1.newField("hi!", "hi!", "hi!");
        byte[] byteArray14 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 7, 0, 2, 12, 0, 2, 0, 2, 9, 0, 5, 0, 6, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, -1, -1]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 1, 0, 3, 0, 0, 0, 3, 104, 105, 33]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int13 = classWriter1.newUTF8("");
        int int18 = classWriter1.newMethod("", "", "hi!", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray84);
        classWriter1.visitEnd();
        int int88 = classWriter1.newUTF8("hi!");
        int int90 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 8 + "'", int90 == 8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        int int12 = classWriter1.newNameType("", "");
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        int int8 = classWriter1.newField("", "", "hi!");
        int int13 = classWriter1.newMethod("", "", "", false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        int int36 = classWriter33.newNameType("", "hi!");
        classWriter33.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter33.visitAnnotation("", true);
        int int46 = classWriter33.newNameType("hi!", "");
        int int47 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitEnd();
        int int52 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter31.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        int int46 = classWriter43.newNameType("", "hi!");
        classWriter43.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        int int60 = classWriter57.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter66.visitMethod(0, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter57.visitMethod((int) 'a', "hi!", "", "hi!", strArray71);
        classWriter43.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter31.visitMethod(7, "", "", "", strArray71);
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter1.visitField(4, "", "hi!", "hi!", (java.lang.Object) "");
        byte[] byteArray77 = classWriter1.toByteArray();
        int int81 = classWriter1.newField("hi!", "hi!", "");
        classWriter1.visitInnerClass("hi!", "hi!", "", 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-54, -2, -70, -66, 0, 0, 0, 32, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 1, 1, 0, 0, 7, 0, 3, 7, 0, 1, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 2, 0, 4, 0, 5, 0, 0, 0, 1, 0, 4, 0, 3, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 8, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 4, 0, 5, 0, 2]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 11 + "'", int81 == 11);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        int int21 = classWriter1.newMethod("", "", "hi!", false);
        int int23 = classWriter1.newUTF8("");
        int int27 = classWriter1.newField("hi!", "", "hi!");
        int int30 = classWriter1.newNameType("hi!", "");
        java.lang.Object obj35 = null;
        org.mockito.asm.FieldVisitor fieldVisitor36 = classWriter1.visitField((int) (short) 1, "hi!", "", "hi!", obj35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(fieldVisitor36);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int36 = classWriter1.newMethod("", "hi!", "hi!", false);
        java.lang.String[] strArray42 = null;
        classWriter1.visit(15, (int) (byte) -1, "hi!", "", "", strArray42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int18 = classWriter1.newMethod("hi!", "", "", false);
        byte[] byteArray19 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 12, 0, 1, 0, 1, 10, 0, 4, 0, 6, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 3, 104, 105, 33, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        int int17 = classWriter1.newClass("");
        int int19 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(3);
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newConst((java.lang.Object) 1);
        int int51 = classWriter44.newMethod("", "", "", true);
        int int56 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        int int57 = classWriter36.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        int int67 = classWriter64.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter73.visitMethod(0, "hi!", "", "hi!", strArray78);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter64.visitMethod((int) 'a', "hi!", "", "hi!", strArray78);
        classWriter36.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray78);
        classWriter29.visit(0, 13, "", "", "", strArray78);
        int int86 = classWriter29.newField("", "hi!", "hi!");
        int int90 = classWriter29.newField("", "", "hi!");
        int int92 = classWriter29.newUTF8("");
        org.mockito.asm.FieldVisitor fieldVisitor93 = classWriter1.visitField((int) (short) 0, "", "hi!", "hi!", (java.lang.Object) int92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 5 + "'", int86 == 5);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 7 + "'", int90 == 7);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor93);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newClass("hi!");
        int int6 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter1.visitAnnotation("", false);
        int int27 = classWriter1.newUTF8("");
        int int31 = classWriter1.newField("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("", false);
        byte[] byteArray20 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        int int25 = classWriter22.newNameType("", "hi!");
        int int27 = classWriter22.newClass("");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor40 = classWriter34.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter34.visitOuterClass("", "hi!", "hi!");
        int int47 = classWriter34.newNameType("", "hi!");
        byte[] byteArray48 = classWriter34.toByteArray();
        byte[] byteArray49 = classWriter34.toByteArray();
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter56.newUTF8("hi!");
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter56.visitMethod(2, "hi!", "hi!", "hi!", strArray66);
        classWriter34.visit(0, 4, "hi!", "", "hi!", strArray66);
        classWriter22.visit((int) ' ', 4, "", "", "hi!", strArray66);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter71.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor82 = classWriter71.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter71.visitInnerClass("", "hi!", "hi!", 1);
        int int92 = classWriter71.newMethod("hi!", "hi!", "hi!", false);
        int int93 = classWriter22.newConst((java.lang.Object) "hi!");
        int int95 = classWriter22.newClass("hi!");
        int int96 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray97 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 15, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 7, 0, 1, 12, 0, 1, 0, 2, 11, 0, 6, 0, 7, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 13, 0, 0, 0, 4, 0, 4, 0, 5, 0, 14, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 8 + "'", int92 == 8);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 6 + "'", int93 == 6);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 5 + "'", int95 == 5);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 15 + "'", int96 == 15);
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray97), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 16, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 7, 0, 1, 12, 0, 1, 0, 2, 11, 0, 6, 0, 7, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 8, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 13, 0, 0, 0, 4, 0, 4, 0, 5, 0, 14, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", 1);
        int int18 = classWriter1.newClass("");
        int int21 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int29 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        classWriter1.visitEnd();
        byte[] byteArray33 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newClass("");
        classWriter39.visitSource("hi!", "");
        int int49 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter39.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        classWriter39.visit((int) (byte) 100, 0, "", "", "hi!", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod(12, "hi!", "", "", strArray67);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        byte[] byteArray74 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass75 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 1, 0, 12, 0, 3, 0, 1, 0, 1, 0, 9, 0, 0, 0, 2, 0, 1, 0, 4, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 4);
        int int12 = classWriter1.newClass("");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter20.visitEnd();
        int int23 = classWriter20.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classWriter20.visitAnnotation("", false);
        classWriter20.visitOuterClass("", "hi!", "");
        int int34 = classWriter20.newField("", "hi!", "hi!");
        int int39 = classWriter20.newMethod("", "hi!", "", false);
        int int41 = classWriter20.newClass("");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter(0);
        int int60 = classWriter55.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter66.visitMethod(0, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter55.visitMethod(4, "", "hi!", "hi!", strArray71);
        classWriter48.visit(10, 6, "", "hi!", "", strArray71);
        classWriter20.visit(8, (int) '#', "hi!", "hi!", "", strArray71);
        classWriter1.visit((int) (short) 100, 7, "hi!", "hi!", "hi!", strArray71);
        byte[] byteArray77 = classWriter1.toByteArray();
        int int82 = classWriter1.newMethod("", "hi!", "", true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 9, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 7, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 3, 0, 6, 0, 0, 0, 2, 0, 3, 0, 7, 0, 0, 0, 4, 0, 2, 0, 4, 0, 8, 0, 0, 0, 10, 0, 1, 0, 5, 0, 2, 0, 1, 0, 4]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int15 = classWriter1.newField("", "hi!", "hi!");
        int int20 = classWriter1.newMethod("", "hi!", "", false);
        int int22 = classWriter1.newClass("");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        int int70 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = classWriter1.visitAnnotation("", false);
        int int78 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 8 + "'", int78 == 8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((-1), (int) (byte) 1, "hi!", "", "", strArray46);
        classWriter1.visitOuterClass("", "", "");
        int int58 = classWriter1.newField("", "", "");
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        int int50 = classWriter1.newUTF8("");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("hi!", "hi!");
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 11 + "'", int37 == 11);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        classWriter1.visitEnd();
        int int20 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(2);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", 7);
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        classWriter1.visitInnerClass("", "", "hi!", 15);
        classWriter1.visitInnerClass("", "hi!", "hi!", 2);
        int int24 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(0);
        int int32 = classWriter30.newConst((java.lang.Object) 1);
        int int37 = classWriter30.newMethod("hi!", "hi!", "", true);
        classWriter30.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter1.visitField((int) ' ', "hi!", "", "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor41);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((-1), (int) (byte) 1, "hi!", "", "", strArray46);
        classWriter1.visitEnd();
        int int55 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("hi!", "", "", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(5);
        int int4 = classWriter1.newNameType("", "");
        int int6 = classWriter1.newUTF8("hi!");
        byte[] byteArray7 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 12, 0, 1, 0, 1, 1, 0, 3, 104, 105, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray14 = classWriter1.toByteArray();
        int int16 = classWriter1.newUTF8("");
        byte[] byteArray17 = classWriter1.toByteArray();
        int int19 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 3, 0, 5]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 3, 0, 5]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray19);
        byte[] byteArray21 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 2, 0, 2, 0, 1, 0, 7, 0, 0, 0, 2, 0, 1, 0, 2, 0, 8, 0, 0, 0, 4, 0, 4, 0, 5, 0, 9, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        int int28 = classWriter1.newNameType("hi!", "");
        int int30 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        int int36 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor21 = classWriter15.visitMethod(0, "hi!", "", "hi!", strArray20);
        int int23 = classWriter15.newConst((java.lang.Object) 10.0d);
        int int25 = classWriter15.newClass("hi!");
        classWriter15.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newConst((java.lang.Object) 1);
        int int50 = classWriter43.newMethod("", "", "", true);
        int int55 = classWriter43.newMethod("hi!", "hi!", "hi!", false);
        int int56 = classWriter35.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        int int66 = classWriter63.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter72.visitMethod(0, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter63.visitMethod((int) 'a', "hi!", "", "hi!", strArray77);
        classWriter35.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter15.visitMethod(4, "hi!", "", "", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter1.visitMethod(12, "", "hi!", "hi!", strArray77);
        int int84 = classWriter1.newClass("");
        byte[] byteArray85 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodVisitor21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 12, 0, 1, 0, 2, 0, 1, 0, 6, 0, 0, 0, 2, 0, 2, 0, 1, 0, 7, 0, 0, 0, 4, 0, 3, 0, 4]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        byte[] byteArray12 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "", "", 8);
        classWriter1.visitOuterClass("", "", "");
        int int26 = classWriter1.newMethod("", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 10, 0, 1, 0, 2, 0, 4, 0, 3, 0, 0, 0, 6, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 10);
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.Attribute attribute40 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        int int24 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor36 = classWriter30.visitMethod(0, "hi!", "", "hi!", strArray35);
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter1.visitMethod((int) ' ', "", "hi!", "hi!", strArray35);
        classWriter1.visitInnerClass("", "hi!", "", 1);
        int int47 = classWriter1.newMethod("", "hi!", "hi!", false);
        int int51 = classWriter1.newField("", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 7 + "'", int47 == 7);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        byte[] byteArray32 = classWriter1.toByteArray();
        int int34 = classWriter1.newClass("");
        int int37 = classWriter1.newNameType("hi!", "");
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int47 = classWriter42.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter42.visitMethod(4, "", "hi!", "hi!", strArray58);
        int int64 = classWriter42.newField("hi!", "", "hi!");
        byte[] byteArray65 = classWriter42.toByteArray();
        // The following exception was thrown during execution in test generation
        try {
            int int66 = classWriter1.newConst((java.lang.Object) classWriter42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@68422bc4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 9, 0, 0, 0, 2, 0, 5, 0, 0]");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray14 = classWriter1.toByteArray();
        int int16 = classWriter1.newUTF8("");
        byte[] byteArray17 = classWriter1.toByteArray();
        int int21 = classWriter1.newField("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 3, 0, 5]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 2, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 0, 0, 4, 0, 3, 0, 5]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int29 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int38 = classWriter35.newNameType("", "hi!");
        int int40 = classWriter35.newClass("");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter47.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter47.visitOuterClass("", "hi!", "hi!");
        int int60 = classWriter47.newNameType("", "hi!");
        byte[] byteArray61 = classWriter47.toByteArray();
        byte[] byteArray62 = classWriter47.toByteArray();
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter(0);
        int int71 = classWriter69.newUTF8("hi!");
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter69.visitMethod(2, "hi!", "hi!", "hi!", strArray79);
        classWriter47.visit(0, 4, "hi!", "", "hi!", strArray79);
        classWriter35.visit((int) ' ', 4, "", "", "hi!", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter1.visitMethod((int) (byte) 0, "", "", "", strArray79);
        java.lang.Class<?> wildcardClass84 = methodVisitor83.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        int int16 = classWriter1.newField("", "hi!", "");
        int int18 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        int int23 = classWriter1.newNameType("", "hi!");
        java.lang.Class<?> wildcardClass24 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        byte[] byteArray82 = classWriter1.toByteArray();
        org.mockito.asm.FieldVisitor fieldVisitor88 = classWriter1.visitField(6, "hi!", "hi!", "", (java.lang.Object) 0.0d);
        int int90 = classWriter1.newClass("");
        int int94 = classWriter1.newField("", "hi!", "hi!");
        int int96 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 97, 0, 1, 0, 1, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 11 + "'", int94 == 11);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 5 + "'", int96 == 5);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter26.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter26.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter26.visitInnerClass("", "hi!", "hi!", 1);
        int int47 = classWriter26.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj52 = null;
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter26.visitField(10, "", "", "", obj52);
        int int55 = classWriter26.newClass("");
        classWriter26.visitSource("", "hi!");
        int int61 = classWriter26.newNameType("hi!", "hi!");
        int int65 = classWriter26.newField("hi!", "hi!", "hi!");
        classWriter26.visitInnerClass("hi!", "", "hi!", (int) (byte) 100);
        int int71 = classWriter1.newConst((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass12 = annotationVisitor11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute91 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        byte[] byteArray89 = classWriter1.toByteArray();
        int int91 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[-54, -2, -70, -66, -1, -1, -1, -1, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 3, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        int int25 = classWriter1.newMethod("", "", "hi!", false);
        int int27 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute28 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor14 = classWriter8.visitMethod(0, "hi!", "", "hi!", strArray13);
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter(0);
        int int18 = classWriter16.newConst((java.lang.Object) 1);
        int int23 = classWriter16.newMethod("", "", "", true);
        int int28 = classWriter16.newMethod("hi!", "hi!", "hi!", false);
        int int29 = classWriter8.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter36.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter45.visitMethod(0, "hi!", "", "hi!", strArray50);
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter36.visitMethod((int) 'a', "hi!", "", "hi!", strArray50);
        classWriter8.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray50);
        classWriter1.visit(0, 13, "", "", "", strArray50);
        int int58 = classWriter1.newField("", "hi!", "hi!");
        int int62 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        byte[] byteArray72 = classWriter68.toByteArray();
        int int74 = classWriter68.newClass("hi!");
        java.lang.String[] strArray80 = null;
        classWriter68.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray80);
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = classWriter68.visitAnnotation("hi!", false);
        byte[] byteArray85 = classWriter68.toByteArray();
        classWriter68.visitOuterClass("hi!", "", "hi!");
        int int92 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor93 = classWriter1.visitField((int) (byte) 100, "", "hi!", "", (java.lang.Object) "");
        int int98 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodVisitor14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 7 + "'", int62 == 7);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor84);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 8, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 10, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 3 + "'", int92 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor93);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 10 + "'", int98 == 10);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter27.newClass("");
        int int31 = classWriter27.newConst((java.lang.Object) 10L);
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) int31);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        byte[] byteArray37 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 16, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 7, 0, 1, 12, 0, 2, 0, 2, 10, 0, 4, 0, 7, 3, 0, 0, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 0, 1, 0, 2, 0, 4, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 2, 0, 1, 0, 100, 0, 2, 0, 2, 0, 2, 0, 10, 0, 0, 0, 2, 0, 9, 0, 13, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 14, 0, 0, 0, 4, 0, 6, 0, 5, 0, 15, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        int int39 = classWriter1.newNameType("", "");
        int int42 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 7 + "'", int42 == 7);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        int int17 = classWriter1.newClass("");
        int int19 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(8);
        int int29 = classWriter25.newField("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter(0);
        int int38 = classWriter36.newConst((java.lang.Object) 1);
        int int43 = classWriter36.newMethod("hi!", "hi!", "", true);
        classWriter36.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        int int56 = classWriter53.newNameType("", "hi!");
        classWriter53.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        int int70 = classWriter67.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter76.visitMethod(0, "hi!", "", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter67.visitMethod((int) 'a', "hi!", "", "hi!", strArray81);
        classWriter53.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray81);
        classWriter36.visit((int) (byte) -1, (int) (byte) 0, "", "", "", strArray81);
        classWriter25.visit((int) 'a', 7, "", "hi!", "", strArray81);
        org.mockito.asm.FieldVisitor fieldVisitor87 = classWriter1.visitField(16, "", "", "hi!", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor90 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(fieldVisitor87);
        org.junit.Assert.assertNotNull(annotationVisitor90);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int22 = classWriter1.newMethod("hi!", "", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("", "hi!", "");
        int int25 = classWriter1.newField("hi!", "", "");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        int int33 = classWriter23.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor39 = classWriter23.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter46.visitMethod(0, "hi!", "", "hi!", strArray51);
        classWriter23.visit((int) (byte) 100, 0, "", "", "hi!", strArray51);
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter60.visitMethod(0, "hi!", "", "hi!", strArray65);
        classWriter23.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray65);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter1.visitMethod(10, "", "", "hi!", strArray65);
        int int72 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter1.visitAnnotation("hi!", false);
        int int79 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 11 + "'", int72 == 11);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 11 + "'", int79 == 11);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(14);
        int int3 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) (byte) 10);
        classWriter1.visitInnerClass("", "", "", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "");
        int int12 = classWriter1.newNameType("", "");
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter10.visitMethod(4, "", "hi!", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (short) 0, "hi!", "", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int22 = classWriter1.newMethod("", "hi!", "", true);
        int int25 = classWriter1.newNameType("hi!", "hi!");
        byte[] byteArray26 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter32.newMethod("", "", "", true);
        int int42 = classWriter32.newMethod("hi!", "hi!", "hi!", false);
        int int46 = classWriter32.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int55 = classWriter53.newConst((java.lang.Object) 1);
        int int60 = classWriter53.newMethod("", "", "", true);
        int int65 = classWriter53.newMethod("hi!", "hi!", "hi!", false);
        int int70 = classWriter53.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter76.visitMethod(0, "hi!", "", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter53.visitMethod(7, "", "hi!", "hi!", strArray81);
        classWriter32.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod(7, "", "", "", strArray81);
        classWriter1.visitInnerClass("", "hi!", "", 15);
        int int94 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 1, 11, 0, 2, 0, 7, 12, 0, 3, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 4, 0, 11, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 12, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 6, 0, 6, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 11 + "'", int70 == 11);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 14 + "'", int94 == 14);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        int int33 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("", true);
        int int38 = classWriter1.newClass("hi!");
        int int41 = classWriter1.newNameType("hi!", "");
        int int45 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter(16);
        int int54 = classWriter51.newNameType("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter1.visitField(14, "", "", "hi!", (java.lang.Object) int54);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor55);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter50.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter50.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter50.visitInnerClass("", "hi!", "hi!", 1);
        int int71 = classWriter50.newMethod("hi!", "hi!", "hi!", false);
        int int72 = classWriter1.newConst((java.lang.Object) "hi!");
        int int75 = classWriter1.newNameType("", "");
        int int79 = classWriter1.newField("", "hi!", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) 'a');
        int int86 = classWriter1.newUTF8("");
        int int88 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        classWriter1.visitEnd();
        byte[] byteArray33 = classWriter1.toByteArray();
        int int35 = classWriter1.newClass("hi!");
        int int37 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", 15);
        org.mockito.asm.Attribute attribute43 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((-1), (int) (byte) 1, "hi!", "", "", strArray46);
        int int54 = classWriter1.newField("", "", "hi!");
        int int56 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int34 = classWriter1.newField("hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter36.newNameType("", "hi!");
        classWriter36.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter36.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter36.visitAnnotation("", false);
        int int51 = classWriter36.newClass("hi!");
        int int52 = classWriter1.newConst((java.lang.Object) int51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11 + "'", int52 == 11);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(1);
        java.lang.Class<?> wildcardClass2 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitSource("", "");
        int int27 = classWriter1.newField("", "", "");
        classWriter1.visitOuterClass("", "", "");
        int int34 = classWriter1.newNameType("", "");
        int int38 = classWriter1.newField("", "", "hi!");
        int int42 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("hi!", "");
        int int24 = classWriter1.newMethod("", "", "", true);
        int int26 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        byte[] byteArray7 = classWriter1.toByteArray();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        byte[] byteArray4 = classWriter1.toByteArray();
        int int9 = classWriter1.newMethod("hi!", "", "hi!", true);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 2, 1, 0, 3, 104, 105, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        int int16 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter23.visitMethod(0, "hi!", "", "hi!", strArray28);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter23.visitAnnotation("", false);
        int int34 = classWriter23.newClass("");
        classWriter23.visitInnerClass("", "hi!", "hi!", 1);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter45.visitMethod(0, "hi!", "", "hi!", strArray50);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int55 = classWriter53.newConst((java.lang.Object) 1);
        int int60 = classWriter53.newMethod("", "", "", true);
        int int65 = classWriter53.newMethod("hi!", "hi!", "hi!", false);
        int int66 = classWriter45.newConst((java.lang.Object) "hi!");
        int int71 = classWriter45.newMethod("", "hi!", "", true);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter45.visitMethod(0, "", "hi!", "", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter23.visitMethod(6, "", "hi!", "hi!", strArray79);
        classWriter1.visit(12, 0, "", "", "", strArray79);
        int int84 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 6 + "'", int71 == 6);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 7 + "'", int84 == 7);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int15 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter22.newConst((java.lang.Object) 1);
        int int29 = classWriter22.newMethod("", "", "", true);
        int int34 = classWriter22.newMethod("hi!", "hi!", "hi!", false);
        int int39 = classWriter22.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter45.visitMethod(0, "hi!", "", "hi!", strArray50);
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter22.visitMethod(7, "", "hi!", "hi!", strArray50);
        classWriter1.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray50);
        int int58 = classWriter1.newMethod("hi!", "", "hi!", true);
        int int60 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11 + "'", int39 == 11);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 11 + "'", int58 == 11);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor22 = classWriter16.visitMethod(0, "hi!", "", "hi!", strArray21);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int26 = classWriter24.newConst((java.lang.Object) 1);
        int int31 = classWriter24.newMethod("", "", "", true);
        int int36 = classWriter24.newMethod("hi!", "hi!", "hi!", false);
        int int37 = classWriter16.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter44.visitMethod((int) 'a', "hi!", "", "hi!", strArray58);
        classWriter16.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray58);
        byte[] byteArray63 = classWriter1.toByteArray();
        classWriter1.visitSource("hi!", "");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int74 = classWriter1.newField("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodVisitor22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 3, 0, 0, 0, 1, 1, 0, 0, 1, 0, 3, 104, 105, 33, 5, -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 2, 0, 3, 0, 2, 0, 6, 0, 0, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 1, 0, 6, 0, 3, 0, 3, 0, 1, 0, 7, 0, 0, 0, 2, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 11 + "'", int74 == 11);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("", true);
        int int36 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter1.visitAnnotation("", true);
        int int43 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 12 + "'", int43 == 12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int10 = classWriter1.newNameType("", "hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        int int6 = classWriter1.newMethod("hi!", "hi!", "", false);
        byte[] byteArray7 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 12, 0, 1, 0, 3, 10, 0, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("", "hi!", "hi!", 12);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        org.mockito.asm.MethodVisitor methodVisitor35 = classWriter19.visitMethod((int) 'a', "hi!", "", "hi!", strArray33);
        int int36 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter38.newUTF8("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter38.visitMethod(2, "hi!", "hi!", "hi!", strArray48);
        byte[] byteArray50 = classWriter38.toByteArray();
        int int55 = classWriter38.newMethod("", "", "hi!", false);
        int int56 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 10);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        int int24 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor36 = classWriter30.visitMethod(0, "hi!", "", "hi!", strArray35);
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter1.visitMethod((int) ' ', "", "hi!", "hi!", strArray35);
        classWriter1.visitInnerClass("", "hi!", "", 1);
        int int47 = classWriter1.newMethod("hi!", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        int int93 = classWriter1.newNameType("", "");
        classWriter1.visitSource("hi!", "hi!");
        int int98 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 5 + "'", int93 == 5);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 4 + "'", int98 == 4);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int14 = classWriter1.newNameType("", "hi!");
        byte[] byteArray15 = classWriter1.toByteArray();
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newUTF8("hi!");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter23.visitMethod(2, "hi!", "hi!", "hi!", strArray33);
        classWriter1.visit(0, 4, "hi!", "", "hi!", strArray33);
        int int37 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter44.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = classWriter44.visitAnnotation("", false);
        int int51 = classWriter1.newConst((java.lang.Object) false);
        org.mockito.asm.Attribute attribute52 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter13.visitOuterClass("", "hi!", "hi!");
        int int26 = classWriter13.newNameType("", "hi!");
        byte[] byteArray27 = classWriter13.toByteArray();
        byte[] byteArray28 = classWriter13.toByteArray();
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newUTF8("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter35.visitMethod(2, "hi!", "hi!", "hi!", strArray45);
        classWriter13.visit(0, 4, "hi!", "", "hi!", strArray45);
        classWriter1.visit((int) ' ', 4, "", "", "hi!", strArray45);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        int int54 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int60 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        byte[] byteArray30 = classWriter1.toByteArray();
        int int35 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 9, 0, 0, 0, 2, 0, 5, 0, 1, 0, 10, 0, 0, 0, 4, 0, 6, 0, 3]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "hi!", 0);
        int int22 = classWriter1.newField("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        int int77 = classWriter1.newClass("");
        int int79 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor87);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int25 = classWriter1.newNameType("", "");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((-1));
        int int37 = classWriter33.newField("hi!", "", "hi!");
        classWriter33.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter1.visitField((int) (short) -1, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int44 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        classWriter10.visitSource("hi!", "");
        int int20 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter10.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        classWriter10.visit((int) (byte) 100, 0, "", "", "hi!", strArray38);
        classWriter10.visitEnd();
        byte[] byteArray42 = classWriter10.toByteArray();
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newClass("");
        classWriter48.visitSource("hi!", "");
        int int58 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor64 = classWriter48.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        classWriter48.visit((int) (byte) 100, 0, "", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter10.visitMethod(12, "hi!", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter1.visitMethod((int) (short) 100, "", "", "", strArray76);
        int int82 = classWriter1.newClass("hi!");
        byte[] byteArray83 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 8, 0, 0, 0, 2, 0, 7, 0, 9, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 1, 0, 1, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1, 0, 0]");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int80 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = classWriter1.visitAnnotation("hi!", true);
        int int88 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int10 = classWriter1.newNameType("", "");
        int int12 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        int int17 = classWriter14.newNameType("", "hi!");
        classWriter14.visitOuterClass("hi!", "hi!", "hi!");
        classWriter14.visitEnd();
        classWriter14.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = classWriter14.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = classWriter1.newConst((java.lang.Object) classWriter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@2497c4d4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("hi!", "", "", (-1));
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter19.newMethod("", "", "", true);
        classWriter19.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        classWriter32.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter32.visitAnnotation("", true);
        classWriter32.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter53.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter64.visitMethod(0, "hi!", "", "hi!", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter53.visitMethod(4, "", "hi!", "hi!", strArray69);
        classWriter32.visit(10, (int) (byte) 100, "", "", "", strArray69);
        classWriter19.visit((int) '4', (int) '#', "", "", "", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter1.visitMethod((int) (byte) 0, "", "", "hi!", strArray69);
        int int76 = classWriter1.newClass("hi!");
        int int79 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 8 + "'", int79 == 8);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(100);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", false);
        int int12 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        java.lang.String[] strArray17 = null;
        classWriter1.visit(13, 3, "hi!", "hi!", "", strArray17);
        classWriter1.visitInnerClass("hi!", "hi!", "", 9);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor4);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newUTF8("");
        int int10 = classWriter1.newUTF8("hi!");
        byte[] byteArray11 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int33 = classWriter1.newUTF8("");
        int int37 = classWriter1.newField("", "hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        byte[] byteArray42 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 9, 0, 2, 0, 5, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 9, 0, 0, 0, 2, 0, 7, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 4, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 3, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 4, 0, 2, 0, 5]");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", 10);
        classWriter1.visitEnd();
        int int17 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int19 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newUTF8("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor36 = classWriter25.visitMethod(2, "hi!", "hi!", "hi!", strArray35);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor56 = classWriter50.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        int int65 = classWriter62.newNameType("", "hi!");
        classWriter62.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        int int79 = classWriter76.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter76.visitMethod((int) 'a', "hi!", "", "hi!", strArray90);
        classWriter62.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter50.visitMethod(7, "", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor95 = classWriter42.visitMethod((int) (short) 10, "hi!", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter25.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor97 = classWriter1.visitMethod((int) (byte) -1, "hi!", "", "hi!", strArray90);
        int int99 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 2 + "'", int99 == 2);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        int int39 = classWriter1.newNameType("", "");
        int int41 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter47.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor58 = classWriter47.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter47.visitInnerClass("", "hi!", "hi!", 1);
        int int68 = classWriter47.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = classWriter47.visitAnnotation("", false);
        int int73 = classWriter47.newUTF8("");
        org.mockito.asm.FieldVisitor fieldVisitor74 = classWriter1.visitField((int) (short) 100, "hi!", "", "hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor74);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter19.visitInnerClass("", "", "hi!", 2);
        int int28 = classWriter19.newField("hi!", "", "");
        int int30 = classWriter19.newUTF8("");
        int int33 = classWriter19.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter19.visitAnnotation("hi!", true);
        int int41 = classWriter19.newMethod("", "hi!", "hi!", false);
        classWriter19.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int48 = classWriter19.newClass("");
        classWriter19.visitOuterClass("hi!", "hi!", "hi!");
        int int53 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter(0);
        int int62 = classWriter60.newConst((java.lang.Object) 1);
        int int67 = classWriter60.newMethod("", "", "", true);
        int int72 = classWriter60.newMethod("hi!", "hi!", "hi!", false);
        int int77 = classWriter60.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray88 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter83.visitMethod(0, "hi!", "", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter60.visitMethod(7, "", "hi!", "hi!", strArray88);
        classWriter1.visit((int) (short) 10, 14, "hi!", "hi!", "", strArray88);
        classWriter1.visitInnerClass("", "hi!", "", 0);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 7 + "'", int53 == 7);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 9 + "'", int72 == 9);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 11 + "'", int77 == 11);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor90);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        int int93 = classWriter1.newNameType("", "");
        int int98 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 5 + "'", int93 == 5);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 7 + "'", int98 == 7);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter((int) '4');
        int int21 = classWriter18.newNameType("", "hi!");
        classWriter18.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter32.visitMethod((int) 'a', "hi!", "", "hi!", strArray46);
        classWriter18.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray46);
        classWriter1.visit((-1), (int) (byte) 1, "hi!", "", "", strArray46);
        classWriter1.visitEnd();
        byte[] byteArray52 = classWriter1.toByteArray();
        int int57 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, -1, -1, -1, -1, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 12, 0, 3, 0, 3, 9, 0, 2, 0, 6, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 1, 0, 8, 0, 2, 0, 0, 0, 0, 0, 0, 0, 3, 0, 9, 0, 0, 0, 2, 0, 1, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray19);
        int int23 = classWriter1.newNameType("hi!", "hi!");
        int int27 = classWriter1.newField("hi!", "", "");
        byte[] byteArray28 = classWriter1.toByteArray();
        int int31 = classWriter1.newNameType("hi!", "hi!");
        int int33 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 12, 0, 1, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 2, 0, 2, 0, 1, 0, 9, 0, 0, 0, 2, 0, 1, 0, 2, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        classWriter1.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray43);
        int int49 = classWriter1.newField("", "", "");
        int int51 = classWriter1.newClass("");
        int int55 = classWriter1.newField("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11 + "'", int55 == 11);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int13 = classWriter1.newClass("");
        byte[] byteArray14 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "hi!", "", (int) (byte) 1);
        int int21 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 2, 0, 4, 0, 9, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("", "hi!", "");
        classWriter1.visitOuterClass("", "", "");
        int int28 = classWriter1.newNameType("", "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newConst((java.lang.Object) (short) 1);
        byte[] byteArray4 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor7);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", false);
        int int12 = classWriter1.newNameType("", "hi!");
        int int17 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int19 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter22.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter22.visitMethod(4, "", "hi!", "hi!", strArray38);
        classWriter1.visit(10, (int) (byte) 100, "", "", "", strArray38);
        int int45 = classWriter1.newField("", "", "");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter(0);
        int int56 = classWriter54.newClass("");
        classWriter54.visitSource("hi!", "");
        int int64 = classWriter54.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor70 = classWriter54.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        classWriter54.visit((int) (byte) 100, 0, "", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter1.visitMethod((int) (byte) -1, "hi!", "", "", strArray82);
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", 0);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(annotationVisitor88);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor32 = classWriter26.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        int int41 = classWriter38.newNameType("", "hi!");
        classWriter38.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        int int55 = classWriter52.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray66 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter61.visitMethod(0, "hi!", "", "hi!", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter52.visitMethod((int) 'a', "hi!", "", "hi!", strArray66);
        classWriter38.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter26.visitMethod(7, "", "", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter18.visitMethod((int) (short) 10, "hi!", "", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter1.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray66);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor72);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) -1);
        int int6 = classWriter1.newMethod("hi!", "", "", false);
        int int10 = classWriter1.newField("", "hi!", "");
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        int int11 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("", "", "");
        byte[] byteArray16 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 9, 0, 4, 0, 3, 7, 0, 1, 12, 0, 1, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 4, 0, 6, 0, 7]");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        int int14 = classWriter11.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter11.visitMethod((int) 'a', "hi!", "", "hi!", strArray25);
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField((int) (byte) 1, "hi!", "hi!", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter1.visitAnnotation("hi!", false);
        byte[] byteArray35 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        int int44 = classWriter41.newNameType("", "hi!");
        int int46 = classWriter41.newClass("");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor59 = classWriter53.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter53.visitOuterClass("", "hi!", "hi!");
        int int66 = classWriter53.newNameType("", "hi!");
        byte[] byteArray67 = classWriter53.toByteArray();
        byte[] byteArray68 = classWriter53.toByteArray();
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter(0);
        int int77 = classWriter75.newUTF8("hi!");
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter75.visitMethod(2, "hi!", "hi!", "hi!", strArray85);
        classWriter53.visit(0, 4, "hi!", "", "hi!", strArray85);
        classWriter41.visit((int) ' ', 4, "", "", "hi!", strArray85);
        classWriter41.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor93 = classWriter1.visitField(9, "hi!", "", "", (java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 5, 0, 5, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 8, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 9, 0, 0, 0, 10, 0, 2, 0, 5, 0, 0, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 6 + "'", int66 == 6);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(fieldVisitor93);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int28 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray29 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 8, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 7, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "hi!", 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int31 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int38 = classWriter1.newNameType("hi!", "");
        int int42 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor16 = classWriter10.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        int int25 = classWriter22.newNameType("", "hi!");
        classWriter22.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter36.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter45.visitMethod(0, "hi!", "", "hi!", strArray50);
        org.mockito.asm.MethodVisitor methodVisitor52 = classWriter36.visitMethod((int) 'a', "hi!", "", "hi!", strArray50);
        classWriter22.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray50);
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter10.visitMethod(7, "", "", "", strArray50);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter1.visitField(7, "hi!", "", "hi!", (java.lang.Object) 7);
        int int58 = classWriter1.newNameType("", "hi!");
        classWriter1.visitSource("", "");
        int int64 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int34 = classWriter1.newMethod("hi!", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 0);
        int int45 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter47.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        int int61 = classWriter58.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter58.visitMethod((int) 'a', "hi!", "", "hi!", strArray72);
        org.mockito.asm.FieldVisitor fieldVisitor75 = classWriter47.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int80 = classWriter47.newMethod("hi!", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = classWriter47.visitAnnotation("", true);
        classWriter47.visitOuterClass("hi!", "", "");
        int int88 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 8 + "'", int80 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 11 + "'", int88 == 11);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        byte[] byteArray83 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 5, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 97, 0, 1, 0, 1, 0, 1, 0, 8, 0, 0, 0, 2, 0, 5, 0, 1, 0, 9, 0, 0, 0, 4, 0, 6, 0, 7]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter12.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter12.visitOuterClass("", "hi!", "hi!");
        int int25 = classWriter12.newNameType("", "hi!");
        byte[] byteArray26 = classWriter12.toByteArray();
        byte[] byteArray27 = classWriter12.toByteArray();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newUTF8("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter34.visitMethod(2, "hi!", "hi!", "hi!", strArray44);
        classWriter12.visit(0, 4, "hi!", "", "hi!", strArray44);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter12.visitAnnotation("", false);
        int int50 = classWriter1.newConst((java.lang.Object) false);
        int int53 = classWriter1.newNameType("", "hi!");
        int int57 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 7 + "'", int53 == 7);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor18 = classWriter12.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter12.visitOuterClass("", "hi!", "hi!");
        int int25 = classWriter12.newNameType("", "hi!");
        byte[] byteArray26 = classWriter12.toByteArray();
        byte[] byteArray27 = classWriter12.toByteArray();
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newUTF8("hi!");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter34.visitMethod(2, "hi!", "hi!", "hi!", strArray44);
        classWriter12.visit(0, 4, "hi!", "", "hi!", strArray44);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = classWriter12.visitAnnotation("", false);
        int int50 = classWriter1.newConst((java.lang.Object) false);
        int int53 = classWriter1.newNameType("", "hi!");
        int int58 = classWriter1.newMethod("", "", "hi!", false);
        int int62 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 7 + "'", int53 == 7);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        int int31 = classWriter1.newUTF8("");
        byte[] byteArray32 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "", 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 9, 0, 0, 0, 2, 0, 5, 0, 1, 0, 10, 0, 0, 0, 4, 0, 6, 0, 3]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        byte[] byteArray7 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor10);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        int int4 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        int int14 = classWriter11.newNameType("", "hi!");
        classWriter11.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter11.visitAnnotation("", true);
        int int24 = classWriter11.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter11.visitAnnotation("", true);
        classWriter11.visitSource("", "");
        byte[] byteArray31 = classWriter11.toByteArray();
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter38.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter38.visitAnnotation("hi!", true);
        int int48 = classWriter38.newField("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter(0);
        int int65 = classWriter63.newConst((java.lang.Object) 1);
        int int70 = classWriter63.newMethod("", "", "", true);
        int int75 = classWriter63.newMethod("hi!", "hi!", "hi!", false);
        int int76 = classWriter55.newConst((java.lang.Object) "hi!");
        int int81 = classWriter55.newMethod("", "hi!", "", true);
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter55.visitMethod(0, "", "hi!", "", strArray89);
        classWriter38.visit(9, (int) 'a', "hi!", "hi!", "hi!", strArray89);
        classWriter11.visit(5, 8, "", "", "hi!", strArray89);
        classWriter1.visit((int) (short) 0, (int) (short) 10, "", "hi!", "hi!", strArray89);
        int int95 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute96 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 4, 0, 5, 0, 10, 0, 0, 0, 10, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 5 + "'", int70 == 5);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        org.mockito.asm.MethodVisitor methodVisitor35 = classWriter19.visitMethod((int) 'a', "hi!", "", "hi!", strArray33);
        int int36 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter38.newUTF8("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter38.visitMethod(2, "hi!", "hi!", "hi!", strArray48);
        byte[] byteArray50 = classWriter38.toByteArray();
        int int55 = classWriter38.newMethod("", "", "hi!", false);
        int int56 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 10);
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int28 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        int int14 = classWriter10.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter40.visitMethod(0, "hi!", "", "hi!", strArray45);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int61 = classWriter40.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        int int71 = classWriter68.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter77.visitMethod(0, "hi!", "", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter68.visitMethod((int) 'a', "hi!", "", "hi!", strArray82);
        classWriter40.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter20.visitMethod(4, "hi!", "", "", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter10.visitMethod((int) 'a', "", "", "hi!", strArray82);
        classWriter1.visit((int) (byte) -1, 3, "hi!", "", "hi!", strArray82);
        int int90 = classWriter1.newUTF8("");
        int int92 = classWriter1.newUTF8("");
        int int97 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 6 + "'", int97 == 6);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        classWriter1.visitSource("", "");
        byte[] byteArray14 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 3, 0, 0, 0, 1, 1, 0, 0, 1, 0, 3, 104, 105, 33, 5, -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 2, 0, 3, 0, 2, 0, 6, 0, 0, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 0, 0, 2, 0, 8, 0, 0, 0, 2, 0, 2, 0, 9, 0, 0, 0, 0]");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter55.newNameType("hi!", "hi!");
        int int60 = classWriter55.newConst((java.lang.Object) 1.0d);
        int int65 = classWriter55.newMethod("hi!", "hi!", "", false);
        org.mockito.asm.FieldVisitor fieldVisitor66 = classWriter1.visitField((int) 'a', "hi!", "", "", (java.lang.Object) "hi!");
        int int71 = classWriter1.newMethod("hi!", "", "", true);
        int int76 = classWriter1.newMethod("", "hi!", "hi!", true);
        int int78 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("hi!", "");
        java.lang.Object obj24 = null;
        org.mockito.asm.FieldVisitor fieldVisitor25 = classWriter1.visitField((int) (short) 0, "hi!", "hi!", "", obj24);
        java.lang.Class<?> wildcardClass26 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter11.newConst((java.lang.Object) 1);
        classWriter11.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor20 = classWriter11.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter26.visitMethod(0, "hi!", "", "hi!", strArray31);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        int int36 = classWriter34.newConst((java.lang.Object) 1);
        int int41 = classWriter34.newMethod("", "", "", true);
        int int46 = classWriter34.newMethod("hi!", "hi!", "hi!", false);
        int int47 = classWriter26.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int57 = classWriter54.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter63.visitMethod(0, "hi!", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter54.visitMethod((int) 'a', "hi!", "", "hi!", strArray68);
        classWriter26.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter11.visitMethod(6, "hi!", "hi!", "", strArray68);
        classWriter1.visit((int) (byte) -1, 100, "hi!", "hi!", "", strArray68);
        int int75 = classWriter1.newClass("hi!");
        int int78 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.Attribute attribute83 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "");
        int int12 = classWriter1.newNameType("", "");
        classWriter1.visitInnerClass("", "", "hi!", 1);
        int int20 = classWriter1.newNameType("", "hi!");
        int int22 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter1.visitAnnotation("hi!", true);
        int int27 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int35 = classWriter33.newUTF8("");
        int int37 = classWriter33.newClass("hi!");
        classWriter33.visitEnd();
        classWriter33.visitInnerClass("", "hi!", "", 10);
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter(0);
        int int55 = classWriter50.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray66 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter61.visitMethod(0, "hi!", "", "hi!", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter50.visitMethod(4, "", "hi!", "hi!", strArray66);
        classWriter33.visit(6, (int) ' ', "", "", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod((int) (byte) 0, "hi!", "", "", strArray66);
        int int75 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int15 = classWriter1.newField("", "hi!", "hi!");
        int int19 = classWriter1.newField("", "", "");
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newClass("");
        classWriter25.visitSource("hi!", "");
        int int35 = classWriter25.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter25.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        classWriter25.visit((int) (byte) 100, 0, "", "", "hi!", strArray53);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        classWriter25.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter1.visitMethod((int) ' ', "", "hi!", "hi!", strArray67);
        java.lang.Class<?> wildcardClass71 = strArray67.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        int int28 = classWriter1.newNameType("hi!", "");
        int int33 = classWriter1.newMethod("", "hi!", "", true);
        int int36 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(3);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor55 = classWriter49.visitMethod(0, "hi!", "", "hi!", strArray54);
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter(0);
        int int59 = classWriter57.newConst((java.lang.Object) 1);
        int int64 = classWriter57.newMethod("", "", "", true);
        int int69 = classWriter57.newMethod("hi!", "hi!", "hi!", false);
        int int70 = classWriter49.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        int int80 = classWriter77.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter86 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray91 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter86.visitMethod(0, "hi!", "", "hi!", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter77.visitMethod((int) 'a', "hi!", "", "hi!", strArray91);
        classWriter49.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray91);
        classWriter42.visit(0, 13, "", "", "", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(10, "", "", "", strArray91);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor96);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int6 = classWriter1.newMethod("", "", "hi!", true);
        classWriter1.visitSource("", "");
        int int13 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter13.visitMethod(0, "hi!", "", "hi!", strArray18);
        int int21 = classWriter13.newConst((java.lang.Object) 10.0d);
        int int23 = classWriter13.newClass("hi!");
        classWriter13.visitOuterClass("hi!", "", "hi!");
        int int29 = classWriter13.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter13.visitMethod(7, "hi!", "hi!", "", strArray40);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter1.visitMethod(7, "", "", "hi!", strArray40);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray15 = classWriter1.toByteArray();
        classWriter1.visitSource("hi!", "hi!");
        int int20 = classWriter1.newUTF8("hi!");
        java.lang.Class<?> wildcardClass21 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 2, 0, 2, 0, 8, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newClass("hi!");
        byte[] byteArray4 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter13.newClass("");
        classWriter13.visitSource("hi!", "");
        byte[] byteArray19 = classWriter13.toByteArray();
        int int23 = classWriter13.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        int int33 = classWriter30.newNameType("", "hi!");
        classWriter30.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter44.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter53.visitMethod(0, "hi!", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter44.visitMethod((int) 'a', "hi!", "", "hi!", strArray58);
        classWriter30.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray58);
        classWriter13.visit((-1), (int) (byte) 1, "hi!", "", "", strArray58);
        classWriter1.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray58);
        int int65 = classWriter1.newClass("");
        int int70 = classWriter1.newMethod("hi!", "", "", true);
        int int75 = classWriter1.newMethod("", "hi!", "", false);
        int int77 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(annotationVisitor4);
        org.junit.Assert.assertNotNull(annotationVisitor11);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("hi!", false);
        int int13 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 0);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter30.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor47 = classWriter41.visitMethod(0, "hi!", "", "hi!", strArray46);
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter30.visitMethod(4, "", "hi!", "hi!", strArray46);
        classWriter23.visit(10, 6, "", "hi!", "", strArray46);
        int int50 = classWriter1.newConst((java.lang.Object) 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int30 = classWriter1.newField("", "hi!", "");
        classWriter1.visitInnerClass("", "hi!", "", (int) '4');
        int int37 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int19 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitEnd();
        byte[] byteArray19 = classWriter1.toByteArray();
        java.lang.String[] strArray25 = null;
        classWriter1.visit((int) (short) -1, 5, "hi!", "", "", strArray25);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 4, 0, 8, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 9, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(12);
        int int3 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        byte[] byteArray21 = classWriter1.toByteArray();
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitSource("", "");
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 4, 0, 4, 0, 3, 0, 8, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int15 = classWriter1.newField("", "hi!", "");
        byte[] byteArray16 = classWriter1.toByteArray();
        int int21 = classWriter1.newMethod("hi!", "", "hi!", false);
        classWriter1.visitEnd();
        int int26 = classWriter1.newField("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 2, 0, 7, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 14 + "'", int26 == 14);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int20 = classWriter1.newUTF8("hi!");
        int int22 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "", "");
        classWriter1.visitEnd();
        int int29 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int30 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int39 = classWriter37.newUTF8("");
        int int41 = classWriter37.newClass("hi!");
        classWriter37.visitEnd();
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int51 = classWriter49.newClass("");
        classWriter49.visitSource("hi!", "");
        int int59 = classWriter49.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter49.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter72.visitMethod(0, "hi!", "", "hi!", strArray77);
        classWriter49.visit((int) (byte) 100, 0, "", "", "hi!", strArray77);
        org.mockito.asm.ClassWriter classWriter86 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray91 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter86.visitMethod(0, "hi!", "", "hi!", strArray91);
        classWriter49.visit((int) (short) 10, (int) (short) 10, "", "hi!", "hi!", strArray91);
        classWriter37.visit(0, (int) (short) 1, "", "hi!", "", strArray91);
        classWriter1.visit(8, 5, "", "", "hi!", strArray91);
        classWriter1.visitSource("hi!", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 6 + "'", int59 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor92);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newClass("");
        classWriter18.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int29 = classWriter1.newMethod("", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int5 = classWriter1.newField("hi!", "hi!", "");
        byte[] byteArray6 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", true);
        int int14 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 12, 0, 1, 0, 3, 9, 0, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter10.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter10.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter10.visitInnerClass("", "hi!", "hi!", 1);
        int int31 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(9, "", "hi!", "", (java.lang.Object) "");
        int int39 = classWriter1.newUTF8("hi!");
        int int41 = classWriter1.newClass("hi!");
        int int45 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter51 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int53 = classWriter51.newUTF8("");
        int int55 = classWriter51.newClass("hi!");
        classWriter51.visitEnd();
        classWriter51.visitInnerClass("", "hi!", "", 10);
        classWriter51.visitEnd();
        int int67 = classWriter51.newMethod("hi!", "hi!", "hi!", false);
        int int71 = classWriter51.newField("hi!", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter1.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) "");
        int int75 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((-1));
        classWriter77.visitOuterClass("", "", "hi!");
        int int85 = classWriter77.newField("", "", "");
        classWriter77.visitSource("", "");
        classWriter77.visitEnd();
        int int91 = classWriter77.newUTF8("");
        classWriter77.visitInnerClass("hi!", "", "", 15);
        java.lang.Class<?> wildcardClass97 = classWriter77.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int98 = classWriter1.newConst((java.lang.Object) classWriter77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@6ea01462");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 6 + "'", int67 == 6);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 6 + "'", int85 == 6);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int31 = classWriter1.newConst((java.lang.Object) (-1.0f));
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int42 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        int int19 = classWriter11.newConst((java.lang.Object) 10.0d);
        int int21 = classWriter11.newClass("hi!");
        classWriter11.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int52 = classWriter31.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter68 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter68.visitMethod(0, "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter59.visitMethod((int) 'a', "hi!", "", "hi!", strArray73);
        classWriter31.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter11.visitMethod(4, "hi!", "", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter1.visitMethod((int) 'a', "", "", "hi!", strArray73);
        int int81 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter(11);
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classWriter83.visitAnnotation("hi!", true);
        int int87 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        byte[] byteArray92 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("hi!", "hi!", "", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 7 + "'", int87 == 7);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 5, 3, 0, 0, 0, 1, 7, 0, 5, 12, 0, 5, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 97, 0, 1, 0, 1, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 1, 0, 11, 0, 0, 0, 4, 0, 8, 0, 9]");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor19 = classWriter13.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        int int28 = classWriter25.newNameType("", "hi!");
        classWriter25.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) '4');
        int int42 = classWriter39.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = classWriter39.visitMethod((int) 'a', "hi!", "", "hi!", strArray53);
        classWriter25.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor57 = classWriter13.visitMethod(7, "", "", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor58 = classWriter1.visitMethod(9, "hi!", "hi!", "hi!", strArray53);
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter(0);
        int int67 = classWriter64.newNameType("hi!", "hi!");
        int int69 = classWriter64.newUTF8("hi!");
        int int70 = classWriter1.newConst((java.lang.Object) "hi!");
        int int72 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        byte[] byteArray9 = classWriter1.toByteArray();
        int int13 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        int int14 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray19);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter26.visitAnnotation("", false);
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newConst((java.lang.Object) 1);
        int int50 = classWriter43.newMethod("", "", "", true);
        int int55 = classWriter43.newMethod("hi!", "hi!", "hi!", false);
        int int56 = classWriter35.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        int int66 = classWriter63.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter72 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray77 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter72.visitMethod(0, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = classWriter63.visitMethod((int) 'a', "hi!", "", "hi!", strArray77);
        classWriter35.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter26.visitMethod(0, "", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter1.visitMethod(10, "", "hi!", "hi!", strArray77);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.Object obj30 = null;
        org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter1.visitField(0, "hi!", "", "", obj30);
        int int33 = classWriter1.newUTF8("hi!");
        int int36 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter((int) '4');
        int int18 = classWriter15.newNameType("", "hi!");
        int int20 = classWriter15.newClass("");
        int int21 = classWriter1.newConst((java.lang.Object) "");
        int int26 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        int int6 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "hi!", "", 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int34 = classWriter1.newMethod("hi!", "", "hi!", true);
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) -1);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter1.visitAnnotation("hi!", true);
        int int42 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray47 = null;
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter1.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray47);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(methodVisitor48);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "hi!");
        int int12 = classWriter1.newNameType("", "hi!");
        int int14 = classWriter1.newClass("");
        byte[] byteArray15 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 2, 0, 2, 0, 6, 0, 0, 0, 3, 104, 105, 33]");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(3);
        int int4 = classWriter1.newNameType("", "");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitSource("", "hi!");
        int int16 = classWriter1.newMethod("", "", "", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        int int15 = classWriter1.newUTF8("");
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) 0L);
        byte[] byteArray23 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass24 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 1, 0, 1, 0, 2, 0, 12, 0, 0, 0, 2, 0, 10, 0, 13, 0, 0, 0, 2, 0, 3, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("hi!", "", "", 4);
        int int25 = classWriter1.newUTF8("hi!");
        int int28 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(7);
        int int5 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter18.newMethod("", "", "", true);
        int int28 = classWriter18.newMethod("hi!", "hi!", "hi!", false);
        int int32 = classWriter18.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter(0);
        int int41 = classWriter39.newConst((java.lang.Object) 1);
        int int46 = classWriter39.newMethod("", "", "", true);
        int int51 = classWriter39.newMethod("hi!", "hi!", "hi!", false);
        int int56 = classWriter39.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter39.visitMethod(7, "", "hi!", "hi!", strArray67);
        classWriter18.visit((int) (byte) 100, (int) (byte) 1, "", "", "", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter1.visitMethod((int) (byte) -1, "", "", "", strArray67);
        int int75 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        int int9 = classWriter1.newClass("hi!");
        int int13 = classWriter1.newField("", "hi!", "");
        classWriter1.visitInnerClass("", "", "", 0);
        byte[] byteArray19 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        int int28 = classWriter25.newNameType("", "hi!");
        classWriter25.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = classWriter25.visitAnnotation("", true);
        int int38 = classWriter25.newNameType("hi!", "");
        int int40 = classWriter25.newClass("hi!");
        classWriter25.visitOuterClass("hi!", "", "hi!");
        int int49 = classWriter25.newMethod("", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = classWriter25.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter1.visitField(13, "", "", "", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 1, 7, 0, 1, 1, 0, 0, 7, 0, 4, 12, 0, 1, 0, 4, 9, 0, 5, 0, 6, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 5, 0, 5, 0, 4, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(fieldVisitor53);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int30 = classWriter1.newMethod("hi!", "", "", false);
        int int34 = classWriter1.newField("hi!", "", "hi!");
        int int37 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) 'a');
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(8);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter(0);
        int int16 = classWriter14.newClass("");
        classWriter14.visitSource("hi!", "");
        byte[] byteArray20 = classWriter14.toByteArray();
        int int24 = classWriter14.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        int int34 = classWriter31.newNameType("", "hi!");
        classWriter31.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        classWriter31.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray59);
        classWriter14.visit((-1), (int) (byte) 1, "hi!", "", "", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter8.visitMethod(2, "", "hi!", "hi!", strArray59);
        classWriter1.visit(0, 3, "hi!", "hi!", "hi!", strArray59);
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor64);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        byte[] byteArray30 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute31 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 9, 0, 0, 0, 2, 0, 5, 0, 1, 0, 10, 0, 0, 0, 4, 0, 6, 0, 3]");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        int int16 = classWriter1.newField("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        int int19 = classWriter14.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter((int) '4');
        int int28 = classWriter25.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter25.visitMethod((int) 'a', "hi!", "", "hi!", strArray39);
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter14.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int44 = classWriter14.newConst((java.lang.Object) (-1.0f));
        int int46 = classWriter14.newClass("hi!");
        classWriter14.visitOuterClass("", "", "hi!");
        java.lang.Object obj55 = null;
        org.mockito.asm.FieldVisitor fieldVisitor56 = classWriter14.visitField(12, "hi!", "hi!", "hi!", obj55);
        int int57 = classWriter1.newConst((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int33 = classWriter31.newUTF8("");
        int int35 = classWriter31.newClass("hi!");
        classWriter31.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = classWriter1.newConst((java.lang.Object) classWriter31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@1b4b146a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int18 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor21);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        int int17 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int26 = classWriter1.newField("", "", "");
        int int30 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 10);
        classWriter1.visitOuterClass("", "", "hi!");
        byte[] byteArray40 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        classWriter46.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor64 = classWriter1.visitField((-1), "", "", "hi!", (java.lang.Object) classWriter46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@8c72297");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 3, 104, 105, 33, 1, 0, 0, 8, 0, 1, 7, 0, 2, 12, 0, 2, 0, 2, 9, 0, 4, 0, 5, 7, 0, 1, 12, 0, 1, 0, 1, 9, 0, 7, 0, 8, 12, 0, 2, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 2, 0, 12, 0, 0, 0, 4, 0, 4, 0, 10, 0, 13, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        int int22 = classWriter1.newMethod("", "", "", false);
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", 6);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int42 = classWriter21.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        classWriter21.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor67 = classWriter1.visitMethod(4, "hi!", "", "", strArray63);
        org.mockito.asm.ClassWriter classWriter69 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = classWriter69.visitAnnotation("", false);
        classWriter69.visitOuterClass("hi!", "hi!", "hi!");
        int int81 = classWriter69.newMethod("hi!", "hi!", "", true);
        int int82 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        int int91 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 7 + "'", int82 == 7);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 10 + "'", int91 == 10);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitEnd();
        int int22 = classWriter1.newField("", "hi!", "hi!");
        int int24 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter44.newClass("");
        classWriter44.visitSource("hi!", "");
        int int54 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter44.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        classWriter44.visit((int) (byte) 100, 0, "", "", "hi!", strArray72);
        classWriter1.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray72);
        int int77 = classWriter1.newClass("");
        int int79 = classWriter1.newClass("hi!");
        int int81 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        int int16 = classWriter13.newNameType("", "hi!");
        classWriter13.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter27 = new org.mockito.asm.ClassWriter((int) '4');
        int int30 = classWriter27.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor42 = classWriter36.visitMethod(0, "hi!", "", "hi!", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor43 = classWriter27.visitMethod((int) 'a', "hi!", "", "hi!", strArray41);
        classWriter13.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray41);
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter1.visitMethod(7, "", "", "", strArray41);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("hi!", "");
        int int54 = classWriter1.newUTF8("hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        byte[] byteArray60 = classWriter1.toByteArray();
        int int65 = classWriter1.newMethod("hi!", "", "", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 15, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 2, 7, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 1, 0, 7, 0, 2, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 2, 0, 4, 0, 11, 0, 0, 0, 2, 0, 1, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 4, 0, 4, 0, 5, 0, 14, 0, 0, 0, 10, 0, 1, 0, 6, 0, 6, 0, 1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 16 + "'", int65 == 16);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        int int6 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("hi!", "", "", 3);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitEnd();
        int int17 = classWriter1.newNameType("", "");
        int int19 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor43 = classWriter37.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        int int52 = classWriter49.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter58.visitMethod(0, "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor65 = classWriter49.visitMethod((int) 'a', "hi!", "", "hi!", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor66 = classWriter37.visitMethod(4, "hi!", "hi!", "hi!", strArray63);
        org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter1.visitField(3, "", "hi!", "", (java.lang.Object) "hi!");
        byte[] byteArray68 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute69 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 10, 0, 3, 0, 3, 0, 2, 0, 9, 0, 0, 0, 2, 0, 7, 0, 10, 0, 0, 0, 2, 0, 1, 0, 3, 0, 1, 0, 3, 0, 2, 0, 9, 0, 0, 0, 2, 0, 8, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 2, 0, 3, 0, 12, 0, 0, 0, 0]");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.ClassWriter classWriter6 = new org.mockito.asm.ClassWriter(0);
        int int8 = classWriter6.newClass("");
        classWriter6.visitSource("hi!", "");
        classWriter6.visitSource("hi!", "");
        int int17 = classWriter6.newNameType("", "");
        classWriter6.visitInnerClass("", "", "hi!", 1);
        int int25 = classWriter6.newNameType("", "hi!");
        int int27 = classWriter6.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter6.visitAnnotation("hi!", true);
        int int32 = classWriter6.newUTF8("hi!");
        int int33 = classWriter1.newConst((java.lang.Object) int32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int19 = classWriter1.newClass("");
        int int22 = classWriter1.newNameType("", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int3 = classWriter1.newUTF8("");
        int int8 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitSource("", "hi!");
        int int13 = classWriter1.newUTF8("");
        byte[] byteArray14 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 3, 0, 1, 10, 0, 2, 0, 4, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 3, 104, 105, 33]");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newConst((java.lang.Object) 6);
        int int14 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int31 = classWriter29.newConst((java.lang.Object) 1);
        int int36 = classWriter29.newMethod("", "", "", true);
        int int41 = classWriter29.newMethod("hi!", "hi!", "hi!", false);
        int int46 = classWriter29.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor58 = classWriter52.visitMethod(0, "hi!", "", "hi!", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor59 = classWriter29.visitMethod(7, "", "hi!", "hi!", strArray57);
        classWriter1.visit(8, 8, "hi!", "", "hi!", strArray57);
        int int63 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 11 + "'", int46 == 11);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter31.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        int int46 = classWriter43.newNameType("", "hi!");
        classWriter43.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter((int) '4');
        int int60 = classWriter57.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter66 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter66.visitMethod(0, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter57.visitMethod((int) 'a', "hi!", "", "hi!", strArray71);
        classWriter43.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter31.visitMethod(7, "", "", "", strArray71);
        org.mockito.asm.FieldVisitor fieldVisitor76 = classWriter1.visitField(4, "", "hi!", "hi!", (java.lang.Object) "");
        byte[] byteArray77 = classWriter1.toByteArray();
        int int81 = classWriter1.newField("hi!", "hi!", "");
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-54, -2, -70, -66, 0, 0, 0, 32, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 1, 1, 0, 0, 7, 0, 3, 7, 0, 1, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 2, 0, 4, 0, 5, 0, 0, 0, 1, 0, 4, 0, 3, 0, 1, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 8, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 4, 0, 5, 0, 2]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 11 + "'", int81 == 11);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        byte[] byteArray12 = classWriter1.toByteArray();
        int int15 = classWriter1.newNameType("hi!", "");
        int int18 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 2, 0, 4, 0, 8, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "", "", (int) (byte) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int36 = classWriter1.newNameType("hi!", "hi!");
        int int39 = classWriter1.newNameType("hi!", "");
        int int43 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        byte[] byteArray4 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter6 = new org.mockito.asm.ClassWriter(0);
        int int8 = classWriter6.newUTF8("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter6.visitMethod(2, "hi!", "hi!", "hi!", strArray16);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter23.newClass("");
        classWriter23.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter6.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int30 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitSource("", "");
        int int35 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 2, 1, 0, 3, 104, 105, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        int int23 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        int int29 = classWriter1.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = classWriter1.visitAnnotation("hi!", false);
        int int37 = classWriter1.newMethod("hi!", "", "", false);
        int int39 = classWriter1.newClass("");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        byte[] byteArray42 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 2, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor46);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", 6);
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter19.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter19.visitAnnotation("hi!", true);
        int int29 = classWriter19.newField("", "hi!", "");
        classWriter19.visitOuterClass("", "hi!", "");
        int int38 = classWriter19.newMethod("hi!", "hi!", "", true);
        int int39 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newClass("");
        classWriter1.visitInnerClass("hi!", "", "", 8);
        int int19 = classWriter1.newConst((java.lang.Object) 100);
        int int21 = classWriter1.newClass("hi!");
        int int23 = classWriter1.newClass("hi!");
        int int25 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        int int28 = classWriter1.newUTF8("");
        int int32 = classWriter1.newField("hi!", "", "");
        java.lang.Class<?> wildcardClass33 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        int int14 = classWriter11.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter11.visitMethod((int) 'a', "hi!", "", "hi!", strArray25);
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField((int) (byte) 1, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor36);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newClass("");
        int int12 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newClass("");
        int int6 = classWriter1.newNameType("", "");
        classWriter1.visitInnerClass("", "hi!", "", 0);
        int int13 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (byte) -1);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        int int27 = classWriter24.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor39 = classWriter33.visitMethod(0, "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter24.visitMethod((int) 'a', "hi!", "", "hi!", strArray38);
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter1.visitMethod(14, "hi!", "hi!", "", strArray38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(methodVisitor41);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        org.mockito.asm.MethodVisitor methodVisitor35 = classWriter19.visitMethod((int) 'a', "hi!", "", "hi!", strArray33);
        int int36 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter(0);
        int int40 = classWriter38.newUTF8("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor49 = classWriter38.visitMethod(2, "hi!", "hi!", "hi!", strArray48);
        byte[] byteArray50 = classWriter38.toByteArray();
        int int55 = classWriter38.newMethod("", "", "hi!", false);
        int int56 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 10);
        int int64 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 11 + "'", int64 == 11);
        org.junit.Assert.assertNotNull(annotationVisitor67);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newClass("");
        classWriter18.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        byte[] byteArray25 = classWriter1.toByteArray();
        byte[] byteArray26 = classWriter1.toByteArray();
        int int31 = classWriter1.newMethod("hi!", "", "hi!", true);
        byte[] byteArray32 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 8, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 8, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 12, 0, 2, 0, 1, 11, 0, 4, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 8, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 0]");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        classWriter1.visitInnerClass("", "", "hi!", 6);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int22 = classWriter1.newUTF8("");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int6 = classWriter1.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        int int15 = classWriter12.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter12.visitMethod((int) 'a', "hi!", "", "hi!", strArray26);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter1.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int34 = classWriter1.newMethod("hi!", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 0);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        classWriter48.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = classWriter48.visitAnnotation("", true);
        int int62 = classWriter48.newField("", "hi!", "");
        int int64 = classWriter48.newUTF8("hi!");
        int int66 = classWriter48.newUTF8("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter1.visitField((int) (short) -1, "hi!", "", "", (java.lang.Object) "hi!");
        int int71 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 11 + "'", int71 == 11);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int30 = classWriter1.newField("", "hi!", "");
        int int35 = classWriter1.newMethod("", "", "hi!", false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newClass("");
        byte[] byteArray13 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        int int16 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 4, 0, 0, 0, 2, 0, 1, 0, 1, 0, 5, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(100);
        int int3 = classWriter1.newClass("");
        int int7 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter4 = new org.mockito.asm.ClassWriter((-1));
        classWriter4.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray14 = null;
        classWriter4.visit(9, (int) '#', "", "", "", strArray14);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter21.newConst((java.lang.Object) 1);
        int int28 = classWriter21.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor29 = classWriter4.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int30 = classWriter1.newConst((java.lang.Object) 100);
        int int34 = classWriter1.newField("", "", "");
        classWriter1.visitEnd();
        int int37 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int10 = classWriter1.newMethod("", "hi!", "hi!", false);
        int int12 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newUTF8("hi!");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter18.visitMethod(2, "hi!", "hi!", "hi!", strArray28);
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int37 = classWriter35.newClass("");
        classWriter35.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter18.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int45 = classWriter18.newField("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor46 = classWriter1.visitField(5, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
        org.junit.Assert.assertNotNull(fieldVisitor46);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter17 = new org.mockito.asm.ClassWriter((-1));
        classWriter17.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter28 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor34 = classWriter28.visitMethod(0, "hi!", "", "hi!", strArray33);
        int int36 = classWriter28.newConst((java.lang.Object) 10.0d);
        int int38 = classWriter28.newClass("hi!");
        classWriter28.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor54 = classWriter48.visitMethod(0, "hi!", "", "hi!", strArray53);
        org.mockito.asm.ClassWriter classWriter56 = new org.mockito.asm.ClassWriter(0);
        int int58 = classWriter56.newConst((java.lang.Object) 1);
        int int63 = classWriter56.newMethod("", "", "", true);
        int int68 = classWriter56.newMethod("hi!", "hi!", "hi!", false);
        int int69 = classWriter48.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        int int79 = classWriter76.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter85 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter85.visitMethod(0, "hi!", "", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter76.visitMethod((int) 'a', "hi!", "", "hi!", strArray90);
        classWriter48.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter28.visitMethod(4, "hi!", "", "", strArray90);
        classWriter17.visit((int) (short) 10, 3, "hi!", "", "", strArray90);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter1.visitMethod(4, "", "hi!", "", strArray90);
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 9 + "'", int68 == 9);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
    }
}


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
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor4);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(annotationVisitor18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.Class<?> wildcardClass34 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        int int18 = classWriter1.newField("", "hi!", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod(6, "hi!", "hi!", "", strArray19);
        int int23 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitOuterClass("", "", "");
        int int32 = classWriter1.newMethod("", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 4);
        int int12 = classWriter1.newClass("");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int24 = classWriter19.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((int) '4');
        int int33 = classWriter30.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter39 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor45 = classWriter39.visitMethod(0, "hi!", "", "hi!", strArray44);
        org.mockito.asm.MethodVisitor methodVisitor46 = classWriter30.visitMethod((int) 'a', "hi!", "", "hi!", strArray44);
        org.mockito.asm.FieldVisitor fieldVisitor47 = classWriter19.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int49 = classWriter19.newConst((java.lang.Object) (-1.0f));
        int int51 = classWriter19.newClass("");
        classWriter19.visitOuterClass("", "hi!", "hi!");
        classWriter19.visitInnerClass("", "", "hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = classWriter19.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor64 = classWriter1.visitField(14, "", "hi!", "hi!", (java.lang.Object) annotationVisitor63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.AnnotationWriter@3a8228b4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 7 + "'", int49 == 7);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor63);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        classWriter1.visitEnd();
        int int41 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor44);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        int int34 = classWriter31.newNameType("", "hi!");
        int int36 = classWriter31.newClass("");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor49 = classWriter43.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter43.visitOuterClass("", "hi!", "hi!");
        int int56 = classWriter43.newNameType("", "hi!");
        byte[] byteArray57 = classWriter43.toByteArray();
        byte[] byteArray58 = classWriter43.toByteArray();
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter(0);
        int int67 = classWriter65.newUTF8("hi!");
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter65.visitMethod(2, "hi!", "hi!", "hi!", strArray75);
        classWriter43.visit(0, 4, "hi!", "", "hi!", strArray75);
        classWriter31.visit((int) ' ', 4, "", "", "hi!", strArray75);
        classWriter1.visit(4, 10, "hi!", "", "hi!", strArray75);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 12, 0, 2, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor76);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("hi!");
        java.lang.Object obj11 = null;
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField(0, "", "", "", obj11);
        int int14 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter20.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter20.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter(0);
        int int38 = classWriter36.newClass("");
        int int40 = classWriter36.newConst((java.lang.Object) 10L);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter36.visitField((int) (byte) 1, "hi!", "hi!", "", (java.lang.Object) "");
        org.mockito.asm.FieldVisitor fieldVisitor64 = classWriter20.visitField(4, "", "hi!", "hi!", (java.lang.Object) "");
        org.mockito.asm.FieldVisitor fieldVisitor65 = classWriter1.visitField((int) '4', "", "", "hi!", (java.lang.Object) "");
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.ClassWriter classWriter75 = new org.mockito.asm.ClassWriter(0);
        int int77 = classWriter75.newClass("");
        int int79 = classWriter75.newConst((java.lang.Object) 10L);
        int int83 = classWriter75.newField("hi!", "hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor84 = classWriter1.visitField(9, "", "", "", (java.lang.Object) int83);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 8 + "'", int83 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor84);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int15 = classWriter1.newField("", "hi!", "");
        byte[] byteArray16 = classWriter1.toByteArray();
        int int21 = classWriter1.newMethod("hi!", "", "hi!", false);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 2, 0, 7, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        int int20 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
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
        int int19 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        int int29 = classWriter21.newConst((java.lang.Object) 10.0d);
        int int31 = classWriter21.newClass("hi!");
        classWriter21.visitOuterClass("hi!", "", "hi!");
        classWriter21.visitInnerClass("", "", "hi!", 3);
        int int43 = classWriter21.newNameType("", "hi!");
        classWriter21.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = classWriter21.visitAnnotation("", true);
        int int48 = classWriter1.newConst((java.lang.Object) true);
        classWriter1.visitInnerClass("hi!", "", "", 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int75 = classWriter1.newClass("");
        int int77 = classWriter1.newUTF8("");
        java.lang.Class<?> wildcardClass78 = classWriter1.getClass();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 100);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int12 = classWriter10.newClass("");
        classWriter10.visitSource("hi!", "");
        int int20 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter26.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter26.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int41 = classWriter26.newField("hi!", "hi!", "hi!");
        int int46 = classWriter26.newMethod("", "", "", false);
        int int50 = classWriter26.newField("", "hi!", "hi!");
        classWriter26.visitEnd();
        org.mockito.asm.ClassWriter classWriter57 = new org.mockito.asm.ClassWriter(0);
        int int59 = classWriter57.newConst((java.lang.Object) 1);
        int int64 = classWriter57.newMethod("", "", "", true);
        int int69 = classWriter57.newMethod("hi!", "hi!", "hi!", false);
        int int74 = classWriter57.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter80 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray85 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter80.visitMethod(0, "hi!", "", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter57.visitMethod(7, "", "hi!", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter26.visitMethod((int) (byte) 100, "hi!", "hi!", "hi!", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter10.visitMethod((-1), "", "", "", strArray85);
        int int90 = classWriter1.newConst((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 11 + "'", int74 == 11);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 7 + "'", int90 == 7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = classWriter1.visitAnnotation("hi!", false);
        int int96 = classWriter1.newMethod("", "", "", false);
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
        org.junit.Assert.assertNotNull(annotationVisitor91);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 9 + "'", int96 == 9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray7 = classWriter1.toByteArray();
        int int11 = classWriter1.newField("", "hi!", "hi!");
        int int15 = classWriter1.newField("", "hi!", "");
        classWriter1.visitOuterClass("", "hi!", "");
        org.mockito.asm.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter10.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor21 = classWriter10.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter10.visitInnerClass("", "hi!", "hi!", 1);
        int int31 = classWriter10.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(9, "", "hi!", "", (java.lang.Object) "");
        int int41 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor44);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        byte[] byteArray9 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 1);
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int17 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        int int27 = classWriter1.newUTF8("");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray31 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 3, 104, 105, 33, 1, 0, 0, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 1, 12, 0, 2, 0, 1, 12, 0, 1, 0, 1, 9, 0, 5, 0, 7, 7, 0, 2, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 3, 0, 11, 0, 0, 0, 2, 0, 1, 0, 12, 0, 0, 0, 0, 0, 13, 0, 0, 0, 4, 0, 9, 0, 6]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int10 = classWriter1.newNameType("", "");
        int int12 = classWriter1.newConst((java.lang.Object) 100L);
        int int14 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        int int22 = classWriter14.newConst((java.lang.Object) 10.0d);
        int int24 = classWriter14.newClass("hi!");
        classWriter14.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newConst((java.lang.Object) 1);
        int int49 = classWriter42.newMethod("", "", "", true);
        int int54 = classWriter42.newMethod("hi!", "hi!", "hi!", false);
        int int55 = classWriter34.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        int int65 = classWriter62.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter62.visitMethod((int) 'a', "hi!", "", "hi!", strArray76);
        classWriter34.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter14.visitMethod(4, "hi!", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter1.visitMethod(7, "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor89 = classWriter83.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter83.visitOuterClass("", "hi!", "hi!");
        int int96 = classWriter83.newNameType("", "hi!");
        int int97 = classWriter1.newConst((java.lang.Object) int96);
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor89);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 6 + "'", int96 == 6);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 7 + "'", int97 == 7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter13 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter13.visitMethod(0, "hi!", "", "hi!", strArray18);
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = classWriter13.visitAnnotation("", false);
        int int24 = classWriter13.newClass("");
        classWriter13.visitInnerClass("", "hi!", "hi!", 1);
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newConst((java.lang.Object) 1);
        int int50 = classWriter43.newMethod("", "", "", true);
        int int55 = classWriter43.newMethod("hi!", "hi!", "hi!", false);
        int int56 = classWriter35.newConst((java.lang.Object) "hi!");
        int int61 = classWriter35.newMethod("", "hi!", "", true);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor70 = classWriter35.visitMethod(0, "", "hi!", "", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = classWriter13.visitMethod(6, "", "hi!", "hi!", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor72 = classWriter1.visitMethod(15, "", "", "", strArray69);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 9 + "'", int55 == 9);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(methodVisitor72);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        byte[] byteArray3 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int12 = classWriter10.newUTF8("");
        int int14 = classWriter10.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter10.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter23 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor29 = classWriter23.visitMethod(0, "hi!", "", "hi!", strArray28);
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int33 = classWriter31.newConst((java.lang.Object) 1);
        int int38 = classWriter31.newMethod("", "", "", true);
        int int43 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int44 = classWriter23.newConst((java.lang.Object) "hi!");
        int int49 = classWriter23.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor61 = classWriter55.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        int int70 = classWriter67.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter76.visitMethod(0, "hi!", "", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter67.visitMethod((int) 'a', "hi!", "", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter55.visitMethod(4, "hi!", "hi!", "hi!", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor85 = classWriter23.visitMethod((int) (byte) 0, "hi!", "", "", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor86 = classWriter10.visitMethod(8, "hi!", "", "", strArray81);
        classWriter1.visit(5, (int) '#', "hi!", "", "", strArray81);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 6 + "'", int49 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(methodVisitor86);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor31);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        java.lang.Object obj8 = null;
        org.mockito.asm.FieldVisitor fieldVisitor9 = classWriter1.visitField(10, "", "hi!", "hi!", obj8);
        int int11 = classWriter1.newUTF8("hi!");
        int int15 = classWriter1.newField("hi!", "hi!", "");
        int int20 = classWriter1.newMethod("hi!", "", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int13 = classWriter1.newUTF8("");
        org.mockito.asm.ClassWriter classWriter20 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter20.visitMethod(0, "hi!", "", "hi!", strArray25);
        int int28 = classWriter20.newConst((java.lang.Object) 10.0d);
        int int30 = classWriter20.newClass("hi!");
        classWriter20.visitOuterClass("hi!", "", "hi!");
        int int36 = classWriter20.newClass("hi!");
        int int40 = classWriter20.newField("hi!", "hi!", "hi!");
        classWriter20.visitEnd();
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter(0);
        int int50 = classWriter48.newConst((java.lang.Object) 1);
        int int55 = classWriter48.newMethod("", "", "", true);
        int int60 = classWriter48.newMethod("hi!", "hi!", "hi!", false);
        int int65 = classWriter48.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter48.visitMethod(7, "", "hi!", "hi!", strArray76);
        classWriter20.visit(8, 8, "hi!", "", "hi!", strArray76);
        classWriter1.visit((int) (short) -1, 9, "", "", "hi!", strArray76);
        int int85 = classWriter1.newMethod("hi!", "hi!", "", true);
        java.lang.Class<?> wildcardClass86 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 8 + "'", int85 == 8);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        int int9 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        int int15 = classWriter1.newUTF8("");
        byte[] byteArray16 = classWriter1.toByteArray();
        org.mockito.asm.FieldVisitor fieldVisitor22 = classWriter1.visitField((int) (byte) 100, "", "", "hi!", (java.lang.Object) 0L);
        byte[] byteArray23 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 100, 0, 1, 0, 1, 0, 2, 0, 12, 0, 0, 0, 2, 0, 10, 0, 13, 0, 0, 0, 2, 0, 3, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int24 = classWriter22.newConst((java.lang.Object) 1);
        int int29 = classWriter22.newMethod("", "", "", true);
        int int34 = classWriter22.newMethod("hi!", "hi!", "hi!", false);
        int int35 = classWriter14.newConst((java.lang.Object) "hi!");
        int int40 = classWriter14.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor52 = classWriter46.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter58 = new org.mockito.asm.ClassWriter((int) '4');
        int int61 = classWriter58.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter67.visitMethod(0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor74 = classWriter58.visitMethod((int) 'a', "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor75 = classWriter46.visitMethod(4, "hi!", "hi!", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor76 = classWriter14.visitMethod((int) (byte) 0, "hi!", "", "", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter1.visitMethod(8, "hi!", "", "", strArray72);
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(methodVisitor77);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int12 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        int int17 = classWriter1.newClass("");
        int int19 = classWriter1.newClass("hi!");
        int int22 = classWriter1.newNameType("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        java.lang.Class<?> wildcardClass18 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (short) 0);
        int int41 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int47 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "", "", (int) (byte) 10);
        int int55 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        byte[] byteArray73 = classWriter1.toByteArray();
        java.lang.Class<?> wildcardClass74 = classWriter1.getClass();
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
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 12, 0, 3, 0, 1, 8, 0, 3, 7, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 3, 0, 3, 0, 1, 0, 9, 0, 0, 0, 2, 0, 3, 0, 3, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0, 0, 10, 0, 0, 0, 4, 0, 2, 0, 6]");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter38.visitEnd();
        int int41 = classWriter38.newClass("hi!");
        int int43 = classWriter38.newUTF8("");
        int int48 = classWriter38.newMethod("", "hi!", "", true);
        int int49 = classWriter1.newConst((java.lang.Object) int48);
        int int51 = classWriter1.newClass("");
        int int56 = classWriter1.newMethod("hi!", "hi!", "", true);
        java.lang.Class<?> wildcardClass57 = classWriter1.getClass();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 12 + "'", int56 == 12);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int30 = classWriter1.newClass("");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("hi!", "", "");
        byte[] byteArray42 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 14, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 5, 12, 0, 3, 0, 3, 10, 0, 2, 0, 7, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 3, 104, 105, 33, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5, 0, 12, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 4, 0, 2, 0, 1, 0, 1, 0, 13, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitInnerClass("", "hi!", "", (-1));
        int int28 = classWriter1.newNameType("hi!", "");
        int int30 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int7 = classWriter1.newNameType("", "hi!");
        byte[] byteArray8 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int18 = classWriter1.newUTF8("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor24 = classWriter1.visitField((int) (byte) 0, "hi!", "", "hi!", (java.lang.Object) (byte) 100);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int29 = classWriter26.newNameType("hi!", "hi!");
        int int31 = classWriter26.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter(8);
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newClass("");
        classWriter43.visitSource("hi!", "");
        byte[] byteArray49 = classWriter43.toByteArray();
        int int53 = classWriter43.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter60 = new org.mockito.asm.ClassWriter((int) '4');
        int int63 = classWriter60.newNameType("", "hi!");
        classWriter60.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter74 = new org.mockito.asm.ClassWriter((int) '4');
        int int77 = classWriter74.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray88 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter83.visitMethod(0, "hi!", "", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter74.visitMethod((int) 'a', "hi!", "", "hi!", strArray88);
        classWriter60.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray88);
        classWriter43.visit((-1), (int) (byte) 1, "hi!", "", "", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter37.visitMethod(2, "", "hi!", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter26.visitMethod((int) (short) -1, "", "hi!", "", strArray88);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = classWriter1.newConst((java.lang.Object) strArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value [Ljava.lang.String;@16f53e99");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 7 + "'", int53 == 7);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        byte[] byteArray17 = classWriter1.toByteArray();
        int int19 = classWriter1.newUTF8("");
        int int21 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 5, 0, 5, 12, 0, 5, 0, 1, 11, 0, 2, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 0, 0, 4, 0, 2, 0, 6]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.Attribute attribute41 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", 1);
        int int18 = classWriter1.newClass("");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter34.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter34.visitAnnotation("hi!", true);
        int int42 = classWriter34.newClass("hi!");
        int int43 = classWriter1.newConst((java.lang.Object) "hi!");
        int int46 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitOuterClass("", "", "");
        org.mockito.asm.Attribute attribute55 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute55);
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
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 7 + "'", int46 == 7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        int int12 = classWriter1.newClass("");
        classWriter1.visitInnerClass("hi!", "", "", 8);
        int int19 = classWriter1.newConst((java.lang.Object) 100);
        int int21 = classWriter1.newClass("hi!");
        int int23 = classWriter1.newClass("hi!");
        int int28 = classWriter1.newMethod("hi!", "hi!", "", true);
        byte[] byteArray29 = classWriter1.toByteArray();
        int int31 = classWriter1.newClass("hi!");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 3, 0, 0, 0, 100, 12, 0, 1, 0, 2, 11, 0, 4, 0, 6, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 0, 8, 0, 0, 0, 2, 0, 1, 0, 2, 0, 9, 0, 0, 0, 10, 0, 1, 0, 4, 0, 3, 0, 2, 0, 8, 0, 10, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        classWriter1.visitOuterClass("", "", "");
        int int35 = classWriter1.newNameType("", "hi!");
        int int40 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classWriter1.visitAnnotation("", true);
        int int36 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter((int) '4');
        int int47 = classWriter42.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) '4');
        int int56 = classWriter53.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor68 = classWriter62.visitMethod(0, "hi!", "", "hi!", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter53.visitMethod((int) 'a', "hi!", "", "hi!", strArray67);
        org.mockito.asm.FieldVisitor fieldVisitor70 = classWriter42.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = classWriter42.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor74 = classWriter1.visitField(2, "hi!", "hi!", "", (java.lang.Object) true);
        classWriter1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor74);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter5 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter5.visitEnd();
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter((-1));
        classWriter8.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter8.visit(9, (int) '#', "", "", "", strArray18);
        org.mockito.asm.ClassWriter classWriter25 = new org.mockito.asm.ClassWriter(0);
        int int27 = classWriter25.newConst((java.lang.Object) 1);
        int int32 = classWriter25.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor33 = classWriter8.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int34 = classWriter5.newConst((java.lang.Object) 100);
        int int35 = classWriter1.newConst((java.lang.Object) int34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter1.visitField((-1), "", "hi!", "", (java.lang.Object) 1L);
        int int44 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.Attribute attribute45 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        int int11 = classWriter1.newField("", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", true);
        java.lang.Class<?> wildcardClass15 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int16 = classWriter1.newClass("hi!");
        int int18 = classWriter1.newUTF8("hi!");
        int int20 = classWriter1.newClass("");
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        int int22 = classWriter14.newConst((java.lang.Object) 10.0d);
        int int24 = classWriter14.newClass("hi!");
        classWriter14.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor40 = classWriter34.visitMethod(0, "hi!", "", "hi!", strArray39);
        org.mockito.asm.ClassWriter classWriter42 = new org.mockito.asm.ClassWriter(0);
        int int44 = classWriter42.newConst((java.lang.Object) 1);
        int int49 = classWriter42.newMethod("", "", "", true);
        int int54 = classWriter42.newMethod("hi!", "hi!", "hi!", false);
        int int55 = classWriter34.newConst((java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        int int65 = classWriter62.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter62.visitMethod((int) 'a', "hi!", "", "hi!", strArray76);
        classWriter34.visit((-1), (int) '#', "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter14.visitMethod(4, "hi!", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter1.visitMethod(7, "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.ClassWriter classWriter83 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor89 = classWriter83.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter83.visitOuterClass("", "hi!", "hi!");
        int int96 = classWriter83.newNameType("", "hi!");
        int int97 = classWriter1.newConst((java.lang.Object) int96);
        classWriter1.visitEnd();
        byte[] byteArray99 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor89);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 6 + "'", int96 == 6);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 7 + "'", int97 == 7);
        org.junit.Assert.assertNotNull(byteArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray99), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 3, 0, 0, 0, 6, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 2, 0, 1, 0, 8, 0, 0, 0, 2, 0, 2, 0, 0]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        int int82 = classWriter1.newClass("");
        int int84 = classWriter1.newUTF8("hi!");
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", 5);
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        int int50 = classWriter47.newNameType("", "hi!");
        classWriter47.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = classWriter47.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = classWriter1.newConst((java.lang.Object) classWriter47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@54f18164");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor57);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter1.visitAnnotation("hi!", false);
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
        org.junit.Assert.assertNotNull(annotationVisitor56);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("", true);
        classWriter1.visitSource("", "");
        int int22 = classWriter1.newClass("");
        org.mockito.asm.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int10 = classWriter1.newNameType("hi!", "");
        classWriter1.visitInnerClass("", "hi!", "hi!", 13);
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(0);
        int int13 = classWriter8.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor25 = classWriter19.visitMethod(0, "hi!", "", "hi!", strArray24);
        org.mockito.asm.MethodVisitor methodVisitor26 = classWriter8.visitMethod(4, "", "hi!", "hi!", strArray24);
        classWriter1.visit(10, 6, "", "hi!", "", strArray24);
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor26);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        int int56 = classWriter1.newNameType("", "");
        byte[] byteArray57 = classWriter1.toByteArray();
        classWriter1.visitSource("", "");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 3, 0, 0, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        int int10 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter12.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor23 = classWriter12.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter12.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int29 = classWriter1.newConst((java.lang.Object) "hi!");
        int int31 = classWriter1.newUTF8("");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter37 = new org.mockito.asm.ClassWriter((int) '4');
        int int40 = classWriter37.newNameType("", "hi!");
        int int42 = classWriter37.newClass("");
        int int44 = classWriter37.newUTF8("hi!");
        java.lang.String[] strArray49 = null;
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter37.visitMethod(8, "hi!", "", "", strArray49);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = classWriter1.newConst((java.lang.Object) methodVisitor50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.MethodWriter@19df20f5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(methodVisitor50);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        classWriter1.visitEnd();
        int int36 = classWriter1.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter((int) '4');
        int int46 = classWriter43.newNameType("", "hi!");
        classWriter43.visitOuterClass("hi!", "hi!", "hi!");
        int int54 = classWriter43.newField("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter61 = new org.mockito.asm.ClassWriter(0);
        int int63 = classWriter61.newClass("");
        classWriter61.visitSource("hi!", "");
        int int71 = classWriter61.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor77 = classWriter61.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter84 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray89 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter84.visitMethod(0, "hi!", "", "hi!", strArray89);
        classWriter61.visit((int) (byte) 100, 0, "", "", "hi!", strArray89);
        classWriter43.visit(3, (int) (short) 0, "", "", "", strArray89);
        classWriter1.visit(8, (int) (byte) 10, "", "hi!", "", strArray89);
        int int95 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13 + "'", int36 == 13);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 7 + "'", int54 == 7);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 6 + "'", int71 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor77);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 6 + "'", int95 == 6);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
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
        classWriter1.visit((int) (byte) -1, (int) (byte) 0, "", "", "", strArray46);
        int int52 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int13 = classWriter1.newUTF8("");
        int int15 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        int int6 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int18 = classWriter1.newMethod("hi!", "", "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter1.visitAnnotation("", false);
        byte[] byteArray22 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 12, 0, 1, 0, 1, 10, 0, 4, 0, 6, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 3, 104, 105, 33, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        java.lang.Class<?> wildcardClass92 = strArray88.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray13 = null;
        org.mockito.asm.MethodVisitor methodVisitor14 = classWriter1.visitMethod(8, "hi!", "", "", strArray13);
        byte[] byteArray15 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter(0);
        int int23 = classWriter21.newUTF8("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor32 = classWriter21.visitMethod(2, "hi!", "hi!", "hi!", strArray31);
        int int36 = classWriter21.newField("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor37 = classWriter1.visitField(11, "", "hi!", "hi!", (java.lang.Object) int36);
        classWriter1.visitSource("", "hi!");
        byte[] byteArray41 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(methodVisitor14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 2, 0, 1, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodVisitor32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 3, 0, 0, 0, 6, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 11, 0, 1, 0, 2, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 5, 0, 0, 0, 2, 0, 2, 0, 1, 0, 8, 0, 2, 0, 1, 0, 1, 0, 5, 0, 0, 0, 2, 0, 1, 0, 2, 0, 8, 0, 0, 0, 2, 0, 1, 0, 9, 0, 0, 0, 3, 104, 105, 33]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitOuterClass("", "hi!", "");
        int int11 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(4);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter11.visitMethod(0, "hi!", "", "hi!", strArray16);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter11.visitAnnotation("", false);
        classWriter11.visitEnd();
        classWriter11.visitInnerClass("", "", "hi!", 1);
        int int29 = classWriter11.newNameType("hi!", "");
        classWriter11.visitEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor31 = classWriter1.visitField((int) (byte) -1, "", "", "", (java.lang.Object) classWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@3078e020");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "", 10);
        int int16 = classWriter1.newUTF8("hi!");
        int int18 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        int int82 = classWriter1.newNameType("", "hi!");
        int int87 = classWriter1.newMethod("hi!", "", "hi!", false);
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        int int29 = classWriter1.newField("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 1);
        classWriter1.visitSource("", "hi!");
        int int9 = classWriter1.newMethod("", "hi!", "", true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        int int17 = classWriter1.newNameType("hi!", "");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        int int22 = classWriter19.newNameType("", "hi!");
        classWriter19.visitOuterClass("hi!", "hi!", "hi!");
        classWriter19.visitEnd();
        classWriter19.visitSource("hi!", "");
        int int33 = classWriter19.newNameType("hi!", "hi!");
        int int36 = classWriter19.newNameType("", "");
        int int40 = classWriter19.newField("", "", "");
        int int41 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        int int32 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int24 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        java.lang.String[] strArray31 = null;
        classWriter1.visit(1, 10, "", "", "hi!", strArray31);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.mockito.asm.ClassWriter classWriter33 = new org.mockito.asm.ClassWriter(0);
        int int35 = classWriter33.newConst((java.lang.Object) 1);
        int int40 = classWriter33.newMethod("", "", "", true);
        int int45 = classWriter33.newMethod("hi!", "hi!", "hi!", false);
        int int46 = classWriter1.newConst((java.lang.Object) "hi!");
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 0);
        int int54 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 9 + "'", int54 == 9);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        int int23 = classWriter1.newNameType("", "hi!");
        int int27 = classWriter1.newField("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int37 = classWriter34.newNameType("", "hi!");
        int int39 = classWriter34.newClass("");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter46.newClass("");
        classWriter46.visitSource("hi!", "");
        byte[] byteArray52 = classWriter46.toByteArray();
        int int56 = classWriter46.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter((int) '4');
        int int66 = classWriter63.newNameType("", "hi!");
        classWriter63.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        int int80 = classWriter77.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter86 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray91 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter86.visitMethod(0, "hi!", "", "hi!", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter77.visitMethod((int) 'a', "hi!", "", "hi!", strArray91);
        classWriter63.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray91);
        classWriter46.visit((-1), (int) (byte) 1, "hi!", "", "", strArray91);
        classWriter34.visit((int) (short) 10, (int) (short) 0, "hi!", "hi!", "", strArray91);
        classWriter1.visit((int) (short) 10, (int) (byte) -1, "hi!", "", "", strArray91);
        org.mockito.asm.Attribute attribute98 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 7 + "'", int56 == 7);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor93);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.Object obj39 = null;
        org.mockito.asm.FieldVisitor fieldVisitor40 = classWriter1.visitField(10, "hi!", "", "", obj39);
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor40);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(5);
        int int4 = classWriter1.newNameType("", "");
        byte[] byteArray5 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 3, 1, 0, 0, 12, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (-1));
        int int17 = classWriter1.newField("", "", "");
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = classWriter1.newConst(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
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
        int int19 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "", "hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray16 = null;
        org.mockito.asm.MethodVisitor methodVisitor17 = classWriter1.visitMethod((int) (short) 100, "hi!", "", "", strArray16);
        int int21 = classWriter1.newField("hi!", "hi!", "hi!");
        int int25 = classWriter1.newField("hi!", "hi!", "hi!");
        int int28 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter30 = new org.mockito.asm.ClassWriter((-1));
        classWriter30.visitOuterClass("", "", "hi!");
        int int38 = classWriter30.newField("", "", "");
        classWriter30.visitSource("", "");
        classWriter30.visitEnd();
        int int44 = classWriter30.newUTF8("");
        byte[] byteArray45 = classWriter30.toByteArray();
        byte[] byteArray46 = classWriter30.toByteArray();
        int int50 = classWriter30.newField("", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = classWriter1.newConst((java.lang.Object) classWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@762d9be5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 6 + "'", int38 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 2, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 7, 0, 0, 0, 2, 0, 1, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 4, 0, 2, 0, 4]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        classWriter1.visitSource("hi!", "hi!");
        int int31 = classWriter1.newUTF8("");
        byte[] byteArray32 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 8, 0, 2, 12, 0, 1, 0, 2, 10, 0, 4, 0, 8, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 3, 104, 105, 33]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        int int53 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter(0);
        int int61 = classWriter59.newClass("");
        classWriter59.visitSource("hi!", "");
        int int69 = classWriter59.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor75 = classWriter59.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter82 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter82.visitMethod(0, "hi!", "", "hi!", strArray87);
        classWriter59.visit((int) (byte) 100, 0, "", "", "hi!", strArray87);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = classWriter59.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor93 = classWriter1.visitField(10, "", "hi!", "hi!", (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 6 + "'", int69 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(fieldVisitor93);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "hi!", 1);
        int int18 = classWriter1.newClass("");
        int int22 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        int int50 = classWriter1.newNameType("", "hi!");
        int int55 = classWriter1.newMethod("", "", "hi!", true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        int int11 = classWriter1.newMethod("hi!", "", "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        org.mockito.asm.ClassWriter classWriter8 = new org.mockito.asm.ClassWriter(0);
        int int10 = classWriter8.newConst((java.lang.Object) 1);
        int int15 = classWriter8.newMethod("", "", "", true);
        int int20 = classWriter8.newMethod("hi!", "hi!", "hi!", false);
        int int25 = classWriter8.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor37 = classWriter31.visitMethod(0, "hi!", "", "hi!", strArray36);
        org.mockito.asm.MethodVisitor methodVisitor38 = classWriter8.visitMethod(7, "", "hi!", "hi!", strArray36);
        int int40 = classWriter8.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = classWriter8.visitAnnotation("", true);
        classWriter8.visitInnerClass("", "", "hi!", (int) (byte) 10);
        int int50 = classWriter8.newUTF8("hi!");
        int int51 = classWriter1.newConst((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass52 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertNotNull(methodVisitor38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        classWriter1.visitEnd();
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        classWriter1.visitInnerClass("hi!", "hi!", "", (-1));
        classWriter1.visitInnerClass("", "", "", 10);
        int int93 = classWriter1.newNameType("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 6 + "'", int93 == 6);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        classWriter1.visitOuterClass("", "", "");
        int int49 = classWriter1.newField("", "", "");
        int int53 = classWriter1.newField("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = classWriter1.visitAnnotation("", true);
        int int58 = classWriter1.newUTF8("hi!");
        int int62 = classWriter1.newField("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodVisitor39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int12 = classWriter1.newUTF8("");
        int int15 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        int int23 = classWriter1.newMethod("", "hi!", "hi!", false);
        classWriter1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        int int30 = classWriter1.newClass("");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.Attribute attribute38 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int15 = classWriter1.newField("", "hi!", "hi!");
        int int20 = classWriter1.newMethod("", "hi!", "", false);
        java.lang.String[] strArray26 = null;
        classWriter1.visit(1, 100, "", "hi!", "hi!", strArray26);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitEnd();
        int int41 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        org.mockito.asm.ClassWriter classWriter31 = new org.mockito.asm.ClassWriter(0);
        int int33 = classWriter31.newConst((java.lang.Object) 1);
        int int38 = classWriter31.newMethod("", "", "", true);
        int int43 = classWriter31.newMethod("hi!", "hi!", "hi!", false);
        int int48 = classWriter31.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter31.visitMethod(7, "", "hi!", "hi!", strArray59);
        int int63 = classWriter31.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = classWriter31.visitAnnotation("", true);
        classWriter31.visitInnerClass("", "", "hi!", (int) (byte) 10);
        int int74 = classWriter31.newNameType("", "");
        int int76 = classWriter31.newClass("hi!");
        org.mockito.asm.FieldVisitor fieldVisitor77 = classWriter1.visitField(5, "", "", "hi!", (java.lang.Object) int76);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11 + "'", int48 == 11);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 7 + "'", int76 == 7);
        org.junit.Assert.assertNotNull(fieldVisitor77);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int13 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("hi!", "hi!", "", 7);
        int int21 = classWriter1.newNameType("", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        int int48 = classWriter1.newNameType("", "hi!");
        byte[] byteArray49 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-54, -2, -70, -66, 0, 0, 0, 10, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 4, 0, 5, 3, 0, 0, 0, 0, 12, 0, 1, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 10, 0, 2, 0, 4, 0, 0, 0, 1, 0, 10, 0, 3, 0, 3, 0, 2, 0, 9, 0, 0, 0, 2, 0, 7, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 3, 0, 10, 0, 0, 0, 2, 0, 3, 0, 11, 0, 0, 0, 2, 0, 3, 0, 12, 0, 0, 0, 0]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int7 = classWriter1.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter14 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter14.visitMethod(0, "hi!", "", "hi!", strArray19);
        classWriter1.visit((int) ' ', 2, "", "hi!", "hi!", strArray19);
        int int23 = classWriter1.newUTF8("hi!");
        int int25 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        java.lang.String[] strArray13 = null;
        classWriter1.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int26 = classWriter24.newClass("");
        classWriter24.visitSource("hi!", "");
        byte[] byteArray30 = classWriter24.toByteArray();
        org.mockito.asm.ClassWriter classWriter36 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter36.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter48 = new org.mockito.asm.ClassWriter((int) '4');
        int int51 = classWriter48.newNameType("", "hi!");
        classWriter48.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter62 = new org.mockito.asm.ClassWriter((int) '4');
        int int65 = classWriter62.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter71 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = classWriter71.visitMethod(0, "hi!", "", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = classWriter62.visitMethod((int) 'a', "hi!", "", "hi!", strArray76);
        classWriter48.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter36.visitMethod(7, "", "", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter24.visitMethod(9, "hi!", "hi!", "hi!", strArray76);
        classWriter1.visit(9, (int) (byte) 1, "hi!", "", "hi!", strArray76);
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitSource("", "");
        org.mockito.asm.ClassWriter classWriter16 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter16.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor27 = classWriter16.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter16.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        int int37 = classWriter16.newMethod("", "hi!", "", true);
        int int40 = classWriter16.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int48 = classWriter46.newUTF8("");
        int int50 = classWriter46.newClass("hi!");
        classWriter46.visitEnd();
        classWriter46.visitInnerClass("", "hi!", "", 10);
        org.mockito.asm.ClassWriter classWriter63 = new org.mockito.asm.ClassWriter(0);
        int int68 = classWriter63.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter74 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray79 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter74.visitMethod(0, "hi!", "", "hi!", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter63.visitMethod(4, "", "hi!", "hi!", strArray79);
        classWriter46.visit(6, (int) ' ', "", "", "", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor83 = classWriter16.visitMethod(4, "hi!", "", "hi!", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor84 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray79);
        classWriter1.visitOuterClass("hi!", "", "");
        int int90 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(methodVisitor84);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 5 + "'", int90 == 5);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classWriter1.visitAnnotation("", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 3, 104, 105, 33, 1, 0, 0, 7, 0, 2, 7, 0, 1, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 3, 0, 4, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = classWriter1.visitAnnotation("hi!", false);
        int int18 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        int int16 = classWriter1.newField("hi!", "hi!", "hi!");
        int int21 = classWriter1.newMethod("", "", "", false);
        int int25 = classWriter1.newField("", "hi!", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter(0);
        int int34 = classWriter32.newConst((java.lang.Object) 1);
        int int39 = classWriter32.newMethod("", "", "", true);
        int int44 = classWriter32.newMethod("hi!", "hi!", "hi!", false);
        int int49 = classWriter32.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter32.visitMethod(7, "", "hi!", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter1.visitMethod((int) (byte) 100, "hi!", "hi!", "hi!", strArray60);
        int int65 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 6 + "'", int65 == 6);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        classWriter1.visitEnd();
        org.mockito.asm.FieldVisitor fieldVisitor10 = classWriter1.visitField(100, "", "hi!", "hi!", (java.lang.Object) (-1L));
        int int12 = classWriter1.newConst((java.lang.Object) 6);
        int int14 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fieldVisitor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int5 = classWriter1.newField("hi!", "hi!", "");
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int13 = classWriter1.newClass("hi!");
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor25 = classWriter19.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter19.visitOuterClass("", "hi!", "hi!");
        int int34 = classWriter19.newMethod("hi!", "hi!", "", true);
        classWriter19.visitOuterClass("", "", "hi!");
        classWriter19.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor42 = classWriter1.visitField(0, "", "hi!", "", (java.lang.Object) "");
        classWriter1.visitInnerClass("", "hi!", "hi!", 2);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter(0);
        int int51 = classWriter49.newClass("");
        classWriter49.visitSource("hi!", "");
        byte[] byteArray55 = classWriter49.toByteArray();
        int int59 = classWriter49.newField("", "hi!", "hi!");
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor69 = classWriter49.visitMethod(9, "", "hi!", "hi!", strArray68);
        int int72 = classWriter49.newNameType("", "hi!");
        int int74 = classWriter49.newClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int75 = classWriter1.newConst((java.lang.Object) classWriter49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@4058f7d1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 7 + "'", int59 == 7);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 9 + "'", int72 == 9);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int46 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int15 = classWriter1.newNameType("hi!", "hi!");
        int int18 = classWriter1.newNameType("", "");
        int int22 = classWriter1.newField("", "", "");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.mockito.asm.ClassWriter classWriter43 = new org.mockito.asm.ClassWriter(0);
        int int45 = classWriter43.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter47.visitEnd();
        org.mockito.asm.ClassWriter classWriter50 = new org.mockito.asm.ClassWriter((-1));
        classWriter50.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray60 = null;
        classWriter50.visit(9, (int) '#', "", "", "", strArray60);
        org.mockito.asm.ClassWriter classWriter67 = new org.mockito.asm.ClassWriter(0);
        int int69 = classWriter67.newConst((java.lang.Object) 1);
        int int74 = classWriter67.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor75 = classWriter50.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        int int76 = classWriter47.newConst((java.lang.Object) 100);
        int int77 = classWriter43.newConst((java.lang.Object) int76);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor78 = classWriter1.visitField((-1), "", "hi!", "", (java.lang.Object) classWriter43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@77de6587");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 0);
        int int3 = classWriter1.newClass("hi!");
        classWriter1.visitEnd();
        classWriter1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("hi!", false);
        int int13 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        int int16 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitInnerClass("", "hi!", "", (int) '4');
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
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitEnd();
        int int23 = classWriter1.newMethod("", "", "hi!", false);
        classWriter1.visitSource("hi!", "hi!");
        int int29 = classWriter1.newNameType("", "hi!");
        int int33 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitOuterClass("", "", "hi!");
        classWriter1.visitSource("", "");
        int int27 = classWriter1.newField("", "", "");
        classWriter1.visitOuterClass("", "", "");
        int int34 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter1.visitAnnotation("hi!", true);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        classWriter1.visit((int) (short) 1, (int) (byte) 10, "", "", "", strArray49);
        java.lang.Class<?> wildcardClass52 = classWriter1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = classWriter1.visitAnnotation("hi!", true);
        int int78 = classWriter1.newUTF8("");
        org.mockito.asm.Attribute attribute79 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int10 = classWriter1.newNameType("", "");
        int int12 = classWriter1.newClass("");
        int int17 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter((int) '4');
        int int39 = classWriter34.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        int int48 = classWriter45.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor60 = classWriter54.visitMethod(0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter45.visitMethod((int) 'a', "hi!", "", "hi!", strArray59);
        org.mockito.asm.FieldVisitor fieldVisitor62 = classWriter34.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter1.visitField((int) ' ', "", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        int int68 = classWriter65.newNameType("", "hi!");
        classWriter65.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = classWriter65.visitAnnotation("", true);
        classWriter65.visitOuterClass("hi!", "", "hi!");
        int int80 = classWriter1.newConst((java.lang.Object) "hi!");
        byte[] byteArray81 = classWriter1.toByteArray();
        org.mockito.asm.Attribute attribute82 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 10, 0, 6, 0, 7, 8, 0, 3, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 0, 1, 0, 1, 0, 2, 0, 10, 0, 0, 0, 2, 0, 4, 0, 11, 0, 0, 0, 2, 0, 1, 0, 10, 0, 1, 0, 1, 0, 1, 0, 11, 0, 0, 0, 2, 0, 1, 0, 32, 0, 1, 0, 3, 0, 2, 0, 10, 0, 0, 0, 2, 0, 9, 0, 11, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 12, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 6, 0, 3, 0, 1]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 10);
        byte[] byteArray2 = classWriter1.toByteArray();
        int int7 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        int int9 = classWriter1.newClass("hi!");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        classWriter1.visitEnd();
        int int9 = classWriter1.newNameType("hi!", "hi!");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("", "hi!", "hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        classWriter1.visitInnerClass("", "", "hi!", 6);
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter(0);
        int int25 = classWriter22.newNameType("hi!", "hi!");
        int int28 = classWriter22.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor41 = classWriter35.visitMethod(0, "hi!", "", "hi!", strArray40);
        classWriter22.visit((int) ' ', 2, "", "hi!", "hi!", strArray40);
        classWriter22.visitOuterClass("hi!", "hi!", "hi!");
        int int51 = classWriter22.newMethod("hi!", "", "", false);
        classWriter22.visitSource("", "");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!" };
        org.mockito.asm.MethodVisitor methodVisitor63 = classWriter22.visitMethod(3, "", "", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = classWriter1.visitMethod(0, "", "", "", strArray62);
        byte[] byteArray65 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(methodVisitor41);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 10, 69, 120, 99, 101, 112, 116, 105, 111, 110, 115, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 0, 5, 0, 0, 0, 8, 0, 3, 0, 4, 0, 2, 0, 4, 0, 6, 0, 0, 0, 2, 0, 1, 0, 2, 0, 7, 0, 0, 0, 18, 0, 2, 0, 2, 0, 4, 0, 3, 0, 0, 0, 2, 0, 2, 0, 3, 0, 6, 0, 8, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        byte[] byteArray15 = classWriter1.toByteArray();
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter24.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter24.visitAnnotation("hi!", true);
        classWriter24.visitOuterClass("hi!", "", "");
        org.mockito.asm.ClassWriter classWriter41 = new org.mockito.asm.ClassWriter(0);
        int int46 = classWriter41.newMethod("", "", "", true);
        classWriter41.visitEnd();
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int55 = classWriter53.newUTF8("");
        int int57 = classWriter53.newClass("hi!");
        classWriter53.visitEnd();
        classWriter53.visitInnerClass("", "hi!", "", 10);
        org.mockito.asm.ClassWriter classWriter70 = new org.mockito.asm.ClassWriter(0);
        int int75 = classWriter70.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter81 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray86 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor87 = classWriter81.visitMethod(0, "hi!", "", "hi!", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter70.visitMethod(4, "", "hi!", "hi!", strArray86);
        classWriter53.visit(6, (int) ' ', "", "", "", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor90 = classWriter41.visitMethod((int) (short) -1, "hi!", "", "hi!", strArray86);
        classWriter24.visit((int) (byte) 1, (int) (byte) 100, "", "", "hi!", strArray86);
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter1.visitMethod((int) (byte) 1, "", "", "", strArray86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 7, 0, 0, 0, 2, 0, 2, 0, 8, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 4 + "'", int75 == 4);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertNotNull(methodVisitor92);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        int int37 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter44.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        int int58 = classWriter55.newNameType("", "hi!");
        classWriter55.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = classWriter55.visitAnnotation("", true);
        classWriter55.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter(0);
        int int81 = classWriter76.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter87 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray92 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter87.visitMethod(0, "hi!", "", "hi!", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter76.visitMethod(4, "", "hi!", "hi!", strArray92);
        classWriter55.visit(10, (int) (byte) 100, "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter44.visitMethod(8, "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor97 = classWriter1.visitMethod((int) (byte) 1, "", "", "hi!", strArray92);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        int int11 = classWriter1.newMethod("hi!", "hi!", "", false);
        int int16 = classWriter1.newMethod("hi!", "hi!", "hi!", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", 12);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int16 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("", "hi!", "", 8);
        org.mockito.asm.Attribute attribute42 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor36);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int62 = classWriter1.newMethod("", "hi!", "hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(methodVisitor43);
        org.junit.Assert.assertNotNull(methodVisitor45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(4);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        int int12 = classWriter1.newField("", "", "hi!");
        java.lang.String[] strArray18 = null;
        classWriter1.visit(12, (-1), "", "hi!", "", strArray18);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("", "", "", true);
        int int13 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int18 = classWriter1.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        org.mockito.asm.MethodVisitor methodVisitor31 = classWriter1.visitMethod(7, "", "hi!", "hi!", strArray29);
        int int33 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 100);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("", "");
        classWriter1.visitEnd();
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        byte[] byteArray55 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("hi!", "hi!", "", 11);
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 17, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 4, 0, 13, 0, 0, 0, 2, 0, 2, 0, 14, 0, 0, 0, 0, 0, 15, 0, 0, 0, 4, 0, 3, 0, 10, 0, 16, 0, 0, 0, 18, 0, 2, 0, 3, 0, 7, 0, 2, 0, 100, 0, 7, 0, 3, 0, 6, 0, 32]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodVisitor47);
        org.junit.Assert.assertNotNull(methodVisitor48);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.mockito.asm.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.ClassWriter classWriter15 = new org.mockito.asm.ClassWriter(0);
        int int17 = classWriter15.newClass("");
        classWriter15.visitSource("hi!", "");
        byte[] byteArray21 = classWriter15.toByteArray();
        int int25 = classWriter15.newField("", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter32 = new org.mockito.asm.ClassWriter((int) '4');
        int int35 = classWriter32.newNameType("", "hi!");
        classWriter32.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        classWriter32.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray60);
        classWriter15.visit((-1), (int) (byte) 1, "hi!", "", "", strArray60);
        classWriter1.visit((int) 'a', 9, "hi!", "hi!", "hi!", strArray60);
        int int69 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitInnerClass("hi!", "", "", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 6 + "'", int69 == 6);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitEnd();
        int int4 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int15 = classWriter1.newField("", "hi!", "hi!");
        int int20 = classWriter1.newMethod("", "hi!", "", false);
        java.lang.String[] strArray26 = null;
        classWriter1.visit(1, 100, "", "hi!", "hi!", strArray26);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitEnd();
        byte[] byteArray40 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 14, 1, 0, 3, 104, 105, 33, 7, 0, 1, 1, 0, 0, 7, 0, 3, 12, 0, 1, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 6, 10, 0, 4, 0, 5, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 100, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 9, 0, 0, 0, 2, 0, 1, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 3, 104, 105, 33, 0, 12, 0, 0, 0, 4, 0, 4, 0, 5, 0, 13, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        int int10 = classWriter1.newField("hi!", "", "");
        int int14 = classWriter1.newField("hi!", "hi!", "");
        java.lang.String[] strArray20 = null;
        classWriter1.visit(0, 7, "hi!", "hi!", "", strArray20);
        byte[] byteArray22 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "hi!", "", 6);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 4, 0, 5, 12, 0, 3, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 7, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 9, 0, 0, 0, 2, 0, 3, 0, 10, 0, 0, 0, 10, 0, 1, 0, 2, 0, 2, 0, 3, 0, 2]");
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }
}


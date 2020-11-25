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
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter(5);
        int int78 = classWriter73.newMethod("", "", "", true);
        int int79 = classWriter1.newConst((java.lang.Object) "");
        classWriter1.visitEnd();
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        int int14 = classWriter1.newNameType("hi!", "");
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = classWriter1.visitAnnotation("hi!", true);
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
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.Class<?> wildcardClass71 = classWriter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter12 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor18 = classWriter12.visitMethod(0, "hi!", "", "hi!", strArray17);
        org.mockito.asm.MethodVisitor methodVisitor19 = classWriter1.visitMethod(4, "", "hi!", "hi!", strArray17);
        byte[] byteArray20 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter(0);
        int int28 = classWriter26.newConst((java.lang.Object) 1);
        int int33 = classWriter26.newMethod("", "", "", true);
        int int38 = classWriter26.newMethod("hi!", "hi!", "hi!", false);
        int int43 = classWriter26.newMethod("", "hi!", "", false);
        org.mockito.asm.ClassWriter classWriter49 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor55 = classWriter49.visitMethod(0, "hi!", "", "hi!", strArray54);
        org.mockito.asm.MethodVisitor methodVisitor56 = classWriter26.visitMethod(7, "", "hi!", "hi!", strArray54);
        byte[] byteArray57 = classWriter26.toByteArray();
        int int59 = classWriter26.newClass("");
        org.mockito.asm.FieldVisitor fieldVisitor60 = classWriter1.visitField(15, "hi!", "", "", (java.lang.Object) "");
        int int65 = classWriter1.newMethod("", "", "", false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 6, 0, 0, 0, 2, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11 + "'", int43 == 11);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 3, 0, 0, 0, 1, 1, 0, 0, 7, 0, 2, 12, 0, 2, 0, 2, 11, 0, 3, 0, 4, 1, 0, 3, 104, 105, 33, 7, 0, 6, 12, 0, 6, 0, 6, 10, 0, 7, 0, 8, 12, 0, 6, 0, 2, 10, 0, 3, 0, 10, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 2, 0, 6, 0, 1, 0, 12, 0, 0, 0, 2, 0, 6, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int3 = classWriter1.newUTF8("hi!");
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        classWriter1.visitInnerClass("", "", "hi!", 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter(0);
        int int26 = classWriter24.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = classWriter24.visitAnnotation("hi!", false);
        classWriter24.visitInnerClass("", "hi!", "hi!", (int) (short) 0);
        byte[] byteArray35 = classWriter24.toByteArray();
        classWriter24.visitInnerClass("hi!", "", "", 8);
        org.mockito.asm.FieldVisitor fieldVisitor41 = classWriter1.visitField((int) (byte) 0, "hi!", "", "hi!", (java.lang.Object) 8);
        byte[] byteArray42 = classWriter1.toByteArray();
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, 10, 0, 1, 0, 2, 0, 4, 0, 3, 0, 0, 0, 6, 0, 0, 0, 6, 0, 1, 0, 3, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 11, 1, 0, 0, 1, 0, 3, 104, 105, 33, 7, 0, 2, 7, 0, 1, 3, 0, 0, 0, 8, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 0, 2, 0, 6, 0, 0, 0, 2, 0, 5, 0, 7, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 0, 8, 0, 0, 0, 2, 0, 2, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 18, 0, 2, 0, 3, 0, 4, 0, 2, 0, 97, 0, 4, 0, 4, 0, 2, 0, 0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) -1);
        int int6 = classWriter1.newMethod("hi!", "", "", false);
        int int10 = classWriter1.newField("", "hi!", "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("hi!", true);
        int int11 = classWriter1.newField("", "hi!", "");
        int int15 = classWriter1.newField("", "", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) ' ');
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "");
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        classWriter1.visitSource("", "");
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (byte) 0);
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int24 = classWriter1.newNameType("", "hi!");
        classWriter1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        byte[] byteArray78 = classWriter1.toByteArray();
        int int82 = classWriter1.newField("", "", "");
        java.lang.Class<?> wildcardClass83 = classWriter1.getClass();
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
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 13 + "'", int82 == 13);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        byte[] byteArray38 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("hi!", "hi!", "", (int) (short) 1);
        int int46 = classWriter1.newClass("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 2, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int37 = classWriter1.newField("", "", "");
        classWriter1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        int int75 = classWriter1.newClass("hi!");
        byte[] byteArray76 = classWriter1.toByteArray();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 6 + "'", int75 == 6);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 15, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 6, 64, 36, 0, 0, 0, 0, 0, 0, 7, 0, 3, 12, 0, 3, 0, 3, 9, 0, 6, 0, 7, 12, 0, 1, 0, 1, 10, 0, 2, 0, 9, 8, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 1, 0, 1, 0, 2, 0, 12, 0, 0, 0, 2, 0, 4, 0, 13, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 14, 0, 0, 0, 18, 0, 2, 0, 2, 0, 2, 0, 3, 0, 2, 0, 2, 0, 2, 0, 1, -1, -1]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        classWriter1.visitEnd();
        classWriter1.visitSource("hi!", "");
        int int15 = classWriter1.newNameType("hi!", "hi!");
        int int18 = classWriter1.newNameType("", "");
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        int int27 = classWriter24.newNameType("", "hi!");
        classWriter24.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = classWriter24.visitAnnotation("", true);
        int int37 = classWriter24.newNameType("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = classWriter24.visitAnnotation("", true);
        org.mockito.asm.ClassWriter classWriter47 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor53 = classWriter47.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter((int) '4');
        int int62 = classWriter59.newNameType("", "hi!");
        classWriter59.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter73 = new org.mockito.asm.ClassWriter((int) '4');
        int int76 = classWriter73.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter82 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor88 = classWriter82.visitMethod(0, "hi!", "", "hi!", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter73.visitMethod((int) 'a', "hi!", "", "hi!", strArray87);
        classWriter59.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor91 = classWriter47.visitMethod(7, "", "", "", strArray87);
        classWriter24.visit(0, 7, "hi!", "", "", strArray87);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter1.visitMethod((int) (byte) 10, "hi!", "", "", strArray87);
        classWriter1.visitInnerClass("hi!", "hi!", "", 4);
        byte[] byteArray99 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertNotNull(methodVisitor91);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(byteArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray99), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 1, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 10, 0, 2, 0, 1, 0, 1, 0, 7, 0, 0, 0, 2, 0, 1, 0, 4, 0, 8, 0, 0, 0, 2, 0, 2, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 10, 0, 1, 0, 4, 0, 4, 0, 1, 0, 4]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        classWriter1.visitSource("", "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = classWriter1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor25);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        org.mockito.asm.ClassWriter classWriter29 = new org.mockito.asm.ClassWriter(0);
        int int34 = classWriter29.newMethod("", "", "", true);
        classWriter29.visitEnd();
        int int38 = classWriter29.newNameType("", "");
        int int39 = classWriter1.newConst((java.lang.Object) "");
        org.mockito.asm.ClassWriter classWriter45 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter45.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter45.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = classWriter45.visitAnnotation("hi!", false);
        int int60 = classWriter45.newClass("hi!");
        int int62 = classWriter45.newUTF8("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = classWriter45.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass66 = annotationVisitor65.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor67 = classWriter1.visitField(8, "", "", "", (java.lang.Object) wildcardClass66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value class org.mockito.asm.AnnotationWriter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray11 = null;
        classWriter1.visit(9, (int) '#', "", "", "", strArray11);
        org.mockito.asm.ClassWriter classWriter18 = new org.mockito.asm.ClassWriter(0);
        int int20 = classWriter18.newConst((java.lang.Object) 1);
        int int25 = classWriter18.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor26 = classWriter1.visitField(100, "hi!", "hi!", "", (java.lang.Object) "");
        classWriter1.visitEnd();
        int int30 = classWriter1.newNameType("", "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        byte[] byteArray11 = classWriter1.toByteArray();
        int int16 = classWriter1.newMethod("hi!", "", "", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        classWriter1.visitSource("hi!", "");
        int int11 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor17 = classWriter1.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter24 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor30 = classWriter24.visitMethod(0, "hi!", "", "hi!", strArray29);
        classWriter1.visit((int) (byte) 100, 0, "", "", "hi!", strArray29);
        int int35 = classWriter1.newField("hi!", "", "");
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
        org.mockito.asm.MethodVisitor methodVisitor89 = classWriter1.visitMethod((int) 'a', "hi!", "", "hi!", strArray85);
        int int93 = classWriter1.newField("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
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
        org.junit.Assert.assertNotNull(methodVisitor89);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.Class<?> wildcardClass83 = classWriter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(8);
        classWriter1.visitInnerClass("", "", "", (int) (byte) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classWriter1.visitAnnotation("hi!", false);
        org.mockito.asm.ClassWriter classWriter19 = new org.mockito.asm.ClassWriter(0);
        int int21 = classWriter19.newConst((java.lang.Object) 1);
        int int26 = classWriter19.newMethod("hi!", "hi!", "", true);
        classWriter19.visitInnerClass("", "hi!", "hi!", (-1));
        byte[] byteArray32 = classWriter19.toByteArray();
        byte[] byteArray33 = classWriter19.toByteArray();
        org.mockito.asm.ClassWriter classWriter40 = new org.mockito.asm.ClassWriter(0);
        int int42 = classWriter40.newClass("");
        classWriter40.visitSource("hi!", "");
        byte[] byteArray46 = classWriter40.toByteArray();
        org.mockito.asm.ClassWriter classWriter52 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor58 = classWriter52.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        org.mockito.asm.ClassWriter classWriter64 = new org.mockito.asm.ClassWriter((int) '4');
        int int67 = classWriter64.newNameType("", "hi!");
        classWriter64.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter78 = new org.mockito.asm.ClassWriter((int) '4');
        int int81 = classWriter78.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter87 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray92 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter87.visitMethod(0, "hi!", "", "hi!", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = classWriter78.visitMethod((int) 'a', "hi!", "", "hi!", strArray92);
        classWriter64.visit((int) (byte) 1, (int) (short) 10, "", "hi!", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor96 = classWriter52.visitMethod(7, "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor97 = classWriter40.visitMethod(9, "hi!", "hi!", "hi!", strArray92);
        classWriter19.visit(5, 15, "hi!", "hi!", "", strArray92);
        classWriter1.visit(9, 8, "", "", "", strArray92);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 7, 0, 3, 0, 2, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 9, 3, 0, 0, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 2, 1, 0, 0, 12, 0, 2, 0, 4, 11, 0, 3, 0, 5, 7, 0, 4, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 10, 0, 1, 0, 7, 0, 3, 0, 2, -1, -1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 6, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 20, 83, 111, 117, 114, 99, 101, 68, 101, 98, 117, 103, 69, 120, 116, 101, 110, 115, 105, 111, 110, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0, 3, 0, 5, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        byte[] byteArray9 = classWriter1.toByteArray();
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classWriter1.visitAnnotation("", false);
        byte[] byteArray13 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 10, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 8, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 7, 0, 3, 12, 0, 1, 0, 1, 10, 0, 4, 0, 5, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 7, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter(0);
        int int38 = classWriter35.newNameType("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter44.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor55 = classWriter44.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter44.visitInnerClass("", "hi!", "hi!", 1);
        int int65 = classWriter44.newMethod("hi!", "hi!", "hi!", false);
        int int70 = classWriter44.newMethod("", "", "", true);
        org.mockito.asm.FieldVisitor fieldVisitor71 = classWriter35.visitField(9, "", "hi!", "", (java.lang.Object) "");
        classWriter35.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        classWriter35.visitOuterClass("hi!", "", "hi!");
        int int81 = classWriter1.newConst((java.lang.Object) "hi!");
        int int85 = classWriter1.newField("", "hi!", "");
        classWriter1.visitInnerClass("", "", "", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor71);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 8 + "'", int81 == 8);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 1);
        int int53 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 6 + "'", int53 == 6);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(annotationVisitor42);
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
        int int34 = classWriter1.newMethod("hi!", "", "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter1.visitAnnotation("", true);
        classWriter1.visitInnerClass("hi!", "", "", (int) (short) 0);
        classWriter1.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor46);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "");
        int int16 = classWriter1.newUTF8("");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        int int23 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classWriter1.visitAnnotation("hi!", false);
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = classWriter1.visitMethod((int) (short) -1, "hi!", "", "", strArray19);
        org.mockito.asm.ClassWriter classWriter26 = new org.mockito.asm.ClassWriter((int) '4');
        int int29 = classWriter26.newNameType("", "hi!");
        classWriter26.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = classWriter26.visitAnnotation("", true);
        int int39 = classWriter26.newNameType("hi!", "");
        int int41 = classWriter26.newClass("hi!");
        classWriter26.visitOuterClass("hi!", "", "hi!");
        int int50 = classWriter26.newMethod("", "", "hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor51 = classWriter1.visitField((int) '4', "hi!", "", "", (java.lang.Object) true);
        byte[] byteArray52 = classWriter1.toByteArray();
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 13, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 3, 0, 0, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 52, 0, 1, 0, 2, 0, 2, 0, 7, 0, 0, 0, 2, 0, 6, 0, 10, 0, 0, 0, 2, 0, 2, 0, 1, -1, -1, 0, 1, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 2, 0, 2, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5, 0, 12, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        classWriter1.visitInnerClass("", "", "", 3);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (byte) 100);
        int int3 = classWriter1.newUTF8("");
        int int5 = classWriter1.newClass("hi!");
        classWriter1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("hi!", false);
        int int13 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.mockito.asm.Attribute attribute73 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        int int3 = classWriter1.newUTF8("");
        int int8 = classWriter1.newMethod("", "hi!", "", false);
        classWriter1.visitSource("", "hi!");
        int int13 = classWriter1.newUTF8("");
        int int15 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = classWriter1.visitAnnotation("hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor18);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor12 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray11);
        byte[] byteArray13 = classWriter1.toByteArray();
        int int18 = classWriter1.newMethod("", "", "hi!", false);
        int int20 = classWriter1.newUTF8("hi!");
        int int23 = classWriter1.newNameType("", "hi!");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        classWriter1.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor11 = classWriter1.visitField(8, "hi!", "", "", (java.lang.Object) "");
        int int13 = classWriter1.newClass("hi!");
        int int15 = classWriter1.newUTF8("");
        int int17 = classWriter1.newUTF8("hi!");
        org.junit.Assert.assertNotNull(fieldVisitor11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(14);
        int int3 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("", "", "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int7 = classWriter1.newClass("hi!");
        java.lang.String[] strArray13 = null;
        classWriter1.visit((int) (byte) 100, (int) (short) 10, "", "", "", strArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = classWriter1.visitAnnotation("hi!", false);
        byte[] byteArray18 = classWriter1.toByteArray();
        classWriter1.visitOuterClass("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass23 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-54, -2, -70, -66, 0, 0, 0, 100, 0, 8, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 7, 0, 1, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 10, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 1, 0, 7, 0, 0, 0, 6, 0, 1, 0, 2, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        java.lang.Class<?> wildcardClass67 = fieldVisitor66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        classWriter1.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitInnerClass("", "hi!", "hi!", (int) (byte) -1);
        int int32 = classWriter1.newNameType("", "");
        int int36 = classWriter1.newField("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int6 = classWriter1.newMethod("", "", "", true);
        classWriter1.visitEnd();
        int int10 = classWriter1.newNameType("", "");
        byte[] byteArray11 = classWriter1.toByteArray();
        classWriter1.visitSource("", "");
        classWriter1.visitInnerClass("", "", "hi!", 11);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 5, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        int int35 = classWriter1.newMethod("", "hi!", "hi!", false);
        int int37 = classWriter1.newUTF8("");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.lang.Class<?> wildcardClass83 = classWriter1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int8 = classWriter1.newMethod("hi!", "", "", false);
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "", "", 10);
        classWriter1.visitEnd();
        int int18 = classWriter1.newNameType("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(5);
        int int4 = classWriter1.newNameType("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classWriter1.visitAnnotation("", false);
        classWriter1.visitEnd();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor7);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int76 = classWriter1.newClass("");
        int int78 = classWriter1.newClass("hi!");
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 7 + "'", int76 == 7);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        byte[] byteArray63 = classWriter1.toByteArray();
        classWriter1.visitInnerClass("", "hi!", "", (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-54, -2, -70, -66, 0, 0, 0, 9, 0, 12, 1, 0, 0, 7, 0, 1, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 3, 8, 0, 3, 7, 0, 3, 12, 0, 1, 0, 1, 9, 0, 6, 0, 7, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 35, 0, 2, 0, 2, 0, 0, 0, 1, 0, 8, 0, 1, 0, 3, 0, 2, 0, 9, 0, 0, 0, 2, 0, 5, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2, 0, 10, 0, 0, 0, 2, 0, 1, 0, 11, 0, 0, 0, 4, 0, 2, 0, 4]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        classWriter1.visitSource("hi!", "");
        int int16 = classWriter1.newUTF8("");
        int int21 = classWriter1.newMethod("hi!", "hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int34 = classWriter1.newConst((java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "");
        int int40 = classWriter1.newClass("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodVisitor18);
        org.junit.Assert.assertNotNull(methodVisitor19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        java.lang.Object obj27 = null;
        org.mockito.asm.FieldVisitor fieldVisitor28 = classWriter1.visitField(10, "", "", "", obj27);
        int int30 = classWriter1.newClass("");
        classWriter1.visitSource("", "hi!");
        int int38 = classWriter1.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter44 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor50 = classWriter44.visitMethod(0, "hi!", "", "hi!", strArray49);
        org.mockito.asm.MethodVisitor methodVisitor51 = classWriter1.visitMethod(2, "hi!", "hi!", "hi!", strArray49);
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(methodVisitor51);
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
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newUTF8("hi!");
        classWriter1.visitSource("hi!", "hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classWriter1.visitAnnotation("hi!", true);
        int int42 = classWriter1.newNameType("hi!", "");
        java.lang.String[] strArray47 = null;
        org.mockito.asm.MethodVisitor methodVisitor48 = classWriter1.visitMethod((int) 'a', "hi!", "hi!", "hi!", strArray47);
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(methodVisitor48);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        classWriter1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(methodVisitor37);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        classWriter1.visitOuterClass("hi!", "hi!", "");
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = classWriter1.newConst(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        org.mockito.asm.ClassWriter classWriter9 = new org.mockito.asm.ClassWriter(0);
        int int11 = classWriter9.newConst((java.lang.Object) 1);
        int int16 = classWriter9.newMethod("", "", "", true);
        int int21 = classWriter9.newMethod("hi!", "hi!", "hi!", false);
        int int22 = classWriter1.newConst((java.lang.Object) "hi!");
        int int27 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitEnd();
        org.mockito.asm.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute29);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        byte[] byteArray5 = classWriter1.toByteArray();
        int int10 = classWriter1.newMethod("", "", "", true);
        byte[] byteArray11 = classWriter1.toByteArray();
        byte[] byteArray12 = classWriter1.toByteArray();
        int int15 = classWriter1.newNameType("", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 4, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 7, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.mockito.asm.ClassWriter classWriter34 = new org.mockito.asm.ClassWriter(0);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = classWriter34.visitAnnotation("", false);
        classWriter34.visitSource("", "hi!");
        classWriter34.visitOuterClass("", "hi!", "");
        java.lang.String[] strArray50 = null;
        classWriter34.visit(13, 3, "hi!", "hi!", "", strArray50);
        int int53 = classWriter34.newUTF8("");
        org.mockito.asm.ClassWriter classWriter59 = new org.mockito.asm.ClassWriter(0);
        int int61 = classWriter59.newConst((java.lang.Object) 1);
        int int66 = classWriter59.newMethod("", "", "", true);
        int int71 = classWriter59.newMethod("hi!", "hi!", "hi!", false);
        classWriter59.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter77 = new org.mockito.asm.ClassWriter((int) '4');
        int int80 = classWriter77.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter86 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray91 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor92 = classWriter86.visitMethod(0, "hi!", "", "hi!", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = classWriter77.visitMethod((int) 'a', "hi!", "", "hi!", strArray91);
        int int94 = classWriter59.newConst((java.lang.Object) "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor95 = classWriter34.visitField((int) (byte) 1, "", "", "", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor96 = classWriter1.visitField((int) '#', "", "", "hi!", (java.lang.Object) classWriter34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@419861ff");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 0, 1, 0, 3, 104, 105, 33, 12, 0, 1, 0, 2, 7, 0, 2, 12, 0, 2, 0, 2, 12, 0, 2, 0, 1, 12, 0, 1, 0, 1, 9, 0, 4, 0, 7, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 25, 82, 117, 110, 116, 105, 109, 101, 86, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 6, 0, 2, 0, 2, 0, 1, 0, 9, 0, 0, 0, 2, 0, 1, 0, 2, 0, 10, 0, 0, 0, 4, 0, 4, 0, 5, 0, 11, 0, 0, 0, 6, 0, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 9 + "'", int71 == 9);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 10 + "'", int94 == 10);
        org.junit.Assert.assertNotNull(fieldVisitor95);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        classWriter1.visitEnd();
        classWriter1.visitInnerClass("", "hi!", "", (int) (short) 0);
        int int65 = classWriter1.newField("", "hi!", "");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 7 + "'", int65 == 7);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int4 = classWriter1.newNameType("hi!", "hi!");
        int int6 = classWriter1.newConst((java.lang.Object) 1.0d);
        classWriter1.visitSource("hi!", "hi!");
        org.mockito.asm.ClassWriter classWriter11 = new org.mockito.asm.ClassWriter((int) '4');
        int int14 = classWriter11.newNameType("", "hi!");
        classWriter11.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = classWriter11.visitAnnotation("", true);
        int int25 = classWriter11.newField("", "hi!", "");
        int int27 = classWriter11.newUTF8("hi!");
        int int32 = classWriter11.newMethod("hi!", "hi!", "", true);
        int int33 = classWriter1.newConst((java.lang.Object) int32);
        int int35 = classWriter1.newClass("");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = classWriter1.visitAnnotation("", false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(annotationVisitor38);
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
        int int30 = classWriter1.newField("", "hi!", "");
        classWriter1.visitSource("", "hi!");
        classWriter1.visitSource("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(9);
        int int3 = classWriter1.newClass("hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classWriter1.visitAnnotation("hi!", false);
        int int8 = classWriter1.newUTF8("");
        int int12 = classWriter1.newField("", "", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newClass("");
        int int5 = classWriter1.newConst((java.lang.Object) 10L);
        int int7 = classWriter1.newUTF8("hi!");
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int16 = classWriter1.newMethod("", "hi!", "", true);
        byte[] byteArray17 = classWriter1.toByteArray();
        int int19 = classWriter1.newUTF8("");
        int int22 = classWriter1.newNameType("hi!", "");
        byte[] byteArray23 = classWriter1.toByteArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 5, 0, 5, 12, 0, 5, 0, 1, 11, 0, 2, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 0, 0, 4, 0, 2, 0, 6]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 10, 1, 0, 0, 7, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 3, 104, 105, 33, 12, 0, 5, 0, 5, 12, 0, 5, 0, 1, 11, 0, 2, 0, 7, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9, 0, 0, 0, 4, 0, 2, 0, 6]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter1.visitInnerClass("", "", "hi!", 2);
        org.mockito.asm.FieldVisitor fieldVisitor12 = classWriter1.visitField((int) (short) 10, "", "", "", (java.lang.Object) 10.0d);
        classWriter1.visitInnerClass("", "hi!", "hi!", 1);
        int int22 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int27 = classWriter1.newMethod("", "", "", true);
        int int29 = classWriter1.newUTF8("hi!");
        org.mockito.asm.ClassWriter classWriter35 = new org.mockito.asm.ClassWriter((int) '4');
        int int40 = classWriter35.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter((int) '4');
        int int49 = classWriter46.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter55 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor61 = classWriter55.visitMethod(0, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = classWriter46.visitMethod((int) 'a', "hi!", "", "hi!", strArray60);
        org.mockito.asm.FieldVisitor fieldVisitor63 = classWriter35.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int65 = classWriter35.newConst((java.lang.Object) (-1.0f));
        int int67 = classWriter35.newClass("hi!");
        classWriter35.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor72 = classWriter1.visitField((int) (short) 10, "", "", "hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 7 + "'", int65 == 7);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        org.mockito.asm.FieldVisitor fieldVisitor7 = classWriter1.visitField((-1), "hi!", "", "hi!", (java.lang.Object) false);
        classWriter1.visitOuterClass("", "hi!", "hi!");
        int int13 = classWriter1.newClass("hi!");
        byte[] byteArray14 = classWriter1.toByteArray();
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        classWriter21.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classWriter21.visitAnnotation("hi!", true);
        int int31 = classWriter21.newField("", "hi!", "");
        org.mockito.asm.ClassWriter classWriter38 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor44 = classWriter38.visitMethod(0, "hi!", "", "hi!", strArray43);
        org.mockito.asm.ClassWriter classWriter46 = new org.mockito.asm.ClassWriter(0);
        int int48 = classWriter46.newConst((java.lang.Object) 1);
        int int53 = classWriter46.newMethod("", "", "", true);
        int int58 = classWriter46.newMethod("hi!", "hi!", "hi!", false);
        int int59 = classWriter38.newConst((java.lang.Object) "hi!");
        int int64 = classWriter38.newMethod("", "hi!", "", true);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor73 = classWriter38.visitMethod(0, "", "hi!", "", strArray72);
        classWriter21.visit(9, (int) 'a', "hi!", "hi!", "hi!", strArray72);
        classWriter1.visit(1, 7, "hi!", "hi!", "hi!", strArray72);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-54, -2, -70, -66, 0, 0, 0, 0, 0, 12, 1, 0, 3, 104, 105, 33, 1, 0, 0, 3, 0, 0, 0, 0, 7, 0, 2, 12, 0, 1, 0, 1, 7, 0, 1, 1, 0, 13, 67, 111, 110, 115, 116, 97, 110, 116, 86, 97, 108, 117, 101, 1, 0, 9, 83, 121, 110, 116, 104, 101, 116, 105, 99, 1, 0, 10, 68, 101, 112, 114, 101, 99, 97, 116, 101, 100, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 0, 1, 0, 2, 0, 4, 0, 7, 0, 0, 0, 2, 0, 3, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 11, 0, 0, 0, 4, 0, 4, 0, 5]");
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(methodVisitor44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        int int41 = classWriter1.newClass("");
        classWriter1.visitInnerClass("", "hi!", "hi!", 2);
        int int48 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter54 = new org.mockito.asm.ClassWriter((int) '4');
        int int59 = classWriter54.newMethod("hi!", "", "", true);
        org.mockito.asm.ClassWriter classWriter65 = new org.mockito.asm.ClassWriter((int) '4');
        int int68 = classWriter65.newNameType("", "hi!");
        org.mockito.asm.ClassWriter classWriter74 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray79 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor80 = classWriter74.visitMethod(0, "hi!", "", "hi!", strArray79);
        org.mockito.asm.MethodVisitor methodVisitor81 = classWriter65.visitMethod((int) 'a', "hi!", "", "hi!", strArray79);
        org.mockito.asm.FieldVisitor fieldVisitor82 = classWriter54.visitField((int) (byte) 100, "hi!", "hi!", "hi!", (java.lang.Object) "hi!");
        int int84 = classWriter54.newConst((java.lang.Object) (-1.0f));
        int int86 = classWriter54.newClass("hi!");
        classWriter54.visitOuterClass("", "", "hi!");
        int int95 = classWriter54.newMethod("", "hi!", "", false);
        classWriter54.visitSource("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor99 = classWriter1.visitField((int) '#', "hi!", "hi!", "", (java.lang.Object) classWriter54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value org.mockito.asm.ClassWriter@73655787");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 7 + "'", int84 == 7);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 11 + "'", int95 == 11);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newConst((java.lang.Object) 1);
        int int8 = classWriter1.newMethod("hi!", "hi!", "", true);
        classWriter1.visitSource("", "");
        int int14 = classWriter1.newNameType("hi!", "");
        classWriter1.visitOuterClass("", "", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter(0);
        int int3 = classWriter1.newUTF8("hi!");
        int int7 = classWriter1.newField("hi!", "hi!", "");
        int int10 = classWriter1.newNameType("", "");
        classWriter1.visitEnd();
        int int13 = classWriter1.newClass("hi!");
        classWriter1.visitInnerClass("hi!", "", "hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor7 = classWriter1.visitMethod(0, "hi!", "", "hi!", strArray6);
        int int9 = classWriter1.newConst((java.lang.Object) 10.0d);
        int int11 = classWriter1.newClass("hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitInnerClass("", "", "hi!", 3);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = classWriter1.visitAnnotation("hi!", true);
        classWriter1.visitSource("", "hi!");
        classWriter1.visitSource("", "");
        int int34 = classWriter1.newMethod("hi!", "hi!", "hi!", false);
        int int36 = classWriter1.newUTF8("hi!");
        int int38 = classWriter1.newClass("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodVisitor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        classWriter1.visitSource("hi!", "");
        java.lang.Class<?> wildcardClass34 = classWriter1.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        classWriter1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classWriter1.visitAnnotation("", true);
        classWriter1.visitOuterClass("hi!", "", "hi!");
        classWriter1.visitEnd();
        org.mockito.asm.ClassWriter classWriter22 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter22.visitMethod(0, "hi!", "", "hi!", strArray27);
        int int30 = classWriter22.newConst((java.lang.Object) 10.0d);
        int int32 = classWriter22.newClass("hi!");
        classWriter22.visitOuterClass("hi!", "", "hi!");
        int int38 = classWriter22.newClass("hi!");
        int int42 = classWriter22.newField("hi!", "hi!", "hi!");
        classWriter22.visitEnd();
        classWriter22.visitInnerClass("", "hi!", "", 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = classWriter1.visitField((int) (short) 100, "hi!", "", "", (java.lang.Object) 100);
        org.mockito.asm.Attribute attribute50 = null;
        // The following exception was thrown during execution in test generation
        try {
            classWriter1.visitAttribute(attribute50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(annotationVisitor11);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(fieldVisitor49);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((-1));
        int int5 = classWriter1.newField("hi!", "", "hi!");
        classWriter1.visitOuterClass("hi!", "", "hi!");
        int int14 = classWriter1.newMethod("", "hi!", "", true);
        classWriter1.visitSource("hi!", "hi!");
        int int20 = classWriter1.newNameType("hi!", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) '4');
        int int4 = classWriter1.newNameType("", "hi!");
        int int6 = classWriter1.newClass("");
        int int8 = classWriter1.newClass("");
        org.mockito.asm.ClassWriter classWriter10 = new org.mockito.asm.ClassWriter(0);
        int int15 = classWriter10.newMethod("", "", "", true);
        org.mockito.asm.ClassWriter classWriter21 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor27 = classWriter21.visitMethod(0, "hi!", "", "hi!", strArray26);
        org.mockito.asm.MethodVisitor methodVisitor28 = classWriter10.visitMethod(4, "", "hi!", "hi!", strArray26);
        int int32 = classWriter10.newField("hi!", "", "hi!");
        classWriter10.visitOuterClass("hi!", "", "");
        int int38 = classWriter10.newUTF8("");
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = classWriter10.visitAnnotation("hi!", false);
        int int46 = classWriter10.newMethod("hi!", "", "", false);
        org.mockito.asm.ClassWriter classWriter53 = new org.mockito.asm.ClassWriter(0);
        int int55 = classWriter53.newClass("");
        classWriter53.visitSource("hi!", "");
        int int63 = classWriter53.newMethod("hi!", "hi!", "hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor69 = classWriter53.visitField((int) (byte) 10, "hi!", "hi!", "", (java.lang.Object) 0);
        org.mockito.asm.ClassWriter classWriter76 = new org.mockito.asm.ClassWriter((int) '4');
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor82 = classWriter76.visitMethod(0, "hi!", "", "hi!", strArray81);
        classWriter53.visit((int) (byte) 100, 0, "", "", "hi!", strArray81);
        classWriter10.visit((int) (short) 1, 0, "", "hi!", "hi!", strArray81);
        int int86 = classWriter10.newClass("");
        byte[] byteArray87 = classWriter10.toByteArray();
        int int92 = classWriter10.newMethod("", "", "hi!", true);
        int int93 = classWriter1.newConst((java.lang.Object) "hi!");
        int int95 = classWriter1.newUTF8("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(methodVisitor28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 6 + "'", int63 == 6);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[-54, -2, -70, -66, 0, 0, 0, 1, 0, 13, 1, 0, 0, 7, 0, 1, 12, 0, 1, 0, 1, 11, 0, 2, 0, 3, 1, 0, 3, 104, 105, 33, 7, 0, 5, 12, 0, 1, 0, 5, 9, 0, 6, 0, 7, 10, 0, 6, 0, 3, 1, 0, 9, 83, 105, 103, 110, 97, 116, 117, 114, 101, 1, 0, 15, 69, 110, 99, 108, 111, 115, 105, 110, 103, 77, 101, 116, 104, 111, 100, 1, 0, 27, 82, 117, 110, 116, 105, 109, 101, 73, 110, 118, 105, 115, 105, 98, 108, 101, 65, 110, 110, 111, 116, 97, 116, 105, 111, 110, 115, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 0, 5, 0, 1, 0, 10, 0, 0, 0, 2, 0, 5, 0, 3, 0, 10, 0, 0, 0, 2, 0, 5, 0, 11, 0, 0, 0, 4, 0, 6, 0, 3, 0, 12, 0, 0, 0, 6, 0, 1, 0, 5, 0, 0]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 13 + "'", int92 == 13);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 5 + "'", int93 == 5);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.asm.ClassWriter classWriter1 = new org.mockito.asm.ClassWriter((int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classWriter1.visitAnnotation("hi!", false);
        classWriter1.visitOuterClass("", "hi!", "");
        classWriter1.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor4);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
}


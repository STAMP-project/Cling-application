import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.Attribute attribute60 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor52);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list14 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor20.visitSource("hi!", "");
        java.util.List list36 = aSMifierClassVisitor20.getText();
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor43.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor59 = aSMifierClassVisitor43.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray58);
        aSMifierClassVisitor20.visit((int) (short) 10, 1, "", "", "hi!", strArray58);
        org.mockito.asm.MethodVisitor methodVisitor61 = aSMifierClassVisitor1.visitMethod((int) (byte) 0, "", "", "", strArray58);
        java.util.List list62 = aSMifierClassVisitor1.getText();
        java.util.List list63 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter64 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(list63);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter35 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor36.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray48 = null;
        aSMifierClassVisitor36.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray48);
        java.lang.String[] strArray54 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor36.visitMethod(100, "", "hi!", "", strArray54);
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (byte) -1, "hi!", "", "hi!", strArray54);
        java.util.List list57 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor64.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor64.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor64.visitSource("hi!", "");
        java.util.List list80 = aSMifierClassVisitor64.text;
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor64.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray86);
        aSMifierClassVisitor1.visit((int) (short) -1, 0, "", "hi!", "", strArray86);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray34 = null;
        aSMifierClassVisitor22.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray34);
        aSMifierClassVisitor22.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.util.List list43 = aSMifierClassVisitor22.text;
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField(10, "hi!", "hi!", "", (java.lang.Object) list43);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.util.List list47 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list24 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list16 = aSMifierClassVisitor1.text;
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 100);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.lang.Class<?> wildcardClass23 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray46 = null;
        aSMifierClassVisitor34.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray46);
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor53 = aSMifierClassVisitor34.visitMethod(100, "", "hi!", "", strArray52);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor34.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        aSMifierClassVisitor63.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        aSMifierClassVisitor63.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray75);
        aSMifierClassVisitor34.visit((int) '4', (int) '#', "", "", "", strArray75);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "", "hi!", "hi!", strArray75);
        java.util.List list79 = aSMifierClassVisitor1.getText();
        java.lang.Class<?> wildcardClass80 = list79.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.lang.Object obj33 = null;
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor1.visitField((int) (byte) 0, "", "hi!", "", obj33);
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor40.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor40.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor40.visitAnnotation("hi!", true);
        java.lang.String[] strArray61 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor40.visit(1, 100, "hi!", "", "hi!", strArray61);
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierClassVisitor40.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor40.visitAnnotation("hi!", true);
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor74 = aSMifierClassVisitor40.visitMethod((int) '4', "hi!", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "", "", "", strArray73);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list79 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(list79);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.io.PrintWriter printWriter52 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor53 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter52);
        aSMifierClassVisitor53.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        aSMifierClassVisitor53.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit(1, 10, "hi!", "hi!", "hi!", strArray65);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (byte) 1, "hi!", "hi!", "hi!", (java.lang.Object) 1.0d);
        java.util.List list74 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list79 = aSMifierClassVisitor1.text;
        java.util.List list80 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 0);
        org.mockito.asm.Attribute attribute86 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter23 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor24.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor40 = aSMifierClassVisitor24.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray39);
        aSMifierClassVisitor1.visit((int) (short) 10, 1, "", "", "hi!", strArray39);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter50 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor51 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter50);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor51.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor51.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = aSMifierClassVisitor51.visitAnnotation("hi!", true);
        java.lang.Class<?> wildcardClass67 = aSMifierClassVisitor51.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor1.visitField(0, "", "", "hi!", (java.lang.Object) aSMifierClassVisitor51);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass77 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor30.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierClassVisitor30.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass49 = aSMifierClassVisitor30.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(10, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 100);
        java.util.List list60 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (short) 0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) '#');
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.util.List list54 = aSMifierClassVisitor35.text;
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "", "", (java.lang.Object) aSMifierClassVisitor35);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(fieldVisitor55);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor29.visitAnnotation("hi!", true);
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "hi!", "", (java.lang.Object) list45);
        java.util.List list47 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) 1);
        java.util.List list64 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor27.visitSource("hi!", "");
        java.util.List list43 = aSMifierClassVisitor27.text;
        java.lang.String[] strArray49 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor27.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray49);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (short) 100, "hi!", "hi!", "hi!", strArray49);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray40 = null;
        aSMifierClassVisitor28.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray40);
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor28.visitMethod((int) (byte) 100, "hi!", "", "", strArray53);
        aSMifierClassVisitor1.visit(0, (int) '#', "hi!", "hi!", "hi!", strArray53);
        java.util.List list56 = aSMifierClassVisitor1.getText();
        java.util.List list57 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        java.io.PrintWriter printWriter64 = null;
        aSMifierClassVisitor63.print(printWriter64);
        java.util.List list66 = aSMifierClassVisitor63.getText();
        java.util.List list67 = aSMifierClassVisitor63.text;
        java.util.List list68 = aSMifierClassVisitor63.getText();
        aSMifierClassVisitor63.visitOuterClass("", "", "hi!");
        java.io.PrintWriter printWriter77 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor78 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter77);
        java.io.PrintWriter printWriter79 = null;
        aSMifierClassVisitor78.print(printWriter79);
        aSMifierClassVisitor78.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray91 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor78.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray91);
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor63.visitMethod((-1), "", "hi!", "", strArray91);
        org.mockito.asm.FieldVisitor fieldVisitor94 = aSMifierClassVisitor1.visitField((int) (short) 1, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor63);
        org.mockito.asm.AnnotationVisitor annotationVisitor97 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(fieldVisitor94);
        org.junit.Assert.assertNotNull(annotationVisitor97);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor13.visitSource("hi!", "");
        java.util.List list29 = aSMifierClassVisitor13.text;
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor13.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray35);
        org.mockito.asm.MethodVisitor methodVisitor37 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "", "", "", strArray35);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor14.visitSource("", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor35.visitMethod(100, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor14.visitMethod(1, "hi!", "hi!", "", strArray53);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray53);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 10);
        java.util.List list65 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray25 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor26 = aSMifierClassVisitor1.visitMethod((int) ' ', "", "hi!", "", strArray25);
        java.util.List list27 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor27.visitSource("hi!", "");
        java.util.List list43 = aSMifierClassVisitor27.getText();
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor66 = aSMifierClassVisitor50.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray65);
        aSMifierClassVisitor27.visit((int) (short) 10, 1, "", "", "hi!", strArray65);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) (short) 1, "hi!", "hi!", "hi!", strArray65);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 10);
        java.util.List list82 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list24 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor31.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor31.visitSource("hi!", "");
        java.util.List list47 = aSMifierClassVisitor31.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor31.visitAnnotation("hi!", false);
        java.util.List list51 = aSMifierClassVisitor31.text;
        java.lang.String[] strArray57 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor31.visit((int) (byte) 10, 0, "", "", "hi!", strArray57);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) '4', "", "hi!", "", strArray57);
        java.lang.String[] strArray64 = null;
        org.mockito.asm.MethodVisitor methodVisitor65 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "", "", "", strArray64);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor65);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor34.visitSource("hi!", "");
        java.util.List list50 = aSMifierClassVisitor34.text;
        aSMifierClassVisitor34.visitSource("", "");
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor60.visitSource("hi!", "");
        java.util.List list76 = aSMifierClassVisitor60.text;
        java.lang.String[] strArray82 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor60.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray82);
        aSMifierClassVisitor34.visit((int) (short) 0, (int) (short) 100, "hi!", "hi!", "hi!", strArray82);
        org.mockito.asm.MethodVisitor methodVisitor85 = aSMifierClassVisitor1.visitMethod(0, "", "hi!", "hi!", strArray82);
        java.util.List list86 = aSMifierClassVisitor1.getText();
        java.util.List list87 = aSMifierClassVisitor1.getText();
        java.util.List list88 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor14.visitSource("", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = null;
        aSMifierClassVisitor35.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray47);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor54 = aSMifierClassVisitor35.visitMethod(100, "", "hi!", "", strArray53);
        org.mockito.asm.MethodVisitor methodVisitor55 = aSMifierClassVisitor14.visitMethod(1, "hi!", "hi!", "", strArray53);
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray53);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list60 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '#');
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor36 = aSMifierClassVisitor1.visitMethod(0, "", "", "hi!", strArray35);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) 'a');
        java.lang.Class<?> wildcardClass42 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }
}


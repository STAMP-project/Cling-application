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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.lang.Object obj33 = null;
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor1.visitField((int) (byte) 0, "", "hi!", "", obj33);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.Class<?> wildcardClass38 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(wildcardClass38);
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
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor82 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass83 = annotationVisitor82.getClass();
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
        org.junit.Assert.assertNotNull(annotationVisitor82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor18.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list25 = aSMifierClassVisitor18.getText();
        aSMifierClassVisitor18.visitOuterClass("", "hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "hi!", "", (java.lang.Object) "");
        java.util.List list31 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.io.PrintWriter printWriter40 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor41 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter40);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor41.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor57 = aSMifierClassVisitor41.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray56);
        java.util.List list58 = aSMifierClassVisitor41.text;
        java.io.PrintWriter printWriter63 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor64 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter63);
        java.io.PrintWriter printWriter65 = null;
        aSMifierClassVisitor64.print(printWriter65);
        java.util.List list67 = aSMifierClassVisitor64.getText();
        java.io.PrintWriter printWriter68 = null;
        aSMifierClassVisitor64.print(printWriter68);
        java.util.List list70 = aSMifierClassVisitor64.text;
        org.mockito.asm.FieldVisitor fieldVisitor71 = aSMifierClassVisitor41.visitField((int) (short) 10, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor64);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.mockito.asm.MethodVisitor methodVisitor77 = aSMifierClassVisitor41.visitMethod((int) (short) 1, "hi!", "hi!", "hi!", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor1.visitMethod((int) '4', "", "hi!", "hi!", strArray76);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(methodVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(fieldVisitor71);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.text;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitSource("", "hi!");
        java.util.List list32 = aSMifierClassVisitor28.getText();
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        aSMifierClassVisitor45.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor28.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.mockito.asm.Attribute attribute55 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor27.visitAnnotation("hi!", true);
        java.util.List list43 = aSMifierClassVisitor27.text;
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor50.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor50.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor50.visitSource("hi!", "");
        java.util.List list66 = aSMifierClassVisitor50.text;
        java.lang.String[] strArray72 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor50.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray72);
        aSMifierClassVisitor27.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray72);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor1.visitMethod(0, "hi!", "hi!", "hi!", strArray72);
        java.util.List list76 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(list76);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray30 = null;
        org.mockito.asm.MethodVisitor methodVisitor31 = aSMifierClassVisitor1.visitMethod(1, "hi!", "", "hi!", strArray30);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(methodVisitor31);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list28 = aSMifierClassVisitor1.getText();
        java.util.List list29 = aSMifierClassVisitor1.text;
        java.util.List list30 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        aSMifierClassVisitor26.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list32 = aSMifierClassVisitor26.getText();
        java.util.List list33 = aSMifierClassVisitor26.getText();
        java.io.PrintWriter printWriter38 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor39.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor39.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor39.visitAnnotation("hi!", true);
        java.util.List list55 = aSMifierClassVisitor39.text;
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor62.visitSource("hi!", "");
        java.util.List list78 = aSMifierClassVisitor62.text;
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor62.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray84);
        aSMifierClassVisitor39.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray84);
        org.mockito.asm.MethodVisitor methodVisitor87 = aSMifierClassVisitor26.visitMethod((int) (short) 100, "", "", "", strArray84);
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!" };
        aSMifierClassVisitor26.visit((int) (short) 1, 10, "", "hi!", "", strArray94);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) 'a', "", "", "hi!", strArray94);
        org.mockito.asm.Attribute attribute97 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor87);
        org.junit.Assert.assertNotNull(strArray94);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor20.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        aSMifierClassVisitor20.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray54 = null;
        aSMifierClassVisitor42.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray54);
        java.lang.String[] strArray60 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor61 = aSMifierClassVisitor42.visitMethod(100, "", "hi!", "", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor20.visitMethod((int) (short) 1, "hi!", "", "hi!", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor63 = aSMifierClassVisitor1.visitMethod((int) ' ', "", "", "", strArray60);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) 'a');
        org.mockito.asm.Attribute attribute69 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor63);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor34.visitAnnotation("", true);
        java.util.List list50 = aSMifierClassVisitor34.getText();
        aSMifierClassVisitor34.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor34.visitInnerClass("hi!", "", "", (int) (short) 10);
        aSMifierClassVisitor34.visitInnerClass("", "", "hi!", (int) (byte) 100);
        java.io.PrintWriter printWriter70 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor71 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter70);
        org.mockito.asm.FieldVisitor fieldVisitor77 = aSMifierClassVisitor71.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor83 = aSMifierClassVisitor71.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor71.visitSource("hi!", "");
        java.util.List list87 = aSMifierClassVisitor71.text;
        java.lang.String[] strArray93 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor71.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray93);
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor34.visitMethod((-1), "hi!", "", "hi!", strArray93);
        aSMifierClassVisitor1.visit(0, 100, "hi!", "hi!", "hi!", strArray93);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(fieldVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor83);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(methodVisitor95);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.lang.String[] strArray29 = null;
        org.mockito.asm.MethodVisitor methodVisitor30 = aSMifierClassVisitor1.visitMethod(0, "", "hi!", "hi!", strArray29);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 1);
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        java.io.PrintWriter printWriter43 = null;
        aSMifierClassVisitor42.print(printWriter43);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor42.visitAnnotation("", false);
        java.util.List list48 = aSMifierClassVisitor42.getText();
        java.io.PrintWriter printWriter53 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor54 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter53);
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor54.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor54.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor54.visitSource("hi!", "");
        java.util.List list70 = aSMifierClassVisitor54.text;
        java.lang.String[] strArray76 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor54.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor42.visitMethod((int) (byte) 10, "", "", "", strArray76);
        aSMifierClassVisitor1.visit((int) (byte) 1, 0, "", "", "hi!", strArray76);
        org.mockito.asm.Attribute attribute80 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(methodVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor78);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.util.List list8 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor14.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor14.visitAnnotation("hi!", true);
        java.util.List list30 = aSMifierClassVisitor14.text;
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("hi!", "");
        java.util.List list53 = aSMifierClassVisitor37.text;
        java.lang.String[] strArray59 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor37.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray59);
        aSMifierClassVisitor14.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray59);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "", "", strArray59);
        java.util.List list63 = aSMifierClassVisitor1.text;
        java.util.List list64 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.Attribute attribute72 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(annotationVisitor71);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list33 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
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
        org.junit.Assert.assertNotNull(annotationVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        java.util.List list7 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list11 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list11 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (-1));
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        org.mockito.asm.Attribute attribute33 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray26 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor27 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "hi!", "", "", strArray26);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter32 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor13.visitAnnotation("hi!", true);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor13.visit(1, 100, "hi!", "", "hi!", strArray34);
        aSMifierClassVisitor1.visit(100, (int) (byte) -1, "", "", "hi!", strArray34);
        java.util.List list37 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray43 = null;
        aSMifierClassVisitor1.visit((-1), (int) (byte) 1, "", "hi!", "hi!", strArray43);
        java.util.List list45 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list40 = aSMifierClassVisitor27.text;
        aSMifierClassVisitor27.visitSource("", "");
        java.util.List list44 = aSMifierClassVisitor27.getText();
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor27);
        java.util.List list46 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass47 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.lang.String[] strArray55 = null;
        aSMifierClassVisitor1.visit(100, (int) (byte) -1, "hi!", "", "hi!", strArray55);
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor62.visitAnnotation("hi!", false);
        aSMifierClassVisitor62.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor1.visitField((int) '#', "", "", "", (java.lang.Object) "hi!");
        java.util.List list82 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list18 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter20 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor21 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter20);
        org.mockito.asm.FieldVisitor fieldVisitor27 = aSMifierClassVisitor21.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor21.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierClassVisitor21.visitAnnotation("", true);
        java.util.List list37 = aSMifierClassVisitor21.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor21.visitAnnotation("", true);
        java.lang.String[] strArray45 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor46 = aSMifierClassVisitor21.visitMethod((int) ' ', "", "hi!", "", strArray45);
        org.mockito.asm.MethodVisitor methodVisitor47 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "", "", "hi!", strArray45);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(methodVisitor46);
        org.junit.Assert.assertNotNull(methodVisitor47);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor62.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor62.visitAnnotation("", true);
        aSMifierClassVisitor62.visitOuterClass("hi!", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "", (java.lang.Object) "hi!");
        java.util.List list83 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.lang.Class<?> wildcardClass91 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list7 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list11 = aSMifierClassVisitor1.getText();
        java.util.List list12 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        java.util.List list6 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor27 = aSMifierClassVisitor15.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor15.visitSource("hi!", "");
        aSMifierClassVisitor15.visitSource("", "hi!");
        aSMifierClassVisitor15.visitInnerClass("hi!", "hi!", "", (int) '#');
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor45.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor45.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor45.visitAnnotation("hi!", true);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor45.visit(1, 100, "hi!", "", "hi!", strArray66);
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor45.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierClassVisitor45.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter78 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor79 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter78);
        java.io.PrintWriter printWriter80 = null;
        aSMifierClassVisitor79.print(printWriter80);
        aSMifierClassVisitor79.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray92 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor79.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor45.visitMethod((int) '4', "", "", "hi!", strArray92);
        aSMifierClassVisitor15.visit((int) (short) -1, (int) '#', "", "", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor96 = aSMifierClassVisitor1.visitMethod((int) '#', "hi!", "", "", strArray92);
        java.io.PrintWriter printWriter97 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(annotationVisitor70);
        org.junit.Assert.assertNotNull(annotationVisitor73);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor96);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.util.List list27 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", 1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.util.List list30 = aSMifierClassVisitor1.text;
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
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) '4');
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.util.List list33 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray43 = null;
        aSMifierClassVisitor31.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray43);
        aSMifierClassVisitor31.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor31.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) annotationVisitor51);
        java.lang.Class<?> wildcardClass53 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor23.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor23.visitSource("", "");
        java.io.PrintWriter printWriter43 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor44 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter43);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor44.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray56 = null;
        aSMifierClassVisitor44.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray56);
        java.lang.String[] strArray62 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor63 = aSMifierClassVisitor44.visitMethod(100, "", "hi!", "", strArray62);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor23.visitMethod(1, "hi!", "hi!", "", strArray62);
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor1.visitField((int) '4', "", "", "hi!", (java.lang.Object) methodVisitor64);
        java.util.List list66 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.util.List list71 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodVisitor63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list33 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(annotationVisitor41);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
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
        org.junit.Assert.assertNotNull(annotationVisitor53);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.util.List list6 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor13.visitAnnotation("hi!", true);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor13.visit(1, 100, "hi!", "", "hi!", strArray34);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor13.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = aSMifierClassVisitor13.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor48.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray60 = null;
        aSMifierClassVisitor48.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray60);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor67 = aSMifierClassVisitor48.visitMethod(100, "", "hi!", "", strArray66);
        aSMifierClassVisitor13.visit((int) (byte) -1, (int) (byte) -1, "hi!", "", "hi!", strArray66);
        aSMifierClassVisitor1.visit(1, (int) (byte) 100, "", "hi!", "", strArray66);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list29 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.lang.Class<?> wildcardClass34 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.util.List list26 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        aSMifierClassVisitor18.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor1.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        java.util.List list23 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor30.visitAnnotation("", true);
        java.util.List list46 = aSMifierClassVisitor30.getText();
        aSMifierClassVisitor30.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray56 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor30.visit(1, (int) (short) 0, "hi!", "", "", strArray56);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) -1, "hi!", "", "hi!", strArray56);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) -1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '#');
        java.util.List list69 = aSMifierClassVisitor1.getText();
        java.lang.Class<?> wildcardClass70 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        aSMifierClassVisitor33.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        aSMifierClassVisitor33.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray45);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor33);
        aSMifierClassVisitor33.visitSource("", "");
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        java.io.PrintWriter printWriter61 = null;
        aSMifierClassVisitor60.print(printWriter61);
        java.util.List list63 = aSMifierClassVisitor60.getText();
        java.io.PrintWriter printWriter69 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter69);
        java.io.PrintWriter printWriter71 = null;
        aSMifierClassVisitor70.print(printWriter71);
        aSMifierClassVisitor70.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray83 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor70.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray83);
        aSMifierClassVisitor60.visit((int) '#', (int) (short) 0, "hi!", "hi!", "", strArray83);
        aSMifierClassVisitor33.visit((int) (short) 100, (int) (byte) -1, "", "hi!", "", strArray83);
        java.util.List list87 = aSMifierClassVisitor33.text;
        java.lang.String[] strArray92 = null;
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor33.visitMethod(1, "", "", "hi!", strArray92);
        aSMifierClassVisitor33.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(methodVisitor93);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter23 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        java.io.PrintWriter printWriter25 = null;
        aSMifierClassVisitor24.print(printWriter25);
        java.util.List list27 = aSMifierClassVisitor24.getText();
        java.io.PrintWriter printWriter28 = null;
        aSMifierClassVisitor24.print(printWriter28);
        java.util.List list30 = aSMifierClassVisitor24.text;
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor1.visitField((int) (short) 10, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor24);
        aSMifierClassVisitor24.visitInnerClass("", "hi!", "", 1);
        org.mockito.asm.Attribute attribute37 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor24.visitAttribute(attribute37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor31);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.lang.Class<?> wildcardClass17 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        aSMifierClassVisitor33.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        aSMifierClassVisitor33.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray45);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor33.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField(100, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor33);
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor56.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        aSMifierClassVisitor56.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        java.util.List list68 = aSMifierClassVisitor56.text;
        aSMifierClassVisitor56.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor56.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierClassVisitor56.visitAnnotation("", true);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor1.visitField((int) (byte) 0, "hi!", "hi!", "", (java.lang.Object) true);
        java.util.List list81 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list37 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.lang.String[] strArray45 = null;
        org.mockito.asm.MethodVisitor methodVisitor46 = aSMifierClassVisitor1.visitMethod((int) (short) 10, "hi!", "hi!", "", strArray45);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(methodVisitor46);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor34.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        java.io.PrintWriter printWriter57 = null;
        aSMifierClassVisitor56.print(printWriter57);
        java.util.List list59 = aSMifierClassVisitor56.getText();
        java.io.PrintWriter printWriter60 = null;
        aSMifierClassVisitor56.print(printWriter60);
        java.util.List list62 = aSMifierClassVisitor56.text;
        java.io.PrintWriter printWriter67 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor68.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor68.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierClassVisitor68.visitAnnotation("", true);
        java.util.List list84 = aSMifierClassVisitor68.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor87 = aSMifierClassVisitor68.visitAnnotation("", true);
        java.lang.String[] strArray92 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor93 = aSMifierClassVisitor68.visitMethod((int) ' ', "", "hi!", "", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor56.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray92);
        aSMifierClassVisitor34.visit((int) (byte) 100, (int) (short) 1, "", "", "", strArray92);
        aSMifierClassVisitor1.visit(0, 0, "hi!", "", "hi!", strArray92);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(annotationVisitor87);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor93);
        org.junit.Assert.assertNotNull(methodVisitor94);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list27 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list31 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor22.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.util.List list38 = aSMifierClassVisitor22.text;
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor45.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor57 = aSMifierClassVisitor45.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor45.visitSource("hi!", "");
        java.util.List list61 = aSMifierClassVisitor45.text;
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor45.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray67);
        aSMifierClassVisitor22.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray67);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (short) 1, "hi!", "", "", strArray67);
        java.util.List list71 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter76 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(fieldVisitor57);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.getText();
        java.util.List list23 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list13 = aSMifierClassVisitor1.getText();
        java.util.List list14 = aSMifierClassVisitor1.text;
        java.util.List list15 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray24 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (byte) 0, "", "", "hi!", strArray24);
        java.util.List list26 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) '#');
        org.mockito.asm.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter76 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor77 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter76);
        org.mockito.asm.FieldVisitor fieldVisitor83 = aSMifierClassVisitor77.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor89 = aSMifierClassVisitor77.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = aSMifierClassVisitor77.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor95 = aSMifierClassVisitor77.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor96 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(fieldVisitor83);
        org.junit.Assert.assertNotNull(fieldVisitor89);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(annotationVisitor95);
        org.junit.Assert.assertNotNull(fieldVisitor96);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter10 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor11 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter10);
        org.mockito.asm.FieldVisitor fieldVisitor17 = aSMifierClassVisitor11.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor27 = aSMifierClassVisitor11.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray26);
        aSMifierClassVisitor11.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor11.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.io.PrintWriter printWriter43 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor44 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter43);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor44.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor44.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor44.visitSource("hi!", "");
        java.util.List list60 = aSMifierClassVisitor44.text;
        aSMifierClassVisitor44.visitSource("", "");
        java.io.PrintWriter printWriter69 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter69);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor70.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor70.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor70.visitSource("hi!", "");
        java.util.List list86 = aSMifierClassVisitor70.text;
        java.lang.String[] strArray92 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor70.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray92);
        aSMifierClassVisitor44.visit((int) (short) 0, (int) (short) 100, "hi!", "hi!", "hi!", strArray92);
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor11.visitMethod(0, "", "hi!", "hi!", strArray92);
        java.util.List list96 = aSMifierClassVisitor11.getText();
        java.util.List list97 = aSMifierClassVisitor11.getText();
        java.util.List list98 = aSMifierClassVisitor11.text;
        org.mockito.asm.FieldVisitor fieldVisitor99 = aSMifierClassVisitor1.visitField((-1), "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor11);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(list96);
        org.junit.Assert.assertNotNull(list97);
        org.junit.Assert.assertNotNull(list98);
        org.junit.Assert.assertNotNull(fieldVisitor99);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        aSMifierClassVisitor13.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list19 = aSMifierClassVisitor13.getText();
        java.util.List list20 = aSMifierClassVisitor13.getText();
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor1.visitField((int) '4', "", "hi!", "", (java.lang.Object) aSMifierClassVisitor13);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (-1));
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        aSMifierClassVisitor13.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list19 = aSMifierClassVisitor13.getText();
        java.util.List list20 = aSMifierClassVisitor13.getText();
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor1.visitField((int) '4', "", "hi!", "", (java.lang.Object) aSMifierClassVisitor13);
        aSMifierClassVisitor13.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor13.visitSource("hi!", "");
        java.lang.Class<?> wildcardClass30 = aSMifierClassVisitor13.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitInnerClass("", "", "", 1);
        java.io.PrintWriter printWriter24 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor25 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor25.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray37 = null;
        aSMifierClassVisitor25.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray37);
        aSMifierClassVisitor25.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        aSMifierClassVisitor48.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list54 = aSMifierClassVisitor48.getText();
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor25.visitField((int) (short) 0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor48);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor1.visitField(0, "", "", "hi!", (java.lang.Object) "hi!");
        java.util.List list57 = aSMifierClassVisitor1.getText();
        java.util.List list58 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list11 = aSMifierClassVisitor1.text;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list8 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        java.io.PrintWriter printWriter27 = null;
        aSMifierClassVisitor26.print(printWriter27);
        java.util.List list29 = aSMifierClassVisitor26.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor26.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor26.visitAnnotation("", true);
        java.util.List list36 = aSMifierClassVisitor26.getText();
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor1.visitField(0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor26);
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor43.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor43.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor43.visitAnnotation("hi!", true);
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor43.visit(1, 100, "hi!", "", "hi!", strArray64);
        org.mockito.asm.MethodVisitor methodVisitor66 = aSMifierClassVisitor1.visitMethod((-1), "hi!", "hi!", "hi!", strArray64);
        java.util.List list67 = aSMifierClassVisitor1.text;
        java.util.List list68 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(annotationVisitor76);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 1);
        java.lang.String[] strArray60 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit((int) ' ', 0, "", "hi!", "hi!", strArray60);
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
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list69 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter74 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor75 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter74);
        java.io.PrintWriter printWriter76 = null;
        aSMifierClassVisitor75.print(printWriter76);
        aSMifierClassVisitor75.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray88 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor75.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor90 = aSMifierClassVisitor1.visitMethod(10, "", "hi!", "hi!", strArray88);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor90);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.util.List list28 = aSMifierClassVisitor1.text;
        java.util.List list29 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        aSMifierClassVisitor40.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter51 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter51);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor52.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor52.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = aSMifierClassVisitor52.visitAnnotation("hi!", true);
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor52.visit(1, 100, "hi!", "", "hi!", strArray73);
        aSMifierClassVisitor40.visit(100, (int) (byte) -1, "", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor1.visitMethod(0, "hi!", "hi!", "", strArray73);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor76);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor37.visitAnnotation("", true);
        java.util.List list53 = aSMifierClassVisitor37.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor37.visitAnnotation("", true);
        aSMifierClassVisitor37.visitInnerClass("", "", "hi!", (int) (short) -1);
        java.util.List list62 = aSMifierClassVisitor37.text;
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor1.visitField(0, "", "hi!", "", (java.lang.Object) list62);
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor69.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list82 = aSMifierClassVisitor69.text;
        aSMifierClassVisitor69.visitSource("", "");
        java.util.List list86 = aSMifierClassVisitor69.getText();
        java.util.List list87 = aSMifierClassVisitor69.text;
        java.util.List list88 = aSMifierClassVisitor69.getText();
        org.mockito.asm.FieldVisitor fieldVisitor89 = aSMifierClassVisitor1.visitField((int) (short) 0, "hi!", "hi!", "hi!", (java.lang.Object) list88);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(fieldVisitor89);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 10);
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        aSMifierClassVisitor20.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor32.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor32.visitAnnotation("hi!", true);
        java.lang.String[] strArray53 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor32.visit(1, 100, "hi!", "", "hi!", strArray53);
        aSMifierClassVisitor20.visit(100, (int) (byte) -1, "", "", "hi!", strArray53);
        java.util.List list56 = aSMifierClassVisitor20.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor20.visitAnnotation("hi!", false);
        java.util.List list60 = aSMifierClassVisitor20.getText();
        java.util.List list61 = aSMifierClassVisitor20.getText();
        java.io.PrintWriter printWriter67 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor68 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter67);
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor68.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor80 = aSMifierClassVisitor68.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierClassVisitor68.visitAnnotation("hi!", true);
        java.lang.String[] strArray89 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor68.visit(1, 100, "hi!", "", "hi!", strArray89);
        aSMifierClassVisitor20.visit((int) (byte) -1, (int) (short) -1, "hi!", "", "", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor92 = aSMifierClassVisitor1.visitMethod((int) (byte) 0, "", "", "hi!", strArray89);
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(fieldVisitor80);
        org.junit.Assert.assertNotNull(annotationVisitor83);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor92);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor15.visitAnnotation("", true);
        java.util.List list25 = aSMifierClassVisitor15.getText();
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor31.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor31.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor31.visitAnnotation("", true);
        java.util.List list47 = aSMifierClassVisitor31.getText();
        aSMifierClassVisitor31.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray57 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor31.visit(1, (int) (short) 0, "hi!", "", "", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor59 = aSMifierClassVisitor15.visitMethod((int) (short) -1, "hi!", "", "hi!", strArray57);
        aSMifierClassVisitor15.visitSource("hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass64 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        java.util.List list10 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        java.io.PrintWriter printWriter21 = null;
        aSMifierClassVisitor20.print(printWriter21);
        java.util.List list23 = aSMifierClassVisitor20.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor20.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor20.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor20.visitAnnotation("hi!", true);
        java.util.List list33 = aSMifierClassVisitor20.getText();
        java.io.PrintWriter printWriter38 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor39 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor39.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor51 = aSMifierClassVisitor39.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor39.visitSource("hi!", "");
        java.util.List list55 = aSMifierClassVisitor39.getText();
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor62.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray77);
        aSMifierClassVisitor39.visit((int) (short) 10, 1, "", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor20.visitMethod((int) (byte) 0, "", "", "", strArray77);
        aSMifierClassVisitor1.visit((int) ' ', (int) 'a', "hi!", "hi!", "", strArray77);
        java.util.List list82 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor51);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list29 = aSMifierClassVisitor1.text;
        java.util.List list30 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) 100);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.util.List list6 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.io.PrintWriter printWriter16 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor17 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        org.mockito.asm.FieldVisitor fieldVisitor23 = aSMifierClassVisitor17.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor17.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor17.visitAnnotation("hi!", true);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor17.visit(1, 100, "hi!", "", "hi!", strArray38);
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierClassVisitor17.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor17.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter51 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter51);
        org.mockito.asm.FieldVisitor fieldVisitor58 = aSMifierClassVisitor52.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray64 = null;
        aSMifierClassVisitor52.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray64);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor71 = aSMifierClassVisitor52.visitMethod(100, "", "hi!", "", strArray70);
        aSMifierClassVisitor17.visit((int) (byte) -1, (int) (byte) -1, "hi!", "", "hi!", strArray70);
        aSMifierClassVisitor1.visit((int) '4', (int) (short) 10, "hi!", "", "", strArray70);
        java.util.List list74 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(fieldVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(fieldVisitor58);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(methodVisitor71);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list22 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        aSMifierClassVisitor34.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor34.visitSource("hi!", "hi!");
        java.util.List list43 = aSMifierClassVisitor34.text;
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField((int) (short) 10, "hi!", "hi!", "hi!", (java.lang.Object) list43);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list51 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.lang.Object obj63 = null;
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "", obj63);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(fieldVisitor64);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.String[] strArray23 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor24 = aSMifierClassVisitor1.visitMethod((int) '4', "hi!", "hi!", "hi!", strArray23);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray46 = null;
        aSMifierClassVisitor34.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray46);
        aSMifierClassVisitor34.visitOuterClass("hi!", "hi!", "");
        java.lang.String[] strArray57 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor34.visit((int) (short) 0, (int) (byte) 0, "", "", "hi!", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor59 = aSMifierClassVisitor1.visitMethod((int) '#', "", "hi!", "", strArray57);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(annotationVisitor62);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter29 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter29);
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor30.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor30.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list43 = aSMifierClassVisitor30.text;
        aSMifierClassVisitor30.visitSource("", "");
        java.util.List list47 = aSMifierClassVisitor30.getText();
        java.util.List list48 = aSMifierClassVisitor30.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor1.visitField((int) 'a', "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor30.visitInnerClass("hi!", "", "", (int) (byte) 1);
        java.lang.Object obj59 = null;
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor30.visitField(100, "hi!", "", "hi!", obj59);
        aSMifierClassVisitor30.visitSource("hi!", "hi!");
        java.util.List list64 = aSMifierClassVisitor30.getText();
        java.util.List list65 = aSMifierClassVisitor30.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor27.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor27.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor27.visitSource("hi!", "");
        java.util.List list43 = aSMifierClassVisitor27.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor46 = aSMifierClassVisitor27.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor27.visitAnnotation("", true);
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor55.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor55.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor55.visitSource("hi!", "");
        java.util.List list71 = aSMifierClassVisitor55.text;
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor27.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor55);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor27.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierClassVisitor27.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor1.visitField((int) (byte) -1, "hi!", "", "", (java.lang.Object) false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(annotationVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(annotationVisitor78);
        org.junit.Assert.assertNotNull(fieldVisitor79);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list20 = aSMifierClassVisitor1.getText();
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list12 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list33 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        java.util.List list47 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) '#');
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 0);
        java.io.PrintWriter printWriter58 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter58);
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray25 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor26 = aSMifierClassVisitor1.visitMethod((int) ' ', "", "hi!", "", strArray25);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", 1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) -1);
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.util.List list58 = aSMifierClassVisitor42.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor67 = aSMifierClassVisitor42.visitMethod((int) ' ', "", "hi!", "", strArray66);
        aSMifierClassVisitor42.visitSource("hi!", "");
        java.util.List list71 = aSMifierClassVisitor42.text;
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "", "hi!", (java.lang.Object) list71);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list63 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor69.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor1.visitField((-1), "", "", "hi!", (java.lang.Object) "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(annotationVisitor62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor82);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor31);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.util.List list37 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        java.util.List list46 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodVisitor36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", 10);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) -1);
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
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor32.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierClassVisitor32.visitAnnotation("", true);
        java.util.List list48 = aSMifierClassVisitor32.getText();
        java.util.List list49 = aSMifierClassVisitor32.getText();
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor55.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray67 = null;
        aSMifierClassVisitor55.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray67);
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor74 = aSMifierClassVisitor55.visitMethod(100, "", "hi!", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor32.visitMethod((-1), "", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor1.visitMethod((int) (short) 10, "", "hi!", "", strArray73);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) -1);
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
        org.junit.Assert.assertNotNull(annotationVisitor91);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        java.util.List list13 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list13);
    }
}


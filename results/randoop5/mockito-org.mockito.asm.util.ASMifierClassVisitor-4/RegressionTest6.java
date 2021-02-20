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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.getText();
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 100);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        aSMifierClassVisitor32.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor32.visitSource("hi!", "hi!");
        java.util.List list41 = aSMifierClassVisitor32.getText();
        java.util.List list42 = aSMifierClassVisitor32.getText();
        java.util.List list43 = aSMifierClassVisitor32.text;
        java.util.List list44 = aSMifierClassVisitor32.text;
        java.util.List list45 = aSMifierClassVisitor32.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (byte) 10, "hi!", "", "hi!", (java.lang.Object) list45);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.util.List list55 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list59 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(list59);
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
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor29.visitSource("hi!", "");
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor29);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor1.visitAnnotation("", false);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list15 = aSMifierClassVisitor1.getText();
        java.lang.String[] strArray20 = null;
        org.mockito.asm.MethodVisitor methodVisitor21 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "", "hi!", "", strArray20);
        java.util.List list22 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(methodVisitor21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (byte) 1);
        java.util.List list32 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter37 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        aSMifierClassVisitor38.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor38.visitSource("hi!", "");
        java.util.List list46 = aSMifierClassVisitor38.getText();
        aSMifierClassVisitor38.visitInnerClass("hi!", "hi!", "hi!", (-1));
        java.io.PrintWriter printWriter56 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter56);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor57.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor69 = aSMifierClassVisitor57.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierClassVisitor57.visitAnnotation("", true);
        java.util.List list73 = aSMifierClassVisitor57.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor57.visitAnnotation("", true);
        java.lang.String[] strArray81 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor82 = aSMifierClassVisitor57.visitMethod((int) ' ', "", "hi!", "", strArray81);
        org.mockito.asm.MethodVisitor methodVisitor83 = aSMifierClassVisitor38.visitMethod((int) (byte) 1, "hi!", "hi!", "", strArray81);
        org.mockito.asm.FieldVisitor fieldVisitor84 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "", "", (java.lang.Object) (byte) 1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) '4');
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(fieldVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(methodVisitor82);
        org.junit.Assert.assertNotNull(methodVisitor83);
        org.junit.Assert.assertNotNull(fieldVisitor84);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (-1));
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '#');
        java.util.List list38 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(annotationVisitor31);
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
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        aSMifierClassVisitor34.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list40 = aSMifierClassVisitor34.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor34.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor1.visitField((int) (byte) -1, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor34);
        java.io.PrintWriter printWriter49 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor50 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        aSMifierClassVisitor50.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor50.visitSource("hi!", "");
        java.util.List list58 = aSMifierClassVisitor50.getText();
        aSMifierClassVisitor50.visitInnerClass("hi!", "hi!", "hi!", (-1));
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor81 = aSMifierClassVisitor69.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = aSMifierClassVisitor69.visitAnnotation("", true);
        java.util.List list85 = aSMifierClassVisitor69.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor88 = aSMifierClassVisitor69.visitAnnotation("", true);
        java.lang.String[] strArray93 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor94 = aSMifierClassVisitor69.visitMethod((int) ' ', "", "hi!", "", strArray93);
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor50.visitMethod((int) (byte) 1, "hi!", "hi!", "", strArray93);
        org.mockito.asm.FieldVisitor fieldVisitor96 = aSMifierClassVisitor1.visitField((int) ' ', "", "hi!", "hi!", (java.lang.Object) (byte) 1);
        java.util.List list97 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute98 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(fieldVisitor81);
        org.junit.Assert.assertNotNull(annotationVisitor84);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(annotationVisitor88);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(methodVisitor94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(fieldVisitor96);
        org.junit.Assert.assertNotNull(list97);
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
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray35 = null;
        aSMifierClassVisitor23.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray35);
        java.lang.String[] strArray41 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor42 = aSMifierClassVisitor23.visitMethod(100, "", "hi!", "", strArray41);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor23.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter51 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor52 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter51);
        aSMifierClassVisitor52.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        aSMifierClassVisitor52.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray64);
        aSMifierClassVisitor23.visit((int) '4', (int) '#', "", "", "", strArray64);
        org.mockito.asm.MethodVisitor methodVisitor67 = aSMifierClassVisitor1.visitMethod((int) (short) 10, "", "", "", strArray64);
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list71 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(methodVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter11 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor12 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter11);
        org.mockito.asm.FieldVisitor fieldVisitor18 = aSMifierClassVisitor12.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor12.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor12.visitSource("", "");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor33.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray45 = null;
        aSMifierClassVisitor33.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray45);
        java.lang.String[] strArray51 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor52 = aSMifierClassVisitor33.visitMethod(100, "", "hi!", "", strArray51);
        org.mockito.asm.MethodVisitor methodVisitor53 = aSMifierClassVisitor12.visitMethod(1, "hi!", "hi!", "", strArray51);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) "");
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor79 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor85 = aSMifierClassVisitor60.visitMethod((int) ' ', "", "hi!", "", strArray84);
        java.lang.Class<?> wildcardClass86 = methodVisitor85.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor87 = aSMifierClassVisitor1.visitField((int) (short) 10, "hi!", "", "", (java.lang.Object) wildcardClass86);
        org.mockito.asm.AnnotationVisitor annotationVisitor90 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(annotationVisitor79);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(methodVisitor85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(fieldVisitor87);
        org.junit.Assert.assertNotNull(annotationVisitor90);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter27 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list30 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) -1);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(annotationVisitor38);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor32.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor32.visitSource("hi!", "");
        java.util.List list48 = aSMifierClassVisitor32.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor32.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor32.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor61.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor61.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor61.visitAnnotation("hi!", true);
        java.lang.String[] strArray82 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor61.visit(1, 100, "hi!", "", "hi!", strArray82);
        aSMifierClassVisitor32.visit(100, (int) (short) 0, "hi!", "", "", strArray82);
        aSMifierClassVisitor1.visit((int) '#', (int) 'a', "", "hi!", "", strArray82);
        java.util.List list86 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        java.util.List list38 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list38);
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
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 1);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) '4');
        org.mockito.asm.Attribute attribute43 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", 1);
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        aSMifierClassVisitor14.visitSource("", "hi!");
        java.util.List list18 = aSMifierClassVisitor14.getText();
        aSMifierClassVisitor14.visitSource("hi!", "hi!");
        aSMifierClassVisitor14.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        aSMifierClassVisitor31.visitSource("", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor14.visitField((int) (short) 100, "hi!", "hi!", "", (java.lang.Object) "");
        java.util.List list36 = aSMifierClassVisitor14.text;
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor43.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor43.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor43.visitAnnotation("", true);
        java.util.List list59 = aSMifierClassVisitor43.getText();
        aSMifierClassVisitor43.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray69 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor43.visit(1, (int) (short) 0, "hi!", "", "", strArray69);
        aSMifierClassVisitor14.visit((int) (short) -1, (int) (byte) -1, "hi!", "", "hi!", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor72 = aSMifierClassVisitor1.visitMethod((int) '#', "hi!", "hi!", "", strArray69);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor78 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter79 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor78);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) 100);
        java.util.List list24 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        java.io.PrintWriter printWriter32 = null;
        aSMifierClassVisitor31.print(printWriter32);
        aSMifierClassVisitor31.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor31.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray44);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) '#', "hi!", "", "hi!", strArray44);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list36 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute37 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        aSMifierClassVisitor13.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list19 = aSMifierClassVisitor13.getText();
        java.util.List list20 = aSMifierClassVisitor13.getText();
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor1.visitField((int) '4', "", "hi!", "", (java.lang.Object) aSMifierClassVisitor13);
        java.lang.Class<?> wildcardClass22 = aSMifierClassVisitor13.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("", "");
        java.io.PrintWriter printWriter57 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor58.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray70 = null;
        aSMifierClassVisitor58.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray70);
        java.lang.String[] strArray76 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor77 = aSMifierClassVisitor58.visitMethod(100, "", "hi!", "", strArray76);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor37.visitMethod(1, "hi!", "hi!", "", strArray76);
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) -1, "hi!", "", "", strArray76);
        java.util.List list80 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(methodVisitor77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (byte) 1);
        java.util.List list51 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass52 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(wildcardClass52);
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
        java.util.List list92 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        java.util.List list97 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertNotNull(list97);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
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
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list32 = aSMifierClassVisitor1.getText();
        java.util.List list33 = aSMifierClassVisitor1.getText();
        java.util.List list34 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
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
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass28 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor18.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor18.visitSource("hi!", "");
        java.util.List list34 = aSMifierClassVisitor18.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor18.visitAnnotation("hi!", false);
        java.util.List list38 = aSMifierClassVisitor18.text;
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor18.visit((int) (byte) 10, 0, "", "", "hi!", strArray44);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        aSMifierClassVisitor18.visit((int) (short) -1, (int) (short) 100, "", "hi!", "hi!", strArray53);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "hi!", (java.lang.Object) aSMifierClassVisitor18);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(fieldVisitor55);
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
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray26 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor27 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "hi!", "", "", strArray26);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray49 = null;
        aSMifierClassVisitor37.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray49);
        aSMifierClassVisitor37.visitSource("hi!", "hi!");
        aSMifierClassVisitor37.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor37.visitAnnotation("", true);
        aSMifierClassVisitor37.visitSource("", "hi!");
        java.util.List list64 = aSMifierClassVisitor37.text;
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor37);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(fieldVisitor65);
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
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray23 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor1.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray23);
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        aSMifierClassVisitor31.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list37 = aSMifierClassVisitor31.getText();
        java.util.List list38 = aSMifierClassVisitor31.getText();
        java.io.PrintWriter printWriter43 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor44 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter43);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor44.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor56 = aSMifierClassVisitor44.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor44.visitAnnotation("hi!", true);
        java.util.List list60 = aSMifierClassVisitor44.text;
        java.io.PrintWriter printWriter66 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor67 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter66);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor67.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor67.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor67.visitSource("hi!", "");
        java.util.List list83 = aSMifierClassVisitor67.text;
        java.lang.String[] strArray89 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor67.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray89);
        aSMifierClassVisitor44.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray89);
        org.mockito.asm.MethodVisitor methodVisitor92 = aSMifierClassVisitor31.visitMethod((int) (short) 100, "", "", "", strArray89);
        aSMifierClassVisitor1.visit((int) '#', (int) (byte) -1, "", "hi!", "hi!", strArray89);
        java.util.List list94 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor97 = aSMifierClassVisitor1.visitAnnotation("", true);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(methodVisitor92);
        org.junit.Assert.assertNotNull(list94);
        org.junit.Assert.assertNotNull(annotationVisitor97);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.io.PrintWriter printWriter60 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter60);
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) ' ');
        aSMifierClassVisitor1.visitOuterClass("", "", "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) ' ');
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor37.visitSource("", "");
        aSMifierClassVisitor37.visitSource("", "hi!");
        java.util.List list56 = aSMifierClassVisitor37.getText();
        aSMifierClassVisitor37.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor37.visitSource("hi!", "");
        java.lang.String[] strArray69 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor37.visit((int) '4', (int) ' ', "", "hi!", "", strArray69);
        org.mockito.asm.MethodVisitor methodVisitor71 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray69);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodVisitor71);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        java.io.PrintWriter printWriter61 = null;
        aSMifierClassVisitor60.print(printWriter61);
        aSMifierClassVisitor60.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor60.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list72 = aSMifierClassVisitor60.getText();
        java.io.PrintWriter printWriter77 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor78 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter77);
        org.mockito.asm.FieldVisitor fieldVisitor84 = aSMifierClassVisitor78.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray90 = null;
        aSMifierClassVisitor78.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray90);
        java.lang.String[] strArray96 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor97 = aSMifierClassVisitor78.visitMethod(100, "", "hi!", "", strArray96);
        org.mockito.asm.MethodVisitor methodVisitor98 = aSMifierClassVisitor60.visitMethod((int) (short) 1, "hi!", "hi!", "hi!", strArray96);
        org.mockito.asm.MethodVisitor methodVisitor99 = aSMifierClassVisitor30.visitMethod(10, "hi!", "hi!", "hi!", strArray96);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(fieldVisitor84);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(methodVisitor97);
        org.junit.Assert.assertNotNull(methodVisitor98);
        org.junit.Assert.assertNotNull(methodVisitor99);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        java.io.PrintWriter printWriter14 = null;
        aSMifierClassVisitor13.print(printWriter14);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        aSMifierClassVisitor22.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter33 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor34 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter33);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor34.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor34.visitAnnotation("hi!", true);
        java.lang.String[] strArray55 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor34.visit(1, 100, "hi!", "", "hi!", strArray55);
        aSMifierClassVisitor22.visit(100, (int) (byte) -1, "", "", "hi!", strArray55);
        aSMifierClassVisitor13.visit(10, (int) (byte) -1, "", "hi!", "", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor59 = aSMifierClassVisitor1.visitMethod((int) (short) 10, "", "", "", strArray55);
        java.util.List list60 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor59);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list29 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) ' ');
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass43 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 10);
        java.io.PrintWriter printWriter43 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor44 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter43);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor44.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list51 = aSMifierClassVisitor44.getText();
        aSMifierClassVisitor44.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor44.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor44.visitOuterClass("", "hi!", "");
        java.io.PrintWriter printWriter68 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter68);
        org.mockito.asm.FieldVisitor fieldVisitor75 = aSMifierClassVisitor69.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray81 = null;
        aSMifierClassVisitor69.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray81);
        aSMifierClassVisitor69.visitSource("hi!", "hi!");
        aSMifierClassVisitor69.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray94 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor69.visitMethod((int) (byte) 100, "hi!", "", "", strArray94);
        org.mockito.asm.MethodVisitor methodVisitor96 = aSMifierClassVisitor44.visitMethod(10, "hi!", "", "", strArray94);
        org.mockito.asm.MethodVisitor methodVisitor97 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "", "", "hi!", strArray94);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(fieldVisitor75);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter39 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor38);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list27 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor13.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor13.visitSource("hi!", "");
        java.util.List list29 = aSMifierClassVisitor13.text;
        java.lang.String[] strArray35 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor13.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray35);
        aSMifierClassVisitor1.visit(0, (int) '4', "hi!", "hi!", "", strArray35);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        aSMifierClassVisitor46.visitSource("", "hi!");
        java.util.List list50 = aSMifierClassVisitor46.getText();
        aSMifierClassVisitor46.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor46.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter61 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor62 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter61);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor62.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor62.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor79 = aSMifierClassVisitor46.visitMethod((int) (short) 100, "hi!", "", "", strArray77);
        org.mockito.asm.MethodVisitor methodVisitor80 = aSMifierClassVisitor1.visitMethod((int) (byte) 100, "hi!", "", "", strArray77);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '4');
        java.util.List list86 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(methodVisitor79);
        org.junit.Assert.assertNotNull(methodVisitor80);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor40.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor56 = aSMifierClassVisitor40.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray55);
        java.util.List list57 = aSMifierClassVisitor40.text;
        java.io.PrintWriter printWriter62 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter62);
        java.io.PrintWriter printWriter64 = null;
        aSMifierClassVisitor63.print(printWriter64);
        java.util.List list66 = aSMifierClassVisitor63.getText();
        java.io.PrintWriter printWriter67 = null;
        aSMifierClassVisitor63.print(printWriter67);
        java.util.List list69 = aSMifierClassVisitor63.text;
        org.mockito.asm.FieldVisitor fieldVisitor70 = aSMifierClassVisitor40.visitField((int) (short) 10, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor63);
        java.lang.String[] strArray76 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor40.visit((int) (short) -1, 0, "hi!", "", "hi!", strArray76);
        aSMifierClassVisitor1.visit(0, 0, "hi!", "", "hi!", strArray76);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(fieldVisitor70);
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.lang.Object obj78 = null;
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor1.visitField(100, "", "", "", obj78);
        java.lang.Class<?> wildcardClass80 = aSMifierClassVisitor1.getClass();
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
        org.junit.Assert.assertNotNull(fieldVisitor79);
        org.junit.Assert.assertNotNull(wildcardClass80);
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
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list34 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray30 = null;
        org.mockito.asm.MethodVisitor methodVisitor31 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "hi!", "", strArray30);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor37.visitAnnotation("", true);
        java.util.List list53 = aSMifierClassVisitor37.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor37.visitAnnotation("", true);
        java.lang.String[] strArray61 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor37.visitMethod((int) ' ', "", "hi!", "", strArray61);
        aSMifierClassVisitor37.visitInnerClass("", "", "hi!", 1);
        aSMifierClassVisitor37.visitOuterClass("", "", "");
        java.util.List list72 = aSMifierClassVisitor37.getText();
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (short) 10, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor37);
        java.io.PrintWriter printWriter74 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(fieldVisitor73);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.String[] strArray61 = null;
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray61);
        java.lang.Class<?> wildcardClass63 = methodVisitor62.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor42.visitSource("hi!", "");
        java.util.List list58 = aSMifierClassVisitor42.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor42.visitAnnotation("hi!", false);
        java.util.List list62 = aSMifierClassVisitor42.text;
        java.lang.String[] strArray68 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor42.visit((int) (byte) 10, 0, "", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = aSMifierClassVisitor1.visitMethod(10, "", "hi!", "", strArray68);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (-1));
        aSMifierClassVisitor1.visitInnerClass("", "", "", (-1));
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor70);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '4');
        java.io.PrintWriter printWriter23 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        aSMifierClassVisitor24.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list30 = aSMifierClassVisitor24.getText();
        java.util.List list31 = aSMifierClassVisitor24.getText();
        java.io.PrintWriter printWriter37 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        org.mockito.asm.FieldVisitor fieldVisitor44 = aSMifierClassVisitor38.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray50 = null;
        aSMifierClassVisitor38.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray50);
        aSMifierClassVisitor38.visitSource("hi!", "hi!");
        aSMifierClassVisitor38.visitOuterClass("hi!", "hi!", "hi!");
        java.lang.String[] strArray63 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor38.visitMethod((int) (byte) 100, "hi!", "", "", strArray63);
        aSMifierClassVisitor24.visit(0, (int) (short) 10, "hi!", "hi!", "", strArray63);
        org.mockito.asm.MethodVisitor methodVisitor66 = aSMifierClassVisitor1.visitMethod((int) '#', "", "", "", strArray63);
        java.lang.Class<?> wildcardClass67 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor10);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(fieldVisitor44);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        org.mockito.asm.Attribute attribute60 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute60);
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
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list25 = aSMifierClassVisitor1.getText();
        java.util.List list26 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor28.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor40 = aSMifierClassVisitor28.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor28.visitSource("", "");
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = null;
        aSMifierClassVisitor49.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray61);
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor68 = aSMifierClassVisitor49.visitMethod(100, "", "hi!", "", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor69 = aSMifierClassVisitor28.visitMethod(1, "hi!", "hi!", "", strArray67);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) (byte) 1, "", "hi!", "hi!", strArray67);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list41 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        aSMifierClassVisitor60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor60.visit(1, (int) (short) 0, "hi!", "", "", strArray86);
        aSMifierClassVisitor35.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) 0, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray14 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor1.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray14);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) ' ');
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        org.mockito.asm.Attribute attribute27 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        aSMifierClassVisitor33.visitInnerClass("", "hi!", "hi!", (int) (short) 10);
        java.util.List list56 = aSMifierClassVisitor33.text;
        java.util.List list57 = aSMifierClassVisitor33.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.io.PrintWriter printWriter8 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor9 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter8);
        org.mockito.asm.FieldVisitor fieldVisitor15 = aSMifierClassVisitor9.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor9.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor9.visitSource("hi!", "");
        aSMifierClassVisitor9.visitSource("", "hi!");
        aSMifierClassVisitor9.visitOuterClass("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor1.visitField((int) (byte) 10, "", "", "", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list36 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor15);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
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
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor33);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 1);
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.Attribute attribute77 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute77);
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
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (-1));
        java.io.PrintWriter printWriter33 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list20 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter26 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor27 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter26);
        aSMifierClassVisitor27.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor27.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor27.visitInnerClass("hi!", "hi!", "", (int) (byte) 10);
        java.io.PrintWriter printWriter47 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor48 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter47);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor48.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor60 = aSMifierClassVisitor48.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierClassVisitor48.visitAnnotation("hi!", true);
        java.util.List list64 = aSMifierClassVisitor48.text;
        java.io.PrintWriter printWriter70 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor71 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter70);
        org.mockito.asm.FieldVisitor fieldVisitor77 = aSMifierClassVisitor71.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor83 = aSMifierClassVisitor71.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor71.visitSource("hi!", "");
        java.util.List list87 = aSMifierClassVisitor71.text;
        java.lang.String[] strArray93 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor71.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray93);
        aSMifierClassVisitor48.visit((int) (byte) 0, (int) (byte) 0, "hi!", "", "hi!", strArray93);
        aSMifierClassVisitor27.visit((int) (short) -1, (int) (short) 1, "hi!", "", "", strArray93);
        aSMifierClassVisitor1.visit((int) (short) -1, 1, "", "", "", strArray93);
        java.util.List list98 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor60);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(fieldVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor83);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(list98);
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        java.util.List list24 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor29 = aSMifierClassVisitor13.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray28);
        aSMifierClassVisitor13.visitInnerClass("", "hi!", "", (int) ' ');
        java.util.List list35 = aSMifierClassVisitor13.getText();
        aSMifierClassVisitor13.visitSource("", "");
        java.util.List list39 = aSMifierClassVisitor13.getText();
        aSMifierClassVisitor13.visitSource("hi!", "");
        aSMifierClassVisitor13.visitOuterClass("", "", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor1.visitField((int) '#', "", "", "", (java.lang.Object) "");
        java.util.List list48 = aSMifierClassVisitor1.getText();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor19);
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
        java.io.PrintWriter printWriter28 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor29.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor29.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor29.visitSource("hi!", "");
        java.util.List list45 = aSMifierClassVisitor29.text;
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor1.visitField((int) (short) 0, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor29);
        aSMifierClassVisitor29.visitInnerClass("", "hi!", "", (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(fieldVisitor46);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.String[] strArray30 = null;
        org.mockito.asm.MethodVisitor methodVisitor31 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "", "hi!", "", strArray30);
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor37.visitAnnotation("", true);
        java.util.List list53 = aSMifierClassVisitor37.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor37.visitAnnotation("", true);
        java.lang.String[] strArray61 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor37.visitMethod((int) ' ', "", "hi!", "", strArray61);
        aSMifierClassVisitor37.visitInnerClass("", "", "hi!", 1);
        aSMifierClassVisitor37.visitOuterClass("", "", "");
        java.util.List list72 = aSMifierClassVisitor37.getText();
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor1.visitField((int) (short) 10, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor37);
        java.io.PrintWriter printWriter74 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor37.print(printWriter74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(methodVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(fieldVisitor73);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) 'a');
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list72 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray78 = null;
        aSMifierClassVisitor1.visit(100, (int) (byte) 100, "", "hi!", "", strArray78);
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
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", (int) (short) 100);
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 0);
        java.util.List list30 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray35 = null;
        org.mockito.asm.MethodVisitor methodVisitor36 = aSMifierClassVisitor1.visitMethod((int) (byte) -1, "hi!", "hi!", "", strArray35);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(methodVisitor36);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.String[] strArray62 = null;
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) ' ', "", "", "hi!", strArray62);
        java.util.List list64 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(annotationVisitor70);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        java.util.List list64 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", 10);
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
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass18 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor34.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor34.visitSource("hi!", "");
        java.util.List list50 = aSMifierClassVisitor34.getText();
        java.io.PrintWriter printWriter56 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor57 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter56);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor57.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor73 = aSMifierClassVisitor57.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray72);
        aSMifierClassVisitor34.visit((int) (short) 10, 1, "", "", "hi!", strArray72);
        aSMifierClassVisitor1.visit((int) (short) 1, (int) ' ', "hi!", "", "hi!", strArray72);
        java.lang.String[] strArray81 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit((int) '#', (int) (short) 1, "", "", "", strArray81);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        aSMifierClassVisitor1.visitSource("", "hi!");
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter25 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor26 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter25);
        org.mockito.asm.FieldVisitor fieldVisitor32 = aSMifierClassVisitor26.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor26.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor41 = aSMifierClassVisitor26.visitAnnotation("", true);
        java.util.List list42 = aSMifierClassVisitor26.getText();
        aSMifierClassVisitor26.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor26.visit(1, (int) (short) 0, "hi!", "", "", strArray52);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray52);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list59 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor32);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 0);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.lang.String[] strArray69 = null;
        org.mockito.asm.MethodVisitor methodVisitor70 = aSMifierClassVisitor1.visitMethod((int) '#', "hi!", "hi!", "", strArray69);
        java.util.List list71 = aSMifierClassVisitor1.text;
        java.util.List list72 = aSMifierClassVisitor1.getText();
        org.mockito.asm.Attribute attribute73 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list21 = aSMifierClassVisitor1.text;
        java.lang.String[] strArray27 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor1.visit((int) (byte) 10, 0, "", "", "hi!", strArray27);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (short) 100, "", "hi!", "hi!", strArray36);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        java.lang.String[] strArray50 = null;
        aSMifierClassVisitor1.visit((int) (byte) 100, 100, "", "hi!", "hi!", strArray50);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(annotationVisitor40);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor89 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter90 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter90);
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
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(annotationVisitor86);
        org.junit.Assert.assertNotNull(annotationVisitor89);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter12 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor13 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        org.mockito.asm.FieldVisitor fieldVisitor19 = aSMifierClassVisitor13.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor29 = aSMifierClassVisitor13.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray28);
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor35.visitSource("hi!", "");
        java.util.List list51 = aSMifierClassVisitor35.getText();
        java.io.PrintWriter printWriter57 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor58.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor74 = aSMifierClassVisitor58.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray73);
        aSMifierClassVisitor35.visit((int) (short) 10, 1, "", "", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor13.visitMethod((int) (short) 0, "hi!", "hi!", "", strArray73);
        org.mockito.asm.FieldVisitor fieldVisitor77 = aSMifierClassVisitor1.visitField((int) (byte) -1, "hi!", "hi!", "", (java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) '#');
        java.util.List list86 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor74);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(fieldVisitor77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        java.util.List list77 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        java.util.List list80 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
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
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.lang.String[] strArray22 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor1.visit(1, 100, "hi!", "", "hi!", strArray22);
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        java.io.PrintWriter printWriter36 = null;
        aSMifierClassVisitor35.print(printWriter36);
        aSMifierClassVisitor35.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray48 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor35.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor50 = aSMifierClassVisitor1.visitMethod((int) '4', "", "", "hi!", strArray48);
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor56.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor68 = aSMifierClassVisitor56.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor71 = aSMifierClassVisitor56.visitAnnotation("", true);
        java.util.List list72 = aSMifierClassVisitor56.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor56.visitAnnotation("", true);
        java.lang.String[] strArray80 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor81 = aSMifierClassVisitor56.visitMethod((int) ' ', "", "hi!", "", strArray80);
        aSMifierClassVisitor56.visitInnerClass("", "", "hi!", 1);
        java.util.List list87 = aSMifierClassVisitor56.text;
        aSMifierClassVisitor56.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor91 = aSMifierClassVisitor1.visitField(100, "", "", "hi!", (java.lang.Object) aSMifierClassVisitor56);
        java.util.List list92 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor71);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(fieldVisitor91);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        java.io.PrintWriter printWriter69 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter69);
        java.io.PrintWriter printWriter71 = null;
        aSMifierClassVisitor70.print(printWriter71);
        java.util.List list73 = aSMifierClassVisitor70.getText();
        java.io.PrintWriter printWriter74 = null;
        aSMifierClassVisitor70.print(printWriter74);
        aSMifierClassVisitor70.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor81 = aSMifierClassVisitor70.visitAnnotation("", false);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor1.visitField((int) (byte) -1, "", "hi!", "hi!", (java.lang.Object) false);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor91 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list92 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(methodVisitor55);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(annotationVisitor81);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(annotationVisitor91);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.util.List list92 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
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
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor31);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list34 = aSMifierClassVisitor1.text;
        java.util.List list35 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter40 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor41 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter40);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor41.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor53 = aSMifierClassVisitor41.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierClassVisitor41.visitAnnotation("hi!", true);
        java.lang.String[] strArray62 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor41.visit(1, 100, "hi!", "", "hi!", strArray62);
        org.mockito.asm.AnnotationVisitor annotationVisitor66 = aSMifierClassVisitor41.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = aSMifierClassVisitor41.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter74 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor75 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter74);
        java.io.PrintWriter printWriter76 = null;
        aSMifierClassVisitor75.print(printWriter76);
        aSMifierClassVisitor75.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray88 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor75.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor90 = aSMifierClassVisitor41.visitMethod((int) '4', "", "", "hi!", strArray88);
        org.mockito.asm.MethodVisitor methodVisitor91 = aSMifierClassVisitor1.visitMethod(0, "", "", "hi!", strArray88);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(fieldVisitor53);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(annotationVisitor66);
        org.junit.Assert.assertNotNull(annotationVisitor69);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(methodVisitor90);
        org.junit.Assert.assertNotNull(methodVisitor91);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", 1);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", 10);
        java.lang.Class<?> wildcardClass36 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.text;
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
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray44 = null;
        aSMifierClassVisitor32.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray44);
        aSMifierClassVisitor32.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        aSMifierClassVisitor55.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list61 = aSMifierClassVisitor55.getText();
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor32.visitField((int) (short) 0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor55);
        org.mockito.asm.FieldVisitor fieldVisitor63 = aSMifierClassVisitor1.visitField((int) (byte) 100, "hi!", "", "", (java.lang.Object) aSMifierClassVisitor55);
        aSMifierClassVisitor55.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = aSMifierClassVisitor55.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(fieldVisitor63);
        org.junit.Assert.assertNotNull(annotationVisitor70);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        aSMifierClassVisitor30.visitOuterClass("", "hi!", "");
        org.mockito.asm.Attribute attribute54 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor30.visitAttribute(attribute54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.util.List list77 = aSMifierClassVisitor1.text;
        java.util.List list78 = aSMifierClassVisitor1.getText();
        java.util.List list79 = aSMifierClassVisitor1.text;
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
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(list79);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        java.util.List list70 = aSMifierClassVisitor1.getText();
        java.util.List list71 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor74 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.lang.Class<?> wildcardClass75 = aSMifierClassVisitor1.getClass();
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
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(annotationVisitor74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.text;
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.util.List list20 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list24 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter13 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor14 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor14.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray26 = null;
        aSMifierClassVisitor14.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray26);
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor33 = aSMifierClassVisitor14.visitMethod(100, "", "hi!", "", strArray32);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierClassVisitor14.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter42 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter42);
        aSMifierClassVisitor43.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        aSMifierClassVisitor43.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray55);
        aSMifierClassVisitor14.visit((int) '4', (int) '#', "", "", "", strArray55);
        org.mockito.asm.MethodVisitor methodVisitor58 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "hi!", "hi!", "", strArray55);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(methodVisitor33);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(methodVisitor58);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        aSMifierClassVisitor60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor60.visit(1, (int) (short) 0, "hi!", "", "", strArray86);
        aSMifierClassVisitor35.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) 0, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list98 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(list98);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter11 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor12 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter11);
        org.mockito.asm.FieldVisitor fieldVisitor18 = aSMifierClassVisitor12.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor12.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor12.visitSource("", "");
        java.io.PrintWriter printWriter32 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter32);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor33.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray45 = null;
        aSMifierClassVisitor33.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray45);
        java.lang.String[] strArray51 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor52 = aSMifierClassVisitor33.visitMethod(100, "", "hi!", "", strArray51);
        org.mockito.asm.MethodVisitor methodVisitor53 = aSMifierClassVisitor12.visitMethod(1, "hi!", "hi!", "", strArray51);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) "");
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list58 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor18);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodVisitor52);
        org.junit.Assert.assertNotNull(methodVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor16.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor16.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor16.visitSource("hi!", "");
        java.util.List list32 = aSMifierClassVisitor16.text;
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor16.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray38);
        java.util.List list40 = aSMifierClassVisitor16.getText();
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor1.visitField((int) (short) 100, "", "hi!", "", (java.lang.Object) aSMifierClassVisitor16);
        java.util.List list42 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list10 = aSMifierClassVisitor1.getText();
        java.util.List list11 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter34 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter34);
        org.mockito.asm.FieldVisitor fieldVisitor41 = aSMifierClassVisitor35.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor35.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierClassVisitor35.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor53 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter59 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor60 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter59);
        org.mockito.asm.FieldVisitor fieldVisitor66 = aSMifierClassVisitor60.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor60.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = aSMifierClassVisitor60.visitAnnotation("", true);
        java.util.List list76 = aSMifierClassVisitor60.getText();
        aSMifierClassVisitor60.visitOuterClass("", "", "hi!");
        java.lang.String[] strArray86 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor60.visit(1, (int) (short) 0, "hi!", "", "", strArray86);
        aSMifierClassVisitor35.visit((int) (byte) 10, (int) (short) -1, "hi!", "", "", strArray86);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) (short) 0, "hi!", "hi!", "hi!", strArray86);
        java.util.List list90 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor41);
        org.junit.Assert.assertNotNull(fieldVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor53);
        org.junit.Assert.assertNotNull(fieldVisitor66);
        org.junit.Assert.assertNotNull(fieldVisitor72);
        org.junit.Assert.assertNotNull(annotationVisitor75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(list90);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 100);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list9 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", 10);
        java.lang.String[] strArray19 = null;
        org.mockito.asm.MethodVisitor methodVisitor20 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "hi!", "", "", strArray19);
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) (byte) 0);
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(methodVisitor20);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list16 = aSMifierClassVisitor1.getText();
        java.util.List list17 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list23 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list27 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        java.util.List list6 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor9 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter17 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter17);
        org.mockito.asm.FieldVisitor fieldVisitor24 = aSMifierClassVisitor18.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray30 = null;
        aSMifierClassVisitor18.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray30);
        java.lang.String[] strArray37 = null;
        aSMifierClassVisitor18.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray37);
        aSMifierClassVisitor18.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 1);
        aSMifierClassVisitor18.visitSource("", "");
        org.mockito.asm.FieldVisitor fieldVisitor47 = aSMifierClassVisitor1.visitField((int) (byte) 1, "", "hi!", "hi!", (java.lang.Object) "");
        org.mockito.asm.Attribute attribute48 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(annotationVisitor9);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(fieldVisitor24);
        org.junit.Assert.assertNotNull(fieldVisitor47);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor23.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.util.List list39 = aSMifierClassVisitor23.getText();
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor46.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray61);
        aSMifierClassVisitor23.visit((int) (short) 10, 1, "", "", "hi!", strArray61);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "hi!", "hi!", "", strArray61);
        java.io.PrintWriter printWriter69 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter69);
        java.io.PrintWriter printWriter71 = null;
        aSMifierClassVisitor70.print(printWriter71);
        aSMifierClassVisitor70.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor77 = aSMifierClassVisitor1.visitField((int) (short) -1, "hi!", "", "", (java.lang.Object) "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor77);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list21 = aSMifierClassVisitor1.getText();
        java.util.List list22 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray27 = null;
        aSMifierClassVisitor15.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray27);
        aSMifierClassVisitor15.visitSource("hi!", "hi!");
        aSMifierClassVisitor15.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor15.visitAnnotation("", true);
        aSMifierClassVisitor15.visitSource("", "hi!");
        aSMifierClassVisitor15.visitInnerClass("", "", "hi!", (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor15.visitAnnotation("hi!", true);
        org.mockito.asm.FieldVisitor fieldVisitor50 = aSMifierClassVisitor1.visitField((int) (short) -1, "", "", "hi!", (java.lang.Object) "hi!");
        java.util.List list51 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.lang.Class<?> wildcardClass55 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor23.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.util.List list39 = aSMifierClassVisitor23.getText();
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor46.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray61);
        aSMifierClassVisitor23.visit((int) (short) 10, 1, "", "", "hi!", strArray61);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "hi!", "hi!", "", strArray61);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list71 = aSMifierClassVisitor1.getText();
        java.util.List list72 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(annotationVisitor36);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.util.List list5 = aSMifierClassVisitor1.text;
        java.util.List list6 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        java.util.List list14 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter20 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor21 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter20);
        org.mockito.asm.FieldVisitor fieldVisitor27 = aSMifierClassVisitor21.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor33 = aSMifierClassVisitor21.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor21.visitSource("hi!", "");
        java.util.List list37 = aSMifierClassVisitor21.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor21.visitAnnotation("hi!", false);
        java.util.List list41 = aSMifierClassVisitor21.text;
        java.lang.String[] strArray47 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor21.visit((int) (byte) 10, 0, "", "", "hi!", strArray47);
        aSMifierClassVisitor1.visit((int) '4', (int) (short) 10, "", "", "hi!", strArray47);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(fieldVisitor27);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list17 = aSMifierClassVisitor1.text;
        java.util.List list18 = aSMifierClassVisitor1.getText();
        java.util.List list19 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter24 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor25 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor25.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        aSMifierClassVisitor25.visitInnerClass("hi!", "hi!", "", (int) (short) -1);
        java.util.List list37 = aSMifierClassVisitor25.text;
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor1.visitField(0, "", "", "", (java.lang.Object) aSMifierClassVisitor25);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list50 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute51 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.util.List list20 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor43 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitSource("", "");
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor43);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.util.List list34 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list26 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierClassVisitor1.visitAnnotation("", true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "hi!", 1);
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.io.PrintWriter printWriter54 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor55 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter54);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor55.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor55.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor55.visitSource("", "");
        java.io.PrintWriter printWriter75 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor76 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter75);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor76.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray88 = null;
        aSMifierClassVisitor76.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray88);
        java.lang.String[] strArray94 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor76.visitMethod(100, "", "hi!", "", strArray94);
        org.mockito.asm.MethodVisitor methodVisitor96 = aSMifierClassVisitor55.visitMethod(1, "hi!", "hi!", "", strArray94);
        aSMifierClassVisitor42.visit((int) (short) 0, (int) (byte) 1, "hi!", "", "hi!", strArray94);
        aSMifierClassVisitor1.visit((int) (byte) 1, (int) (byte) 100, "hi!", "", "hi!", strArray94);
        java.util.List list99 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(list99);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.util.List list58 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.lang.Class<?> wildcardClass62 = aSMifierClassVisitor1.getClass();
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
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) 1);
        org.mockito.asm.Attribute attribute74 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute74);
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
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list20 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitSource("", "");
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list8 = aSMifierClassVisitor1.text;
        java.util.List list9 = aSMifierClassVisitor1.text;
        java.io.PrintWriter printWriter14 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        org.mockito.asm.FieldVisitor fieldVisitor21 = aSMifierClassVisitor15.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.util.List list22 = aSMifierClassVisitor15.text;
        java.util.List list23 = aSMifierClassVisitor15.text;
        java.util.List list24 = aSMifierClassVisitor15.getText();
        org.mockito.asm.FieldVisitor fieldVisitor25 = aSMifierClassVisitor1.visitField(0, "hi!", "", "hi!", (java.lang.Object) list24);
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        java.io.PrintWriter printWriter32 = null;
        aSMifierClassVisitor31.print(printWriter32);
        aSMifierClassVisitor31.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor31.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list43 = aSMifierClassVisitor31.getText();
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = null;
        aSMifierClassVisitor49.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray61);
        java.lang.String[] strArray67 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor68 = aSMifierClassVisitor49.visitMethod(100, "", "hi!", "", strArray67);
        org.mockito.asm.MethodVisitor methodVisitor69 = aSMifierClassVisitor31.visitMethod((int) (short) 1, "hi!", "hi!", "hi!", strArray67);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierClassVisitor31.visitAnnotation("hi!", false);
        java.lang.Object obj77 = null;
        org.mockito.asm.FieldVisitor fieldVisitor78 = aSMifierClassVisitor31.visitField((-1), "", "hi!", "hi!", obj77);
        org.mockito.asm.FieldVisitor fieldVisitor79 = aSMifierClassVisitor1.visitField((int) 'a', "", "", "", (java.lang.Object) aSMifierClassVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(fieldVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor72);
        org.junit.Assert.assertNotNull(fieldVisitor78);
        org.junit.Assert.assertNotNull(fieldVisitor79);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.lang.String[] strArray25 = null;
        aSMifierClassVisitor1.visit((-1), (int) 'a', "", "", "hi!", strArray25);
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list53 = aSMifierClassVisitor1.getText();
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
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.io.PrintWriter printWriter9 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor10 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter9);
        aSMifierClassVisitor10.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.io.PrintWriter printWriter21 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor22 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        org.mockito.asm.FieldVisitor fieldVisitor28 = aSMifierClassVisitor22.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor22.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = aSMifierClassVisitor22.visitAnnotation("hi!", true);
        java.lang.String[] strArray43 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor22.visit(1, 100, "hi!", "", "hi!", strArray43);
        aSMifierClassVisitor10.visit(100, (int) (byte) -1, "", "", "hi!", strArray43);
        aSMifierClassVisitor1.visit(10, (int) (byte) -1, "", "hi!", "", strArray43);
        java.lang.Class<?> wildcardClass47 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor28);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor61.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor61.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.util.List list77 = aSMifierClassVisitor61.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.lang.String[] strArray85 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor86 = aSMifierClassVisitor61.visitMethod((int) ' ', "", "hi!", "", strArray85);
        org.mockito.asm.FieldVisitor fieldVisitor87 = aSMifierClassVisitor1.visitField((int) (short) 10, "", "", "", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass88 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(fieldVisitor87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        aSMifierClassVisitor1.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        aSMifierClassVisitor23.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.util.List list31 = aSMifierClassVisitor23.getText();
        aSMifierClassVisitor23.visitInnerClass("hi!", "hi!", "hi!", (-1));
        java.io.PrintWriter printWriter41 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter41);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor42.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.util.List list58 = aSMifierClassVisitor42.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor42.visitAnnotation("", true);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor67 = aSMifierClassVisitor42.visitMethod((int) ' ', "", "hi!", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor68 = aSMifierClassVisitor23.visitMethod((int) (byte) 1, "hi!", "hi!", "", strArray66);
        org.mockito.asm.MethodVisitor methodVisitor69 = aSMifierClassVisitor1.visitMethod((int) (short) 10, "hi!", "", "hi!", strArray66);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(methodVisitor67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(methodVisitor69);
        org.junit.Assert.assertNotNull(annotationVisitor72);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.util.List list28 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor31 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(annotationVisitor31);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor17 = aSMifierClassVisitor1.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray16);
        java.io.PrintWriter printWriter22 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor23 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter22);
        org.mockito.asm.FieldVisitor fieldVisitor29 = aSMifierClassVisitor23.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor35 = aSMifierClassVisitor23.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor23.visitSource("hi!", "");
        java.util.List list39 = aSMifierClassVisitor23.getText();
        java.io.PrintWriter printWriter45 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor46.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor46.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray61);
        aSMifierClassVisitor23.visit((int) (short) 10, 1, "", "", "hi!", strArray61);
        org.mockito.asm.MethodVisitor methodVisitor64 = aSMifierClassVisitor1.visitMethod((int) (short) 0, "hi!", "hi!", "", strArray61);
        java.io.PrintWriter printWriter69 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter69);
        org.mockito.asm.FieldVisitor fieldVisitor76 = aSMifierClassVisitor70.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor70.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor70.visitSource("hi!", "");
        java.util.List list86 = aSMifierClassVisitor70.text;
        java.lang.String[] strArray92 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor70.visit((int) '#', (int) (byte) 10, "hi!", "hi!", "", strArray92);
        org.mockito.asm.FieldVisitor fieldVisitor94 = aSMifierClassVisitor1.visitField((int) (byte) 10, "hi!", "", "hi!", (java.lang.Object) aSMifierClassVisitor70);
        aSMifierClassVisitor70.visitInnerClass("", "", "", (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodVisitor17);
        org.junit.Assert.assertNotNull(fieldVisitor29);
        org.junit.Assert.assertNotNull(fieldVisitor35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(methodVisitor64);
        org.junit.Assert.assertNotNull(fieldVisitor76);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(fieldVisitor94);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor1.visitSource("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor27);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (byte) 0);
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor1.visitSource("", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.io.PrintWriter printWriter24 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor25 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor25.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor37 = aSMifierClassVisitor25.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor25.visitSource("hi!", "");
        java.util.List list41 = aSMifierClassVisitor25.getText();
        java.lang.Class<?> wildcardClass42 = list41.getClass();
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor1.visitField((int) '4', "", "", "", (java.lang.Object) list41);
        java.util.List list44 = aSMifierClassVisitor1.text;
        java.util.List list45 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass46 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(fieldVisitor37);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = aSMifierClassVisitor1.visitAnnotation("", false);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "", "hi!");
        java.io.PrintWriter printWriter19 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor20 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter19);
        org.mockito.asm.FieldVisitor fieldVisitor26 = aSMifierClassVisitor20.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray32 = null;
        aSMifierClassVisitor20.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray32);
        org.mockito.asm.FieldVisitor fieldVisitor39 = aSMifierClassVisitor20.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        java.util.List list40 = aSMifierClassVisitor20.getText();
        java.util.List list41 = aSMifierClassVisitor20.text;
        java.util.List list42 = aSMifierClassVisitor20.text;
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        java.io.PrintWriter printWriter50 = null;
        aSMifierClassVisitor49.print(printWriter50);
        java.util.List list52 = aSMifierClassVisitor49.getText();
        java.io.PrintWriter printWriter53 = null;
        aSMifierClassVisitor49.print(printWriter53);
        java.util.List list55 = aSMifierClassVisitor49.text;
        java.io.PrintWriter printWriter60 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor61 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter60);
        org.mockito.asm.FieldVisitor fieldVisitor67 = aSMifierClassVisitor61.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor73 = aSMifierClassVisitor61.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.util.List list77 = aSMifierClassVisitor61.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierClassVisitor61.visitAnnotation("", true);
        java.lang.String[] strArray85 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor86 = aSMifierClassVisitor61.visitMethod((int) ' ', "", "hi!", "", strArray85);
        org.mockito.asm.MethodVisitor methodVisitor87 = aSMifierClassVisitor49.visitMethod((int) (short) -1, "", "hi!", "hi!", strArray85);
        aSMifierClassVisitor20.visit(1, (-1), "hi!", "hi!", "hi!", strArray85);
        aSMifierClassVisitor1.visit((int) (byte) 10, (int) '#', "hi!", "", "", strArray85);
        org.junit.Assert.assertNotNull(annotationVisitor6);
        org.junit.Assert.assertNotNull(fieldVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(fieldVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor73);
        org.junit.Assert.assertNotNull(annotationVisitor76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(methodVisitor86);
        org.junit.Assert.assertNotNull(methodVisitor87);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        org.mockito.asm.FieldVisitor fieldVisitor20 = aSMifierClassVisitor1.visitField((-1), "", "hi!", "", (java.lang.Object) (byte) -1);
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitInnerClass("", "", "", (-1));
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) (short) 100);
        java.io.PrintWriter printWriter39 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor40 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter39);
        org.mockito.asm.FieldVisitor fieldVisitor46 = aSMifierClassVisitor40.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor52 = aSMifierClassVisitor40.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor40.visitAnnotation("", true);
        java.util.List list56 = aSMifierClassVisitor40.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierClassVisitor40.visitAnnotation("", true);
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor65 = aSMifierClassVisitor40.visitMethod((int) ' ', "", "hi!", "", strArray64);
        aSMifierClassVisitor1.visit((int) (short) -1, 100, "hi!", "", "hi!", strArray64);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(fieldVisitor46);
        org.junit.Assert.assertNotNull(fieldVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodVisitor65);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray20 = null;
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) 1, "", "", "hi!", strArray20);
        java.io.PrintWriter printWriter27 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitSource("", "hi!");
        java.util.List list32 = aSMifierClassVisitor28.getText();
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor28.visitSource("hi!", "hi!");
        aSMifierClassVisitor28.visitSource("", "hi!");
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor51 = aSMifierClassVisitor28.visitMethod((int) '4', "hi!", "hi!", "hi!", strArray50);
        aSMifierClassVisitor1.visit((-1), 0, "hi!", "hi!", "hi!", strArray50);
        java.io.PrintWriter printWriter57 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor58 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter57);
        java.io.PrintWriter printWriter59 = null;
        aSMifierClassVisitor58.print(printWriter59);
        aSMifierClassVisitor58.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor58.visitInnerClass("", "hi!", "", (int) (byte) 0);
        java.util.List list70 = aSMifierClassVisitor58.getText();
        java.io.PrintWriter printWriter75 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor76 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter75);
        org.mockito.asm.FieldVisitor fieldVisitor82 = aSMifierClassVisitor76.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray88 = null;
        aSMifierClassVisitor76.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray88);
        java.lang.String[] strArray94 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor95 = aSMifierClassVisitor76.visitMethod(100, "", "hi!", "", strArray94);
        org.mockito.asm.MethodVisitor methodVisitor96 = aSMifierClassVisitor58.visitMethod((int) (short) 1, "hi!", "hi!", "hi!", strArray94);
        org.mockito.asm.MethodVisitor methodVisitor97 = aSMifierClassVisitor1.visitMethod((int) (byte) -1, "", "hi!", "", strArray94);
        java.util.List list98 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(methodVisitor51);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(fieldVisitor82);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(methodVisitor95);
        org.junit.Assert.assertNotNull(methodVisitor96);
        org.junit.Assert.assertNotNull(methodVisitor97);
        org.junit.Assert.assertNotNull(list98);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        java.util.List list32 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        java.io.PrintWriter printWriter36 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor37 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter36);
        org.mockito.asm.FieldVisitor fieldVisitor43 = aSMifierClassVisitor37.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor37.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor37.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = aSMifierClassVisitor37.visitAnnotation("hi!", false);
        aSMifierClassVisitor37.visitOuterClass("hi!", "", "hi!");
        java.io.PrintWriter printWriter64 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        org.mockito.asm.FieldVisitor fieldVisitor71 = aSMifierClassVisitor65.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor81 = aSMifierClassVisitor65.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray80);
        org.mockito.asm.MethodVisitor methodVisitor82 = aSMifierClassVisitor37.visitMethod((int) 'a', "", "hi!", "", strArray80);
        aSMifierClassVisitor1.visit(0, 100, "hi!", "hi!", "hi!", strArray80);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        org.mockito.asm.Attribute attribute87 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor43);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(annotationVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor71);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(methodVisitor81);
        org.junit.Assert.assertNotNull(methodVisitor82);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.getText();
        java.lang.String[] strArray27 = null;
        org.mockito.asm.MethodVisitor methodVisitor28 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "hi!", "hi!", "", strArray27);
        org.mockito.asm.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(methodVisitor28);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", 0);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list10 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter15 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        org.mockito.asm.FieldVisitor fieldVisitor22 = aSMifierClassVisitor16.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray28 = null;
        aSMifierClassVisitor16.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray28);
        java.lang.String[] strArray34 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor35 = aSMifierClassVisitor16.visitMethod(100, "", "hi!", "", strArray34);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierClassVisitor16.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter44 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor45 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter44);
        aSMifierClassVisitor45.visitInnerClass("hi!", "hi!", "hi!", 0);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        aSMifierClassVisitor45.visit((int) (short) 0, (int) (short) 100, "", "", "hi!", strArray57);
        aSMifierClassVisitor16.visit((int) '4', (int) '#', "", "", "", strArray57);
        org.mockito.asm.MethodVisitor methodVisitor60 = aSMifierClassVisitor1.visitMethod((int) (byte) 1, "", "hi!", "", strArray57);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list64 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(fieldVisitor22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(methodVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor38);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodVisitor60);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        org.mockito.asm.FieldVisitor fieldVisitor54 = aSMifierClassVisitor42.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor42.visitSource("hi!", "");
        java.util.List list58 = aSMifierClassVisitor42.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierClassVisitor42.visitAnnotation("hi!", false);
        java.util.List list62 = aSMifierClassVisitor42.text;
        java.lang.String[] strArray68 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor42.visit((int) (byte) 10, 0, "", "", "hi!", strArray68);
        org.mockito.asm.MethodVisitor methodVisitor70 = aSMifierClassVisitor1.visitMethod(10, "", "hi!", "", strArray68);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (-1));
        java.util.List list76 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(methodVisitor70);
        org.junit.Assert.assertNotNull(list76);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        java.io.PrintWriter printWriter23 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor24 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter23);
        aSMifierClassVisitor24.visitInnerClass("hi!", "hi!", "", (int) (short) 10);
        java.util.List list30 = aSMifierClassVisitor24.getText();
        org.mockito.asm.FieldVisitor fieldVisitor31 = aSMifierClassVisitor1.visitField((int) (short) 0, "hi!", "hi!", "hi!", (java.lang.Object) aSMifierClassVisitor24);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        java.util.List list35 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(fieldVisitor31);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.util.List list21 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "hi!");
        java.io.PrintWriter printWriter30 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor31 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter30);
        java.io.PrintWriter printWriter32 = null;
        aSMifierClassVisitor31.print(printWriter32);
        java.util.List list34 = aSMifierClassVisitor31.getText();
        java.util.List list35 = aSMifierClassVisitor31.text;
        org.mockito.asm.FieldVisitor fieldVisitor36 = aSMifierClassVisitor1.visitField((int) '4', "", "hi!", "", (java.lang.Object) list35);
        java.util.List list37 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(fieldVisitor36);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "hi!", (int) '#');
        aSMifierClassVisitor1.visitSource("hi!", "");
        aSMifierClassVisitor1.visitSource("", "");
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
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list17 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (byte) -1);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter35 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor36 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter35);
        org.mockito.asm.FieldVisitor fieldVisitor42 = aSMifierClassVisitor36.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor48 = aSMifierClassVisitor36.visitField((int) '#', "hi!", "", "hi!", (java.lang.Object) (-1));
        aSMifierClassVisitor36.visitSource("hi!", "");
        java.util.List list52 = aSMifierClassVisitor36.text;
        java.util.List list53 = aSMifierClassVisitor36.text;
        java.util.List list54 = aSMifierClassVisitor36.getText();
        java.util.List list55 = aSMifierClassVisitor36.getText();
        aSMifierClassVisitor36.visitSource("", "");
        aSMifierClassVisitor36.visitInnerClass("hi!", "", "", 0);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor1.visitField(0, "hi!", "hi!", "", (java.lang.Object) aSMifierClassVisitor36);
        java.util.List list65 = aSMifierClassVisitor36.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(annotationVisitor30);
        org.junit.Assert.assertNotNull(fieldVisitor42);
        org.junit.Assert.assertNotNull(fieldVisitor48);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(annotationVisitor12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.util.List list22 = aSMifierClassVisitor1.text;
        java.util.List list23 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = aSMifierClassVisitor1.visitAnnotation("hi!", true);
        java.io.PrintWriter printWriter31 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor32 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter31);
        org.mockito.asm.FieldVisitor fieldVisitor38 = aSMifierClassVisitor32.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor48 = aSMifierClassVisitor32.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray47);
        aSMifierClassVisitor32.visitInnerClass("", "hi!", "", (int) ' ');
        org.mockito.asm.FieldVisitor fieldVisitor59 = aSMifierClassVisitor32.visitField((int) (short) 100, "", "hi!", "hi!", (java.lang.Object) 100L);
        java.util.List list60 = aSMifierClassVisitor32.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierClassVisitor32.visitAnnotation("", false);
        aSMifierClassVisitor32.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list68 = aSMifierClassVisitor32.text;
        aSMifierClassVisitor32.visitSource("hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor1.visitField((int) (byte) 0, "hi!", "hi!", "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(annotationVisitor26);
        org.junit.Assert.assertNotNull(fieldVisitor38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(methodVisitor48);
        org.junit.Assert.assertNotNull(fieldVisitor59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        java.lang.String[] strArray19 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor20 = aSMifierClassVisitor1.visitMethod(100, "", "hi!", "", strArray19);
        org.mockito.asm.AnnotationVisitor annotationVisitor23 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list24 = aSMifierClassVisitor1.getText();
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.util.List list69 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor33);
        org.junit.Assert.assertNotNull(fieldVisitor39);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(fieldVisitor56);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(methodVisitor66);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor57 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor60 = aSMifierClassVisitor1.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierClassVisitor1.visitAnnotation("", true);
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
        org.junit.Assert.assertNotNull(annotationVisitor57);
        org.junit.Assert.assertNotNull(annotationVisitor60);
        org.junit.Assert.assertNotNull(annotationVisitor63);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list14 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        java.util.List list19 = aSMifierClassVisitor1.text;
        java.lang.Class<?> wildcardClass20 = aSMifierClassVisitor1.getClass();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray13 = null;
        aSMifierClassVisitor1.visit((int) (short) -1, (int) (byte) 100, "hi!", "", "hi!", strArray13);
        aSMifierClassVisitor1.visitSource("hi!", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor1.visitAnnotation("", true);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list28 = aSMifierClassVisitor1.text;
        java.util.List list29 = aSMifierClassVisitor1.getText();
        java.util.List list30 = aSMifierClassVisitor1.text;
        java.util.List list31 = aSMifierClassVisitor1.text;
        org.mockito.asm.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        java.util.List list41 = aSMifierClassVisitor1.getText();
        java.util.List list42 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter48 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor49 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter48);
        org.mockito.asm.FieldVisitor fieldVisitor55 = aSMifierClassVisitor49.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor49.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        org.mockito.asm.AnnotationVisitor annotationVisitor64 = aSMifierClassVisitor49.visitAnnotation("hi!", true);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor49.visit(1, 100, "hi!", "", "hi!", strArray70);
        aSMifierClassVisitor1.visit((int) (byte) -1, (int) (short) -1, "hi!", "", "", strArray70);
        java.io.PrintWriter printWriter77 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor78 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter77);
        java.io.PrintWriter printWriter79 = null;
        aSMifierClassVisitor78.print(printWriter79);
        java.util.List list81 = aSMifierClassVisitor78.getText();
        java.io.PrintWriter printWriter82 = null;
        aSMifierClassVisitor78.print(printWriter82);
        aSMifierClassVisitor78.visitSource("", "");
        java.util.List list87 = aSMifierClassVisitor78.text;
        org.mockito.asm.FieldVisitor fieldVisitor88 = aSMifierClassVisitor1.visitField((int) (byte) -1, "", "", "hi!", (java.lang.Object) aSMifierClassVisitor78);
        aSMifierClassVisitor78.visitInnerClass("hi!", "hi!", "hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldVisitor19);
        org.junit.Assert.assertNotNull(fieldVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(fieldVisitor55);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(annotationVisitor64);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNotNull(fieldVisitor88);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        org.mockito.asm.Attribute attribute38 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.visitAttribute(attribute38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        aSMifierClassVisitor1.visitInnerClass("", "", "", (int) (short) -1);
        aSMifierClassVisitor1.visitSource("", "hi!");
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor1.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        java.io.PrintWriter printWriter2 = null;
        aSMifierClassVisitor1.print(printWriter2);
        java.util.List list4 = aSMifierClassVisitor1.getText();
        java.io.PrintWriter printWriter5 = null;
        aSMifierClassVisitor1.print(printWriter5);
        java.util.List list7 = aSMifierClassVisitor1.getText();
        aSMifierClassVisitor1.visitOuterClass("hi!", "", "");
        java.util.List list12 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor1.visitAnnotation("", false);
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierClassVisitor1.print(printWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        aSMifierClassVisitor1.visitInnerClass("", "hi!", "", (int) '#');
        aSMifierClassVisitor1.visitSource("hi!", "");
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
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        java.io.PrintWriter printWriter46 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor47 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter46);
        java.io.PrintWriter printWriter48 = null;
        aSMifierClassVisitor47.print(printWriter48);
        aSMifierClassVisitor47.visitInnerClass("hi!", "hi!", "", 1);
        java.lang.String[] strArray60 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierClassVisitor47.visit((int) (short) 10, (int) (short) 100, "", "hi!", "", strArray60);
        org.mockito.asm.MethodVisitor methodVisitor62 = aSMifierClassVisitor1.visitMethod((int) (short) 100, "hi!", "", "", strArray60);
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "hi!", (int) (short) 0);
        java.io.PrintWriter printWriter72 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor73 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter72);
        aSMifierClassVisitor73.visitOuterClass("hi!", "hi!", "hi!");
        aSMifierClassVisitor73.visitSource("hi!", "");
        java.util.List list81 = aSMifierClassVisitor73.getText();
        aSMifierClassVisitor73.visitInnerClass("", "hi!", "", 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor89 = aSMifierClassVisitor73.visitAnnotation("hi!", false);
        org.mockito.asm.FieldVisitor fieldVisitor90 = aSMifierClassVisitor1.visitField(1, "hi!", "", "", (java.lang.Object) false);
        aSMifierClassVisitor1.visitInnerClass("hi!", "", "", (int) (short) -1);
        java.util.List list96 = aSMifierClassVisitor1.text;
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodVisitor40);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodVisitor62);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(annotationVisitor89);
        org.junit.Assert.assertNotNull(fieldVisitor90);
        org.junit.Assert.assertNotNull(list96);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.io.PrintWriter printWriter55 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor56 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter55);
        org.mockito.asm.FieldVisitor fieldVisitor62 = aSMifierClassVisitor56.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.mockito.asm.MethodVisitor methodVisitor72 = aSMifierClassVisitor56.visitMethod((int) (byte) 10, "hi!", "", "hi!", strArray71);
        org.mockito.asm.MethodVisitor methodVisitor73 = aSMifierClassVisitor1.visitMethod((int) (short) 1, "", "hi!", "", strArray71);
        java.util.List list74 = aSMifierClassVisitor1.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
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
        org.junit.Assert.assertNotNull(fieldVisitor62);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(methodVisitor72);
        org.junit.Assert.assertNotNull(methodVisitor73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierClassVisitor1.visitAnnotation("hi!", false);
        aSMifierClassVisitor1.visitSource("hi!", "");
        java.util.List list62 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(methodVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(list62);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        aSMifierClassVisitor1.visitSource("", "hi!");
        java.util.List list5 = aSMifierClassVisitor1.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = aSMifierClassVisitor1.visitAnnotation("", true);
        java.util.List list9 = aSMifierClassVisitor1.getText();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(annotationVisitor8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.io.PrintWriter printWriter0 = null;
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor1 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter0);
        org.mockito.asm.FieldVisitor fieldVisitor7 = aSMifierClassVisitor1.visitField(1, "hi!", "hi!", "", (java.lang.Object) (short) 100);
        org.mockito.asm.FieldVisitor fieldVisitor13 = aSMifierClassVisitor1.visitField((int) 'a', "", "hi!", "", (java.lang.Object) 100.0d);
        java.util.List list14 = aSMifierClassVisitor1.text;
        aSMifierClassVisitor1.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor1.visitInnerClass("hi!", "hi!", "", (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(fieldVisitor13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        aSMifierClassVisitor33.visitInnerClass("", "", "hi!", (int) (byte) 10);
        aSMifierClassVisitor33.visitSource("", "");
        aSMifierClassVisitor33.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor33.visitSource("", "hi!");
        org.junit.Assert.assertNotNull(fieldVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(fieldVisitor50);
    }
}


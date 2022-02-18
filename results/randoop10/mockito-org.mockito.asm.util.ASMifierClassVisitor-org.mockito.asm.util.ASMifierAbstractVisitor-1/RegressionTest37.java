import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitMaxs((int) 'a', 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor15.visitTryCatchBlock(label16, label17, label18, "");
        aSMifierMethodVisitor15.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj24 = null;
        aSMifierMethodVisitor15.visitLdcInsn(obj24);
        aSMifierMethodVisitor15.visitTypeInsn(0, "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label30 = null;
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor29.visitTryCatchBlock(label30, label31, label32, "");
        aSMifierMethodVisitor29.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj38 = null;
        aSMifierMethodVisitor29.visitLdcInsn(obj38);
        aSMifierMethodVisitor29.visitEnd();
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor29);
        aSMifierMethodVisitor15.visitCode();
        aSMifierMethodVisitor15.visitIincInsn((int) (byte) 10, (int) (byte) 10);
        org.mockito.asm.Label label46 = null;
        aSMifierMethodVisitor15.visitLabel(label46);
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor15.visitLocalVariable("", "", "hi!", label51, label52, (int) (byte) -1);
        aSMifierMethodVisitor15.visitMultiANewArrayInsn("", (int) (short) 0);
        aSMifierMethodVisitor15.visitEnd();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor15);
        org.mockito.asm.Label label61 = null;
        aSMifierMethodVisitor15.visitJumpInsn((int) ' ', label61);
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        java.util.List list6 = aSMifierMethodVisitor0.text;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label8 = null;
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor7.visitTryCatchBlock(label8, label9, label10, "");
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor7.visitLocalVariable("hi!", "hi!", "hi!", label16, label17, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierMethodVisitor7.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) annotationVisitor20);
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitLineNumber(0, label23);
        aSMifierMethodVisitor0.visitMethodInsn(0, "", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (byte) 100, "hi!", false);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (byte) -1);
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label37, label38, label39, "");
        java.util.List list42 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor33);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter3 = printWriter1.append('a');
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.Writer) printWriter3, true);
        java.util.Locale locale6 = null;
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter("hi!");
        printWriter9.print(false);
        java.util.Locale locale12 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor14.visitTryCatchBlock(label15, label16, label17, "");
        aSMifierMethodVisitor14.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj23 = null;
        aSMifierMethodVisitor14.visitLdcInsn(obj23);
        aSMifierMethodVisitor14.visitInsn((int) ' ');
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        aSMifierMethodVisitor30.visitTryCatchBlock(label31, label32, label33, "");
        aSMifierMethodVisitor30.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj39 = null;
        aSMifierMethodVisitor30.visitLdcInsn(obj39);
        org.mockito.asm.Label label41 = null;
        int[] intArray48 = new int[] { ' ', 'a', 100, (byte) 10, '4', (byte) -1 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor49.visitTryCatchBlock(label50, label51, label52, "");
        aSMifierMethodVisitor49.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label60 = null;
        org.mockito.asm.Label label61 = null;
        org.mockito.asm.Label[] labelArray62 = new org.mockito.asm.Label[] { label61 };
        aSMifierMethodVisitor49.visitTableSwitchInsn(0, (int) (byte) 10, label60, labelArray62);
        aSMifierMethodVisitor30.visitLookupSwitchInsn(label41, intArray48, labelArray62);
        aSMifierMethodVisitor14.visitTableSwitchInsn((int) '4', (int) '#', label29, labelArray62);
        java.io.PrintWriter printWriter66 = printWriter9.format(locale12, "hi!", (java.lang.Object[]) labelArray62);
        java.io.PrintWriter printWriter67 = printWriter5.printf(locale6, "", (java.lang.Object[]) labelArray62);
        printWriter5.println((int) '#');
        printWriter5.println(0L);
        printWriter5.print(10);
        printWriter5.write("");
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[32, 97, 100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(labelArray62);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(printWriter67);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("hi!");
        printWriter12.print((java.lang.Object) (short) -1);
        aSMifierMethodVisitor0.print(printWriter12);
        printWriter12.println("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor18 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter12);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        printWriter24.write((-1));
        printWriter24.flush();
        java.util.Locale locale28 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray33 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray35 = null;
        aSMifierMethodVisitor30.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray33, (int) (short) 1, objArray35);
        java.io.PrintWriter printWriter37 = printWriter24.printf(locale28, "", (java.lang.Object[]) strArray33);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor38 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        aSMifierClassVisitor38.visitEnd();
        aSMifierClassVisitor38.visitSource("", "hi!");
        java.lang.String[] strArray48 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor38.visit((int) ' ', (int) (byte) 100, "", "hi!", "", strArray48);
        org.mockito.asm.MethodVisitor methodVisitor50 = aSMifierClassVisitor18.visitMethod(0, "", "hi!", "hi!", strArray48);
        aSMifierClassVisitor18.visitEnd();
        aSMifierClassVisitor18.visitEnd();
        aSMifierClassVisitor18.visitInnerClass("", "", "hi!", (int) (byte) 10);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor62 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label63 = null;
        org.mockito.asm.Label label64 = null;
        org.mockito.asm.Label label65 = null;
        aSMifierMethodVisitor62.visitTryCatchBlock(label63, label64, label65, "");
        aSMifierMethodVisitor62.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj71 = null;
        aSMifierMethodVisitor62.visitLdcInsn(obj71);
        java.io.PrintWriter printWriter74 = new java.io.PrintWriter("hi!");
        printWriter74.print((java.lang.Object) (short) -1);
        aSMifierMethodVisitor62.print(printWriter74);
        org.mockito.asm.AnnotationVisitor annotationVisitor80 = aSMifierMethodVisitor62.visitAnnotation("", false);
        java.io.PrintWriter printWriter82 = new java.io.PrintWriter("hi!");
        printWriter82.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter86 = printWriter82.append((java.lang.CharSequence) "");
        printWriter86.close();
        aSMifierMethodVisitor62.visitLdcInsn((java.lang.Object) printWriter86);
        org.mockito.asm.Label label90 = null;
        aSMifierMethodVisitor62.visitJumpInsn(100, label90);
        org.mockito.asm.AnnotationVisitor annotationVisitor92 = aSMifierMethodVisitor62.visitAnnotationDefault();
        org.mockito.asm.FieldVisitor fieldVisitor93 = aSMifierClassVisitor18.visitField(0, "hi!", "", "", (java.lang.Object) aSMifierMethodVisitor62);
        org.mockito.asm.Attribute attribute94 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldVisitor93.visitAttribute(attribute94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(methodVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor80);
        org.junit.Assert.assertNotNull(printWriter86);
        org.junit.Assert.assertNotNull(annotationVisitor92);
        org.junit.Assert.assertNotNull(fieldVisitor93);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label19 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor20 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor20.visitTryCatchBlock(label21, label22, label23, "");
        aSMifierMethodVisitor20.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj29 = null;
        aSMifierMethodVisitor20.visitLdcInsn(obj29);
        org.mockito.asm.Label label31 = null;
        int[] intArray38 = new int[] { ' ', 'a', 100, (byte) 10, '4', (byte) -1 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor39.visitTryCatchBlock(label40, label41, label42, "");
        aSMifierMethodVisitor39.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.Label[] labelArray52 = new org.mockito.asm.Label[] { label51 };
        aSMifierMethodVisitor39.visitTableSwitchInsn(0, (int) (byte) 10, label50, labelArray52);
        aSMifierMethodVisitor20.visitLookupSwitchInsn(label31, intArray38, labelArray52);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) 'a', 10, label19, labelArray52);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierMethodVisitor0.visitAnnotation("", true);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label61 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 100, label61);
        java.io.PrintWriter printWriter64 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter66 = printWriter64.append('a');
        java.io.PrintWriter printWriter68 = new java.io.PrintWriter((java.io.Writer) printWriter66, true);
        printWriter66.println(10);
        aSMifierMethodVisitor0.print(printWriter66);
        printWriter66.print("hi!");
        java.io.PrintWriter printWriter75 = printWriter66.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass76 = printWriter75.getClass();
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32, 97, 100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(labelArray52);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("", "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor24.visitTryCatchBlock(label25, label26, label27, "");
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor15.visitField((int) (short) -1, "hi!", "hi!", "", (java.lang.Object) label27);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj44 = null;
        aSMifierMethodVisitor35.visitLdcInsn(obj44);
        aSMifierMethodVisitor35.visitLdcInsn((java.lang.Object) (short) 10);
        java.util.List list48 = aSMifierMethodVisitor35.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor15.visitField((int) (byte) -1, "", "", "", (java.lang.Object) list48);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor15.visitAnnotation("hi!", false);
        aSMifierClassVisitor15.visitOuterClass("hi!", "", "");
        aSMifierClassVisitor15.visitInnerClass("", "", "", 100);
        aSMifierClassVisitor15.visitEnd();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(annotationVisitor52);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter5.close();
        printWriter5.println(true);
        printWriter5.println((double) '#');
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        printWriter5.println('a');
        printWriter5.println();
        printWriter5.println("hi!");
        printWriter5.close();
        org.junit.Assert.assertNotNull(printWriter5);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitMaxs((int) (short) -1, (int) (short) 100);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label19 = null;
        aSMifierMethodVisitor0.visitJumpInsn(10, label19);
        aSMifierMethodVisitor0.visitVarInsn(100, 0);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (short) 0);
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitCode();
        java.util.List list13 = aSMifierMethodVisitor0.text;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label14, label15, label16, "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 0, "", false);
        aSMifierMethodVisitor0.visitTypeInsn((int) ' ', "");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(annotationVisitor22);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter3 = printWriter1.append('a');
        printWriter1.print("hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor8 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor8.visitEnd();
        aSMifierClassVisitor8.visitEnd();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor15.visitTryCatchBlock(label16, label17, label18, "");
        aSMifierMethodVisitor15.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj24 = null;
        aSMifierMethodVisitor15.visitLdcInsn(obj24);
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor15.visitJumpInsn((int) (short) 1, label27);
        aSMifierMethodVisitor15.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor15.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierMethodVisitor15.visitAnnotationDefault();
        aSMifierMethodVisitor15.visitIntInsn(0, (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierMethodVisitor15.visitAnnotationDefault();
        org.mockito.asm.Label label43 = null;
        org.mockito.asm.Label label44 = null;
        aSMifierMethodVisitor15.visitLocalVariable("hi!", "hi!", "", label43, label44, (int) (short) 1);
        aSMifierMethodVisitor15.visitIntInsn((int) '#', (int) 'a');
        aSMifierMethodVisitor15.visitIntInsn((int) (short) 100, (int) (byte) 0);
        aSMifierMethodVisitor15.visitMaxs((int) (byte) 100, (int) '#');
        aSMifierMethodVisitor15.visitFieldInsn((int) (byte) 10, "", "hi!", "");
        org.mockito.asm.FieldVisitor fieldVisitor61 = aSMifierClassVisitor8.visitField((int) (short) 100, "", "", "", (java.lang.Object) (byte) 10);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor66 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label67 = null;
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        aSMifierMethodVisitor66.visitTryCatchBlock(label67, label68, label69, "");
        aSMifierMethodVisitor66.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj75 = null;
        aSMifierMethodVisitor66.visitLdcInsn(obj75);
        org.mockito.asm.Label label78 = null;
        aSMifierMethodVisitor66.visitJumpInsn((int) (short) 1, label78);
        aSMifierMethodVisitor66.visitTypeInsn((int) (byte) 100, "hi!");
        aSMifierMethodVisitor66.visitInsn(100);
        aSMifierMethodVisitor66.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor89 = aSMifierMethodVisitor66.visitParameterAnnotation((int) (short) 100, "", true);
        org.mockito.asm.FieldVisitor fieldVisitor90 = aSMifierClassVisitor8.visitField((int) (short) -1, "", "", "hi!", (java.lang.Object) aSMifierMethodVisitor66);
        org.mockito.asm.AnnotationVisitor annotationVisitor93 = aSMifierClassVisitor8.visitAnnotation("hi!", true);
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(fieldVisitor61);
        org.junit.Assert.assertNotNull(annotationVisitor89);
        org.junit.Assert.assertNotNull(fieldVisitor90);
        org.junit.Assert.assertNotNull(annotationVisitor93);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn(0, "", "", "hi!");
        aSMifierMethodVisitor0.visitEnd();
        java.util.List list13 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '4', "", false);
        java.io.PrintWriter printWriter19 = new java.io.PrintWriter("hi!");
        java.util.Locale locale20 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray25 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray27 = null;
        aSMifierMethodVisitor22.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray25, (int) (short) 1, objArray27);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        aSMifierMethodVisitor30.visitTryCatchBlock(label31, label32, label33, "");
        aSMifierMethodVisitor30.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray39 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray41 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor30, strArray39, 1.0f };
        java.io.PrintWriter printWriter42 = printWriter19.printf(locale20, "", (java.lang.Object[]) strArray39);
        java.io.PrintWriter printWriter44 = new java.io.PrintWriter("hi!");
        java.util.Locale locale45 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray52 = null;
        aSMifierMethodVisitor47.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray50, (int) (short) 1, objArray52);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.Label label57 = null;
        org.mockito.asm.Label label58 = null;
        aSMifierMethodVisitor55.visitTryCatchBlock(label56, label57, label58, "");
        aSMifierMethodVisitor55.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray66 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor55, strArray64, 1.0f };
        java.io.PrintWriter printWriter67 = printWriter44.printf(locale45, "", (java.lang.Object[]) strArray64);
        char[] charArray74 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter67.println(charArray74);
        printWriter42.print(charArray74);
        printWriter42.print(true);
        java.io.PrintWriter printWriter80 = printWriter42.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter82 = printWriter42.append((java.lang.CharSequence) "");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor83 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter82);
        printWriter82.close();
        aSMifierMethodVisitor0.print(printWriter82);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("", (int) (byte) 100);
        aSMifierMethodVisitor0.visitMethodInsn(100, "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(annotationVisitor17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printWriter82);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 100, "hi!");
        aSMifierMethodVisitor0.visitInsn(100);
        aSMifierMethodVisitor0.visitCode();
        java.util.List list20 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "", "", label24, label25, (int) (short) 1);
        org.mockito.asm.Label label29 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (byte) 0, label29);
        aSMifierMethodVisitor0.visitInsn((int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) '#', "hi!");
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 0, "hi!", "", "");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter5.print((float) 'a');
        boolean boolean8 = printWriter5.checkError();
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        printWriter10.print("");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn((int) ' ', "hi!", "hi!", "");
        org.mockito.asm.Label label13 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) -1, label13);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        printWriter16.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter20 = printWriter16.append((java.lang.CharSequence) "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor22.visitTryCatchBlock(label23, label24, label25, "");
        aSMifierMethodVisitor22.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj31 = null;
        aSMifierMethodVisitor22.visitLdcInsn(obj31);
        org.mockito.asm.Label label34 = null;
        aSMifierMethodVisitor22.visitJumpInsn((int) (short) 1, label34);
        aSMifierMethodVisitor22.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label41 = null;
        org.mockito.asm.Label[] labelArray42 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor22.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label41, labelArray42);
        java.io.PrintWriter printWriter44 = printWriter20.printf("", (java.lang.Object[]) labelArray42);
        aSMifierMethodVisitor0.print(printWriter44);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", 0);
        java.util.List list49 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitFieldInsn(100, "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(labelArray42);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter3 = printWriter1.append('a');
        printWriter1.print("hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor8 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter16 = printWriter14.append('a');
        printWriter14.print("hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor19 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label20 = null;
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        aSMifierMethodVisitor19.visitTryCatchBlock(label20, label21, label22, "");
        aSMifierMethodVisitor19.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj28 = null;
        aSMifierMethodVisitor19.visitLdcInsn(obj28);
        aSMifierMethodVisitor19.visitTypeInsn(0, "hi!");
        printWriter14.print((java.lang.Object) 0);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter((java.io.Writer) printWriter14);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor36 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor36.visitTryCatchBlock(label37, label38, label39, "");
        aSMifierMethodVisitor36.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj45 = null;
        aSMifierMethodVisitor36.visitLdcInsn(obj45);
        aSMifierMethodVisitor36.visitInsn((int) ' ');
        org.mockito.asm.Label label50 = null;
        aSMifierMethodVisitor36.visitJumpInsn(100, label50);
        aSMifierMethodVisitor36.visitIntInsn(10, (int) ' ');
        aSMifierMethodVisitor36.visitCode();
        org.mockito.asm.Label label57 = null;
        aSMifierMethodVisitor36.visitJumpInsn((int) (short) 10, label57);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor61 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray64 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray66 = null;
        aSMifierMethodVisitor61.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray64, (int) (short) 1, objArray66);
        java.io.PrintWriter printWriter70 = new java.io.PrintWriter("hi!");
        printWriter70.print((java.lang.Object) (short) -1);
        java.lang.String[] strArray74 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter75 = printWriter70.format("", (java.lang.Object[]) strArray74);
        aSMifierMethodVisitor36.visitFrame((int) '#', (int) '4', (java.lang.Object[]) strArray64, 0, (java.lang.Object[]) strArray74);
        java.io.PrintWriter printWriter77 = printWriter14.format("hi!", (java.lang.Object[]) strArray74);
        org.mockito.asm.MethodVisitor methodVisitor78 = aSMifierClassVisitor8.visitMethod((int) (byte) 1, "", "", "", strArray74);
        aSMifierClassVisitor8.visitEnd();
        aSMifierClassVisitor8.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor83 = aSMifierClassVisitor8.visitAnnotation("", false);
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter77);
        org.junit.Assert.assertNotNull(methodVisitor78);
        org.junit.Assert.assertNotNull(annotationVisitor83);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = printWriter24.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter28 = printWriter24.append(' ');
        printWriter28.println((float) '4');
        printWriter28.println(0);
        printWriter28.println((float) 0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj44 = null;
        aSMifierMethodVisitor35.visitLdcInsn(obj44);
        org.mockito.asm.Label label47 = null;
        aSMifierMethodVisitor35.visitJumpInsn((int) (short) 1, label47);
        aSMifierMethodVisitor35.visitMultiANewArrayInsn("hi!", (int) (short) 1);
        org.mockito.asm.Label label53 = null;
        aSMifierMethodVisitor35.visitJumpInsn((int) (short) 1, label53);
        aSMifierMethodVisitor35.visitFieldInsn((int) (byte) 100, "hi!", "", "");
        aSMifierMethodVisitor35.visitMaxs((int) (short) 1, (int) '#');
        aSMifierMethodVisitor35.visitCode();
        printWriter28.println((java.lang.Object) aSMifierMethodVisitor35);
        org.mockito.asm.Label label66 = null;
        aSMifierMethodVisitor35.visitJumpInsn(100, label66);
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        org.mockito.asm.Label label70 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label68, label69, label70, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(printWriter28);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) ' ');
        org.mockito.asm.AnnotationVisitor annotationVisitor17 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) -1);
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label24, label25, 1);
        aSMifierMethodVisitor0.visitMethodInsn((int) '#', "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor17);
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        java.util.Locale locale27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray34 = null;
        aSMifierMethodVisitor29.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray32, (int) (short) 1, objArray34);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray46 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray48 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor37, strArray46, 1.0f };
        java.io.PrintWriter printWriter49 = printWriter26.printf(locale27, "", (java.lang.Object[]) strArray46);
        char[] charArray56 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter49.println(charArray56);
        printWriter24.print(charArray56);
        printWriter24.print(true);
        java.io.PrintWriter printWriter62 = printWriter24.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter64 = printWriter24.append((java.lang.CharSequence) "");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        printWriter64.close();
        printWriter64.println((int) (short) 10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor69 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter64);
        aSMifierClassVisitor69.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(printWriter64);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        java.util.Locale locale27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray34 = null;
        aSMifierMethodVisitor29.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray32, (int) (short) 1, objArray34);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray46 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray48 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor37, strArray46, 1.0f };
        java.io.PrintWriter printWriter49 = printWriter26.printf(locale27, "", (java.lang.Object[]) strArray46);
        char[] charArray56 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter49.println(charArray56);
        printWriter24.print(charArray56);
        printWriter24.print(true);
        java.io.PrintWriter printWriter62 = printWriter24.append((java.lang.CharSequence) "");
        printWriter24.print(10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor65 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        aSMifierClassVisitor65.visitSource("hi!", "");
        java.util.List list69 = aSMifierClassVisitor65.getText();
        aSMifierClassVisitor65.visitInnerClass("", "hi!", "hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs((int) (byte) 0, (int) (short) 1);
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor18 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label19 = null;
        org.mockito.asm.Label label20 = null;
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor18.visitTryCatchBlock(label19, label20, label21, "");
        aSMifierMethodVisitor18.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj27 = null;
        aSMifierMethodVisitor18.visitLdcInsn(obj27);
        org.mockito.asm.Label label29 = null;
        int[] intArray36 = new int[] { ' ', 'a', 100, (byte) 10, '4', (byte) -1 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label48 = null;
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] { label49 };
        aSMifierMethodVisitor37.visitTableSwitchInsn(0, (int) (byte) 10, label48, labelArray50);
        aSMifierMethodVisitor18.visitLookupSwitchInsn(label29, intArray36, labelArray50);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) '4', (int) (short) 10, label17, labelArray50);
        org.mockito.asm.AnnotationVisitor annotationVisitor56 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = annotationVisitor56.visitArray("");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 97, 100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(labelArray50);
        org.junit.Assert.assertNotNull(annotationVisitor56);
        org.junit.Assert.assertNotNull(annotationVisitor58);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitMaxs(0, (-1));
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "hi!", label13, label14, (int) (short) 10);
        java.io.PrintWriter printWriter18 = new java.io.PrintWriter("hi!");
        java.util.Locale locale19 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray24 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray26 = null;
        aSMifierMethodVisitor21.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray24, (int) (short) 1, objArray26);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label30 = null;
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor29.visitTryCatchBlock(label30, label31, label32, "");
        aSMifierMethodVisitor29.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray38 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray40 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor29, strArray38, 1.0f };
        java.io.PrintWriter printWriter41 = printWriter18.printf(locale19, "", (java.lang.Object[]) strArray38);
        boolean boolean42 = printWriter41.checkError();
        printWriter41.println(false);
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter((java.io.Writer) printWriter41);
        printWriter41.println((float) 'a');
        printWriter41.print((long) '4');
        aSMifierMethodVisitor0.print(printWriter41);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label52 = null;
        org.mockito.asm.Label label53 = null;
        org.mockito.asm.Label label54 = null;
        aSMifierMethodVisitor51.visitTryCatchBlock(label52, label53, label54, "");
        aSMifierMethodVisitor51.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj60 = null;
        aSMifierMethodVisitor51.visitLdcInsn(obj60);
        aSMifierMethodVisitor51.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        aSMifierMethodVisitor51.visitLocalVariable("hi!", "hi!", "hi!", label68, label69, (int) (byte) 1);
        org.mockito.asm.Label label73 = null;
        aSMifierMethodVisitor51.visitLineNumber((int) 'a', label73);
        org.mockito.asm.Label label76 = null;
        aSMifierMethodVisitor51.visitLineNumber((int) (byte) 0, label76);
        aSMifierMethodVisitor51.visitEnd();
        printWriter41.println((java.lang.Object) aSMifierMethodVisitor51);
        org.mockito.asm.Label label80 = null;
        org.mockito.asm.Label label81 = null;
        org.mockito.asm.Label label82 = null;
        aSMifierMethodVisitor51.visitTryCatchBlock(label80, label81, label82, "hi!");
        org.mockito.asm.Label label86 = null;
        aSMifierMethodVisitor51.visitLineNumber((int) '#', label86);
        java.util.List list88 = aSMifierMethodVisitor51.text;
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list88);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter("hi!");
        java.util.Locale locale8 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor10 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray13 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray15 = null;
        aSMifierMethodVisitor10.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray13, (int) (short) 1, objArray15);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor18 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label19 = null;
        org.mockito.asm.Label label20 = null;
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor18.visitTryCatchBlock(label19, label20, label21, "");
        aSMifierMethodVisitor18.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray27 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray29 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor18, strArray27, 1.0f };
        java.io.PrintWriter printWriter30 = printWriter7.printf(locale8, "", (java.lang.Object[]) strArray27);
        java.io.PrintWriter printWriter32 = printWriter30.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter34 = printWriter30.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter("hi!");
        java.util.Locale locale37 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray42 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray44 = null;
        aSMifierMethodVisitor39.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray42, (int) (short) 1, objArray44);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor47 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label48 = null;
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.Label label50 = null;
        aSMifierMethodVisitor47.visitTryCatchBlock(label48, label49, label50, "");
        aSMifierMethodVisitor47.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray56 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray58 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor47, strArray56, 1.0f };
        java.io.PrintWriter printWriter59 = printWriter36.printf(locale37, "", (java.lang.Object[]) strArray56);
        char[] charArray66 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter59.println(charArray66);
        printWriter34.print(charArray66);
        printWriter1.print(charArray66);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor70 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor70.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor70.visitOuterClass("", "", "");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[a, 4, #, 4, #,  ]");
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitInsn((int) ' ');
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) ' ', "");
        aSMifierMethodVisitor0.visitVarInsn((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.println();
        printWriter24.print('a');
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        printWriter28.flush();
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        java.io.PrintWriter printWriter32 = new java.io.PrintWriter((java.io.Writer) printWriter28, true);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter("hi!");
        printWriter39.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label44 = null;
        org.mockito.asm.Label label45 = null;
        org.mockito.asm.Label label46 = null;
        aSMifierMethodVisitor43.visitTryCatchBlock(label44, label45, label46, "");
        aSMifierMethodVisitor43.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label54 = null;
        org.mockito.asm.Label label55 = null;
        org.mockito.asm.Label[] labelArray56 = new org.mockito.asm.Label[] { label55 };
        aSMifierMethodVisitor43.visitTableSwitchInsn(0, (int) (byte) 10, label54, labelArray56);
        java.io.PrintWriter printWriter58 = printWriter39.printf("hi!", (java.lang.Object[]) labelArray56);
        java.io.PrintWriter printWriter60 = printWriter39.append((java.lang.CharSequence) "");
        printWriter60.println(1);
        java.io.PrintWriter printWriter64 = printWriter60.append('a');
        org.mockito.asm.FieldVisitor fieldVisitor65 = aSMifierClassVisitor33.visitField((int) (byte) 0, "", "hi!", "hi!", (java.lang.Object) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor68 = aSMifierClassVisitor33.visitAnnotation("", false);
        annotationVisitor68.visitEnum("", "", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor75 = annotationVisitor68.visitAnnotation("hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(labelArray56);
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(printWriter60);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(fieldVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor75);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label18);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        java.util.Locale locale25 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray30 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray32 = null;
        aSMifierMethodVisitor27.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray30, (int) (short) 1, objArray32);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray46 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor35, strArray44, 1.0f };
        java.io.PrintWriter printWriter47 = printWriter24.printf(locale25, "", (java.lang.Object[]) strArray44);
        char[] charArray54 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter47.println(charArray54);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter47, true);
        boolean boolean58 = printWriter57.checkError();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter57);
        printWriter57.write("hi!");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter57);
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 1, 0);
        aSMifierMethodVisitor0.visitFieldInsn(0, "hi!", "hi!", "");
        org.mockito.asm.Label label72 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label72);
        aSMifierMethodVisitor0.visitTypeInsn((int) (short) 1, "hi!");
        aSMifierMethodVisitor0.visitInsn((int) '4');
        java.lang.Class<?> wildcardClass79 = aSMifierMethodVisitor0.getClass();
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitVarInsn((int) (short) 100, (int) (byte) 10);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitInsn((int) (byte) 0);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIntInsn((int) 'a', 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor29);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = printWriter24.append((java.lang.CharSequence) "");
        printWriter24.write((int) (byte) 0);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("hi!");
        java.util.Locale locale31 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor33 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray36 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray38 = null;
        aSMifierMethodVisitor33.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray36, (int) (short) 1, objArray38);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label42 = null;
        org.mockito.asm.Label label43 = null;
        org.mockito.asm.Label label44 = null;
        aSMifierMethodVisitor41.visitTryCatchBlock(label42, label43, label44, "");
        aSMifierMethodVisitor41.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray52 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor41, strArray50, 1.0f };
        java.io.PrintWriter printWriter53 = printWriter30.printf(locale31, "", (java.lang.Object[]) strArray50);
        char[] charArray60 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter53.println(charArray60);
        printWriter24.print(charArray60);
        printWriter24.println(100.0f);
        printWriter24.println((float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            printWriter24.write("", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, 4, #, 4, #,  ]");
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        printWriter1.flush();
        java.io.PrintWriter printWriter5 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.println((float) 10);
        printWriter1.flush();
        printWriter1.write("");
        java.io.PrintWriter printWriter12 = printWriter1.append((java.lang.CharSequence) "");
        boolean boolean13 = printWriter1.checkError();
        printWriter1.println((double) 0);
        org.junit.Assert.assertNotNull(printWriter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = printWriter24.append((java.lang.CharSequence) "");
        printWriter24.write((int) (byte) 0);
        printWriter24.write("hi!");
        printWriter24.print((long) '4');
        printWriter24.println((double) (byte) 100);
        printWriter24.println((float) (short) 1);
        printWriter24.flush();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter26);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        printWriter1.flush();
        printWriter1.println(true);
        java.util.Locale locale7 = null;
        java.io.PrintWriter printWriter10 = new java.io.PrintWriter("hi!");
        java.util.Locale locale11 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor13 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray16 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray18 = null;
        aSMifierMethodVisitor13.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray16, (int) (short) 1, objArray18);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.Label label24 = null;
        aSMifierMethodVisitor21.visitTryCatchBlock(label22, label23, label24, "");
        aSMifierMethodVisitor21.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray30 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray32 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor21, strArray30, 1.0f };
        java.io.PrintWriter printWriter33 = printWriter10.printf(locale11, "", (java.lang.Object[]) strArray30);
        printWriter33.print("hi!");
        java.io.PrintWriter printWriter36 = new java.io.PrintWriter((java.io.Writer) printWriter33);
        printWriter33.println(true);
        java.io.PrintWriter printWriter39 = new java.io.PrintWriter((java.io.Writer) printWriter33);
        printWriter33.flush();
        java.util.Locale locale41 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor43 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label44 = null;
        org.mockito.asm.Label label45 = null;
        org.mockito.asm.Label label46 = null;
        aSMifierMethodVisitor43.visitTryCatchBlock(label44, label45, label46, "");
        aSMifierMethodVisitor43.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj52 = null;
        aSMifierMethodVisitor43.visitLdcInsn(obj52);
        aSMifierMethodVisitor43.visitEnd();
        aSMifierMethodVisitor43.visitMaxs((int) (byte) 0, (int) (short) 1);
        org.mockito.asm.Label label60 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor61 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label62 = null;
        org.mockito.asm.Label label63 = null;
        org.mockito.asm.Label label64 = null;
        aSMifierMethodVisitor61.visitTryCatchBlock(label62, label63, label64, "");
        aSMifierMethodVisitor61.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj70 = null;
        aSMifierMethodVisitor61.visitLdcInsn(obj70);
        org.mockito.asm.Label label72 = null;
        int[] intArray79 = new int[] { ' ', 'a', 100, (byte) 10, '4', (byte) -1 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor80 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label81 = null;
        org.mockito.asm.Label label82 = null;
        org.mockito.asm.Label label83 = null;
        aSMifierMethodVisitor80.visitTryCatchBlock(label81, label82, label83, "");
        aSMifierMethodVisitor80.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label91 = null;
        org.mockito.asm.Label label92 = null;
        org.mockito.asm.Label[] labelArray93 = new org.mockito.asm.Label[] { label92 };
        aSMifierMethodVisitor80.visitTableSwitchInsn(0, (int) (byte) 10, label91, labelArray93);
        aSMifierMethodVisitor61.visitLookupSwitchInsn(label72, intArray79, labelArray93);
        aSMifierMethodVisitor43.visitTableSwitchInsn((int) '4', (int) (short) 10, label60, labelArray93);
        java.io.PrintWriter printWriter97 = printWriter33.format(locale41, "hi!", (java.lang.Object[]) labelArray93);
        java.io.PrintWriter printWriter98 = printWriter1.printf(locale7, "hi!", (java.lang.Object[]) labelArray93);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor99 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter98);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(printWriter33);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[32, 97, 100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(labelArray93);
        org.junit.Assert.assertNotNull(printWriter97);
        org.junit.Assert.assertNotNull(printWriter98);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (short) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label17, label18, (int) (byte) 1);
        java.util.List list21 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 1, "hi!");
        aSMifierMethodVisitor0.visitVarInsn(0, (int) (byte) 0);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 0);
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter35 = printWriter33.append('a');
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter35, true);
        printWriter35.println(10);
        printWriter35.close();
        java.io.PrintWriter printWriter44 = printWriter35.append((java.lang.CharSequence) "", 0, 0);
        printWriter44.print('a');
        printWriter44.println("hi!");
        printWriter44.write("hi!", (int) (byte) 10, (int) 'a');
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierMethodVisitor0.visitAnnotationDefault();
        annotationVisitor54.visitEnd();
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(printWriter44);
        org.junit.Assert.assertNotNull(annotationVisitor54);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        java.util.List list14 = aSMifierMethodVisitor0.text;
        org.mockito.asm.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label17, label18, (int) (byte) 1);
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label21, label22, label23, "");
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "", label29, label30, (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "", false);
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) 'a', label38);
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitInsn((int) ' ');
        aSMifierMethodVisitor0.visitTypeInsn((int) '4', "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor46 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray49 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray51 = null;
        aSMifierMethodVisitor46.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray49, (int) (short) 1, objArray51);
        aSMifierMethodVisitor46.visitFieldInsn(0, "", "", "hi!");
        aSMifierMethodVisitor46.visitCode();
        aSMifierMethodVisitor46.visitIincInsn((int) (byte) 100, 1);
        aSMifierMethodVisitor46.visitVarInsn((int) (short) 10, 0);
        aSMifierMethodVisitor46.visitTypeInsn((int) (byte) 0, "");
        aSMifierMethodVisitor46.visitInsn((int) (short) 0);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (short) 0);
        aSMifierMethodVisitor0.visitCode();
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        aSMifierMethodVisitor0.visitMaxs(100, (int) (short) -1);
        java.util.List list12 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label14, label15, label16, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "hi!", true);
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 100, 1);
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label26, label27, label28, "");
        org.mockito.asm.Attribute attribute31 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(annotationVisitor22);
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (short) 10);
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 10, label14);
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitLabel(label16);
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.Label label19 = null;
        org.mockito.asm.Label label20 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label18, label19, label20, "hi!");
        org.mockito.asm.Label label24 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (byte) 0, label24);
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label26, label27, label28, "hi!");
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor15.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierClassVisitor15.visitAnnotation("hi!", false);
        aSMifierClassVisitor15.visitSource("", "");
        aSMifierClassVisitor15.visitInnerClass("hi!", "hi!", "", 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor15.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor37 = annotationVisitor35.visitArray("hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor37);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((double) 1);
        java.io.PrintWriter printWriter9 = printWriter1.append((java.lang.CharSequence) "hi!");
        printWriter1.print(false);
        java.lang.CharSequence charSequence12 = null;
        java.io.PrintWriter printWriter13 = printWriter1.append(charSequence12);
        printWriter1.print((double) (-1));
        printWriter1.print('#');
        boolean boolean18 = printWriter1.checkError();
        printWriter1.println((double) 1);
        printWriter1.print("");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(printWriter13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 10, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitInsn((int) (byte) 100);
        org.mockito.asm.Label label13 = null;
        aSMifierMethodVisitor0.visitLabel(label13);
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 10, "");
        aSMifierMethodVisitor0.visitMaxs((int) (short) 0, (int) (short) 0);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitEnd();
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        boolean boolean25 = printWriter24.checkError();
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        java.io.PrintWriter printWriter28 = printWriter26.append((java.lang.CharSequence) "hi!");
        java.util.Locale locale29 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor31 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        org.mockito.asm.Label label34 = null;
        aSMifierMethodVisitor31.visitTryCatchBlock(label32, label33, label34, "");
        aSMifierMethodVisitor31.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj40 = null;
        aSMifierMethodVisitor31.visitLdcInsn(obj40);
        org.mockito.asm.Label label43 = null;
        aSMifierMethodVisitor31.visitJumpInsn((int) (short) 1, label43);
        aSMifierMethodVisitor31.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.Label[] labelArray51 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor31.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label50, labelArray51);
        java.io.PrintWriter printWriter53 = printWriter26.printf(locale29, "hi!", (java.lang.Object[]) labelArray51);
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter((java.io.Writer) printWriter26);
        java.lang.Object[] objArray56 = null;
        java.io.PrintWriter printWriter57 = printWriter54.format("", objArray56);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(labelArray51);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(printWriter57);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitIntInsn(0, (int) (short) 100);
        aSMifierMethodVisitor0.visitMaxs(100, (int) '4');
        org.mockito.asm.Label label13 = null;
        aSMifierMethodVisitor0.visitJumpInsn(10, label13);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor21 = aSMifierMethodVisitor0.visitParameterAnnotation(10, "hi!", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = annotationVisitor21.visitAnnotation("hi!", "hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter("hi!");
        java.util.Locale locale28 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray33 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray35 = null;
        aSMifierMethodVisitor30.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray33, (int) (short) 1, objArray35);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        aSMifierMethodVisitor38.visitTryCatchBlock(label39, label40, label41, "");
        aSMifierMethodVisitor38.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray47 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray49 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor38, strArray47, 1.0f };
        java.io.PrintWriter printWriter50 = printWriter27.printf(locale28, "", (java.lang.Object[]) strArray47);
        java.io.PrintWriter printWriter52 = printWriter50.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter54 = printWriter50.append((java.lang.CharSequence) "hi!");
        printWriter54.print("hi!");
        char[] charArray63 = new char[] { 'a', '#', ' ', ' ', '4', 'a' };
        printWriter54.println(charArray63);
        java.io.PrintWriter printWriter66 = new java.io.PrintWriter((java.io.Writer) printWriter54, true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor67 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        org.mockito.asm.Label label70 = null;
        aSMifierMethodVisitor67.visitTryCatchBlock(label68, label69, label70, "");
        aSMifierMethodVisitor67.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        aSMifierMethodVisitor67.visitMaxs(100, (int) (short) -1);
        aSMifierMethodVisitor67.visitIincInsn((int) (short) 0, (-1));
        aSMifierMethodVisitor67.visitInsn((int) '#');
        org.mockito.asm.AnnotationVisitor annotationVisitor84 = aSMifierMethodVisitor67.visitAnnotationDefault();
        org.mockito.asm.Label label85 = null;
        org.mockito.asm.Label label86 = null;
        org.mockito.asm.Label label87 = null;
        aSMifierMethodVisitor67.visitTryCatchBlock(label85, label86, label87, "hi!");
        printWriter66.print((java.lang.Object) "hi!");
        printWriter66.println("");
        annotationVisitor24.visit("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(annotationVisitor21);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(printWriter52);
        org.junit.Assert.assertNotNull(printWriter54);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "a#  4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "a#  4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[a, #,  ,  , 4, a]");
        org.junit.Assert.assertNotNull(annotationVisitor84);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (short) 10);
        java.util.List list13 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitMethodInsn((int) (byte) 1, "", "", "");
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor0.visitLineNumber(0, label21);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor27.visitFieldInsn((int) ' ', "hi!", "", "");
        aSMifierMethodVisitor27.visitEnd();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label48 = null;
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.Label[] labelArray50 = new org.mockito.asm.Label[] { label49 };
        aSMifierMethodVisitor37.visitTableSwitchInsn(0, (int) (byte) 10, label48, labelArray50);
        aSMifierMethodVisitor27.visitTableSwitchInsn((int) (byte) 100, 0, label36, labelArray50);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) '#', (int) (short) 1, label26, labelArray50);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(labelArray50);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        printWriter14.println((double) (-1.0f));
        printWriter14.println((int) '4');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor19 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter14);
        java.io.PrintWriter printWriter21 = printWriter14.append((java.lang.CharSequence) "hi!");
        printWriter21.flush();
        printWriter21.print((double) '#');
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter((java.io.Writer) printWriter21, false);
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        printWriter28.write((-1));
        printWriter28.flush();
        java.util.Locale locale32 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor34 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray37 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray39 = null;
        aSMifierMethodVisitor34.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray37, (int) (short) 1, objArray39);
        java.io.PrintWriter printWriter41 = printWriter28.printf(locale32, "", (java.lang.Object[]) strArray37);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter28);
        aSMifierClassVisitor42.visitEnd();
        aSMifierClassVisitor42.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor42.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor42.visitAnnotation("hi!", false);
        aSMifierClassVisitor42.visitEnd();
        aSMifierClassVisitor42.visitOuterClass("", "hi!", "");
        printWriter26.println((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("", "hi!");
        aSMifierClassVisitor15.visitEnd();
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        printWriter26.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter30 = printWriter26.append((java.lang.CharSequence) "");
        printWriter30.close();
        printWriter30.println((int) (short) 10);
        org.mockito.asm.FieldVisitor fieldVisitor34 = aSMifierClassVisitor15.visitField((int) (short) 0, "hi!", "hi!", "", (java.lang.Object) (short) 10);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierClassVisitor15.visitAnnotation("hi!", false);
        java.lang.String[] strArray45 = null;
        aSMifierClassVisitor15.visit((int) '#', (int) (byte) -1, "", "", "", strArray45);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(printWriter30);
        org.junit.Assert.assertNotNull(fieldVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor39);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label19 = null;
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label19, labelArray20);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        annotationVisitor24.visitEnd();
        annotationVisitor24.visitEnum("hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor32 = annotationVisitor24.visitAnnotation("", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = annotationVisitor24.visitAnnotation("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = annotationVisitor35.visitAnnotation("hi!", "hi!");
        org.junit.Assert.assertNotNull(labelArray20);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor32);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(annotationVisitor38);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn(0, "", "", "hi!");
        aSMifierMethodVisitor0.visitEnd();
        java.util.List list13 = aSMifierMethodVisitor0.text;
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("hi!");
        printWriter15.write((-1));
        printWriter15.flush();
        java.util.Locale locale19 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray24 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray26 = null;
        aSMifierMethodVisitor21.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray24, (int) (short) 1, objArray26);
        java.io.PrintWriter printWriter28 = printWriter15.printf(locale19, "", (java.lang.Object[]) strArray24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor29 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter15);
        aSMifierClassVisitor29.visitEnd();
        aSMifierClassVisitor29.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor29.visitEnd();
        aSMifierClassVisitor29.visitOuterClass("", "", "hi!");
        aSMifierClassVisitor29.visitEnd();
        aSMifierClassVisitor29.visitSource("", "");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierClassVisitor29);
        aSMifierMethodVisitor0.visitMaxs((-1), (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(printWriter28);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label17, label18, (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "", true);
        org.mockito.asm.Label label26 = null;
        aSMifierMethodVisitor0.visitJumpInsn(10, label26);
        aSMifierMethodVisitor0.visitInsn((int) (byte) 10);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        aSMifierMethodVisitor30.visitTryCatchBlock(label31, label32, label33, "");
        aSMifierMethodVisitor30.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj39 = null;
        aSMifierMethodVisitor30.visitLdcInsn(obj39);
        aSMifierMethodVisitor30.visitEnd();
        aSMifierMethodVisitor30.visitCode();
        java.util.List list43 = aSMifierMethodVisitor30.text;
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) list43);
        aSMifierMethodVisitor0.visitInsn(1);
        org.mockito.asm.AnnotationVisitor annotationVisitor50 = aSMifierMethodVisitor0.visitParameterAnnotation((int) 'a', "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor54 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 1, "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 0, "", true);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(annotationVisitor50);
        org.junit.Assert.assertNotNull(annotationVisitor54);
        org.junit.Assert.assertNotNull(annotationVisitor58);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label17, label18, (int) (byte) 1);
        org.mockito.asm.Label label22 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) 'a', label22);
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "hi!", label27, label28, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierMethodVisitor0.visitParameterAnnotation(1, "hi!", true);
        org.mockito.asm.Label label36 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) '4', label36);
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 0, "", "hi!", "");
        aSMifierMethodVisitor0.visitFieldInsn(100, "", "", "");
        java.util.List list48 = aSMifierMethodVisitor0.text;
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.print((-1));
        printWriter1.print((float) (short) 100);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor8 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor8.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierClassVisitor8.visitAnnotation("", false);
        aSMifierClassVisitor8.visitSource("hi!", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print("hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        java.util.List list33 = aSMifierClassVisitor28.getText();
        aSMifierClassVisitor28.visitSource("hi!", "");
        aSMifierClassVisitor28.visitSource("hi!", "");
        aSMifierClassVisitor28.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor28.visitInnerClass("", "hi!", "hi!", (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierClassVisitor28.visitAnnotation("", true);
        aSMifierClassVisitor28.visitSource("hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.println(false);
        java.io.PrintWriter printWriter7 = printWriter1.append('#');
        printWriter7.print((long) 0);
        printWriter7.println((int) (byte) -1);
        printWriter7.flush();
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter("hi!");
        printWriter15.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter19 = printWriter15.append((java.lang.CharSequence) "");
        printWriter15.print((double) 1);
        java.io.PrintWriter printWriter23 = printWriter15.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter25 = new java.io.PrintWriter((java.io.Writer) printWriter15, true);
        java.util.Locale locale26 = null;
        java.io.PrintWriter printWriter29 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter31 = printWriter29.append('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor32 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label33 = null;
        org.mockito.asm.Label label34 = null;
        org.mockito.asm.Label label35 = null;
        aSMifierMethodVisitor32.visitTryCatchBlock(label33, label34, label35, "");
        aSMifierMethodVisitor32.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj41 = null;
        aSMifierMethodVisitor32.visitLdcInsn(obj41);
        org.mockito.asm.Label label44 = null;
        aSMifierMethodVisitor32.visitJumpInsn((int) (short) 1, label44);
        aSMifierMethodVisitor32.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor32.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierMethodVisitor32.visitAnnotationDefault();
        java.io.PrintWriter printWriter56 = new java.io.PrintWriter("hi!");
        printWriter56.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor60 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label61 = null;
        org.mockito.asm.Label label62 = null;
        org.mockito.asm.Label label63 = null;
        aSMifierMethodVisitor60.visitTryCatchBlock(label61, label62, label63, "");
        aSMifierMethodVisitor60.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label71 = null;
        org.mockito.asm.Label label72 = null;
        org.mockito.asm.Label[] labelArray73 = new org.mockito.asm.Label[] { label72 };
        aSMifierMethodVisitor60.visitTableSwitchInsn(0, (int) (byte) 10, label71, labelArray73);
        java.io.PrintWriter printWriter75 = printWriter56.printf("hi!", (java.lang.Object[]) labelArray73);
        java.lang.String[] strArray77 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor32.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray73, 1, (java.lang.Object[]) strArray77);
        printWriter31.println((java.lang.Object) strArray77);
        java.io.PrintWriter printWriter80 = printWriter15.printf(locale26, "hi!", (java.lang.Object[]) strArray77);
        java.io.PrintWriter printWriter81 = printWriter7.format("", (java.lang.Object[]) strArray77);
        org.junit.Assert.assertNotNull(printWriter7);
        org.junit.Assert.assertNotNull(printWriter19);
        org.junit.Assert.assertNotNull(printWriter23);
        org.junit.Assert.assertNotNull(printWriter31);
        org.junit.Assert.assertNotNull(annotationVisitor52);
        org.junit.Assert.assertNotNull(labelArray73);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(printWriter80);
        org.junit.Assert.assertNotNull(printWriter81);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 0);
        org.mockito.asm.Label label6 = null;
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter("hi!");
        printWriter8.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label[] labelArray25 = new org.mockito.asm.Label[] { label24 };
        aSMifierMethodVisitor12.visitTableSwitchInsn(0, (int) (byte) 10, label23, labelArray25);
        java.io.PrintWriter printWriter27 = printWriter8.printf("hi!", (java.lang.Object[]) labelArray25);
        aSMifierMethodVisitor0.visitTableSwitchInsn(1, (int) (short) 10, label6, labelArray25);
        aSMifierMethodVisitor0.visitVarInsn(100, (int) ' ');
        org.mockito.asm.Label label35 = null;
        org.mockito.asm.Label label36 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "", "hi!", label35, label36, 1);
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor0.visitLabel(label39);
        org.mockito.asm.Label label44 = null;
        org.mockito.asm.Label label45 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "", "hi!", label44, label45, (int) (short) 100);
        org.mockito.asm.Label label48 = null;
        aSMifierMethodVisitor0.visitLabel(label48);
        org.junit.Assert.assertNotNull(labelArray25);
        org.junit.Assert.assertNotNull(printWriter27);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 10, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitMaxs((int) (byte) 10, 0);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitIincInsn((int) 'a', (int) (short) 0);
        org.mockito.asm.Label label20 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) -1, label20);
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = annotationVisitor22.visitArray("");
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor24);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print("hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor34 = aSMifierClassVisitor28.visitAnnotation("hi!", true);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor39.visitTryCatchBlock(label40, label41, label42, "");
        aSMifierMethodVisitor39.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj48 = null;
        aSMifierMethodVisitor39.visitLdcInsn(obj48);
        aSMifierMethodVisitor39.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.Label label57 = null;
        aSMifierMethodVisitor39.visitLocalVariable("hi!", "hi!", "hi!", label56, label57, (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor63 = aSMifierMethodVisitor39.visitParameterAnnotation(0, "", true);
        org.mockito.asm.FieldVisitor fieldVisitor64 = aSMifierClassVisitor28.visitField((int) ' ', "hi!", "hi!", "", (java.lang.Object) aSMifierMethodVisitor39);
        java.lang.String[] strArray70 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor28.visit((int) (byte) 1, 100, "hi!", "hi!", "hi!", strArray70);
        org.mockito.asm.AnnotationVisitor annotationVisitor74 = aSMifierClassVisitor28.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = aSMifierClassVisitor28.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter79 = new java.io.PrintWriter("hi!");
        printWriter79.print((java.lang.Object) (short) -1);
        printWriter79.flush();
        printWriter79.println(true);
        printWriter79.println();
        aSMifierClassVisitor28.print(printWriter79);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(annotationVisitor34);
        org.junit.Assert.assertNotNull(annotationVisitor63);
        org.junit.Assert.assertNotNull(fieldVisitor64);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(annotationVisitor74);
        org.junit.Assert.assertNotNull(annotationVisitor77);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.close();
        printWriter1.print((int) '#');
        printWriter1.println(true);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((double) 1);
        java.io.PrintWriter printWriter9 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter9, false);
        printWriter11.println((long) (byte) 100);
        java.io.PrintWriter printWriter15 = new java.io.PrintWriter((java.io.Writer) printWriter11, false);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor16 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter11);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter9);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter5.close();
        printWriter5.println((int) (short) 10);
        printWriter5.print((long) (-1));
        printWriter5.print((int) (byte) 0);
        printWriter5.print((double) 1.0f);
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        printWriter16.print(false);
        java.io.PrintWriter printWriter20 = printWriter16.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter22 = new java.io.PrintWriter((java.io.Writer) printWriter20, true);
        java.io.PrintWriter printWriter23 = new java.io.PrintWriter((java.io.Writer) printWriter20);
        printWriter23.write("");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter("hi!");
        java.util.Locale locale28 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor30 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray33 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray35 = null;
        aSMifierMethodVisitor30.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray33, (int) (short) 1, objArray35);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor38 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        aSMifierMethodVisitor38.visitTryCatchBlock(label39, label40, label41, "");
        aSMifierMethodVisitor38.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray47 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray49 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor38, strArray47, 1.0f };
        java.io.PrintWriter printWriter50 = printWriter27.printf(locale28, "", (java.lang.Object[]) strArray47);
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter((java.io.Writer) printWriter50, true);
        printWriter23.println((java.lang.Object) printWriter52);
        java.io.PrintWriter printWriter55 = printWriter23.append(' ');
        java.io.PrintWriter printWriter57 = printWriter55.append('#');
        boolean boolean58 = printWriter55.checkError();
        printWriter55.println(0);
        printWriter5.print((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(printWriter55);
        org.junit.Assert.assertNotNull(printWriter57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = printWriter24.append((java.lang.CharSequence) "");
        printWriter24.write((int) (byte) 0);
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("hi!");
        java.util.Locale locale31 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor33 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray36 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray38 = null;
        aSMifierMethodVisitor33.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray36, (int) (short) 1, objArray38);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label42 = null;
        org.mockito.asm.Label label43 = null;
        org.mockito.asm.Label label44 = null;
        aSMifierMethodVisitor41.visitTryCatchBlock(label42, label43, label44, "");
        aSMifierMethodVisitor41.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray52 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor41, strArray50, 1.0f };
        java.io.PrintWriter printWriter53 = printWriter30.printf(locale31, "", (java.lang.Object[]) strArray50);
        char[] charArray60 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter53.println(charArray60);
        printWriter24.print(charArray60);
        printWriter24.println(100.0f);
        printWriter24.write((int) 'a');
        java.io.PrintWriter printWriter68 = printWriter24.append('4');
        printWriter24.print(false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter68);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((int) (byte) -1);
        printWriter1.print("hi!");
        java.lang.Object obj10 = null;
        printWriter1.print(obj10);
        printWriter1.print(false);
        java.util.Locale locale14 = null;
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("hi!");
        printWriter17.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor21 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.Label label24 = null;
        aSMifierMethodVisitor21.visitTryCatchBlock(label22, label23, label24, "");
        aSMifierMethodVisitor21.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        org.mockito.asm.Label[] labelArray34 = new org.mockito.asm.Label[] { label33 };
        aSMifierMethodVisitor21.visitTableSwitchInsn(0, (int) (byte) 10, label32, labelArray34);
        java.io.PrintWriter printWriter36 = printWriter17.printf("hi!", (java.lang.Object[]) labelArray34);
        java.io.PrintWriter printWriter38 = printWriter17.append((java.lang.CharSequence) "");
        printWriter38.close();
        java.io.PrintWriter printWriter41 = printWriter38.append(' ');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor42 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter38);
        java.io.PrintWriter printWriter45 = new java.io.PrintWriter("hi!");
        printWriter45.write((-1));
        printWriter45.flush();
        java.util.Locale locale49 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray54 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray56 = null;
        aSMifierMethodVisitor51.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray54, (int) (short) 1, objArray56);
        java.io.PrintWriter printWriter58 = printWriter45.printf(locale49, "", (java.lang.Object[]) strArray54);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor59 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        aSMifierClassVisitor59.visitEnd();
        aSMifierClassVisitor59.visitSource("", "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor68 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label69 = null;
        org.mockito.asm.Label label70 = null;
        org.mockito.asm.Label label71 = null;
        aSMifierMethodVisitor68.visitTryCatchBlock(label69, label70, label71, "");
        org.mockito.asm.FieldVisitor fieldVisitor74 = aSMifierClassVisitor59.visitField((int) (short) -1, "hi!", "hi!", "", (java.lang.Object) label71);
        aSMifierClassVisitor59.visitSource("hi!", "");
        aSMifierClassVisitor59.visitInnerClass("", "", "", (int) '4');
        java.lang.String[] strArray87 = org.mockito.asm.util.AbstractVisitor.TYPES;
        org.mockito.asm.MethodVisitor methodVisitor88 = aSMifierClassVisitor59.visitMethod((int) (byte) -1, "", "hi!", "", strArray87);
        java.io.PrintWriter printWriter89 = printWriter38.printf("hi!", (java.lang.Object[]) strArray87);
        java.io.PrintWriter printWriter90 = printWriter1.format(locale14, "", (java.lang.Object[]) strArray87);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(labelArray34);
        org.junit.Assert.assertNotNull(printWriter36);
        org.junit.Assert.assertNotNull(printWriter38);
        org.junit.Assert.assertNotNull(printWriter41);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(printWriter58);
        org.junit.Assert.assertNotNull(fieldVisitor74);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(methodVisitor88);
        org.junit.Assert.assertNotNull(printWriter89);
        org.junit.Assert.assertNotNull(printWriter90);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter3 = printWriter1.append('a');
        printWriter1.print("hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        java.io.PrintWriter printWriter9 = printWriter1.append('a');
        org.junit.Assert.assertNotNull(printWriter3);
        org.junit.Assert.assertNotNull(printWriter9);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.println(false);
        printWriter1.print(0L);
        printWriter1.close();
        printWriter1.println();
        printWriter1.print((float) (-1));
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter1.write("", (int) (byte) 10, (int) '4');
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        printWriter8.write("");
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("hi!");
        java.util.Locale locale13 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray18 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray20 = null;
        aSMifierMethodVisitor15.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray18, (int) (short) 1, objArray20);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor23 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        aSMifierMethodVisitor23.visitTryCatchBlock(label24, label25, label26, "");
        aSMifierMethodVisitor23.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray34 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor23, strArray32, 1.0f };
        java.io.PrintWriter printWriter35 = printWriter12.printf(locale13, "", (java.lang.Object[]) strArray32);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter((java.io.Writer) printWriter35, true);
        printWriter8.println((java.lang.Object) printWriter37);
        java.io.PrintWriter printWriter40 = printWriter8.append(' ');
        java.io.PrintWriter printWriter42 = printWriter40.append('#');
        printWriter42.write("hi!");
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter("hi!");
        java.util.Locale locale47 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor49 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray52 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray54 = null;
        aSMifierMethodVisitor49.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray52, (int) (short) 1, objArray54);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor57 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label58 = null;
        org.mockito.asm.Label label59 = null;
        org.mockito.asm.Label label60 = null;
        aSMifierMethodVisitor57.visitTryCatchBlock(label58, label59, label60, "");
        aSMifierMethodVisitor57.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray66 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray68 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor57, strArray66, 1.0f };
        java.io.PrintWriter printWriter69 = printWriter46.printf(locale47, "", (java.lang.Object[]) strArray66);
        java.io.PrintWriter printWriter71 = printWriter69.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter73 = printWriter69.append(' ');
        printWriter73.print(1);
        printWriter42.println((java.lang.Object) printWriter73);
        printWriter42.write((int) (byte) 100);
        printWriter42.println((long) (byte) 1);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(printWriter40);
        org.junit.Assert.assertNotNull(printWriter42);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(printWriter69);
        org.junit.Assert.assertNotNull(printWriter71);
        org.junit.Assert.assertNotNull(printWriter73);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((int) (byte) -1);
        printWriter1.print((double) (byte) 1);
        printWriter1.close();
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        boolean boolean12 = printWriter1.checkError();
        printWriter1.println((long) (byte) 100);
        printWriter1.println(false);
        java.lang.Object obj17 = null;
        printWriter1.println(obj17);
        java.io.PrintWriter printWriter21 = new java.io.PrintWriter("hi!");
        printWriter21.write((-1));
        printWriter21.flush();
        java.util.Locale locale25 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray30 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray32 = null;
        aSMifierMethodVisitor27.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray30, (int) (short) 1, objArray32);
        java.io.PrintWriter printWriter34 = printWriter21.printf(locale25, "", (java.lang.Object[]) strArray30);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor35 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter21);
        aSMifierClassVisitor35.visitEnd();
        aSMifierClassVisitor35.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor35.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor44 = aSMifierClassVisitor35.visitAnnotation("hi!", false);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        printWriter51.print((java.lang.Object) (short) -1);
        java.lang.String[] strArray55 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter56 = printWriter51.format("", (java.lang.Object[]) strArray55);
        aSMifierClassVisitor35.visit((int) (byte) -1, (int) (short) 0, "", "", "hi!", strArray55);
        java.io.PrintWriter printWriter58 = printWriter1.format("", (java.lang.Object[]) strArray55);
        printWriter58.close();
        printWriter58.print(true);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(printWriter34);
        org.junit.Assert.assertNotNull(annotationVisitor44);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(printWriter56);
        org.junit.Assert.assertNotNull(printWriter58);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        java.util.Locale locale27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray34 = null;
        aSMifierMethodVisitor29.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray32, (int) (short) 1, objArray34);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray46 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray48 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor37, strArray46, 1.0f };
        java.io.PrintWriter printWriter49 = printWriter26.printf(locale27, "", (java.lang.Object[]) strArray46);
        char[] charArray56 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter49.println(charArray56);
        printWriter24.print(charArray56);
        printWriter24.print(true);
        java.io.PrintWriter printWriter62 = printWriter24.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter64 = printWriter24.append((java.lang.CharSequence) "");
        printWriter64.println();
        java.lang.CharSequence charSequence66 = null;
        java.io.PrintWriter printWriter67 = printWriter64.append(charSequence66);
        java.io.PrintWriter printWriter69 = printWriter64.append('#');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(printWriter69);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) (short) 100);
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) (-1));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor15);
        java.util.List list21 = aSMifierMethodVisitor15.getText();
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor15.visitLineNumber((int) (byte) 10, label23);
        aSMifierMethodVisitor15.visitCode();
        aSMifierMethodVisitor15.visitMethodInsn((int) (byte) 0, "hi!", "hi!", "hi!");
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor15.visitLineNumber(100, label32);
        aSMifierMethodVisitor15.visitTypeInsn((int) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label17, label18, (int) (byte) 1);
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label21, label22, label23, "");
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "", label29, label30, (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor0.visitParameterAnnotation(0, "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) -1, "hi!", false);
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor0.visitLineNumber(0, label42);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierMethodVisitor0.visitParameterAnnotation((int) 'a', "", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor48 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor0.visitAnnotation("", true);
        aSMifierMethodVisitor0.visitInsn((int) (short) 10);
        org.mockito.asm.Label label55 = null;
        aSMifierMethodVisitor0.visitJumpInsn(0, label55);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(annotationVisitor48);
        org.junit.Assert.assertNotNull(annotationVisitor51);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitInsn((int) ' ');
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor16 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.Label label19 = null;
        aSMifierMethodVisitor16.visitTryCatchBlock(label17, label18, label19, "");
        aSMifierMethodVisitor16.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj25 = null;
        aSMifierMethodVisitor16.visitLdcInsn(obj25);
        org.mockito.asm.Label label27 = null;
        int[] intArray34 = new int[] { ' ', 'a', 100, (byte) 10, '4', (byte) -1 };
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label46 = null;
        org.mockito.asm.Label label47 = null;
        org.mockito.asm.Label[] labelArray48 = new org.mockito.asm.Label[] { label47 };
        aSMifierMethodVisitor35.visitTableSwitchInsn(0, (int) (byte) 10, label46, labelArray48);
        aSMifierMethodVisitor16.visitLookupSwitchInsn(label27, intArray34, labelArray48);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) '4', (int) '#', label15, labelArray48);
        org.mockito.asm.Label label55 = null;
        org.mockito.asm.Label label56 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "", label55, label56, (int) (short) 0);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor62 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.Label label66 = null;
        org.mockito.asm.Label label67 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "", label66, label67, 0);
        aSMifierMethodVisitor0.visitMethodInsn(1, "", "", "");
        org.mockito.asm.Label label75 = null;
        org.mockito.asm.Label label76 = null;
        org.mockito.asm.Label label77 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label75, label76, label77, "");
        org.mockito.asm.Label label81 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 1, label81);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[32, 97, 100, 10, 52, -1]");
        org.junit.Assert.assertNotNull(labelArray48);
        org.junit.Assert.assertNotNull(annotationVisitor62);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 100, "hi!");
        aSMifierMethodVisitor0.visitInsn(100);
        aSMifierMethodVisitor0.visitCode();
        java.util.List list20 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "", "", label24, label25, (int) (short) 1);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (byte) 10, label30);
        org.mockito.asm.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 1, "hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 10, "", true);
        java.lang.Object obj27 = null;
        annotationVisitor25.visit("hi!", obj27);
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor16);
        org.junit.Assert.assertNotNull(annotationVisitor25);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitFieldInsn(100, "hi!", "", "hi!");
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitInsn(0);
        aSMifierMethodVisitor0.visitFieldInsn(100, "", "", "hi!");
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) ' ', label28);
        org.mockito.asm.Label label31 = null;
        aSMifierMethodVisitor0.visitLineNumber(1, label31);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Attribute attribute34 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor5 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label6 = null;
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = null;
        aSMifierMethodVisitor5.visitTryCatchBlock(label6, label7, label8, "");
        aSMifierMethodVisitor5.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label17 };
        aSMifierMethodVisitor5.visitTableSwitchInsn(0, (int) (byte) 10, label16, labelArray18);
        java.io.PrintWriter printWriter20 = printWriter1.printf("hi!", (java.lang.Object[]) labelArray18);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter((java.io.Writer) printWriter1, false);
        printWriter24.println((double) (byte) 1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor27.visitTryCatchBlock(label28, label29, label30, "");
        aSMifierMethodVisitor27.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj36 = null;
        aSMifierMethodVisitor27.visitLdcInsn(obj36);
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor27.visitJumpInsn((int) (short) 1, label39);
        aSMifierMethodVisitor27.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label46 = null;
        org.mockito.asm.Label[] labelArray47 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor27.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label46, labelArray47);
        org.mockito.asm.AnnotationVisitor annotationVisitor51 = aSMifierMethodVisitor27.visitAnnotation("hi!", true);
        aSMifierMethodVisitor27.visitMaxs((int) (byte) 100, (int) (byte) 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor58 = aSMifierMethodVisitor27.visitParameterAnnotation(0, "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor61 = aSMifierMethodVisitor27.visitAnnotation("hi!", false);
        aSMifierMethodVisitor27.visitMethodInsn(0, "", "hi!", "hi!");
        printWriter24.print((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            printWriter24.write("hi!", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray18);
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(printWriter22);
        org.junit.Assert.assertNotNull(labelArray47);
        org.junit.Assert.assertNotNull(annotationVisitor51);
        org.junit.Assert.assertNotNull(annotationVisitor58);
        org.junit.Assert.assertNotNull(annotationVisitor61);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print("hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor28.visitAnnotation("", true);
        aSMifierClassVisitor28.visitInnerClass("hi!", "", "hi!", (int) (byte) 100);
        aSMifierClassVisitor28.visitInnerClass("hi!", "hi!", "hi!", 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(annotationVisitor35);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.lang.String[] strArray5 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter6 = printWriter1.format("", (java.lang.Object[]) strArray5);
        java.util.Locale locale7 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor9 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label10 = null;
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor9.visitTryCatchBlock(label10, label11, label12, "");
        aSMifierMethodVisitor9.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj18 = null;
        aSMifierMethodVisitor9.visitLdcInsn(obj18);
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor9.visitJumpInsn((int) (short) 1, label21);
        aSMifierMethodVisitor9.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor9.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor29 = aSMifierMethodVisitor9.visitAnnotationDefault();
        aSMifierMethodVisitor9.visitIntInsn(0, (int) '4');
        org.mockito.asm.Label label33 = null;
        aSMifierMethodVisitor9.visitLabel(label33);
        java.util.List list35 = aSMifierMethodVisitor9.getText();
        aSMifierMethodVisitor9.visitMultiANewArrayInsn("", (int) (short) 0);
        java.io.PrintWriter printWriter42 = new java.io.PrintWriter("hi!");
        printWriter42.write((-1));
        printWriter42.flush();
        java.util.Locale locale46 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor48 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray51 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray53 = null;
        aSMifierMethodVisitor48.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray51, (int) (short) 1, objArray53);
        java.io.PrintWriter printWriter55 = printWriter42.printf(locale46, "", (java.lang.Object[]) strArray51);
        java.lang.Object[] objArray57 = null;
        aSMifierMethodVisitor9.visitFrame((int) (short) 1, 10, (java.lang.Object[]) strArray51, (int) (short) -1, objArray57);
        java.io.PrintWriter printWriter59 = printWriter1.printf(locale7, "", objArray57);
        printWriter59.print("");
        printWriter59.print((double) (-1L));
        printWriter59.print("");
        printWriter59.write("hi!");
        printWriter59.print('4');
        printWriter59.println("hi!");
        java.lang.CharSequence charSequence72 = null;
        java.io.PrintWriter printWriter73 = printWriter59.append(charSequence72);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(printWriter6);
        org.junit.Assert.assertNotNull(annotationVisitor29);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(printWriter55);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(printWriter73);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label17, label18, (int) (byte) 1);
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label21, label22, label23, "");
        aSMifierMethodVisitor0.visitCode();
        java.io.PrintWriter printWriter28 = new java.io.PrintWriter("hi!");
        printWriter28.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter32 = printWriter28.append((java.lang.CharSequence) "");
        printWriter28.print((int) (byte) -1);
        printWriter28.print((double) (byte) 1);
        printWriter28.close();
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter((java.io.Writer) printWriter28);
        printWriter38.println();
        printWriter38.println((double) (byte) 100);
        printWriter38.print((long) (byte) 100);
        printWriter38.println();
        printWriter38.print((int) 'a');
        java.io.PrintWriter printWriter48 = new java.io.PrintWriter((java.io.Writer) printWriter38, true);
        printWriter48.println(0.0d);
        aSMifierMethodVisitor0.print(printWriter48);
        org.mockito.asm.Label label52 = null;
        aSMifierMethodVisitor0.visitLabel(label52);
        org.junit.Assert.assertNotNull(printWriter32);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor5 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label6 = null;
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = null;
        aSMifierMethodVisitor5.visitTryCatchBlock(label6, label7, label8, "");
        aSMifierMethodVisitor5.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label17 };
        aSMifierMethodVisitor5.visitTableSwitchInsn(0, (int) (byte) 10, label16, labelArray18);
        java.io.PrintWriter printWriter20 = printWriter1.printf("hi!", (java.lang.Object[]) labelArray18);
        java.io.PrintWriter printWriter22 = printWriter1.append((java.lang.CharSequence) "");
        printWriter22.println(1);
        printWriter22.println((double) (byte) 100);
        org.junit.Assert.assertNotNull(labelArray18);
        org.junit.Assert.assertNotNull(printWriter20);
        org.junit.Assert.assertNotNull(printWriter22);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        printWriter7.print(0.0d);
        java.util.Locale locale10 = null;
        java.io.PrintWriter printWriter13 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter15 = printWriter13.append('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor16 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        org.mockito.asm.Label label19 = null;
        aSMifierMethodVisitor16.visitTryCatchBlock(label17, label18, label19, "");
        aSMifierMethodVisitor16.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj25 = null;
        aSMifierMethodVisitor16.visitLdcInsn(obj25);
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor16.visitJumpInsn((int) (short) 1, label28);
        aSMifierMethodVisitor16.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor16.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor36 = aSMifierMethodVisitor16.visitAnnotationDefault();
        java.io.PrintWriter printWriter40 = new java.io.PrintWriter("hi!");
        printWriter40.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor44 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label45 = null;
        org.mockito.asm.Label label46 = null;
        org.mockito.asm.Label label47 = null;
        aSMifierMethodVisitor44.visitTryCatchBlock(label45, label46, label47, "");
        aSMifierMethodVisitor44.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label55 = null;
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.Label[] labelArray57 = new org.mockito.asm.Label[] { label56 };
        aSMifierMethodVisitor44.visitTableSwitchInsn(0, (int) (byte) 10, label55, labelArray57);
        java.io.PrintWriter printWriter59 = printWriter40.printf("hi!", (java.lang.Object[]) labelArray57);
        java.lang.String[] strArray61 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor16.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray57, 1, (java.lang.Object[]) strArray61);
        printWriter15.println((java.lang.Object) strArray61);
        java.io.PrintWriter printWriter64 = printWriter7.printf(locale10, "hi!", (java.lang.Object[]) strArray61);
        java.io.PrintWriter printWriter66 = printWriter7.append('#');
        java.io.PrintWriter printWriter67 = new java.io.PrintWriter((java.io.Writer) printWriter66);
        printWriter66.println((int) '4');
        printWriter66.println("");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor72 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label73 = null;
        org.mockito.asm.Label label74 = null;
        org.mockito.asm.Label label75 = null;
        aSMifierMethodVisitor72.visitTryCatchBlock(label73, label74, label75, "");
        aSMifierMethodVisitor72.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj81 = null;
        aSMifierMethodVisitor72.visitLdcInsn(obj81);
        java.io.PrintWriter printWriter84 = new java.io.PrintWriter("hi!");
        printWriter84.print((java.lang.Object) (short) -1);
        aSMifierMethodVisitor72.print(printWriter84);
        java.util.List list88 = aSMifierMethodVisitor72.text;
        org.mockito.asm.Label label90 = null;
        aSMifierMethodVisitor72.visitLineNumber((int) '4', label90);
        aSMifierMethodVisitor72.visitTypeInsn((int) (byte) 10, "hi!");
        printWriter66.print((java.lang.Object) "hi!");
        printWriter66.flush();
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(annotationVisitor36);
        org.junit.Assert.assertNotNull(labelArray57);
        org.junit.Assert.assertNotNull(printWriter59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(printWriter64);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(list88);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitFieldInsn(100, "hi!", "", "hi!");
        aSMifierMethodVisitor0.visitInsn((int) 'a');
        java.util.List list21 = aSMifierMethodVisitor0.text;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitJumpInsn(0, label23);
        java.util.List list25 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMethodInsn(10, "", "hi!", "");
        aSMifierMethodVisitor0.visitInsn((int) (byte) 0);
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitOuterClass("", "hi!", "hi!");
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("hi!", "hi!");
        aSMifierClassVisitor15.visitSource("", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = aSMifierClassVisitor15.visitAnnotation("", true);
        aSMifierClassVisitor15.visitInnerClass("", "", "", 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor15 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) (short) 100);
        aSMifierMethodVisitor15.visitLdcInsn((java.lang.Object) (-1));
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor15);
        org.mockito.asm.Label label22 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 10, label22);
        org.mockito.asm.Label label24 = null;
        aSMifierMethodVisitor0.visitLabel(label24);
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.Label label29 = null;
        aSMifierMethodVisitor0.visitLabel(label29);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(annotationVisitor28);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label18);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        java.util.Locale locale25 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray30 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray32 = null;
        aSMifierMethodVisitor27.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray30, (int) (short) 1, objArray32);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray46 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor35, strArray44, 1.0f };
        java.io.PrintWriter printWriter47 = printWriter24.printf(locale25, "", (java.lang.Object[]) strArray44);
        char[] charArray54 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter47.println(charArray54);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter47, true);
        boolean boolean58 = printWriter57.checkError();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter57);
        printWriter57.write("hi!");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter57);
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 1, 0);
        aSMifierMethodVisitor0.visitFieldInsn(0, "hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor73 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        aSMifierMethodVisitor0.visitInsn(100);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(annotationVisitor73);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn((int) ' ', "hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitParameterAnnotation(100, "", true);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMethodInsn(100, "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print('#');
        printWriter24.print((int) ' ');
        java.lang.Object obj29 = null;
        printWriter24.print(obj29);
        printWriter24.write("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor33 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter24);
        aSMifierClassVisitor33.visitSource("", "hi!");
        java.util.List list37 = aSMifierClassVisitor33.text;
        aSMifierClassVisitor33.visitInnerClass("", "hi!", "", 1);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = aSMifierClassVisitor33.visitAnnotation("", false);
        aSMifierClassVisitor33.visitEnd();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotation("hi!", true);
        java.util.List list14 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitEnd();
        java.util.List list16 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitIntInsn((int) (short) 10, (int) (short) 1);
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.Label label24 = null;
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label23, label24, label25, "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(annotationVisitor19);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label18);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 1);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        java.util.Locale locale25 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray30 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray32 = null;
        aSMifierMethodVisitor27.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray30, (int) (short) 1, objArray32);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray44 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray46 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor35, strArray44, 1.0f };
        java.io.PrintWriter printWriter47 = printWriter24.printf(locale25, "", (java.lang.Object[]) strArray44);
        char[] charArray54 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter47.println(charArray54);
        java.io.PrintWriter printWriter57 = new java.io.PrintWriter((java.io.Writer) printWriter47, true);
        boolean boolean58 = printWriter57.checkError();
        java.io.PrintWriter printWriter59 = new java.io.PrintWriter((java.io.Writer) printWriter57);
        printWriter57.write("hi!");
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) printWriter57);
        java.lang.Object[] objArray64 = null;
        java.io.PrintWriter printWriter65 = printWriter57.format("", objArray64);
        printWriter65.close();
        printWriter65.println((double) 10);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(printWriter47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(printWriter65);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = printWriter24.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter28 = printWriter24.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter30 = new java.io.PrintWriter("hi!");
        java.util.Locale locale31 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor33 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray36 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray38 = null;
        aSMifierMethodVisitor33.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray36, (int) (short) 1, objArray38);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor41 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label42 = null;
        org.mockito.asm.Label label43 = null;
        org.mockito.asm.Label label44 = null;
        aSMifierMethodVisitor41.visitTryCatchBlock(label42, label43, label44, "");
        aSMifierMethodVisitor41.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray50 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray52 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor41, strArray50, 1.0f };
        java.io.PrintWriter printWriter53 = printWriter30.printf(locale31, "", (java.lang.Object[]) strArray50);
        char[] charArray60 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter53.println(charArray60);
        printWriter28.print(charArray60);
        boolean boolean63 = printWriter28.checkError();
        printWriter28.println((int) (byte) 0);
        printWriter28.println(0L);
        java.io.PrintWriter printWriter69 = new java.io.PrintWriter((java.io.Writer) printWriter28, true);
        printWriter69.close();
        java.io.PrintWriter printWriter72 = new java.io.PrintWriter((java.io.Writer) printWriter69, false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter26);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitInsn((int) (byte) 1);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "", "", label27, label28, (int) (byte) 10);
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label32);
        aSMifierMethodVisitor0.visitTypeInsn(0, "");
        java.lang.Object obj37 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj37);
        org.mockito.asm.Label label42 = null;
        org.mockito.asm.Label label43 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "hi!", label42, label43, (int) (short) 100);
        org.mockito.asm.Label label47 = null;
        aSMifierMethodVisitor0.visitLineNumber(100, label47);
        org.mockito.asm.Label label49 = null;
        aSMifierMethodVisitor0.visitLabel(label49);
        org.mockito.asm.Label label51 = null;
        org.mockito.asm.Label label52 = null;
        org.mockito.asm.Label label53 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label51, label52, label53, "");
        org.junit.Assert.assertNotNull(annotationVisitor20);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print('#');
        printWriter24.println(false);
        printWriter24.println();
        printWriter24.write("");
        printWriter24.print(false);
        java.lang.CharSequence charSequence34 = null;
        java.io.PrintWriter printWriter37 = printWriter24.append(charSequence34, (int) (short) 0, (int) (byte) 1);
        java.io.PrintWriter printWriter39 = printWriter37.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(printWriter37);
        org.junit.Assert.assertNotNull(printWriter39);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 1);
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor0.visitLabel(label17);
        org.mockito.asm.Label label20 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) ' ', label20);
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) -1, label23);
        org.mockito.asm.Label label25 = null;
        aSMifierMethodVisitor0.visitLabel(label25);
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label27, label28, label29, "hi!");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        java.util.Locale locale27 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray32 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray34 = null;
        aSMifierMethodVisitor29.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray32, (int) (short) 1, objArray34);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor37 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        org.mockito.asm.Label label40 = null;
        aSMifierMethodVisitor37.visitTryCatchBlock(label38, label39, label40, "");
        aSMifierMethodVisitor37.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray46 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray48 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor37, strArray46, 1.0f };
        java.io.PrintWriter printWriter49 = printWriter26.printf(locale27, "", (java.lang.Object[]) strArray46);
        char[] charArray56 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter49.println(charArray56);
        printWriter24.print(charArray56);
        printWriter24.print(true);
        java.io.PrintWriter printWriter62 = printWriter24.append((java.lang.CharSequence) "");
        java.util.Locale locale63 = null;
        org.mockito.asm.Attribute[] attributeArray65 = org.mockito.asm.util.AbstractVisitor.getDefaultAttributes();
        java.io.PrintWriter printWriter66 = printWriter62.format(locale63, "", (java.lang.Object[]) attributeArray65);
        printWriter62.print(false);
        printWriter62.close();
        printWriter62.write("");
        printWriter62.println((-1.0f));
        java.lang.CharSequence charSequence74 = null;
        java.io.PrintWriter printWriter75 = printWriter62.append(charSequence74);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(printWriter49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(attributeArray65);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(printWriter75);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitMaxs((int) (short) -1, (int) (short) 100);
        aSMifierMethodVisitor0.visitMaxs((int) 'a', (int) ' ');
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label21);
        java.io.PrintWriter printWriter24 = new java.io.PrintWriter("hi!");
        printWriter24.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter28 = printWriter24.append((java.lang.CharSequence) "");
        printWriter24.print((double) 1);
        java.io.PrintWriter printWriter32 = printWriter24.append((java.lang.CharSequence) "hi!");
        printWriter24.print(false);
        java.lang.CharSequence charSequence35 = null;
        java.io.PrintWriter printWriter36 = printWriter24.append(charSequence35);
        printWriter24.print(' ');
        printWriter24.print((int) (byte) -1);
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(printWriter32);
        org.junit.Assert.assertNotNull(printWriter36);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print("hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitInnerClass("", "hi!", "hi!", (int) (byte) 1);
        aSMifierClassVisitor28.visitEnd();
        aSMifierClassVisitor28.visitOuterClass("", "hi!", "");
        aSMifierClassVisitor28.visitInnerClass("", "", "hi!", (int) (byte) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor48 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label49 = null;
        org.mockito.asm.Label label50 = null;
        org.mockito.asm.Label label51 = null;
        aSMifierMethodVisitor48.visitTryCatchBlock(label49, label50, label51, "");
        aSMifierMethodVisitor48.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj57 = null;
        aSMifierMethodVisitor48.visitLdcInsn(obj57);
        aSMifierMethodVisitor48.visitLdcInsn((java.lang.Object) (short) 10);
        java.util.List list61 = aSMifierMethodVisitor48.getText();
        aSMifierMethodVisitor48.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor65 = aSMifierMethodVisitor48.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor67 = annotationVisitor65.visitArray("");
        annotationVisitor67.visitEnum("", "", "");
        org.mockito.asm.FieldVisitor fieldVisitor72 = aSMifierClassVisitor28.visitField((int) 'a', "hi!", "hi!", "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(annotationVisitor65);
        org.junit.Assert.assertNotNull(annotationVisitor67);
        org.junit.Assert.assertNotNull(fieldVisitor72);
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.println();
        printWriter24.print('a');
        printWriter24.write(0);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor31 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label32 = null;
        org.mockito.asm.Label label33 = null;
        org.mockito.asm.Label label34 = null;
        aSMifierMethodVisitor31.visitTryCatchBlock(label32, label33, label34, "");
        aSMifierMethodVisitor31.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj40 = null;
        aSMifierMethodVisitor31.visitLdcInsn(obj40);
        aSMifierMethodVisitor31.visitTypeInsn(0, "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor45 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label46 = null;
        org.mockito.asm.Label label47 = null;
        org.mockito.asm.Label label48 = null;
        aSMifierMethodVisitor45.visitTryCatchBlock(label46, label47, label48, "");
        aSMifierMethodVisitor45.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj54 = null;
        aSMifierMethodVisitor45.visitLdcInsn(obj54);
        aSMifierMethodVisitor45.visitEnd();
        aSMifierMethodVisitor31.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor45);
        org.mockito.asm.Label label60 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor61 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label62 = null;
        org.mockito.asm.Label label63 = null;
        org.mockito.asm.Label label64 = null;
        aSMifierMethodVisitor61.visitTryCatchBlock(label62, label63, label64, "");
        aSMifierMethodVisitor61.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj70 = null;
        aSMifierMethodVisitor61.visitLdcInsn(obj70);
        org.mockito.asm.Label label73 = null;
        aSMifierMethodVisitor61.visitJumpInsn((int) (short) 1, label73);
        aSMifierMethodVisitor61.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label80 = null;
        org.mockito.asm.Label[] labelArray81 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor61.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label80, labelArray81);
        aSMifierMethodVisitor31.visitTableSwitchInsn((int) (short) 100, (int) (byte) 10, label60, labelArray81);
        java.io.PrintWriter printWriter84 = printWriter24.printf("", (java.lang.Object[]) labelArray81);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(labelArray81);
        org.junit.Assert.assertNotNull(printWriter84);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("", "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor24.visitTryCatchBlock(label25, label26, label27, "");
        org.mockito.asm.FieldVisitor fieldVisitor30 = aSMifierClassVisitor15.visitField((int) (short) -1, "hi!", "hi!", "", (java.lang.Object) label27);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor35 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label36 = null;
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor35.visitTryCatchBlock(label36, label37, label38, "");
        aSMifierMethodVisitor35.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj44 = null;
        aSMifierMethodVisitor35.visitLdcInsn(obj44);
        aSMifierMethodVisitor35.visitLdcInsn((java.lang.Object) (short) 10);
        java.util.List list48 = aSMifierMethodVisitor35.getText();
        org.mockito.asm.FieldVisitor fieldVisitor49 = aSMifierClassVisitor15.visitField((int) (byte) -1, "", "", "", (java.lang.Object) list48);
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        java.util.Locale locale52 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor54 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray57 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray59 = null;
        aSMifierMethodVisitor54.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray57, (int) (short) 1, objArray59);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor62 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label63 = null;
        org.mockito.asm.Label label64 = null;
        org.mockito.asm.Label label65 = null;
        aSMifierMethodVisitor62.visitTryCatchBlock(label63, label64, label65, "");
        aSMifierMethodVisitor62.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray71 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray73 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor62, strArray71, 1.0f };
        java.io.PrintWriter printWriter74 = printWriter51.printf(locale52, "", (java.lang.Object[]) strArray71);
        java.io.PrintWriter printWriter76 = printWriter74.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter78 = printWriter74.append(' ');
        printWriter78.println((float) '4');
        aSMifierClassVisitor15.print(printWriter78);
        printWriter78.write((int) (short) 1);
        printWriter78.println();
        printWriter78.println("");
        printWriter78.print((long) 'a');
        printWriter78.println(false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(fieldVisitor30);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(fieldVisitor49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(printWriter74);
        org.junit.Assert.assertNotNull(printWriter76);
        org.junit.Assert.assertNotNull(printWriter78);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitTypeInsn(0, "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor14 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor14.visitTryCatchBlock(label15, label16, label17, "");
        aSMifierMethodVisitor14.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj23 = null;
        aSMifierMethodVisitor14.visitLdcInsn(obj23);
        aSMifierMethodVisitor14.visitEnd();
        aSMifierMethodVisitor0.visitLdcInsn((java.lang.Object) aSMifierMethodVisitor14);
        org.mockito.asm.Label label29 = null;
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter("hi!");
        printWriter31.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter35 = printWriter31.append((java.lang.CharSequence) "");
        printWriter31.print((double) 1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor39.visitTryCatchBlock(label40, label41, label42, "");
        aSMifierMethodVisitor39.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj48 = null;
        aSMifierMethodVisitor39.visitLdcInsn(obj48);
        org.mockito.asm.Label label51 = null;
        aSMifierMethodVisitor39.visitJumpInsn((int) (short) 1, label51);
        aSMifierMethodVisitor39.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor39.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor59 = aSMifierMethodVisitor39.visitAnnotationDefault();
        java.io.PrintWriter printWriter63 = new java.io.PrintWriter("hi!");
        printWriter63.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor67 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        org.mockito.asm.Label label70 = null;
        aSMifierMethodVisitor67.visitTryCatchBlock(label68, label69, label70, "");
        aSMifierMethodVisitor67.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label78 = null;
        org.mockito.asm.Label label79 = null;
        org.mockito.asm.Label[] labelArray80 = new org.mockito.asm.Label[] { label79 };
        aSMifierMethodVisitor67.visitTableSwitchInsn(0, (int) (byte) 10, label78, labelArray80);
        java.io.PrintWriter printWriter82 = printWriter63.printf("hi!", (java.lang.Object[]) labelArray80);
        java.lang.String[] strArray84 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor39.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray80, 1, (java.lang.Object[]) strArray84);
        java.io.PrintWriter printWriter86 = printWriter31.printf("hi!", (java.lang.Object[]) labelArray80);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (short) 100, (int) (short) 1, label29, labelArray80);
        aSMifierMethodVisitor0.visitVarInsn((int) (short) 10, 0);
        org.mockito.asm.Attribute attribute91 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(printWriter35);
        org.junit.Assert.assertNotNull(annotationVisitor59);
        org.junit.Assert.assertNotNull(labelArray80);
        org.junit.Assert.assertNotNull(printWriter82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(printWriter86);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitSource("", "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor24.visitTryCatchBlock(label25, label26, label27, "");
        org.mockito.asm.Label label33 = null;
        org.mockito.asm.Label label34 = null;
        aSMifierMethodVisitor24.visitLocalVariable("hi!", "hi!", "hi!", label33, label34, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = aSMifierMethodVisitor24.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor40 = aSMifierMethodVisitor24.visitAnnotationDefault();
        annotationVisitor40.visitEnum("", "hi!", "hi!");
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor15.visitField((int) '#', "", "", "", (java.lang.Object) "hi!");
        aSMifierClassVisitor15.visitSource("", "");
        aSMifierClassVisitor15.visitEnd();
        org.mockito.asm.AnnotationVisitor annotationVisitor52 = aSMifierClassVisitor15.visitAnnotation("", true);
        aSMifierClassVisitor15.visitInnerClass("", "hi!", "hi!", (int) '4');
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitOuterClass("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(annotationVisitor39);
        org.junit.Assert.assertNotNull(annotationVisitor40);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(annotationVisitor52);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        aSMifierMethodVisitor0.visitMaxs(100, (int) (short) -1);
        java.util.List list12 = aSMifierMethodVisitor0.getText();
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        org.mockito.asm.Label label16 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label14, label15, label16, "");
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label[] labelArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitTableSwitchInsn((int) (short) 100, (int) (byte) 100, label21, labelArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(annotationVisitor13);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        java.util.List list6 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitFieldInsn((int) '#', "", "", "hi!");
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 100, "", "", "hi!");
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (byte) 0, label18);
        java.util.List list20 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitMethodInsn((int) (byte) 1, "", "", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor28 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor30 = annotationVisitor28.visitArray("");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(annotationVisitor28);
        org.junit.Assert.assertNotNull(annotationVisitor30);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((double) 1);
        java.io.PrintWriter printWriter9 = printWriter1.append((java.lang.CharSequence) "hi!");
        printWriter9.println(false);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter("hi!");
        printWriter14.print(false);
        java.io.PrintWriter printWriter18 = printWriter14.append((java.lang.CharSequence) "hi!");
        boolean boolean19 = printWriter18.checkError();
        java.io.PrintWriter printWriter21 = printWriter18.append('4');
        printWriter21.println(1.0f);
        java.io.PrintWriter printWriter26 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter28 = printWriter26.append('a');
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor29 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label30 = null;
        org.mockito.asm.Label label31 = null;
        org.mockito.asm.Label label32 = null;
        aSMifierMethodVisitor29.visitTryCatchBlock(label30, label31, label32, "");
        aSMifierMethodVisitor29.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj38 = null;
        aSMifierMethodVisitor29.visitLdcInsn(obj38);
        org.mockito.asm.Label label41 = null;
        aSMifierMethodVisitor29.visitJumpInsn((int) (short) 1, label41);
        aSMifierMethodVisitor29.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor29.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor49 = aSMifierMethodVisitor29.visitAnnotationDefault();
        java.io.PrintWriter printWriter53 = new java.io.PrintWriter("hi!");
        printWriter53.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor57 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label58 = null;
        org.mockito.asm.Label label59 = null;
        org.mockito.asm.Label label60 = null;
        aSMifierMethodVisitor57.visitTryCatchBlock(label58, label59, label60, "");
        aSMifierMethodVisitor57.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label68 = null;
        org.mockito.asm.Label label69 = null;
        org.mockito.asm.Label[] labelArray70 = new org.mockito.asm.Label[] { label69 };
        aSMifierMethodVisitor57.visitTableSwitchInsn(0, (int) (byte) 10, label68, labelArray70);
        java.io.PrintWriter printWriter72 = printWriter53.printf("hi!", (java.lang.Object[]) labelArray70);
        java.lang.String[] strArray74 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor29.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray70, 1, (java.lang.Object[]) strArray74);
        printWriter28.println((java.lang.Object) strArray74);
        java.io.PrintWriter printWriter77 = printWriter21.printf("hi!", (java.lang.Object[]) strArray74);
        java.io.PrintWriter printWriter78 = printWriter9.format("", (java.lang.Object[]) strArray74);
        printWriter78.println((int) ' ');
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(printWriter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(printWriter21);
        org.junit.Assert.assertNotNull(printWriter28);
        org.junit.Assert.assertNotNull(annotationVisitor49);
        org.junit.Assert.assertNotNull(labelArray70);
        org.junit.Assert.assertNotNull(printWriter72);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(printWriter77);
        org.junit.Assert.assertNotNull(printWriter78);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        char[] charArray31 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter24.println(charArray31);
        java.io.PrintWriter printWriter34 = new java.io.PrintWriter((java.io.Writer) printWriter24, true);
        boolean boolean35 = printWriter34.checkError();
        printWriter34.println((int) (byte) 1);
        java.io.PrintWriter printWriter38 = new java.io.PrintWriter((java.io.Writer) printWriter34);
        printWriter34.print("");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        aSMifierMethodVisitor0.visitMaxs(100, (int) (short) -1);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitLabel(label12);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotation("", true);
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 10, label18);
        aSMifierMethodVisitor0.visitMaxs((int) '#', (-1));
        org.junit.Assert.assertNotNull(annotationVisitor16);
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.write((-1));
        printWriter1.flush();
        java.util.Locale locale5 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray10 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray12 = null;
        aSMifierMethodVisitor7.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray10, (int) (short) 1, objArray12);
        java.io.PrintWriter printWriter14 = printWriter1.printf(locale5, "", (java.lang.Object[]) strArray10);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor15 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter1);
        aSMifierClassVisitor15.visitEnd();
        aSMifierClassVisitor15.visitOuterClass("hi!", "", "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor25.visitTryCatchBlock(label26, label27, label28, "");
        aSMifierMethodVisitor25.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj34 = null;
        aSMifierMethodVisitor25.visitLdcInsn(obj34);
        java.io.PrintWriter printWriter37 = new java.io.PrintWriter("hi!");
        printWriter37.print((java.lang.Object) (short) -1);
        aSMifierMethodVisitor25.print(printWriter37);
        printWriter37.println("");
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor43 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter37);
        java.io.PrintWriter printWriter49 = new java.io.PrintWriter("hi!");
        printWriter49.write((-1));
        printWriter49.flush();
        java.util.Locale locale53 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray58 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray60 = null;
        aSMifierMethodVisitor55.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray58, (int) (short) 1, objArray60);
        java.io.PrintWriter printWriter62 = printWriter49.printf(locale53, "", (java.lang.Object[]) strArray58);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor63 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter49);
        aSMifierClassVisitor63.visitEnd();
        aSMifierClassVisitor63.visitSource("", "hi!");
        java.lang.String[] strArray73 = org.mockito.asm.util.AbstractVisitor.TYPES;
        aSMifierClassVisitor63.visit((int) ' ', (int) (byte) 100, "", "hi!", "", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor75 = aSMifierClassVisitor43.visitMethod(0, "", "hi!", "hi!", strArray73);
        org.mockito.asm.MethodVisitor methodVisitor76 = aSMifierClassVisitor15.visitMethod((int) (short) 0, "", "hi!", "", strArray73);
        org.mockito.asm.AnnotationVisitor annotationVisitor77 = methodVisitor76.visitAnnotationDefault();
        methodVisitor76.visitMethodInsn((int) '4', "", "", "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(printWriter62);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodVisitor75);
        org.junit.Assert.assertNotNull(methodVisitor76);
        org.junit.Assert.assertNotNull(annotationVisitor77);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotation("", false);
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label16, label17, label18, "");
        org.mockito.asm.Label label23 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor24 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label25 = null;
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor24.visitTryCatchBlock(label25, label26, label27, "");
        aSMifierMethodVisitor24.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj33 = null;
        aSMifierMethodVisitor24.visitLdcInsn(obj33);
        aSMifierMethodVisitor24.visitInsn((int) ' ');
        org.mockito.asm.Label label38 = null;
        aSMifierMethodVisitor24.visitJumpInsn(100, label38);
        aSMifierMethodVisitor24.visitIntInsn(10, (int) ' ');
        org.mockito.asm.Label label43 = null;
        int[] intArray44 = new int[] {};
        java.io.PrintWriter printWriter46 = new java.io.PrintWriter("hi!");
        printWriter46.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter50 = printWriter46.append((java.lang.CharSequence) "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor52 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label53 = null;
        org.mockito.asm.Label label54 = null;
        org.mockito.asm.Label label55 = null;
        aSMifierMethodVisitor52.visitTryCatchBlock(label53, label54, label55, "");
        aSMifierMethodVisitor52.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj61 = null;
        aSMifierMethodVisitor52.visitLdcInsn(obj61);
        org.mockito.asm.Label label64 = null;
        aSMifierMethodVisitor52.visitJumpInsn((int) (short) 1, label64);
        aSMifierMethodVisitor52.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label71 = null;
        org.mockito.asm.Label[] labelArray72 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor52.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label71, labelArray72);
        java.io.PrintWriter printWriter74 = printWriter50.printf("", (java.lang.Object[]) labelArray72);
        aSMifierMethodVisitor24.visitLookupSwitchInsn(label43, intArray44, labelArray72);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 100, (-1), label23, labelArray72);
        aSMifierMethodVisitor0.visitFieldInsn((int) (byte) 0, "hi!", "hi!", "hi!");
        aSMifierMethodVisitor0.visitInsn((int) 'a');
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) -1, (int) (byte) 1);
        org.mockito.asm.Attribute attribute87 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(printWriter50);
        org.junit.Assert.assertNotNull(labelArray72);
        org.junit.Assert.assertNotNull(printWriter74);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label11 = null;
        org.mockito.asm.Label label12 = null;
        org.mockito.asm.Label[] labelArray13 = new org.mockito.asm.Label[] { label12 };
        aSMifierMethodVisitor0.visitTableSwitchInsn(0, (int) (byte) 10, label11, labelArray13);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitCode();
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.Label label19 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label19);
        org.mockito.asm.Label label21 = null;
        org.mockito.asm.Label label22 = null;
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label21, label22, label23, "hi!");
        org.junit.Assert.assertNotNull(labelArray13);
        org.junit.Assert.assertNotNull(annotationVisitor15);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((double) 1);
        java.io.PrintWriter printWriter9 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter9, false);
        printWriter11.println((long) (byte) 100);
        printWriter11.print(true);
        printWriter11.close();
        printWriter11.println((double) (byte) 10);
        printWriter11.println(100.0d);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter9);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        printWriter8.write("");
        java.io.PrintWriter printWriter12 = new java.io.PrintWriter("hi!");
        printWriter12.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter16 = printWriter12.append((java.lang.CharSequence) "");
        printWriter8.println((java.lang.Object) printWriter16);
        printWriter16.print((long) (byte) 10);
        printWriter16.println(10.0d);
        java.io.PrintWriter printWriter23 = printWriter16.append((java.lang.CharSequence) "");
        printWriter16.print(1L);
        printWriter16.print("");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter16);
        org.junit.Assert.assertNotNull(printWriter23);
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        aSMifierMethodVisitor0.visitInsn((int) ' ');
        aSMifierMethodVisitor0.visitIincInsn((int) (byte) 100, (int) (short) 1);
        aSMifierMethodVisitor0.visitTypeInsn((int) (byte) 0, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor19 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitIincInsn((int) '#', (int) (byte) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor25 = aSMifierMethodVisitor0.visitAnnotation("hi!", false);
        aSMifierMethodVisitor0.visitVarInsn(0, 0);
        aSMifierMethodVisitor0.visitMethodInsn((int) (short) 10, "", "", "hi!");
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 0);
        org.mockito.asm.Label label37 = null;
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label37, label38, label39, "");
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(annotationVisitor19);
        org.junit.Assert.assertNotNull(annotationVisitor25);
        org.junit.Assert.assertNotNull(annotationVisitor42);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((int) (byte) -1);
        printWriter1.print((double) (byte) 1);
        printWriter1.close();
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        printWriter11.println();
        java.io.PrintWriter printWriter14 = printWriter11.append('4');
        java.io.PrintWriter printWriter16 = new java.io.PrintWriter("hi!");
        printWriter16.write((-1));
        printWriter16.flush();
        java.util.Locale locale20 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor22 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray25 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray27 = null;
        aSMifierMethodVisitor22.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray25, (int) (short) 1, objArray27);
        java.io.PrintWriter printWriter29 = printWriter16.printf(locale20, "", (java.lang.Object[]) strArray25);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor30 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter16);
        aSMifierClassVisitor30.visitEnd();
        aSMifierClassVisitor30.visitSource("", "hi!");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label40 = null;
        org.mockito.asm.Label label41 = null;
        org.mockito.asm.Label label42 = null;
        aSMifierMethodVisitor39.visitTryCatchBlock(label40, label41, label42, "");
        org.mockito.asm.FieldVisitor fieldVisitor45 = aSMifierClassVisitor30.visitField((int) (short) -1, "hi!", "hi!", "", (java.lang.Object) label42);
        aSMifierClassVisitor30.visitSource("hi!", "");
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter("hi!");
        printWriter54.write((-1));
        printWriter54.flush();
        java.util.Locale locale58 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor60 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray63 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray65 = null;
        aSMifierMethodVisitor60.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray63, (int) (short) 1, objArray65);
        java.io.PrintWriter printWriter67 = printWriter54.printf(locale58, "", (java.lang.Object[]) strArray63);
        org.mockito.asm.MethodVisitor methodVisitor68 = aSMifierClassVisitor30.visitMethod((int) (byte) 0, "", "", "hi!", strArray63);
        aSMifierClassVisitor30.visitSource("hi!", "");
        aSMifierClassVisitor30.visitInnerClass("hi!", "hi!", "hi!", (int) '4');
        aSMifierClassVisitor30.visitEnd();
        aSMifierClassVisitor30.visitEnd();
        printWriter11.print((java.lang.Object) aSMifierClassVisitor30);
        aSMifierClassVisitor30.visitSource("hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = aSMifierClassVisitor30.visitAnnotation("hi!", true);
        aSMifierClassVisitor30.visitInnerClass("hi!", "hi!", "hi!", 10);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(fieldVisitor45);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(printWriter67);
        org.junit.Assert.assertNotNull(methodVisitor68);
        org.junit.Assert.assertNotNull(annotationVisitor85);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        java.util.List list6 = aSMifierMethodVisitor0.text;
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitVarInsn((int) (short) 0, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 10, "", false);
        org.mockito.asm.AnnotationVisitor annotationVisitor18 = aSMifierMethodVisitor0.visitParameterAnnotation((int) '#', "", true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(annotationVisitor7);
        org.junit.Assert.assertNotNull(annotationVisitor14);
        org.junit.Assert.assertNotNull(annotationVisitor18);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        printWriter1.print((double) 1);
        java.io.PrintWriter printWriter9 = printWriter1.append((java.lang.CharSequence) "hi!");
        printWriter1.write((int) (short) 1);
        printWriter1.write(0);
        java.io.PrintWriter printWriter15 = printWriter1.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter17 = new java.io.PrintWriter("hi!");
        java.util.Locale locale18 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor20 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray23 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray25 = null;
        aSMifierMethodVisitor20.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray23, (int) (short) 1, objArray25);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor28 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        org.mockito.asm.Label label31 = null;
        aSMifierMethodVisitor28.visitTryCatchBlock(label29, label30, label31, "");
        aSMifierMethodVisitor28.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray37 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray39 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor28, strArray37, 1.0f };
        java.io.PrintWriter printWriter40 = printWriter17.printf(locale18, "", (java.lang.Object[]) strArray37);
        char[] charArray47 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        printWriter40.println(charArray47);
        char[] charArray49 = new char[] {};
        printWriter40.print(charArray49);
        printWriter1.print(charArray49);
        java.io.PrintWriter printWriter53 = printWriter1.append((java.lang.CharSequence) "");
        java.io.PrintWriter printWriter54 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        java.io.PrintWriter printWriter56 = printWriter54.append('#');
        printWriter54.println((float) (-1L));
        printWriter54.println('#');
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertNotNull(printWriter15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(printWriter40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertNotNull(printWriter53);
        org.junit.Assert.assertNotNull(printWriter56);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 1, label12);
        aSMifierMethodVisitor0.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor0.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor20 = aSMifierMethodVisitor0.visitAnnotationDefault();
        aSMifierMethodVisitor0.visitIntInsn(0, (int) '4');
        org.mockito.asm.AnnotationVisitor annotationVisitor24 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "", label28, label29, (int) (short) 1);
        aSMifierMethodVisitor0.visitIntInsn((int) '#', (int) 'a');
        aSMifierMethodVisitor0.visitIntInsn((int) (short) 100, (int) (byte) 0);
        aSMifierMethodVisitor0.visitCode();
        org.mockito.asm.AnnotationVisitor annotationVisitor42 = aSMifierMethodVisitor0.visitParameterAnnotation((int) (short) 1, "hi!", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor45 = annotationVisitor42.visitAnnotation("hi!", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor20);
        org.junit.Assert.assertNotNull(annotationVisitor24);
        org.junit.Assert.assertNotNull(annotationVisitor42);
        org.junit.Assert.assertNotNull(annotationVisitor45);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print((java.lang.Object) (short) -1);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor7 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label8 = null;
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor7.visitTryCatchBlock(label8, label9, label10, "");
        aSMifierMethodVisitor7.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj16 = null;
        aSMifierMethodVisitor7.visitLdcInsn(obj16);
        org.mockito.asm.Label label19 = null;
        aSMifierMethodVisitor7.visitJumpInsn((int) (short) 1, label19);
        aSMifierMethodVisitor7.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor7.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label26, labelArray27);
        java.io.PrintWriter printWriter29 = printWriter5.printf("", (java.lang.Object[]) labelArray27);
        java.io.PrintWriter printWriter31 = new java.io.PrintWriter((java.io.Writer) printWriter29, true);
        java.io.PrintWriter printWriter33 = new java.io.PrintWriter("hi!");
        printWriter33.print(false);
        printWriter33.println(false);
        printWriter33.print(0L);
        printWriter33.close();
        printWriter33.println();
        printWriter31.print((java.lang.Object) printWriter33);
        printWriter31.print(' ');
        printWriter31.print((int) '#');
        java.io.PrintWriter printWriter48 = printWriter31.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(labelArray27);
        org.junit.Assert.assertNotNull(printWriter29);
        org.junit.Assert.assertNotNull(printWriter48);
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        java.util.Locale locale9 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor11 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label12 = null;
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor11.visitTryCatchBlock(label12, label13, label14, "");
        org.mockito.asm.Label label20 = null;
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor11.visitLocalVariable("hi!", "hi!", "hi!", label20, label21, (int) (byte) 10);
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor27.visitTryCatchBlock(label28, label29, label30, "");
        aSMifierMethodVisitor27.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj36 = null;
        aSMifierMethodVisitor27.visitLdcInsn(obj36);
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor27.visitJumpInsn((int) (short) 1, label39);
        aSMifierMethodVisitor27.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor27.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierMethodVisitor27.visitAnnotationDefault();
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        printWriter51.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.Label label57 = null;
        org.mockito.asm.Label label58 = null;
        aSMifierMethodVisitor55.visitTryCatchBlock(label56, label57, label58, "");
        aSMifierMethodVisitor55.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label66 = null;
        org.mockito.asm.Label label67 = null;
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] { label67 };
        aSMifierMethodVisitor55.visitTableSwitchInsn(0, (int) (byte) 10, label66, labelArray68);
        java.io.PrintWriter printWriter70 = printWriter51.printf("hi!", (java.lang.Object[]) labelArray68);
        java.lang.String[] strArray72 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor27.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray68, 1, (java.lang.Object[]) strArray72);
        aSMifierMethodVisitor11.visitTableSwitchInsn((int) (byte) 1, (int) (byte) 100, label26, labelArray68);
        java.io.PrintWriter printWriter75 = printWriter5.format(locale9, "", (java.lang.Object[]) labelArray68);
        java.lang.Object[] objArray77 = null;
        java.io.PrintWriter printWriter78 = printWriter5.printf("hi!", objArray77);
        printWriter78.write("hi!");
        java.io.PrintWriter printWriter82 = printWriter78.append((java.lang.CharSequence) "hi!");
        printWriter82.print((int) (byte) 1);
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(labelArray68);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter78);
        org.junit.Assert.assertNotNull(printWriter82);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitMaxs(0, (-1));
        aSMifierMethodVisitor0.visitMethodInsn(10, "", "hi!", "hi!");
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "", label17, label18, (int) (short) -1);
        aSMifierMethodVisitor0.visitEnd();
        java.util.List list22 = aSMifierMethodVisitor0.text;
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label26, label27, (int) (byte) -1);
        aSMifierMethodVisitor0.visitTypeInsn((int) '4', "");
        org.mockito.asm.Label label34 = null;
        aSMifierMethodVisitor0.visitJumpInsn((int) (short) 10, label34);
        org.mockito.asm.Label label38 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor39 = new org.mockito.asm.util.ASMifierMethodVisitor();
        aSMifierMethodVisitor39.visitMultiANewArrayInsn("hi!", (int) (short) 0);
        org.mockito.asm.Label label45 = null;
        java.io.PrintWriter printWriter47 = new java.io.PrintWriter("hi!");
        printWriter47.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor51 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label52 = null;
        org.mockito.asm.Label label53 = null;
        org.mockito.asm.Label label54 = null;
        aSMifierMethodVisitor51.visitTryCatchBlock(label52, label53, label54, "");
        aSMifierMethodVisitor51.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label62 = null;
        org.mockito.asm.Label label63 = null;
        org.mockito.asm.Label[] labelArray64 = new org.mockito.asm.Label[] { label63 };
        aSMifierMethodVisitor51.visitTableSwitchInsn(0, (int) (byte) 10, label62, labelArray64);
        java.io.PrintWriter printWriter66 = printWriter47.printf("hi!", (java.lang.Object[]) labelArray64);
        aSMifierMethodVisitor39.visitTableSwitchInsn(1, (int) (short) 10, label45, labelArray64);
        aSMifierMethodVisitor0.visitTableSwitchInsn((int) (byte) 0, 1, label38, labelArray64);
        org.mockito.asm.Label label70 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) '#', label70);
        org.mockito.asm.AnnotationVisitor annotationVisitor72 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.mockito.asm.Label label74 = null;
        aSMifierMethodVisitor0.visitLineNumber((-1), label74);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(labelArray64);
        org.junit.Assert.assertNotNull(printWriter66);
        org.junit.Assert.assertNotNull(annotationVisitor72);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.println(false);
        java.io.PrintWriter printWriter7 = printWriter1.append('#');
        java.io.PrintWriter printWriter9 = printWriter1.append('a');
        boolean boolean10 = printWriter1.checkError();
        org.junit.Assert.assertNotNull(printWriter7);
        org.junit.Assert.assertNotNull(printWriter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn((int) ' ', "hi!", "hi!", "");
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        org.mockito.asm.Label label18 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label16, label17, label18, "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(annotationVisitor14);
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = aSMifierMethodVisitor0.visitAnnotation("hi!", true);
        java.util.List list14 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitEnd();
        java.util.List list16 = aSMifierMethodVisitor0.text;
        aSMifierMethodVisitor0.visitInsn((int) '4');
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 0, (int) (byte) -1);
        org.mockito.asm.Label label23 = null;
        aSMifierMethodVisitor0.visitLineNumber(0, label23);
        org.mockito.asm.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            aSMifierMethodVisitor0.visitAttribute(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationVisitor13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        aSMifierMethodVisitor0.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj9 = null;
        aSMifierMethodVisitor0.visitLdcInsn(obj9);
        org.mockito.asm.Label label12 = null;
        aSMifierMethodVisitor0.visitLineNumber((int) (short) 0, label12);
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor0.visitJumpInsn(0, label15);
        java.util.List list17 = aSMifierMethodVisitor0.getText();
        aSMifierMethodVisitor0.visitInsn((int) '4');
        aSMifierMethodVisitor0.visitCode();
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.println(false);
        boolean boolean6 = printWriter1.checkError();
        printWriter1.print((float) (byte) 10);
        printWriter1.print(0.0f);
        java.io.PrintWriter printWriter11 = new java.io.PrintWriter((java.io.Writer) printWriter1);
        char[] charArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            printWriter11.write(charArray12, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        printWriter1.println(false);
        printWriter1.print(0L);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor8 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        org.mockito.asm.Label label11 = null;
        aSMifierMethodVisitor8.visitTryCatchBlock(label9, label10, label11, "");
        aSMifierMethodVisitor8.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj17 = null;
        aSMifierMethodVisitor8.visitLdcInsn(obj17);
        java.io.PrintWriter printWriter20 = new java.io.PrintWriter("hi!");
        printWriter20.print((java.lang.Object) (short) -1);
        aSMifierMethodVisitor8.print(printWriter20);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor25 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.Label label27 = null;
        org.mockito.asm.Label label28 = null;
        aSMifierMethodVisitor25.visitTryCatchBlock(label26, label27, label28, "");
        aSMifierMethodVisitor25.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj34 = null;
        aSMifierMethodVisitor25.visitLdcInsn(obj34);
        org.mockito.asm.Label label37 = null;
        aSMifierMethodVisitor25.visitJumpInsn((int) (short) 1, label37);
        aSMifierMethodVisitor25.visitIntInsn((int) (byte) 100, 100);
        org.mockito.asm.Label label44 = null;
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] {};
        aSMifierMethodVisitor25.visitTableSwitchInsn((int) (byte) 0, (int) (byte) 0, label44, labelArray45);
        java.io.PrintWriter printWriter47 = printWriter20.printf("", (java.lang.Object[]) labelArray45);
        printWriter47.println();
        printWriter1.println((java.lang.Object) printWriter47);
        printWriter47.print((double) 'a');
        java.io.PrintWriter printWriter52 = new java.io.PrintWriter((java.io.Writer) printWriter47);
        printWriter47.print((int) '#');
        org.junit.Assert.assertNotNull(labelArray45);
        org.junit.Assert.assertNotNull(printWriter47);
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        printWriter1.print(false);
        java.io.PrintWriter printWriter5 = printWriter1.append((java.lang.CharSequence) "hi!");
        java.io.PrintWriter printWriter7 = new java.io.PrintWriter((java.io.Writer) printWriter5, true);
        java.io.PrintWriter printWriter8 = new java.io.PrintWriter((java.io.Writer) printWriter5);
        java.util.Locale locale9 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor11 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label12 = null;
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        aSMifierMethodVisitor11.visitTryCatchBlock(label12, label13, label14, "");
        org.mockito.asm.Label label20 = null;
        org.mockito.asm.Label label21 = null;
        aSMifierMethodVisitor11.visitLocalVariable("hi!", "hi!", "hi!", label20, label21, (int) (byte) 10);
        org.mockito.asm.Label label26 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor27 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label28 = null;
        org.mockito.asm.Label label29 = null;
        org.mockito.asm.Label label30 = null;
        aSMifierMethodVisitor27.visitTryCatchBlock(label28, label29, label30, "");
        aSMifierMethodVisitor27.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj36 = null;
        aSMifierMethodVisitor27.visitLdcInsn(obj36);
        org.mockito.asm.Label label39 = null;
        aSMifierMethodVisitor27.visitJumpInsn((int) (short) 1, label39);
        aSMifierMethodVisitor27.visitIntInsn((int) (byte) 100, 100);
        aSMifierMethodVisitor27.visitMultiANewArrayInsn("hi!", (int) (short) 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor47 = aSMifierMethodVisitor27.visitAnnotationDefault();
        java.io.PrintWriter printWriter51 = new java.io.PrintWriter("hi!");
        printWriter51.print((java.lang.Object) (short) -1);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor55 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label56 = null;
        org.mockito.asm.Label label57 = null;
        org.mockito.asm.Label label58 = null;
        aSMifierMethodVisitor55.visitTryCatchBlock(label56, label57, label58, "");
        aSMifierMethodVisitor55.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        org.mockito.asm.Label label66 = null;
        org.mockito.asm.Label label67 = null;
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] { label67 };
        aSMifierMethodVisitor55.visitTableSwitchInsn(0, (int) (byte) 10, label66, labelArray68);
        java.io.PrintWriter printWriter70 = printWriter51.printf("hi!", (java.lang.Object[]) labelArray68);
        java.lang.String[] strArray72 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        aSMifierMethodVisitor27.visitFrame((int) (short) 100, (-1), (java.lang.Object[]) labelArray68, 1, (java.lang.Object[]) strArray72);
        aSMifierMethodVisitor11.visitTableSwitchInsn((int) (byte) 1, (int) (byte) 100, label26, labelArray68);
        java.io.PrintWriter printWriter75 = printWriter5.format(locale9, "", (java.lang.Object[]) labelArray68);
        java.lang.Object[] objArray77 = null;
        java.io.PrintWriter printWriter78 = printWriter5.printf("hi!", objArray77);
        printWriter78.print(10);
        printWriter78.close();
        printWriter78.println("hi!");
        org.junit.Assert.assertNotNull(printWriter5);
        org.junit.Assert.assertNotNull(annotationVisitor47);
        org.junit.Assert.assertNotNull(labelArray68);
        org.junit.Assert.assertNotNull(printWriter70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(printWriter75);
        org.junit.Assert.assertNotNull(printWriter78);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("hi!");
        java.util.Locale locale2 = null;
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor4 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray7 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray9 = null;
        aSMifierMethodVisitor4.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray7, (int) (short) 1, objArray9);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor12 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label13 = null;
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = null;
        aSMifierMethodVisitor12.visitTryCatchBlock(label13, label14, label15, "");
        aSMifierMethodVisitor12.visitVarInsn((int) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray21 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray23 = new java.lang.Object[] { '4', (short) 10, aSMifierMethodVisitor12, strArray21, 1.0f };
        java.io.PrintWriter printWriter24 = printWriter1.printf(locale2, "", (java.lang.Object[]) strArray21);
        printWriter24.print("hi!");
        java.io.PrintWriter printWriter27 = new java.io.PrintWriter((java.io.Writer) printWriter24);
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor28 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter27);
        aSMifierClassVisitor28.visitOuterClass("hi!", "hi!", "hi!");
        org.mockito.asm.AnnotationVisitor annotationVisitor35 = aSMifierClassVisitor28.visitAnnotation("hi!", true);
        aSMifierClassVisitor28.visitEnd();
        java.io.PrintWriter printWriter43 = new java.io.PrintWriter("hi!");
        java.io.PrintWriter printWriter45 = printWriter43.append('a');
        org.mockito.asm.util.ASMifierClassVisitor aSMifierClassVisitor46 = new org.mockito.asm.util.ASMifierClassVisitor(printWriter45);
        java.lang.String[] strArray52 = null;
        aSMifierClassVisitor46.visit((int) (short) 1, (int) '#', "hi!", "hi!", "", strArray52);
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor58 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label59 = null;
        org.mockito.asm.Label label60 = null;
        org.mockito.asm.Label label61 = null;
        aSMifierMethodVisitor58.visitTryCatchBlock(label59, label60, label61, "");
        org.mockito.asm.Label label67 = null;
        org.mockito.asm.Label label68 = null;
        aSMifierMethodVisitor58.visitLocalVariable("hi!", "hi!", "hi!", label67, label68, (int) (byte) 10);
        java.io.PrintWriter printWriter72 = new java.io.PrintWriter("hi!");
        printWriter72.print((java.lang.Object) (short) -1);
        java.lang.String[] strArray76 = org.mockito.asm.util.AbstractVisitor.TYPES;
        java.io.PrintWriter printWriter77 = printWriter72.format("", (java.lang.Object[]) strArray76);
        aSMifierMethodVisitor58.visitLdcInsn((java.lang.Object) strArray76);
        org.mockito.asm.MethodVisitor methodVisitor79 = aSMifierClassVisitor46.visitMethod((int) (byte) 1, "hi!", "hi!", "hi!", strArray76);
        aSMifierClassVisitor28.visit((-1), 0, "", "", "hi!", strArray76);
        aSMifierClassVisitor28.visitInnerClass("", "hi!", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(printWriter24);
        org.junit.Assert.assertNotNull(annotationVisitor35);
        org.junit.Assert.assertNotNull(printWriter45);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(printWriter77);
        org.junit.Assert.assertNotNull(methodVisitor79);
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        java.lang.String[] strArray3 = org.mockito.asm.util.AbstractVisitor.OPCODES;
        java.lang.Object[] objArray5 = null;
        aSMifierMethodVisitor0.visitFrame((int) '4', (int) (byte) 1, (java.lang.Object[]) strArray3, (int) (short) 1, objArray5);
        aSMifierMethodVisitor0.visitFieldInsn(0, "", "", "hi!");
        aSMifierMethodVisitor0.visitEnd();
        org.mockito.asm.Label label16 = null;
        org.mockito.asm.Label label17 = null;
        aSMifierMethodVisitor0.visitLocalVariable("", "hi!", "hi!", label16, label17, (int) 'a');
        org.mockito.asm.AnnotationVisitor annotationVisitor22 = aSMifierMethodVisitor0.visitAnnotation("", false);
        aSMifierMethodVisitor0.visitEnd();
        aSMifierMethodVisitor0.visitMaxs((int) (byte) -1, 10);
        aSMifierMethodVisitor0.visitFieldInsn((int) '4', "hi!", "", "");
        aSMifierMethodVisitor0.visitIincInsn((int) (short) 0, (int) (byte) 0);
        aSMifierMethodVisitor0.visitVarInsn((int) '#', 100);
        org.mockito.asm.AnnotationVisitor annotationVisitor38 = aSMifierMethodVisitor0.visitAnnotationDefault();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(annotationVisitor22);
        org.junit.Assert.assertNotNull(annotationVisitor38);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        org.mockito.asm.util.ASMifierMethodVisitor aSMifierMethodVisitor0 = new org.mockito.asm.util.ASMifierMethodVisitor();
        org.mockito.asm.Label label1 = null;
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = null;
        aSMifierMethodVisitor0.visitTryCatchBlock(label1, label2, label3, "");
        org.mockito.asm.Label label9 = null;
        org.mockito.asm.Label label10 = null;
        aSMifierMethodVisitor0.visitLocalVariable("hi!", "hi!", "hi!", label9, label10, (int) (byte) 10);
        org.mockito.asm.AnnotationVisitor annotationVisitor15 = aSMifierMethodVisitor0.visitAnnotation("", true);
        org.mockito.asm.AnnotationVisitor annotationVisitor16 = aSMifierMethodVisitor0.visitAnnotationDefault();
        annotationVisitor16.visitEnum("", "hi!", "hi!");
        annotationVisitor16.visitEnum("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(annotationVisitor15);
        org.junit.Assert.assertNotNull(annotationVisitor16);
    }
}


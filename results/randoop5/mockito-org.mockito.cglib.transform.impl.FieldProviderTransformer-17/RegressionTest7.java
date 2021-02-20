import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        fieldProviderTransformer0.setTarget(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = fieldProviderTransformer0.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer10.getClassInfo();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer14.getClassInfo();
        fieldProviderTransformer13.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        fieldProviderTransformer13.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        fieldProviderTransformer10.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer21 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        fieldProviderTransformer21.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer22);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        fieldProviderTransformer21.setTarget(classVisitor25);
        fieldProviderTransformer10.setTarget(classVisitor25);
        org.mockito.cglib.core.ClassInfo classInfo28 = fieldProviderTransformer10.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer30 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer31 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo32 = fieldProviderTransformer31.getClassInfo();
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        fieldProviderTransformer30.setTarget(classVisitor34);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer36 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo37 = fieldProviderTransformer36.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer38 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer39 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo40 = fieldProviderTransformer39.getClassInfo();
        fieldProviderTransformer38.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer39);
        fieldProviderTransformer36.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer38);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer43 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo44 = fieldProviderTransformer43.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer45 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer46 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo47 = fieldProviderTransformer46.getClassInfo();
        fieldProviderTransformer45.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer46);
        fieldProviderTransformer43.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer45);
        fieldProviderTransformer38.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer45);
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo52 = fieldProviderTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer53 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer54 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo55 = fieldProviderTransformer54.getClassInfo();
        fieldProviderTransformer53.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer54);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer57 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo58 = fieldProviderTransformer57.getClassInfo();
        fieldProviderTransformer53.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer57);
        org.mockito.cglib.core.ClassInfo classInfo60 = fieldProviderTransformer53.getClassInfo();
        fieldProviderTransformer45.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        org.mockito.cglib.core.ClassInfo classInfo62 = fieldProviderTransformer53.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        java.lang.Class<?> wildcardClass64 = fieldProviderTransformer53.getClass();
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo13 = fieldProviderTransformer12.getClassInfo();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo20 = fieldProviderTransformer19.getClassInfo();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer24 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo25 = fieldProviderTransformer24.getClassInfo();
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer24);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        fieldProviderTransformer23.setTarget(classVisitor27);
        fieldProviderTransformer12.setTarget(classVisitor27);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer30 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer31 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo32 = fieldProviderTransformer31.getClassInfo();
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer34 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer35 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo36 = fieldProviderTransformer35.getClassInfo();
        fieldProviderTransformer34.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer35);
        org.mockito.cglib.core.ClassInfo classInfo38 = fieldProviderTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo39 = fieldProviderTransformer34.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer40 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo41 = fieldProviderTransformer40.getClassInfo();
        fieldProviderTransformer34.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer40);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer43 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer44 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo45 = fieldProviderTransformer44.getClassInfo();
        fieldProviderTransformer43.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer44);
        org.mockito.cglib.core.ClassInfo classInfo47 = fieldProviderTransformer43.getClassInfo();
        fieldProviderTransformer40.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer43);
        fieldProviderTransformer31.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer40);
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer51 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer52 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo53 = fieldProviderTransformer52.getClassInfo();
        fieldProviderTransformer51.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer52);
        org.mockito.cglib.core.ClassInfo classInfo55 = fieldProviderTransformer51.getClassInfo();
        fieldProviderTransformer12.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer51);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer51);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer58 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer59 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo60 = fieldProviderTransformer59.getClassInfo();
        fieldProviderTransformer58.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer59);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer62 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer63 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo64 = fieldProviderTransformer63.getClassInfo();
        fieldProviderTransformer62.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer63);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer66 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo67 = fieldProviderTransformer66.getClassInfo();
        fieldProviderTransformer62.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer66);
        fieldProviderTransformer59.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer66);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer59);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer4.visit(0, (int) (byte) 100, "", "hi!", "hi!", strArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = fieldProviderTransformer0.visitMethod(0, "hi!", "", "", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@df65738");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        fieldProviderTransformer0.setTarget(classVisitor4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer9.getClassInfo();
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        fieldProviderTransformer13.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        fieldProviderTransformer8.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo22 = fieldProviderTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer15.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer15.visitInnerClass("hi!", "", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer9 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer10 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer10.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer10);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer13 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer13.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer9.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer18 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo19 = fieldProviderTransformer18.getClassInfo();
        fieldProviderTransformer17.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer18);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        fieldProviderTransformer17.setTarget(classVisitor21);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo24 = fieldProviderTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer26 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo27 = fieldProviderTransformer26.getClassInfo();
        fieldProviderTransformer25.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer26);
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer30 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo31 = fieldProviderTransformer30.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer32 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer33 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo34 = fieldProviderTransformer33.getClassInfo();
        fieldProviderTransformer32.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer33);
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        fieldProviderTransformer25.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        fieldProviderTransformer17.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer39 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo40 = fieldProviderTransformer39.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer41 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer42 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo43 = fieldProviderTransformer42.getClassInfo();
        fieldProviderTransformer41.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer42);
        fieldProviderTransformer39.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer41);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer46 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer47 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo48 = fieldProviderTransformer47.getClassInfo();
        fieldProviderTransformer46.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer47);
        org.mockito.cglib.core.ClassInfo classInfo50 = fieldProviderTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = fieldProviderTransformer46.getClassInfo();
        fieldProviderTransformer39.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer46);
        org.mockito.cglib.core.ClassInfo classInfo53 = fieldProviderTransformer39.getClassInfo();
        fieldProviderTransformer17.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer39);
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo56 = fieldProviderTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = fieldProviderTransformer9.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer9);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer59 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer60 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo61 = fieldProviderTransformer60.getClassInfo();
        fieldProviderTransformer59.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer60);
        org.mockito.asm.ClassVisitor classVisitor63 = null;
        fieldProviderTransformer59.setTarget(classVisitor63);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer65 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo66 = fieldProviderTransformer65.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer67 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer68 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo69 = fieldProviderTransformer68.getClassInfo();
        fieldProviderTransformer67.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer68);
        fieldProviderTransformer65.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer67);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer72 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo73 = fieldProviderTransformer72.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer74 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer75 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo76 = fieldProviderTransformer75.getClassInfo();
        fieldProviderTransformer74.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer75);
        fieldProviderTransformer72.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer74);
        fieldProviderTransformer67.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer74);
        fieldProviderTransformer59.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer74);
        org.mockito.cglib.core.ClassInfo classInfo81 = fieldProviderTransformer74.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer82 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer83 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo84 = fieldProviderTransformer83.getClassInfo();
        fieldProviderTransformer82.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer83);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer86 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo87 = fieldProviderTransformer86.getClassInfo();
        fieldProviderTransformer82.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer86);
        org.mockito.cglib.core.ClassInfo classInfo89 = fieldProviderTransformer82.getClassInfo();
        fieldProviderTransformer74.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer82);
        org.mockito.cglib.core.ClassInfo classInfo91 = fieldProviderTransformer82.getClassInfo();
        fieldProviderTransformer9.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer82);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = fieldProviderTransformer82.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo89);
        org.junit.Assert.assertNull(classInfo91);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo8 = fieldProviderTransformer7.getClassInfo();
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        fieldProviderTransformer6.setTarget(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer6.getClassInfo();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        fieldProviderTransformer15.setTarget(classVisitor19);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer21 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo22 = fieldProviderTransformer21.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer24 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo25 = fieldProviderTransformer24.getClassInfo();
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer24);
        fieldProviderTransformer21.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer28 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo29 = fieldProviderTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer30 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer31 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo32 = fieldProviderTransformer31.getClassInfo();
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        fieldProviderTransformer28.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer30);
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer30);
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer30);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer37 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer38 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo39 = fieldProviderTransformer38.getClassInfo();
        fieldProviderTransformer37.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer38);
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        fieldProviderTransformer37.setTarget(classVisitor41);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer43 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo44 = fieldProviderTransformer43.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer45 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer46 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo47 = fieldProviderTransformer46.getClassInfo();
        fieldProviderTransformer45.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer46);
        fieldProviderTransformer43.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer45);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer50 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo51 = fieldProviderTransformer50.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer52 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer53 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo54 = fieldProviderTransformer53.getClassInfo();
        fieldProviderTransformer52.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        fieldProviderTransformer50.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer52);
        fieldProviderTransformer45.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer52);
        fieldProviderTransformer37.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer52);
        fieldProviderTransformer30.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer37);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer60 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo61 = fieldProviderTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer62 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer63 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo64 = fieldProviderTransformer63.getClassInfo();
        fieldProviderTransformer62.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer63);
        fieldProviderTransformer60.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer62);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer67 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo68 = fieldProviderTransformer67.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer69 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer70 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo71 = fieldProviderTransformer70.getClassInfo();
        fieldProviderTransformer69.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer70);
        fieldProviderTransformer67.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer69);
        fieldProviderTransformer62.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer69);
        fieldProviderTransformer37.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer69);
        fieldProviderTransformer1.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor82 = fieldProviderTransformer37.visitField((int) (short) -1, "", "hi!", "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo71);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo14 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = fieldProviderTransformer11.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        fieldProviderTransformer16.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer17);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        fieldProviderTransformer16.setTarget(classVisitor20);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo23 = fieldProviderTransformer22.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer24 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer25 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo26 = fieldProviderTransformer25.getClassInfo();
        fieldProviderTransformer24.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer25);
        fieldProviderTransformer22.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer24);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer29 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo30 = fieldProviderTransformer29.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer31 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer32 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo33 = fieldProviderTransformer32.getClassInfo();
        fieldProviderTransformer31.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        fieldProviderTransformer29.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        fieldProviderTransformer24.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        fieldProviderTransformer16.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer31);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer38 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer39 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo40 = fieldProviderTransformer39.getClassInfo();
        fieldProviderTransformer38.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer39);
        org.mockito.asm.ClassVisitor classVisitor42 = null;
        fieldProviderTransformer38.setTarget(classVisitor42);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer44 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo45 = fieldProviderTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer46 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer47 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo48 = fieldProviderTransformer47.getClassInfo();
        fieldProviderTransformer46.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer47);
        fieldProviderTransformer44.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer46);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer51 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo52 = fieldProviderTransformer51.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer53 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer54 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo55 = fieldProviderTransformer54.getClassInfo();
        fieldProviderTransformer53.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer54);
        fieldProviderTransformer51.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        fieldProviderTransformer46.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        fieldProviderTransformer38.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer53);
        fieldProviderTransformer31.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer38);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer61 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo62 = fieldProviderTransformer61.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer63 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer64 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo65 = fieldProviderTransformer64.getClassInfo();
        fieldProviderTransformer63.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer64);
        fieldProviderTransformer61.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer63);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer68 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo69 = fieldProviderTransformer68.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer70 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer71 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo72 = fieldProviderTransformer71.getClassInfo();
        fieldProviderTransformer70.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer71);
        fieldProviderTransformer68.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer70);
        fieldProviderTransformer63.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer70);
        fieldProviderTransformer38.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer70);
        org.mockito.cglib.core.ClassInfo classInfo77 = fieldProviderTransformer38.getClassInfo();
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo79 = fieldProviderTransformer38.getClassInfo();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter81 = fieldProviderTransformer2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@79a1374f");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo79);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer4 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer4.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer4);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer11.getClassInfo();
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer11);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer16 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo17 = fieldProviderTransformer16.getClassInfo();
        fieldProviderTransformer15.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer16);
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        fieldProviderTransformer15.setTarget(classVisitor19);
        fieldProviderTransformer4.setTarget(classVisitor19);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer22 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer23 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo24 = fieldProviderTransformer23.getClassInfo();
        fieldProviderTransformer22.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer26 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer27 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo28 = fieldProviderTransformer27.getClassInfo();
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo30 = fieldProviderTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = fieldProviderTransformer26.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer32 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo33 = fieldProviderTransformer32.getClassInfo();
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer35 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer36 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo37 = fieldProviderTransformer36.getClassInfo();
        fieldProviderTransformer35.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer36);
        org.mockito.cglib.core.ClassInfo classInfo39 = fieldProviderTransformer35.getClassInfo();
        fieldProviderTransformer32.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer35);
        fieldProviderTransformer23.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer32);
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer23);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer43 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer44 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo45 = fieldProviderTransformer44.getClassInfo();
        fieldProviderTransformer43.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer44);
        org.mockito.cglib.core.ClassInfo classInfo47 = fieldProviderTransformer43.getClassInfo();
        fieldProviderTransformer4.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer43);
        org.mockito.cglib.core.ClassInfo classInfo49 = fieldProviderTransformer43.getClassInfo();
        org.mockito.asm.Attribute attribute50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer43.visitAttribute(attribute50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo49);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        fieldProviderTransformer0.setTarget(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer0.getClassInfo();
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = fieldProviderTransformer0.visitMethod((int) (short) 10, "", "hi!", "", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.FieldProviderTransformer@dbfed9d");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo1 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer2 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer3 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer3.getClassInfo();
        fieldProviderTransformer2.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer3);
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer2);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer7 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer8 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer8.getClassInfo();
        fieldProviderTransformer7.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo11 = fieldProviderTransformer7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = fieldProviderTransformer7.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer7);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer14 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer15 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo16 = fieldProviderTransformer15.getClassInfo();
        fieldProviderTransformer14.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer15);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        fieldProviderTransformer14.setTarget(classVisitor18);
        org.mockito.cglib.core.ClassInfo classInfo20 = fieldProviderTransformer14.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer14);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        fieldProviderTransformer0.setTarget(classVisitor22);
        org.mockito.cglib.core.ClassInfo classInfo24 = fieldProviderTransformer0.getClassInfo();
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer0 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer1 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo2 = fieldProviderTransformer1.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer1);
        org.mockito.cglib.core.ClassInfo classInfo4 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = fieldProviderTransformer0.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer6 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo7 = fieldProviderTransformer6.getClassInfo();
        fieldProviderTransformer0.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer6);
        org.mockito.cglib.core.ClassInfo classInfo9 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer11 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer12 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo13 = fieldProviderTransformer12.getClassInfo();
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer12);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        fieldProviderTransformer11.setTarget(classVisitor15);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer17 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo18 = fieldProviderTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer19 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer20 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo21 = fieldProviderTransformer20.getClassInfo();
        fieldProviderTransformer19.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer20);
        fieldProviderTransformer17.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer19);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer24 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo25 = fieldProviderTransformer24.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer26 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer27 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo28 = fieldProviderTransformer27.getClassInfo();
        fieldProviderTransformer26.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer27);
        fieldProviderTransformer24.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer26);
        fieldProviderTransformer19.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer26);
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer26);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer33 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo34 = fieldProviderTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer35 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer36 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo37 = fieldProviderTransformer36.getClassInfo();
        fieldProviderTransformer35.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer36);
        fieldProviderTransformer33.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer35);
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer40 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.transform.impl.FieldProviderTransformer fieldProviderTransformer41 = new org.mockito.cglib.transform.impl.FieldProviderTransformer();
        org.mockito.cglib.core.ClassInfo classInfo42 = fieldProviderTransformer41.getClassInfo();
        fieldProviderTransformer40.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer41);
        org.mockito.cglib.core.ClassInfo classInfo44 = fieldProviderTransformer40.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = fieldProviderTransformer40.getClassInfo();
        fieldProviderTransformer33.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer40);
        org.mockito.cglib.core.ClassInfo classInfo47 = fieldProviderTransformer33.getClassInfo();
        fieldProviderTransformer11.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer33);
        fieldProviderTransformer6.setTarget((org.mockito.asm.ClassVisitor) fieldProviderTransformer33);
        org.mockito.cglib.core.ClassInfo classInfo50 = fieldProviderTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = fieldProviderTransformer6.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            fieldProviderTransformer6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer12.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.asm.ClassVisitor classVisitor30 = null;
        interceptFieldTransformer26.setTarget(classVisitor30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer1.getClassInfo();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit((int) (byte) 0, (int) (short) 100, "", "", "", strArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitOuterClass("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer7.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = interceptFieldTransformer7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer35.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        interceptFieldTransformer22.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer22.visitSource("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer19.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer36.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        interceptFieldTransformer36.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer40);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer36.getClassInfo();
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer36);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer19.visitOuterClass("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo42);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer22.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        interceptFieldTransformer22.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        interceptFieldTransformer22.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer42.getClassInfo();
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        interceptFieldTransformer59.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter75 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer76 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer76.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer76.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter83 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer84 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter83);
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer84.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer84.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer84.getClassInfo();
        interceptFieldTransformer79.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer84);
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo90 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter91 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer92 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter91);
        org.mockito.cglib.core.ClassInfo classInfo93 = interceptFieldTransformer92.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter94 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer95 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter94);
        org.mockito.cglib.core.ClassInfo classInfo96 = interceptFieldTransformer95.getClassInfo();
        interceptFieldTransformer92.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer95);
        interceptFieldTransformer79.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer92);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor99 = interceptFieldTransformer8.visitField((int) 'a', "", "hi!", "", (java.lang.Object) interceptFieldTransformer92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo86);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo89);
        org.junit.Assert.assertNull(classInfo90);
        org.junit.Assert.assertNull(classInfo93);
        org.junit.Assert.assertNull(classInfo96);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer7.getClassInfo();
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer11.getClassInfo();
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = interceptFieldTransformer1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter24 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer25 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        interceptFieldTransformer25.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer25.getClassInfo();
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer25);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer20.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer35.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        interceptFieldTransformer22.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer56.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer66.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer71.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter75 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer76 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer76.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo78 = interceptFieldTransformer76.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter79 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer80 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter79);
        interceptFieldTransformer76.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer80);
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer80);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer80.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer80.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer80);
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter87 = interceptFieldTransformer1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo86);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer19.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer28.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer49.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer63.getClassInfo();
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter72 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer73 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter72);
        interceptFieldTransformer69.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer63.visitInnerClass("hi!", "", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter15 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer16 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer16.getClassInfo();
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer16);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter24 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer25 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer25.getClassInfo();
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer25);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter31 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer32 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer32.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        interceptFieldTransformer32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer32);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer14.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter54 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer55 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter54);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter60 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer61 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter60);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer57.getClassInfo();
        interceptFieldTransformer55.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer66.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer66.getClassInfo();
        interceptFieldTransformer55.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter72 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer73 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter72);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer73.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer73.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        interceptFieldTransformer73.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter79 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer80 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter79);
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer80.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer80.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer80);
        org.mockito.asm.ClassVisitor classVisitor84 = null;
        interceptFieldTransformer80.setTarget(classVisitor84);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter86 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer87 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter86);
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer87.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer87.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter90 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer91 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter90);
        interceptFieldTransformer87.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer91);
        interceptFieldTransformer80.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer91);
        interceptFieldTransformer55.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer91);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer91);
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer14.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNull(classInfo89);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter15 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer16 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter15);
        interceptFieldTransformer12.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer16);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer19.getClassInfo();
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer44.getClassInfo();
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        org.mockito.asm.ClassVisitor classVisitor48 = null;
        interceptFieldTransformer44.setTarget(classVisitor48);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer51.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer51.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter54 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer55 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter54);
        interceptFieldTransformer51.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer55);
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer55);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter63 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer64 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter63);
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer67.getClassInfo();
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter75 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer76 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer76.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer76.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer67.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer67.visitInnerClass("", "hi!", "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo83);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer8.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter24 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer25 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        interceptFieldTransformer25.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer45.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter56 = interceptFieldTransformer45.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@69c89651");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = null;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = interceptFieldTransformer1.begin_method((int) 'a', signature7, typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@6c2371d");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer12.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer1.getClassInfo();
        org.mockito.asm.Type type30 = null;
        org.mockito.asm.Type type31 = null;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class((int) (byte) 100, 100, "", type30, typeArray32, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer29.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer29);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer52.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer52);
        org.mockito.asm.ClassVisitor classVisitor56 = null;
        interceptFieldTransformer52.setTarget(classVisitor56);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        interceptFieldTransformer59.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer52.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.Signature signature70 = null;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter72 = interceptFieldTransformer3.begin_method(100, signature70, typeArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@3f5f20ec");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNotNull(typeArray71);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer22.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        interceptFieldTransformer52.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.asm.ClassVisitor classVisitor63 = null;
        interceptFieldTransformer59.setTarget(classVisitor63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer12.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter15 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer16 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter15);
        interceptFieldTransformer12.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer16);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer19.getClassInfo();
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer41.getClassInfo();
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer52.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer52);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter60 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer61 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter60);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer61);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter63 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer64 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer64.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer61.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.asm.ClassVisitor classVisitor68 = null;
        interceptFieldTransformer64.setTarget(classVisitor68);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        interceptFieldTransformer71.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer75.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor80 = null;
        interceptFieldTransformer75.setTarget(classVisitor80);
        interceptFieldTransformer38.setTarget(classVisitor80);
        interceptFieldTransformer31.setTarget(classVisitor80);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor86 = interceptFieldTransformer31.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo79);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
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
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor47 = interceptFieldTransformer31.visitMethod((int) 'a', "", "hi!", "hi!", strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@3f9aeb53");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
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
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitInnerClass("hi!", "", "hi!", 0);
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
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
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
        org.mockito.cglib.core.Signature signature38 = null;
        org.mockito.asm.Type type39 = null;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type39 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = interceptFieldTransformer31.begin_method((int) '#', signature38, typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@41e46d66");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer44.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
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
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.asm.ClassVisitor classVisitor71 = null;
        interceptFieldTransformer67.setTarget(classVisitor71);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter77 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer78 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter77);
        interceptFieldTransformer74.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer1.getClassInfo();
        org.mockito.asm.Type type88 = null;
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.begin_class((int) (byte) -1, (int) (byte) 10, "", type88, typeArray89, "hi!");
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNotNull(typeArray89);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer56.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer45.getClassInfo();
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
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer80.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer80);
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
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo86);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter31 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer32 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer32.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer32.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        interceptFieldTransformer32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer36);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer36);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer36.visit(1, (int) (short) 100, "", "", "", strArray44);
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
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer3.getClassInfo();
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer39.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer49.getClassInfo();
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type67 = interceptFieldTransformer60.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo64);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer18);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer45.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
            int int87 = interceptFieldTransformer1.getAccess();
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
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer11.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer11.visit(100, (int) '4', "", "", "hi!", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer14.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer14.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer14.getClassInfo();
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter24 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer25 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        interceptFieldTransformer25.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer25.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer25);
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer25);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer37.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter60 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer61 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter60);
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer61.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter63 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer64 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer61.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        interceptFieldTransformer25.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitInnerClass("hi!", "", "", (-1));
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
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo67);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer40.getClassInfo();
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer40);
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        interceptFieldTransformer40.setTarget(classVisitor44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter67 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer68 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter67);
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer61.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer61.getClassInfo();
        interceptFieldTransformer51.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer61);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer61.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer61.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer61.visitInnerClass("hi!", "", "hi!", (int) (short) 1);
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
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo75);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
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
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter67 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer68 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter67);
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer68.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer68.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter71 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer72 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter71);
        interceptFieldTransformer68.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer75.getClassInfo();
        interceptFieldTransformer72.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter83 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer84 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter83);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter85 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer86 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter85);
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer86.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer86.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter89 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer90 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter89);
        interceptFieldTransformer86.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer90);
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer86.getClassInfo();
        interceptFieldTransformer84.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        interceptFieldTransformer72.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type96 = interceptFieldTransformer57.getSuperType();
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNull(classInfo92);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
            interceptFieldTransformer31.visitInnerClass("hi!", "", "", 1);
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

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        interceptFieldTransformer58.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer77.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer19.visitInnerClass("", "", "hi!", (int) (byte) 1);
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
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer5.getClassInfo();
        org.mockito.asm.Type type28 = null;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer5.declare_field((-1), "", type28, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo25);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter49 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer50 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter49);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.asm.Type type59 = null;
        org.mockito.asm.Type type60 = null;
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type60 };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer4.begin_class((int) (short) 100, (int) (byte) 1, "hi!", type59, typeArray61, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNotNull(typeArray61);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter15 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer16 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer23.getClassInfo();
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter31 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer32 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter31);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer51.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer51.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter54 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer55 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter54);
        interceptFieldTransformer51.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer51.getClassInfo();
        interceptFieldTransformer48.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer1.getClassInfo();
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visit((-1), (int) (short) -1, "hi!", "hi!", "hi!", strArray68);
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
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer44.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
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
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.asm.ClassVisitor classVisitor71 = null;
        interceptFieldTransformer67.setTarget(classVisitor71);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter77 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer78 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter77);
        interceptFieldTransformer74.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter84 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer85 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter84);
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer85.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer85.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter88 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer89 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter88);
        interceptFieldTransformer85.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer89);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter91 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer92 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter91);
        org.mockito.cglib.core.ClassInfo classInfo93 = interceptFieldTransformer92.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo94 = interceptFieldTransformer92.getClassInfo();
        interceptFieldTransformer89.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer92);
        org.mockito.asm.ClassVisitor classVisitor96 = null;
        interceptFieldTransformer92.setTarget(classVisitor96);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer92);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type99 = interceptFieldTransformer28.getSuperType();
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo86);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo93);
        org.junit.Assert.assertNull(classInfo94);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer56.getClassInfo();
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        org.mockito.asm.ClassVisitor classVisitor60 = null;
        interceptFieldTransformer56.setTarget(classVisitor60);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter77 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer78 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter77);
        interceptFieldTransformer74.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer74.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter83 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer84 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter83);
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer84.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer84.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer84.getClassInfo();
        interceptFieldTransformer82.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer84);
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer74.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer82.end_class();
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
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo86);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo89);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer47.getClassInfo();
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
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        interceptFieldTransformer63.setTarget(classVisitor67);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter69 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer70 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        interceptFieldTransformer70.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer70.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        org.mockito.asm.Type type82 = null;
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer70.begin_class((int) (short) 1, (int) (byte) 0, "", type82, typeArray83, "hi!");
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNotNull(typeArray83);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer37.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.asm.ClassVisitor classVisitor64 = null;
        interceptFieldTransformer60.setTarget(classVisitor64);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer21.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type78 = interceptFieldTransformer5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo76);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
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
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.core.Signature signature20 = null;
        org.mockito.asm.Type type21 = null;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type21 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = interceptFieldTransformer4.begin_method((int) 'a', signature20, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@1e6d80cc");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer52.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer52);
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type60 = interceptFieldTransformer45.getClassType();
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
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
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        interceptFieldTransformer8.setTarget(classVisitor12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer36.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer51.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer66.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter71 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer72 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter71);
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer72.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter77 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer78 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter77);
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer78.getClassInfo();
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        interceptFieldTransformer72.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer72.getClassInfo();
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer17.getClassInfo();
        java.lang.String[] strArray98 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor99 = interceptFieldTransformer17.visitMethod((int) ' ', "", "hi!", "", strArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@54150fc4");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo79);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo86);
        org.junit.Assert.assertNull(classInfo89);
        org.junit.Assert.assertNull(classInfo92);
        org.junit.Assert.assertNotNull(strArray98);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter31 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer32 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer32.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer32.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        interceptFieldTransformer32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer36);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer39.getClassInfo();
        interceptFieldTransformer36.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer51.getClassInfo();
        interceptFieldTransformer48.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer39.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        interceptFieldTransformer59.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer67.getClassInfo();
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer62.getClassInfo();
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer62.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer62.end_class();
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
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer9.getClassInfo();
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer17.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor27 = interceptFieldTransformer17.visitAnnotation("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        interceptFieldTransformer58.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer77.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        org.mockito.cglib.core.Signature signature88 = null;
        org.mockito.asm.Type type89 = null;
        org.mockito.asm.Type[] typeArray90 = new org.mockito.asm.Type[] { type89 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter91 = interceptFieldTransformer77.begin_method(0, signature88, typeArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@48ca42ef");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNotNull(typeArray90);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer47.getClassInfo();
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
        org.mockito.asm.ClassVisitor classVisitor67 = null;
        interceptFieldTransformer63.setTarget(classVisitor67);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter69 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer70 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        interceptFieldTransformer70.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer70.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer70.visit((int) '#', (int) (short) 100, "", "", "hi!", strArray89);
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNotNull(strArray89);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        interceptFieldTransformer20.setTarget(classVisitor24);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer36.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        interceptFieldTransformer36.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer40);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer43.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer52.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer5.getClassInfo();
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = interceptFieldTransformer1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
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
            interceptFieldTransformer1.visitSource("hi!", "hi!");
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
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
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
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer19.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer19.visitEnd();
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
        org.junit.Assert.assertNull(classInfo27);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
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
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer56.visitEnd();
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
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter49 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer50 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter49);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter72 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer73 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter72);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer73.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter75 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer76 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer76.getClassInfo();
        interceptFieldTransformer73.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer76);
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer4.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type82 = interceptFieldTransformer4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo81);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
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
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.end_class();
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
        org.junit.Assert.assertNull(classInfo44);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
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
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter69 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer70 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer70.getClassInfo();
        interceptFieldTransformer65.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo78 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer65.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter80 = interceptFieldTransformer65.getStaticHook();
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
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertNull(classInfo79);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter49 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer50 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter49);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter54 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer55 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter54);
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer55.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer55.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        interceptFieldTransformer55.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer62.getClassInfo();
        interceptFieldTransformer59.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter73 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer74 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter73);
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer74.getClassInfo();
        interceptFieldTransformer71.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer74);
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer74);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer74);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter79 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer80 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter79);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter85 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer86 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter85);
        interceptFieldTransformer82.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer80.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        interceptFieldTransformer74.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        org.mockito.cglib.core.ClassInfo classInfo91 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNull(classInfo91);
        org.junit.Assert.assertNull(classInfo92);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
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
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer28.visit(1, (int) (byte) 10, "hi!", "", "", strArray52);
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
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
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
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.core.Signature signature43 = null;
        org.mockito.asm.Type type44 = null;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type44 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter46 = interceptFieldTransformer37.begin_method((int) (byte) 0, signature43, typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@4a43072a");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter23 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer24 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter23);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer29.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter60 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer61 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter60);
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer61.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer61.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        interceptFieldTransformer61.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter67 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer68 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter67);
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer68.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer68.getClassInfo();
        interceptFieldTransformer65.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer68);
        org.mockito.asm.ClassVisitor classVisitor72 = null;
        interceptFieldTransformer68.setTarget(classVisitor72);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        interceptFieldTransformer68.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        interceptFieldTransformer29.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter85 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer86 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter85);
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer86.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer86.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        org.mockito.cglib.core.ClassInfo classInfo90 = interceptFieldTransformer86.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer86);
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo93 = interceptFieldTransformer5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type94 = interceptFieldTransformer5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNull(classInfo90);
        org.junit.Assert.assertNull(classInfo92);
        org.junit.Assert.assertNull(classInfo93);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
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
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.asm.Attribute attribute31 = null;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer4.visitAttribute(attribute31);
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
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = interceptFieldTransformer7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@628963d");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
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
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter69 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer70 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer70.getClassInfo();
        interceptFieldTransformer65.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo78 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer65.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer65.visitEnd();
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
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertNull(classInfo79);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        interceptFieldTransformer8.setTarget(classVisitor12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer30.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer41.getClassInfo();
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter49 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer50 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer50.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer50.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer50.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer50.getClassInfo();
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer50);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        interceptFieldTransformer71.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer79.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer71.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        org.mockito.asm.ClassVisitor classVisitor89 = null;
        interceptFieldTransformer71.setTarget(classVisitor89);
        org.mockito.cglib.core.ClassInfo classInfo91 = interceptFieldTransformer71.getClassInfo();
        org.mockito.cglib.core.Signature signature93 = null;
        org.mockito.asm.Type type94 = null;
        org.mockito.asm.Type[] typeArray95 = new org.mockito.asm.Type[] { type94 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter96 = interceptFieldTransformer71.begin_method((int) (byte) -1, signature93, typeArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@6ce0bff4");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo91);
        org.junit.Assert.assertNotNull(typeArray95);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
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
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        interceptFieldTransformer8.setTarget(classVisitor12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter35 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer36 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer36.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer51.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter65 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer66 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter65);
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer66.getClassInfo();
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter71 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer72 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter71);
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer72.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter74 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer75 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer75.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter77 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer78 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter77);
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer78.getClassInfo();
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer78);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer82.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer75.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        interceptFieldTransformer72.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer75);
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer72.getClassInfo();
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer17.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type93 = interceptFieldTransformer17.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo79);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo86);
        org.junit.Assert.assertNull(classInfo89);
        org.junit.Assert.assertNull(classInfo92);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.Signature signature18 = null;
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type19 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = interceptFieldTransformer13.begin_method(0, signature18, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@5c2e03d0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        interceptFieldTransformer58.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer77.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer19.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer19.visitInnerClass("hi!", "hi!", "", 0);
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
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo88);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        org.mockito.asm.Type type36 = null;
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer25.declare_field((int) (byte) 10, "", type36, obj37);
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
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
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
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer30.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        interceptFieldTransformer12.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer30.visit((int) (short) 1, (int) (short) 100, "hi!", "", "", strArray47);
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
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter58 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer59 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter58);
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter63 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer64 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer64.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer64.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer59.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer59.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer59);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer59.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer59.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer59.visitEnd();
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
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer21.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer37.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer37.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.asm.ClassVisitor classVisitor64 = null;
        interceptFieldTransformer60.setTarget(classVisitor64);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo69 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter70 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer71 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter70);
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        interceptFieldTransformer21.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer71);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer21.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor80 = interceptFieldTransformer21.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo69);
        org.junit.Assert.assertNull(classInfo76);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
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
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer38.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer42);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        interceptFieldTransformer54.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer62.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer62.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter69 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer70 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer70.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer70.getClassInfo();
        interceptFieldTransformer65.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer70);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter81 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer82 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter81);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer79.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer82.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer82);
        java.lang.Class<?> wildcardClass87 = interceptFieldTransformer82.getClass();
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
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo76);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.asm.ClassVisitor classVisitor37 = null;
        interceptFieldTransformer33.setTarget(classVisitor37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.asm.Type type46 = null;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer33.begin_class((int) (byte) 1, 0, "", type46, typeArray47, "hi!");
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
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNotNull(typeArray47);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor56 = interceptFieldTransformer45.visitAnnotation("hi!", false);
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
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        org.mockito.cglib.core.ClassInfo classInfo76 = interceptFieldTransformer63.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor79 = interceptFieldTransformer63.visitAnnotation("", false);
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
        org.junit.Assert.assertNull(classInfo76);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        interceptFieldTransformer8.setTarget(classVisitor12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer8.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer28.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter31 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer32 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter31);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer32);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer35.getClassInfo();
        interceptFieldTransformer32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter51 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer52 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer52.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter54 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer55 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter54);
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer55.getClassInfo();
        interceptFieldTransformer52.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer55);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer55.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer55.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer55);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer47.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor67 = interceptFieldTransformer8.visitField(100, "hi!", "hi!", "", (java.lang.Object) classInfo66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
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
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.asm.Type type34 = null;
        org.mockito.asm.Type type35 = null;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type35 };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer23.begin_class((int) (byte) -1, (int) (byte) 10, "hi!", type34, typeArray36, "");
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
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = interceptFieldTransformer1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@3b07ead");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        interceptFieldTransformer20.setTarget(classVisitor24);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer31.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        interceptFieldTransformer31.setTarget(classVisitor36);
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer31.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type39 = interceptFieldTransformer31.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo38);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer67.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo86 = interceptFieldTransformer67.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type87 = interceptFieldTransformer67.getSuperType();
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
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo86);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer17.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter20 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer21 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter20);
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer21);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer17.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer40.getClassInfo();
        interceptFieldTransformer37.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer40);
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        interceptFieldTransformer40.setTarget(classVisitor44);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter50 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer51 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter50);
        interceptFieldTransformer47.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer51);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer63);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer57);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer57.getClassInfo();
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter83 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer84 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter83);
        interceptFieldTransformer80.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer84);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter86 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer87 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter86);
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer87.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo89 = interceptFieldTransformer87.getClassInfo();
        interceptFieldTransformer84.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer87);
        org.mockito.asm.ClassVisitor classVisitor91 = null;
        interceptFieldTransformer87.setTarget(classVisitor91);
        org.mockito.cglib.core.ClassInfo classInfo93 = interceptFieldTransformer87.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer87);
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer87);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor98 = interceptFieldTransformer57.visitAnnotation("hi!", true);
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
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNull(classInfo89);
        org.junit.Assert.assertNull(classInfo93);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer18);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer44.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer44.getClassInfo();
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer44);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer44.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo51);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer15.getClassInfo();
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter23 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer24 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer24.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter27 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer28 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter27);
        interceptFieldTransformer24.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer28);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo33 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer31.getClassInfo();
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer15.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer3.visitSource("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer3.visitOuterClass("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
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
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        interceptFieldTransformer8.setTarget(classVisitor12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer31.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer34.visitInnerClass("hi!", "hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo37);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
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
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer18);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter25 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer26 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer26.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter36 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer37 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter36);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer33.getClassInfo();
        interceptFieldTransformer30.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer33);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter41 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer42 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer42.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer42.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.Signature signature53 = null;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter55 = interceptFieldTransformer45.begin_method((int) (byte) 10, signature53, typeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@34a0d696");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNotNull(typeArray54);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer38.getClassInfo();
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
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer52.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer52);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter60 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer61 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter60);
        org.mockito.cglib.core.ClassInfo classInfo62 = interceptFieldTransformer61.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter63 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer64 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter63);
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer64.getClassInfo();
        interceptFieldTransformer61.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        interceptFieldTransformer52.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer64);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter71 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer72 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter71);
        org.mockito.cglib.core.ClassInfo classInfo73 = interceptFieldTransformer72.getClassInfo();
        interceptFieldTransformer69.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        org.mockito.cglib.core.ClassInfo classInfo75 = interceptFieldTransformer72.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        org.mockito.cglib.core.ClassInfo classInfo78 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo79 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer77.getClassInfo();
        interceptFieldTransformer72.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        interceptFieldTransformer64.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        org.mockito.cglib.core.ClassInfo classInfo83 = interceptFieldTransformer72.getClassInfo();
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer72);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter85 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer86 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter85);
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer86.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter88 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer89 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter88);
        org.mockito.cglib.core.ClassInfo classInfo90 = interceptFieldTransformer89.getClassInfo();
        interceptFieldTransformer86.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer89);
        org.mockito.cglib.core.ClassInfo classInfo92 = interceptFieldTransformer89.getClassInfo();
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer89);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer89);
        org.mockito.cglib.core.ClassInfo classInfo95 = interceptFieldTransformer5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor98 = interceptFieldTransformer5.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo62);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo73);
        org.junit.Assert.assertNull(classInfo75);
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertNull(classInfo79);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo83);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo90);
        org.junit.Assert.assertNull(classInfo92);
        org.junit.Assert.assertNull(classInfo95);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer3.getClassInfo();
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
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        java.lang.Class<?> wildcardClass28 = interceptFieldTransformer3.getClass();
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter55 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer56 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer56.getClassInfo();
        interceptFieldTransformer53.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer56);
        org.mockito.asm.ClassVisitor classVisitor60 = null;
        interceptFieldTransformer56.setTarget(classVisitor60);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter62 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer63 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo65 = interceptFieldTransformer63.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        interceptFieldTransformer63.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        interceptFieldTransformer56.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer67.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor72 = null;
        interceptFieldTransformer67.setTarget(classVisitor72);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer67);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter75 = interceptFieldTransformer3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@db167e1");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertNull(classInfo71);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
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
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer37.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = interceptFieldTransformer37.getAccess();
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
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        org.mockito.cglib.core.ClassInfo classInfo46 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer45.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter48 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer49 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter48);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer45.getClassInfo();
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter53 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer54 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo56 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo57 = interceptFieldTransformer54.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer54.getClassInfo();
        interceptFieldTransformer43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer54);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer54.getClassInfo();
        java.lang.String[] strArray66 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor67 = interceptFieldTransformer54.visitMethod(100, "hi!", "", "", strArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@6dbcd905");
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
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo56);
        org.junit.Assert.assertNull(classInfo57);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter16 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer17 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter16);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer17);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer17.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        interceptFieldTransformer20.setTarget(classVisitor24);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        interceptFieldTransformer5.setTarget(classVisitor35);
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer5.visitSource("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter7 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer8 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter7);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer10.getClassInfo();
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter29 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer30 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter29);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer30);
        org.mockito.cglib.core.ClassInfo classInfo32 = interceptFieldTransformer26.getClassInfo();
        interceptFieldTransformer23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer26);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = interceptFieldTransformer38.getClassInfo();
        interceptFieldTransformer35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer26.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter43 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer44 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter45 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer46 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer46.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter49 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer50 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter49);
        interceptFieldTransformer46.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer50);
        org.mockito.cglib.core.ClassInfo classInfo52 = interceptFieldTransformer46.getClassInfo();
        interceptFieldTransformer44.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer38.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer46);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter64 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer65 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter64);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer65.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo68 = interceptFieldTransformer65.getClassInfo();
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer65);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer60.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter72 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer73 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter72);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer73.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter75 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer76 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = interceptFieldTransformer76.getClassInfo();
        interceptFieldTransformer73.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer76);
        interceptFieldTransformer60.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer73);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo32);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo52);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo67);
        org.junit.Assert.assertNull(classInfo68);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo77);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer13.getClassInfo();
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer13);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter17 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer18 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = interceptFieldTransformer18.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter21 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer22 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter21);
        interceptFieldTransformer18.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter24 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer25 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer25.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter28 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer29 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter28);
        interceptFieldTransformer25.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer29);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer25.getClassInfo();
        interceptFieldTransformer22.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer25);
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer22);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer22.visit((int) (short) 1, (int) (short) 0, "hi!", "", "hi!", strArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer9.getClassInfo();
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter15 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer16 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer16.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        interceptFieldTransformer16.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter22 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer23 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer23.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer23.getClassInfo();
        interceptFieldTransformer20.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer23);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        java.lang.String[] strArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor35 = interceptFieldTransformer4.visitMethod(0, "hi!", "hi!", "", strArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@79eac03b");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(classInfo28);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        interceptFieldTransformer8.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter18 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer19 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter18);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer15.getClassInfo();
        interceptFieldTransformer12.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter23 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer24 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = interceptFieldTransformer24.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        interceptFieldTransformer24.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassInfo classInfo31 = interceptFieldTransformer15.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter32 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer33 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer33.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter38 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer39 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer39.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        interceptFieldTransformer39.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        interceptFieldTransformer33.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        interceptFieldTransformer15.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer39);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer39.visit((int) (byte) 1, (int) (short) 0, "", "hi!", "", strArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter39 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer40 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = interceptFieldTransformer40.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter42 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer43 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = interceptFieldTransformer43.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer47.getClassInfo();
        interceptFieldTransformer40.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        interceptFieldTransformer28.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type54 = interceptFieldTransformer47.getSuperType();
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
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo44);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer12 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter11);
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer12.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer12.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer12);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        interceptFieldTransformer1.setTarget(classVisitor18);
        java.lang.Class<?> wildcardClass20 = interceptFieldTransformer1.getClass();
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
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
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer28.visitInnerClass("", "hi!", "", 100);
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
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer1.visitSource("", "");
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
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter2 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer3 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = interceptFieldTransformer3.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer3);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter14 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer15 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter14);
        interceptFieldTransformer11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer15);
        org.mockito.cglib.core.ClassInfo classInfo17 = interceptFieldTransformer11.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter19 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer20 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = interceptFieldTransformer20.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer20);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter30 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer31 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter30);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer31);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter33 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer34 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer31.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        org.mockito.asm.ClassVisitor classVisitor38 = null;
        interceptFieldTransformer34.setTarget(classVisitor38);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo43 = interceptFieldTransformer41.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter44 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer45 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter44);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer34.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        interceptFieldTransformer3.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo50 = interceptFieldTransformer9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = interceptFieldTransformer9.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer9.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo51);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter4 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer5 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter4);
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer5);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter8 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer9 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter8);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter10 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer11 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo13 = interceptFieldTransformer11.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = interceptFieldTransformer11.getClassInfo();
        interceptFieldTransformer9.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer11);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer9.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer9);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer9.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor21 = interceptFieldTransformer9.visitAnnotation("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter0 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer1 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = interceptFieldTransformer1.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter3 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer4 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = interceptFieldTransformer4.getClassInfo();
        interceptFieldTransformer1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer4);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer4.getClassInfo();
        org.mockito.asm.Type type11 = null;
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter12 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer13 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter12);
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
        org.mockito.cglib.core.ClassInfo classInfo53 = interceptFieldTransformer34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer34.getClassInfo();
        interceptFieldTransformer13.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer34);
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer4.declare_field((int) ' ', "", type11, (java.lang.Object) interceptFieldTransformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
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
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter47 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer48 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = interceptFieldTransformer48.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer48);
        interceptFieldTransformer27.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = interceptFieldTransformer53.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer53.getClassInfo();
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter57 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer58 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = interceptFieldTransformer58.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter61 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer62 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter61);
        interceptFieldTransformer58.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer45.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer62);
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer45);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter66 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer67 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter66);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter68 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer69 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo71 = interceptFieldTransformer69.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo72 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer67.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.core.ClassInfo classInfo74 = interceptFieldTransformer69.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer69);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter76 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer77 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter76);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter78 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer79 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo81 = interceptFieldTransformer79.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = interceptFieldTransformer79.getClassInfo();
        interceptFieldTransformer77.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer79);
        org.mockito.cglib.core.ClassInfo classInfo84 = interceptFieldTransformer77.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo85 = interceptFieldTransformer77.getClassInfo();
        interceptFieldTransformer19.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer77);
        org.mockito.cglib.core.ClassInfo classInfo87 = interceptFieldTransformer19.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo88 = interceptFieldTransformer19.getClassInfo();
        java.lang.Class<?> wildcardClass89 = interceptFieldTransformer19.getClass();
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo31);
        org.junit.Assert.assertNull(classInfo35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertNull(classInfo60);
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertNull(classInfo72);
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertNull(classInfo80);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
        org.junit.Assert.assertNull(classInfo84);
        org.junit.Assert.assertNull(classInfo85);
        org.junit.Assert.assertNull(classInfo87);
        org.junit.Assert.assertNull(classInfo88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
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
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter52 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer53 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter52);
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer53);
        org.mockito.cglib.core.ClassInfo classInfo55 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter56 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer57 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = interceptFieldTransformer57.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter59 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer60 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer57.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        org.mockito.cglib.core.ClassInfo classInfo63 = interceptFieldTransformer60.getClassInfo();
        interceptFieldTransformer49.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer60);
        interceptFieldTransformer5.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer49);
        org.mockito.cglib.core.ClassInfo classInfo66 = interceptFieldTransformer49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo67 = interceptFieldTransformer49.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type68 = interceptFieldTransformer49.getClassType();
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
        org.junit.Assert.assertNull(classInfo55);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo61);
        org.junit.Assert.assertNull(classInfo63);
        org.junit.Assert.assertNull(classInfo66);
        org.junit.Assert.assertNull(classInfo67);
    }
}


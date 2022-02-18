import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

    public static boolean debug = false;

    @Test
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label0.info = label1;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters6 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("int", "int", "S");
        label0.info = arrayDelimiters6;
        java.lang.String str8 = label0.toString();
        java.lang.String str9 = label0.toString();
        java.lang.Object obj10 = label0.info;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((int) 'a', type14);
        java.lang.String str16 = type14.getClassName();
        int int18 = type14.getOpcode(1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((int) 'a', type25);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(154, type32);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type22, type23, type28, type29, type30, type32 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type14, typeArray34);
        org.mockito.asm.Type type37 = signature36.getReturnType();
        org.mockito.asm.Type type38 = signature36.getReturnType();
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local(97, type38);
        int int41 = type38.getOpcode(97);
        label0.info = 97;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) 'a', type47);
        org.mockito.asm.Type type49 = local48.getType();
        org.mockito.asm.Type type50 = local48.getType();
        java.lang.String str51 = type50.getDescriptor();
        java.lang.String str52 = type50.getDescriptor();
        boolean boolean53 = type44.equals((java.lang.Object) type50);
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(126, type44);
        org.mockito.asm.Type type55 = local54.getType();
        java.lang.String str56 = type55.getClassName();
        int int57 = type55.getSize();
        label0.info = type55;
        int int60 = type55.getOpcode(0);
        int int62 = type55.getOpcode(36);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1652185451" + "'", str8, "L1652185451");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1652185451" + "'", str9, "L1652185451");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "int" + "'", str16, "int");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "S" + "'", str21, "S");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "B" + "'", str45, "B");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "I" + "'", str51, "I");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "I" + "'", str52, "I");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "byte" + "'", str56, "byte");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 36 + "'", int62 == 36);
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters3 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("L39108396", "L2032444690", "B");
    }
}

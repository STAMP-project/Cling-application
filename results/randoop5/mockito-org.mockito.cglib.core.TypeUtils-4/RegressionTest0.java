import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray1 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.core.TypeUtils.isArray(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("hi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.cglib.core.MethodInfo methodInfo0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.core.TypeUtils.isConstructor(methodInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang.hi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang.hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.Class<?> wildcardClass3 = typeArray1.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.hi!" + "'", str1, "Java.lang.hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang.hi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang$2Ehi!" + "'", str1, "java$2Elang$2Ehi!");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java.lang.hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2Elang$2Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242Elang$242Ehi!" + "'", str1, "java$242Elang$242Ehi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.hi!" + "'", str1, "Java.lang.hi!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang" + "'", str1, "Java.lang");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ehi!" + "'", str1, "Java$2Elang$2Ehi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ehi!" + "'", str1, "Java$2Elang$2Ehi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$242Elang$242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242Ehi!" + "'", str1, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = null;
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang" + "'", str1, "java$2Elang");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang");
        java.lang.Class<?> wildcardClass2 = signature1.getClass();
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getComponentType(type23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242Ehi!" + "'", str1, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$24242Elang$24242Ehi!" + "'", str1, "java$24242Elang$24242Ehi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getClassName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Hi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2Elang$2Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242Ehi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java.lang");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getComponentType(type11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.Class<?> wildcardClass40 = typeArray38.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class<?> wildcardClass6 = signature5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2424242Elang$2424242Ehi!" + "'", str1, "java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java" + "'", str1, "Java");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.asm.Type[] typeArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java" + "'", str1, "Java");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.Class<?> wildcardClass24 = type19.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(signature15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getBoxedType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$24242Elang$24242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass6 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.Class<?> wildcardClass4 = typeArray1.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(signature3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242Ehi!" + "'", str1, "Java$24242Elang$24242Ehi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getComponentType(type30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getComponentType(type16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang" + "'", str1, "Java$2Elang");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242Elang$2424242Ehi!" + "'", str1, "Java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.Class<?> wildcardClass31 = signature30.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang" + "'", str1, "Java.lang");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getComponentType(type16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242Elang$2424242Ehi!" + "'", str1, "Java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2Elang");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242Ehi!" + "'", str1, "Java$24242Elang$24242Ehi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.Class<?> wildcardClass8 = typeArray7.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242Elang" + "'", str1, "java$242Elang");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Class[] classArray0 = null;
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$242Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.asm.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang" + "'", str1, "Java$242Elang");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getComponentType(type31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        java.lang.Class<?> wildcardClass32 = typeArray27.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getComponentType(type12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242Ehi!" + "'", str1, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray38);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.String[] strArray5 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2Elang");
        java.lang.Class<?> wildcardClass2 = signature1.getClass();
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type14);
        java.lang.Class<?> wildcardClass18 = typeArray6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$242Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String[] strArray0 = null;
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type14);
        java.lang.Class<?> wildcardClass18 = type14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242Elang$242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getComponentType(type13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray27);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        int int30 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray27);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray45);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242Elang$24242Ehi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/Java$24242Elang$24242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.Class<?> wildcardClass33 = strArray32.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type18);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = null;
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$24242Elang$24242Ehi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava$24242Elang$24242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        java.lang.Class<?> wildcardClass28 = typeArray27.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang.Java$2Elang$2Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        java.lang.Class<?> wildcardClass3 = typeArray2.getClass();
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type14);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242Ehi!" + "'", str1, "Java$24242Elang$24242Ehi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$24242Elang$24242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang" + "'", str1, "Java$24242Elang");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$24242Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242424242Elang$242424242Ehi!" + "'", str1, "java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.asm.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.Class<?> wildcardClass14 = typeArray12.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.Class<?> wildcardClass6 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        java.lang.Class<?> wildcardClass30 = classArray24.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ehi!" + "'", str1, "Java$2Elang$2Ehi!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type5);
        java.lang.String[] strArray10 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type16, type19, type22 };
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type34, type37, type40 };
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int47 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type52);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type46, type49, type52 };
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isPrimitive(type60);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getBoxedType(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type62);
        boolean boolean65 = org.mockito.cglib.core.TypeUtils.isArray(type62);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getComponentType(type62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.hi!" + "'", str41, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeArray66);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray61);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type66);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray50);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray31);
        int int72 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray31);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang$2EJava$242Elang$242Ehi!" + "'", str1, "java$2Elang$2EJava$242Elang$242Ehi!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        java.lang.Class<?> wildcardClass19 = typeArray18.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        int int57 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type54);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type59);
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type43, type48, type50, type54, type59 };
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type65);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray69);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray69);
        java.lang.Class<?> wildcardClass73 = typeArray69.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(signature70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(signature72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242Elang");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$24242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getComponentType(type19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type18);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray19);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}


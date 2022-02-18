import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "()" + "'", str1, "()");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        java.lang.Class<?> wildcardClass1 = namePosition0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(1, (int) (byte) 1, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 1?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, jSType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = com.google.javascript.rhino.jstype.JSType.NOT_ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(hi!)" + "'", str1, "(hi!)");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 0, (int) (byte) 10, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 0?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.Class<?> wildcardClass4 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        java.lang.Class<?> wildcardClass4 = namePosition0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(true)" + "'", str1, "(true)");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        java.lang.Class<?> wildcardClass3 = marker0.getClass();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 100, (int) (short) -1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.lang.Class<?> wildcardClass6 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(JSDocInfo)" + "'", str1, "(JSDocInfo)");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        boolean boolean7 = jSDocInfo0.isConstant();
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(true)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.union(booleanLiteralSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', (-1), 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = null;
        namePosition0.setItem(node6);
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '4', 10, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', 97, (int) (short) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Not declared as a type name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Not declared as a type name)" + "'", str1, "(Not declared as a type name)");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.union(booleanLiteralSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 100, (int) (short) -1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("Named type with empty name component");
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.Class<?> wildcardClass5 = strSet4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getTypedefType();
        java.lang.Class<?> wildcardClass2 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        int int10 = namePosition0.getPositionOnStartLine();
        int int11 = namePosition0.getPositionOnEndLine();
        int int12 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node13 = namePosition0.getItem();
        int int14 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) ' ', (int) (short) 10, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("Named type with empty name component");
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        java.lang.String str4 = jSDocInfo0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.union(booleanLiteralSet3);
        boolean boolean6 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.union(booleanLiteralSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        java.lang.Class<?> wildcardClass5 = marker0.getClass();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        stringPosition0.setItem("(hi!)");
        stringPosition0.setItem("(Not declared as a type name)");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 10, (int) (short) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = null;
        namePosition0.setItem(node6);
        int int8 = namePosition0.getEndLine();
        int int9 = namePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) 'a', (int) (short) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(35, (int) (byte) 100, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '#', 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "Not declared as a constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue20.or(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue8.xor(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue27.or(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue31.or(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue27.xor(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue36.or(ternaryValue38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue33.xor(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue26.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue26.xor(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue8.xor(ternaryValue46);
        java.lang.String str48 = ternaryValue8.toString();
        java.lang.String str49 = ternaryValue8.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "false" + "'", str48, "false");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "false" + "'", str49, "false");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("unknown");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(unknown)" + "'", str1, "(unknown)");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 10, (int) (byte) 10, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        int int8 = namePosition0.getPositionOnEndLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node11 = null;
        namePosition0.setItem(node11);
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 1, 35, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 1?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getReturnType();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getBaseType();
        java.lang.String str13 = jSDocInfo0.toString();
        boolean boolean14 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSDocInfo" + "'", str13, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isNoShadow();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getModifies();
        java.lang.Class<?> wildcardClass15 = strSet14.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        java.lang.String str10 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        java.lang.Class<?> wildcardClass4 = stringPosition0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isConstructor();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.Class<?> wildcardClass5 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        int int10 = stringPosition0.getPositionOnEndLine();
        int int11 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(1, (int) '4', (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 52?end-char: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.Class<?> wildcardClass5 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 100, 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isOverride();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.hasParameterType("Not declared as a type name");
        boolean boolean5 = jSDocInfo0.isOverride();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("Unknown class name");
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str11 = jSDocInfo10.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo10.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo10.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo10.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo10.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList18 = jSDocInfo10.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = jSDocInfo10.getVisibility();
        jSDocInfo0.setVisibility(visibility19);
        boolean boolean21 = jSDocInfo0.isIdGenerator();
        java.lang.Class<?> wildcardClass22 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNotNull(jSTypeExpressionList18);
        org.junit.Assert.assertTrue("'" + visibility19 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility19.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        jSDocInfo0.setDeprecated(true);
        java.lang.Class<?> wildcardClass6 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue3.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue7.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue3.xor(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue12.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue9.xor(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue2.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue2.xor(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue0.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue23.xor(ternaryValue24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Named type with empty name component");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Named type with empty name component)" + "'", str1, "(Named type with empty name component)");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(100, (int) (short) 1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(Not declared as a type name)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("()");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(())" + "'", str1, "(())");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        java.lang.String str9 = stringPosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(100, (int) (byte) 10, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 10?end-char: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(())");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasThisType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        boolean boolean13 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue1.xor(ternaryValue20);
        java.lang.Class<?> wildcardClass22 = ternaryValue21.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isNoCompile();
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) ' ', 100, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo0.setVisibility(visibility4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        java.lang.Class<?> wildcardClass11 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        com.google.javascript.rhino.Node node2 = null;
        typePosition0.setItem(node2);
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        typePosition0.setPositionInformation((int) (byte) 1, 0, (int) '4', 0);
        boolean boolean11 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) (byte) 10, (int) '#', (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 35?end-char: 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        java.lang.String str9 = jSDocInfo0.getMeaning();
        boolean boolean10 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str3 = ternaryValue2.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.and(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str6 = ternaryValue5.toString();
        java.lang.String str7 = ternaryValue5.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.or(ternaryValue5);
        java.lang.Class<?> wildcardClass9 = ternaryValue0.getClass();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "false" + "'", str6, "false");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "false" + "'", str7, "false");
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        java.lang.Class<?> wildcardClass5 = stringPosition0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = null;
        namePosition0.setItem(node6);
        int int8 = namePosition0.getEndLine();
        int int9 = namePosition0.getPositionOnEndLine();
        int int10 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 10, (int) (short) 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str7 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue6.xor(ternaryValue12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue16.or(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue20.or(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue16.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue24.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue15.xor(ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue12.or(ternaryValue26);
        boolean boolean29 = ternaryValue27.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        int int10 = namePosition0.getPositionOnStartLine();
        int int11 = namePosition0.getPositionOnEndLine();
        int int12 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node13 = namePosition0.getItem();
        int int14 = namePosition0.getPositionOnStartLine();
        int int15 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(35, 100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(Named type with empty name component)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((Named type with empty name component))" + "'", str1, "((Named type with empty name component))");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        boolean boolean9 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        boolean boolean10 = ternaryValue7.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue11.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue20.or(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue17.xor(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue23.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue28.or(ternaryValue30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue32.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue28.xor(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue34.xor(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue27.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue43.or(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue47.or(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue43.xor(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue27.xor(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue51.and(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue23.and(ternaryValue54);
        java.lang.String str57 = ternaryValue54.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue54.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue7.xor(ternaryValue54);
        java.lang.Class<?> wildcardClass60 = ternaryValue59.getClass();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "true" + "'", str57, "true");
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Not declared as a constructor");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Not declared as a constructor)" + "'", str1, "(Not declared as a constructor)");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        java.lang.String str3 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        boolean boolean10 = jSDocInfo0.hasParameter("Unknown class name");
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        boolean boolean11 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(())");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((()))" + "'", str1, "((()))");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.or(ternaryValue1);
        java.lang.String str3 = ternaryValue0.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unknown" + "'", str3, "unknown");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 100, (int) (byte) 0, (int) (short) 100, (int) 'a');
        java.lang.String str14 = stringPosition0.getItem();
        int int15 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(JSDocInfo)");
        int int18 = stringPosition0.getEndLine();
        java.lang.String str19 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JSDocInfo)" + "'", str19, "(JSDocInfo)");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(100, 32, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstant();
        jSDocInfo0.addSuppression("JSDocInfo");
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("(JSDocInfo)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(stringPosition6);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(100, 1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) ' ', (int) (short) 0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean12 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "((Named type with empty name component))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 100, (int) (byte) 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(hi!)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((hi!))" + "'", str1, "((hi!))");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Named type with empty name component");
        int int4 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(32, 35, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        boolean boolean9 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        boolean boolean11 = jSDocInfo0.isExpose();
        boolean boolean12 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility12);
        int int14 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        java.lang.String str9 = stringPosition0.getItem();
        java.lang.String str10 = stringPosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(32, (int) (byte) 10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(JSDocInfo)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 100, 32, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean12 = jSDocInfo0.isDeprecated();
        boolean boolean13 = jSDocInfo0.hasFileOverview();
        int int14 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str2 = ternaryValue1.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue3.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue7.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue5.xor(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue12.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue16.or(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue14.xor(ternaryValue19);
        java.lang.String str21 = ternaryValue20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue11.xor(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue22.and(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue1.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue28.or(ternaryValue30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue32.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue28.xor(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue34.xor(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue27.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue43.or(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue47.or(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue43.xor(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue27.xor(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue22.xor(ternaryValue52);
        boolean boolean55 = ternaryValue53.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "false" + "'", str21, "false");
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("Named type with empty name component");
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasThisType();
        boolean boolean12 = jSDocInfo0.hasThisType();
        boolean boolean13 = jSDocInfo0.hasReturnType();
        boolean boolean14 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("unknown");
        boolean boolean10 = jSDocInfo0.hasDescriptionForParameter("(unknown)");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        java.lang.Class<?> wildcardClass12 = markerCollection11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(markerCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(JSDocInfo)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((JSDocInfo))" + "'", str1, "((JSDocInfo))");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean11 = booleanLiteralSet9.contains(true);
        boolean boolean13 = booleanLiteralSet9.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean17 = booleanLiteralSet15.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet15.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = booleanLiteralSet14.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet9.union(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanLiteralSet0.union(booleanLiteralSet9);
        java.lang.Class<?> wildcardClass23 = booleanLiteralSet9.getClass();
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(Not declared as a constructor)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((Not declared as a constructor))" + "'", str1, "((Not declared as a constructor))");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getPositionOnEndLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        int int5 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '#', (int) (byte) 100, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        int int7 = stringPosition0.getEndLine();
        java.lang.String str8 = stringPosition0.getItem();
        int int9 = stringPosition0.getEndLine();
        java.lang.String str10 = stringPosition0.getItem();
        int int11 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(35, (int) (byte) 100, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.toString();
        java.lang.Class<?> wildcardClass5 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        boolean boolean10 = jSDocInfo0.isExpose();
        java.lang.String str11 = jSDocInfo0.getDescription();
        boolean boolean13 = jSDocInfo0.hasParameter("((()))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node3 = namePosition0.getItem();
        int int4 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 1, (int) (byte) 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 0?end-char: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        int int8 = namePosition0.getPositionOnEndLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 0, (-1), (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 0?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.lang.String str11 = jSDocInfo0.toString();
        java.lang.String str12 = jSDocInfo0.getLendsName();
        java.lang.String str13 = jSDocInfo0.getFileOverview();
        boolean boolean14 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSDocInfo" + "'", str11, "JSDocInfo");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean12 = booleanLiteralSet10.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet9.intersection(booleanLiteralSet10);
        boolean boolean15 = booleanLiteralSet9.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet0.union(booleanLiteralSet9);
        java.lang.Class<?> wildcardClass17 = booleanLiteralSet16.getClass();
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        java.lang.String str5 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strCollection4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean7 = booleanLiteralSet5.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet5.union(booleanLiteralSet8);
        boolean boolean11 = booleanLiteralSet5.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet4.intersection(booleanLiteralSet5);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet1.intersection(booleanLiteralSet12);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean16 = booleanLiteralSet14.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = booleanLiteralSet12.union(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet0.union(booleanLiteralSet17);
        boolean boolean20 = booleanLiteralSet18.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        boolean boolean9 = jSDocInfo0.hasParameter("(Not declared as a type name)");
        boolean boolean10 = jSDocInfo0.hasModifies();
        boolean boolean12 = jSDocInfo0.hasParameter("Not declared as a type name");
        boolean boolean13 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        boolean boolean4 = jSDocInfo0.isNoAlias();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue1.xor(ternaryValue20);
        java.lang.Class<?> wildcardClass22 = ternaryValue20.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("Not declared as a type name");
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("()");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertNull(visibility11);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getPositionOnEndLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(100, (int) ' ', (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue20.xor(ternaryValue25);
        java.lang.String str27 = ternaryValue26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue17.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue17.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue8.or(ternaryValue17);
        java.lang.String str35 = ternaryValue34.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue38.xor(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue46.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue37.xor(ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue34.and(ternaryValue47);
        boolean boolean51 = ternaryValue49.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "false" + "'", str27, "false");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "unknown" + "'", str35, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        int int10 = stringPosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) 100, (int) (byte) 0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(100, (int) (short) 0, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("Named type with empty name component");
        java.lang.String str9 = jSDocInfo0.toString();
        boolean boolean10 = jSDocInfo0.isOverride();
        boolean boolean11 = jSDocInfo0.isInterface();
        java.lang.Class<?> wildcardClass12 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue19.and(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue19.or(ternaryValue22);
        boolean boolean29 = ternaryValue27.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setItem("Not declared as a constructor");
        stringPosition0.setItem("JSDocInfo");
        int int8 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(100, 35, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isInterface();
        boolean boolean8 = jSDocInfo0.isInterface();
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isNoShadow();
        int int14 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean9 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        stringPosition0.setItem("(hi!)");
        int int12 = stringPosition0.getPositionOnStartLine();
        java.lang.String str13 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) '4', (int) (byte) 100, 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(0, (int) '4', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 0?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(hi!)" + "'", str13, "(hi!)");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean13 = jSDocInfo0.isConstant();
        java.lang.Class<?> wildcardClass14 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean11 = booleanLiteralSet9.contains(true);
        boolean boolean13 = booleanLiteralSet9.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean17 = booleanLiteralSet15.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet15.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = booleanLiteralSet14.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet9.union(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanLiteralSet0.union(booleanLiteralSet9);
        boolean boolean24 = booleanLiteralSet22.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        java.lang.String str4 = stringPosition0.getItem();
        int int5 = stringPosition0.getStartLine();
        int int6 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue20.xor(ternaryValue25);
        java.lang.String str27 = ternaryValue26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue17.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue17.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue8.or(ternaryValue17);
        java.lang.String str35 = ternaryValue8.toString();
        java.lang.Class<?> wildcardClass36 = ternaryValue8.getClass();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "false" + "'", str27, "false");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "unknown" + "'", str35, "unknown");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(35, (int) (byte) 1, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstant();
        jSDocInfo0.addSuppression("JSDocInfo");
        java.lang.String str9 = jSDocInfo0.getLicense();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasParameterType("(hi!)");
        boolean boolean9 = jSDocInfo0.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        boolean boolean10 = jSDocInfo0.hasParameterType("Not declared as a constructor");
        boolean boolean11 = jSDocInfo0.hasBaseType();
        java.lang.String str12 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node13 = null;
        jSDocInfo0.setAssociatedNode(node13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        boolean boolean4 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = typePosition0.getItem();
        com.google.javascript.rhino.Node node6 = null;
        typePosition0.setItem(node6);
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(97, 0, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isIdGenerator();
        boolean boolean15 = jSDocInfo0.isExterns();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection16 = jSDocInfo0.getMarkers();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection17 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(markerCollection16);
        org.junit.Assert.assertNotNull(markerCollection17);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo0.setVisibility(visibility4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        boolean boolean11 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        java.lang.String str12 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility13);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = jSDocInfo0.getVisibility();
        boolean boolean16 = jSDocInfo0.isInterface();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection17 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSDocInfo" + "'", str12, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + visibility13 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility13.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility15 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility15.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeCollection17);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.union(booleanLiteralSet4);
        boolean boolean8 = booleanLiteralSet4.contains(true);
        boolean boolean10 = booleanLiteralSet4.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "((JSDocInfo))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean10 = jSDocInfo0.isConstant();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        boolean boolean12 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(true);
        boolean boolean4 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean8 = booleanLiteralSet6.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet6.union(booleanLiteralSet9);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = booleanLiteralSet5.union(booleanLiteralSet9);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet0.union(booleanLiteralSet5);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean16 = booleanLiteralSet14.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean20 = booleanLiteralSet18.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanLiteralSet18.union(booleanLiteralSet21);
        boolean boolean24 = booleanLiteralSet18.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = booleanLiteralSet17.intersection(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = booleanLiteralSet14.intersection(booleanLiteralSet25);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean29 = booleanLiteralSet27.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet25.union(booleanLiteralSet27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet13.union(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet0.intersection(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        boolean boolean36 = booleanLiteralSet34.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean40 = booleanLiteralSet38.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = booleanLiteralSet37.intersection(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet34.intersection(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = booleanLiteralSet32.intersection(booleanLiteralSet34);
        java.lang.Class<?> wildcardClass44 = booleanLiteralSet32.getClass();
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(Not declared as a constructor)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("Unknown class name");
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        boolean boolean11 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        boolean boolean12 = jSDocInfo0.hasReturnType();
        java.util.Collection<java.lang.String> strCollection13 = jSDocInfo0.getAuthors();
        boolean boolean14 = jSDocInfo0.isNoCompile();
        java.lang.String str15 = jSDocInfo0.toString();
        boolean boolean16 = jSDocInfo0.hasFileOverview();
        java.lang.String str17 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSDocInfo" + "'", str15, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getEndLine();
        int int8 = namePosition0.getStartLine();
        int int9 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 100, (int) (short) 0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection8 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(markerCollection8);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        boolean boolean12 = jSDocInfo0.hasParameterType("");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node14 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo0.getParameterNames();
        boolean boolean16 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(markerCollection13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        boolean boolean5 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue9.xor(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue15.xor(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue8.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue6.or(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue0.and(ternaryValue23);
        java.lang.String str26 = ternaryValue23.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "true" + "'", str26, "true");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(visibility3);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        boolean boolean11 = jSDocInfo0.isExpose();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        int int10 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(32, (int) (short) 10, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        int int10 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("hi!");
        java.lang.Class<?> wildcardClass13 = stringPosition0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        jSDocInfo0.addSuppression("((hi!))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isExterns();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("true");
        boolean boolean13 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isConstant();
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        boolean boolean6 = jSDocInfo0.isInterface();
        java.lang.String str7 = jSDocInfo0.getVersion();
        boolean boolean9 = jSDocInfo0.hasParameter("Unknown class name");
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        boolean boolean7 = jSDocInfo0.isConstructor();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        boolean boolean9 = jSDocInfo0.hasTypedefType();
        boolean boolean10 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Named type with empty name component");
        int int4 = stringPosition0.getPositionOnStartLine();
        int int5 = stringPosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(10, 32, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.lang.String str8 = jSDocInfo0.getFileOverview();
        boolean boolean9 = jSDocInfo0.hasBaseType();
        jSDocInfo0.addSuppression("JSDocInfo");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(Named type with empty name component)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        java.lang.String str12 = jSDocInfo0.toString();
        boolean boolean13 = jSDocInfo0.isJavaDispatch();
        java.lang.String str14 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSDocInfo" + "'", str12, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        stringPosition0.setItem("(Not declared as a type name)");
        int int10 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(JSDocInfo)");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(0, 52, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 52?end-char: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(false)" + "'", str1, "(false)");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        int int7 = stringPosition0.getEndLine();
        java.lang.String str8 = stringPosition0.getItem();
        int int9 = stringPosition0.getEndLine();
        java.lang.String str10 = stringPosition0.getItem();
        int int11 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(1, (-1), (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 1?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue3.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue7.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue3.xor(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue12.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue9.xor(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue2.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue0.or(ternaryValue17);
        java.lang.String str19 = ternaryValue0.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue20.or(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue24.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue22.xor(ternaryValue27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue33.or(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue31.xor(ternaryValue36);
        java.lang.String str38 = ternaryValue37.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue28.xor(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue40.or(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue28.xor(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue0.or(ternaryValue28);
        boolean boolean47 = ternaryValue0.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "unknown" + "'", str19, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "false" + "'", str38, "false");
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        boolean boolean6 = jSDocInfo0.isInterface();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(())");
        stringPosition0.setItem("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(0, 1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 1?end-char: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        java.lang.String str4 = jSDocInfo0.getSourceName();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getReturnDescription();
        boolean boolean3 = jSDocInfo0.isDefine();
        boolean boolean4 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.Node node5 = null;
        jSDocInfo0.setAssociatedNode(node5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility4);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        java.lang.String str8 = jSDocInfo0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSDocInfo" + "'", str8, "JSDocInfo");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getEndLine();
        int int8 = namePosition0.getPositionOnEndLine();
        java.lang.Class<?> wildcardClass9 = namePosition0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str15 = jSDocInfo0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((JSDocInfo))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((JSDocInfo)))" + "'", str1, "(((JSDocInfo)))");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue20.xor(ternaryValue25);
        java.lang.String str27 = ternaryValue26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue17.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue17.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue8.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str36 = ternaryValue35.toString();
        java.lang.String str37 = ternaryValue35.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue38.xor(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str50 = ternaryValue49.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue47.and(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue38.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue35.and(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue34.and(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue55.or(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = ternaryValue59.or(ternaryValue61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue57.xor(ternaryValue62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue64.or(ternaryValue66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue68.or(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue64.xor(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue72.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = ternaryValue62.or(ternaryValue72);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue35.or(ternaryValue72);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue35.not();
        java.lang.String str77 = ternaryValue35.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str79 = ternaryValue78.toString();
        java.lang.String str80 = ternaryValue78.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = ternaryValue81.or(ternaryValue83);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue88 = ternaryValue85.or(ternaryValue87);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = ternaryValue81.xor(ternaryValue87);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str93 = ternaryValue92.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue94 = ternaryValue90.and(ternaryValue92);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = ternaryValue81.or(ternaryValue94);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = ternaryValue78.and(ternaryValue94);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = ternaryValue96.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue98 = ternaryValue35.or(ternaryValue97);
        java.lang.String str99 = ternaryValue35.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "false" + "'", str27, "false");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "false" + "'", str36, "false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "false" + "'", str37, "false");
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "true" + "'", str50, "true");
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "false" + "'", str77, "false");
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "false" + "'", str79, "false");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "false" + "'", str80, "false");
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(ternaryValue87);
        org.junit.Assert.assertNotNull(ternaryValue88);
        org.junit.Assert.assertNotNull(ternaryValue89);
        org.junit.Assert.assertNotNull(ternaryValue90);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "true" + "'", str93, "true");
        org.junit.Assert.assertNotNull(ternaryValue94);
        org.junit.Assert.assertNotNull(ternaryValue95);
        org.junit.Assert.assertNotNull(ternaryValue96);
        org.junit.Assert.assertNotNull(ternaryValue97);
        org.junit.Assert.assertNotNull(ternaryValue98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "false" + "'", str99, "false");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isHidden();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        boolean boolean10 = jSDocInfo0.hasParameter("(Named type with empty name component)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean4 = booleanLiteralSet2.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet2.intersection(booleanLiteralSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue19.and(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue19.or(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue27.or(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue30.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue34.or(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue30.xor(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str42 = ternaryValue41.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue39.and(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue30.or(ternaryValue43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue30.not();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue29.xor(ternaryValue30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "true" + "'", str42, "true");
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        jSDocInfo0.addSuppression("");
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfo0.setAssociatedNode(node8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((hi!))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((hi!)))" + "'", str1, "(((hi!)))");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        int int4 = namePosition0.getPositionOnEndLine();
        namePosition0.setPositionInformation((-1), (int) (byte) 10, (int) (byte) 10, (int) (byte) 100);
        int int10 = namePosition0.getPositionOnEndLine();
        int int11 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node12 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        int int4 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node5 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        int int8 = namePosition0.getPositionOnEndLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node11 = null;
        namePosition0.setItem(node11);
        com.google.javascript.rhino.Node node13 = namePosition0.getItem();
        com.google.javascript.rhino.Node node14 = namePosition0.getItem();
        com.google.javascript.rhino.Node node15 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        jSDocInfo0.addSuppression("Unknown class name");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        stringPosition0.setItem("false");
        int int8 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Unknown class name");
        stringPosition0.setItem("false");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getStartLine();
        namePosition0.setPositionInformation((int) (byte) -1, 1, (int) (byte) -1, (int) (short) 10);
        int int8 = namePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getType();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.or(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue22.xor(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue31.or(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue28.xor(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue21.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue21.xor(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue8.xor(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue46.or(ternaryValue48);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue50.or(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue46.xor(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue55.or(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue52.xor(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue45.or(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = ternaryValue43.or(ternaryValue60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = ternaryValue42.xor(ternaryValue60);
        boolean boolean64 = ternaryValue62.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setPositionInformation(10, (int) (short) 1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(32, (-1), (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        jSDocInfo0.setLicense("((()))");
        boolean boolean11 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        boolean boolean10 = jSDocInfo0.hasThisType();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        java.lang.String str12 = jSDocInfo0.getOriginalCommentString();
        boolean boolean13 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean5 = booleanLiteralSet3.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet2.intersection(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = booleanLiteralSet1.intersection(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean11 = booleanLiteralSet9.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet1.union(booleanLiteralSet9);
        boolean boolean14 = booleanLiteralSet9.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        boolean boolean11 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        boolean boolean7 = jSDocInfo0.hasModifies();
        jSDocInfo0.addSuppression("(unknown)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.isHidden();
        boolean boolean9 = jSDocInfo0.hasBaseType();
        boolean boolean10 = jSDocInfo0.containsDeclaration();
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getParameterNames();
        java.util.Collection<java.lang.String> strCollection13 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(strCollection13);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(32, (-1), (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(visibility6);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        int int8 = namePosition0.getPositionOnEndLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node11 = null;
        namePosition0.setItem(node11);
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(52, (int) (byte) 1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str7 = jSDocInfo0.getLicense();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setItem("Named type with empty name component");
        stringPosition0.setItem("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 10, 35, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.isDeprecated();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node12 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        int int6 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isExterns();
        boolean boolean14 = jSDocInfo0.isImplicitCast();
        boolean boolean15 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.isDeprecated();
        boolean boolean10 = jSDocInfo0.hasType();
        java.util.Collection<java.lang.String> strCollection11 = jSDocInfo0.getReferences();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strCollection11);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertNotNull(markerCollection13);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue21.or(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue17.xor(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue1.xor(ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue30.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue34.or(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue30.xor(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue39.or(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue36.xor(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue29.or(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue45.or(ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue29.xor(ternaryValue48);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue27.or(ternaryValue48);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue1.or(ternaryValue50);
        boolean boolean53 = ternaryValue1.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((Named type with empty name component))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((Named type with empty name component)))" + "'", str1, "(((Named type with empty name component)))");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strCollection7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        java.lang.String str5 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean5 = booleanLiteralSet3.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet2.intersection(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = booleanLiteralSet1.intersection(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean11 = booleanLiteralSet9.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet1.union(booleanLiteralSet9);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean16 = booleanLiteralSet14.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet14.union(booleanLiteralSet17);
        boolean boolean20 = booleanLiteralSet14.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet13.intersection(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean25 = booleanLiteralSet23.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = booleanLiteralSet22.intersection(booleanLiteralSet23);
        boolean boolean28 = booleanLiteralSet23.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = booleanLiteralSet13.union(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet9.union(booleanLiteralSet13);
        boolean boolean32 = booleanLiteralSet13.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getStartLine();
        java.lang.String str5 = stringPosition0.getItem();
        int int6 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) 10, (int) '4', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 52?end-char: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = null;
        jSDocInfo0.setVisibility(visibility11);
        java.lang.Class<?> wildcardClass13 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        java.lang.String str7 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.toString();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.Class<?> wildcardClass6 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isIdGenerator();
        boolean boolean15 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        stringPosition0.setItem("false");
        int int8 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 100, 97, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(true)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((true))" + "'", str1, "((true))");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasTypedefType();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        boolean boolean6 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.hasParameterType("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("Named type with empty name component");
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((JSDocInfo)))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((JSDocInfo))))" + "'", str1, "((((JSDocInfo))))");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((Not declared as a constructor))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((Not declared as a constructor)))" + "'", str1, "(((Not declared as a constructor)))");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str12 = ternaryValue11.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue9.and(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue0.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue19.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue15.xor(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue24.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue28.or(ternaryValue30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue26.xor(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue33.or(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue35.xor(ternaryValue40);
        java.lang.String str42 = ternaryValue41.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue32.xor(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue44.or(ternaryValue46);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue32.xor(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue23.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue14.and(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue51.or(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue55.or(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue53.xor(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue60.or(ternaryValue62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue64.or(ternaryValue66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue62.xor(ternaryValue67);
        java.lang.String str69 = ternaryValue68.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = ternaryValue59.xor(ternaryValue68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = ternaryValue71.or(ternaryValue73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue59.xor(ternaryValue71);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue14.xor(ternaryValue59);
        java.lang.String str77 = ternaryValue76.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "true" + "'", str12, "true");
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "false" + "'", str42, "false");
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "false" + "'", str69, "false");
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "unknown" + "'", str77, "unknown");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isInterface();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.union(booleanLiteralSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.union(booleanLiteralSet4);
        boolean boolean8 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean12 = booleanLiteralSet10.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = booleanLiteralSet10.union(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet9.union(booleanLiteralSet13);
        boolean boolean17 = booleanLiteralSet15.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet4.union(booleanLiteralSet15);
        boolean boolean20 = booleanLiteralSet15.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getSourceName();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        jSDocInfo0.setDeprecated(true);
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo0.getMarkers();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertNotNull(nodeCollection13);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((hi!)))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((hi!))))" + "'", str1, "((((hi!))))");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isHidden();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        java.lang.String str7 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getThisType();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue20.xor(ternaryValue25);
        java.lang.String str27 = ternaryValue26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue17.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue17.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue8.or(ternaryValue17);
        java.lang.String str35 = ternaryValue34.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue34.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue39.or(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue43.or(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue39.xor(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue47.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue38.xor(ternaryValue48);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue50.or(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue54.or(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue50.xor(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str62 = ternaryValue61.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue59.and(ternaryValue61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = ternaryValue50.or(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue49.xor(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue66.or(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue65.or(ternaryValue68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = ternaryValue36.or(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "false" + "'", str27, "false");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "unknown" + "'", str35, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "true" + "'", str62, "true");
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        java.lang.Class<?> wildcardClass7 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isExport();
        jSDocInfo0.setDeprecated(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "()");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getModifies();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getEndLine();
        int int4 = typePosition0.getEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) '#', (int) ' ', (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(unknown)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        java.lang.Class<?> wildcardClass5 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean11 = jSDocInfo0.hasParameter("((Not declared as a constructor))");
        boolean boolean12 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((hi!))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((hi!)))))" + "'", str1, "(((((hi!)))))");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasThisType();
        boolean boolean12 = jSDocInfo0.hasThisType();
        java.lang.String str13 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getReturnDescription();
        java.lang.String str3 = jSDocInfo0.getOriginalCommentString();
        java.lang.Class<?> wildcardClass4 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getPositionOnEndLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation((int) (byte) 1, (int) ' ', (int) ' ', (int) (byte) 100);
        java.lang.String str10 = stringPosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '#', 10, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "((((hi!))))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue1.xor(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        boolean boolean27 = ternaryValue22.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue31.or(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue35.or(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue31.xor(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue40.or(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue37.xor(ternaryValue43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue30.or(ternaryValue43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue28.or(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue22.and(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue48.or(ternaryValue50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue52.or(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue50.xor(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue57.or(ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = ternaryValue61.or(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue59.xor(ternaryValue64);
        java.lang.String str66 = ternaryValue65.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue56.xor(ternaryValue65);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue22.and(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue20.and(ternaryValue56);
        java.lang.String str70 = ternaryValue56.toString();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "false" + "'", str66, "false");
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "false" + "'", str70, "false");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        java.lang.String str9 = stringPosition0.getItem();
        int int10 = stringPosition0.getEndLine();
        stringPosition0.setItem("((()))");
        stringPosition0.setItem("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', (int) (byte) 10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isDefine();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean13 = jSDocInfo0.hasReturnType();
        java.lang.String str14 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getTypedefType();
        int int16 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean17 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        java.lang.String str5 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 100, (int) (byte) 0, (int) (short) 100, (int) 'a');
        java.lang.String str14 = stringPosition0.getItem();
        int int15 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(JSDocInfo)");
        int int18 = stringPosition0.getPositionOnStartLine();
        int int19 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(hi!)");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', (int) (byte) 0, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean14 = jSDocInfo0.hasParameterType("false");
        boolean boolean15 = jSDocInfo0.isJavaDispatch();
        boolean boolean16 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        boolean boolean11 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str7 = jSDocInfo6.getVersion();
        java.lang.String str8 = jSDocInfo6.getBlockDescription();
        java.lang.String str9 = jSDocInfo6.getFileOverview();
        boolean boolean10 = jSDocInfo6.isNoSideEffects();
        boolean boolean11 = jSDocInfo6.isOverride();
        java.lang.String str12 = jSDocInfo6.getLicense();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str14 = jSDocInfo13.getBlockDescription();
        boolean boolean15 = jSDocInfo13.hasReturnType();
        int int16 = jSDocInfo13.getImplementedInterfaceCount();
        boolean boolean17 = jSDocInfo13.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo13.getParameterType("Not declared as a constructor");
        boolean boolean20 = jSDocInfo13.isOverride();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo13.setVisibility(visibility21);
        jSDocInfo6.setVisibility(visibility21);
        jSDocInfo0.setVisibility(visibility21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + visibility21 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility21.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfo0.setAssociatedNode(node8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(52, 1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean8 = booleanLiteralSet6.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet5.intersection(booleanLiteralSet6);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet4.intersection(booleanLiteralSet6);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean14 = booleanLiteralSet12.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet12.union(booleanLiteralSet15);
        boolean boolean18 = booleanLiteralSet12.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet11.intersection(booleanLiteralSet12);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean23 = booleanLiteralSet21.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet20.intersection(booleanLiteralSet21);
        boolean boolean26 = booleanLiteralSet20.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = booleanLiteralSet11.union(booleanLiteralSet20);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet6.intersection(booleanLiteralSet11);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean32 = booleanLiteralSet30.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet30.union(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = booleanLiteralSet29.union(booleanLiteralSet33);
        boolean boolean37 = booleanLiteralSet33.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean40 = booleanLiteralSet38.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean44 = booleanLiteralSet42.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = booleanLiteralSet42.union(booleanLiteralSet45);
        boolean boolean48 = booleanLiteralSet42.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = booleanLiteralSet41.intersection(booleanLiteralSet42);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet38.intersection(booleanLiteralSet49);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        boolean boolean54 = booleanLiteralSet52.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean58 = booleanLiteralSet56.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet59 = booleanLiteralSet55.intersection(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = booleanLiteralSet52.intersection(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = booleanLiteralSet50.union(booleanLiteralSet60);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = booleanLiteralSet33.union(booleanLiteralSet61);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = booleanLiteralSet28.intersection(booleanLiteralSet62);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet65 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean67 = booleanLiteralSet65.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet68 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = booleanLiteralSet65.union(booleanLiteralSet68);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet70 = booleanLiteralSet64.union(booleanLiteralSet68);
        boolean boolean72 = booleanLiteralSet68.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet73 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean75 = booleanLiteralSet73.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet77 = booleanLiteralSet73.union(booleanLiteralSet76);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = booleanLiteralSet68.union(booleanLiteralSet73);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = booleanLiteralSet63.intersection(booleanLiteralSet68);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet59 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet59.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet65 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet65.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet68 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet68.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet70 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet70.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet73 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet73.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet77 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet77.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet79 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet79.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(false)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((false))" + "'", str1, "((false))");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        boolean boolean5 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setItem("Not declared as a constructor");
        stringPosition0.setItem("JSDocInfo");
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) '#', 97, 97);
        int int14 = stringPosition0.getEndLine();
        stringPosition0.setItem("(((JSDocInfo)))");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) 10, (int) ' ', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean12 = booleanLiteralSet10.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet9.intersection(booleanLiteralSet10);
        boolean boolean15 = booleanLiteralSet10.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet0.union(booleanLiteralSet10);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet0.union(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean21 = booleanLiteralSet19.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = booleanLiteralSet19.union(booleanLiteralSet22);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet18.intersection(booleanLiteralSet23);
        boolean boolean26 = booleanLiteralSet18.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet18.intersection(booleanLiteralSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((false))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((false)))" + "'", str1, "(((false)))");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        boolean boolean5 = ternaryValue0.toBoolean(true);
        boolean boolean7 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.not();
        boolean boolean10 = ternaryValue0.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue19.and(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue19.or(ternaryValue22);
        boolean boolean29 = ternaryValue22.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean12 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getType();
        jSDocInfo0.addSuppression("((JSDocInfo))");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet17 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.isHidden();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean6 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet4.union(booleanLiteralSet7);
        boolean boolean10 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = booleanLiteralSet3.intersection(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet0.intersection(booleanLiteralSet11);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean15 = booleanLiteralSet13.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet11.union(booleanLiteralSet13);
        boolean boolean18 = booleanLiteralSet11.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.lang.String str5 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        int int4 = namePosition0.getPositionOnEndLine();
        namePosition0.setPositionInformation((-1), (int) (byte) 10, (int) (byte) 10, (int) (byte) 100);
        int int10 = namePosition0.getPositionOnEndLine();
        int int11 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 100, (int) (byte) 100, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        int int10 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("()");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasParameter("Named type with empty name component");
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean6 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.lang.Class<?> wildcardClass12 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        com.google.javascript.rhino.Node node2 = null;
        typePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        boolean boolean7 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node8 = typePosition0.getItem();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        int int5 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        boolean boolean9 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean4 = jSDocInfo0.isHidden();
        boolean boolean5 = jSDocInfo0.isDefine();
        boolean boolean6 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str3 = ternaryValue2.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.and(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str6 = ternaryValue5.toString();
        java.lang.String str7 = ternaryValue5.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue0.and(ternaryValue9);
        java.lang.String str11 = ternaryValue9.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "false" + "'", str6, "false");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "false" + "'", str7, "false");
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "true" + "'", str11, "true");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        int int10 = jSDocInfo0.getParameterCount();
        boolean boolean11 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = null;
        namePosition0.setItem(node6);
        int int8 = namePosition0.getEndLine();
        int int9 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node10 = null;
        namePosition0.setItem(node10);
        java.lang.Class<?> wildcardClass12 = namePosition0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isExport();
        java.lang.String str11 = jSDocInfo0.getDeprecationReason();
        java.lang.String str12 = jSDocInfo0.getLicense();
        boolean boolean13 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str14 = jSDocInfo0.getLendsName();
        java.lang.String str15 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getEndLine();
        int int4 = typePosition0.getEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        int int7 = typePosition0.getPositionOnEndLine();
        int int8 = typePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) '#', (-1), 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasThisType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = jSDocInfo0.getVisibility();
        boolean boolean15 = jSDocInfo0.hasParameterType("(JSDocInfo)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(visibility13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.lang.String str8 = jSDocInfo0.getVersion();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(markerCollection9);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (byte) -1, (int) (short) 0, (int) ' ', 97);
        int int10 = stringPosition0.getPositionOnStartLine();
        java.lang.String str11 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        boolean boolean10 = jSDocInfo0.hasThisType();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        boolean boolean6 = jSDocInfo0.isInterface();
        boolean boolean7 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.isExport();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        java.lang.Class<?> wildcardClass10 = strSet9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        java.lang.String str9 = stringPosition0.getItem();
        stringPosition0.setItem("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) -1, 97, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 97?end-char: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasParameter("Named type with empty name component");
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getVersion();
        java.lang.String str10 = jSDocInfo8.getBlockDescription();
        java.lang.String str11 = jSDocInfo8.getFileOverview();
        boolean boolean12 = jSDocInfo8.isNoSideEffects();
        java.lang.String str13 = jSDocInfo8.getLicense();
        java.lang.String str14 = jSDocInfo8.getReturnDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = jSDocInfo8.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo8.getBaseType();
        boolean boolean17 = jSDocInfo8.hasReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str19 = jSDocInfo18.getVersion();
        java.lang.String str20 = jSDocInfo18.getBlockDescription();
        java.lang.String str21 = jSDocInfo18.getFileOverview();
        boolean boolean22 = jSDocInfo18.isNoSideEffects();
        java.lang.String str23 = jSDocInfo18.getLicense();
        boolean boolean24 = jSDocInfo18.hasModifies();
        boolean boolean25 = jSDocInfo18.isNoCompile();
        boolean boolean26 = jSDocInfo18.containsDeclaration();
        java.lang.String str28 = jSDocInfo18.getDescriptionForParameter("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList29 = jSDocInfo18.getThrownTypes();
        java.lang.String str30 = jSDocInfo18.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo18.setVisibility(visibility31);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = jSDocInfo18.getVisibility();
        jSDocInfo8.setVisibility(visibility33);
        jSDocInfo0.setVisibility(visibility33);
        boolean boolean36 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeExpressionList15);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(jSTypeExpressionList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "JSDocInfo" + "'", str30, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + visibility31 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility31.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        java.lang.String str10 = jSDocInfo0.getLicense();
        java.lang.Class<?> wildcardClass11 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        java.util.Collection<java.lang.String> strCollection11 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strCollection11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasParameterType("");
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        boolean boolean7 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.lang.String str11 = jSDocInfo0.toString();
        boolean boolean13 = jSDocInfo0.hasParameter("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSDocInfo" + "'", str11, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getEndLine();
        int int8 = namePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(35, (int) (byte) 10, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        int int3 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        boolean boolean6 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasTypedefType();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.containsDeclaration();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue1.xor(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue13.xor(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue13.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue12.xor(ternaryValue26);
        java.lang.Class<?> wildcardClass29 = ternaryValue26.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.Node node11 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasParameter("(Not declared as a type name)");
        boolean boolean4 = jSDocInfo0.containsDeclaration();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        jSDocInfo0.addSuppression("(JSDocInfo)");
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getStartLine();
        int int8 = namePosition0.getPositionOnStartLine();
        int int9 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(35, 35, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str2 = ternaryValue1.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue3.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue7.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue5.xor(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue12.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue16.or(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue14.xor(ternaryValue19);
        java.lang.String str21 = ternaryValue20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue11.xor(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue22.and(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue1.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.or(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue30.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue26.xor(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue35.or(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue32.xor(ternaryValue38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue1.xor(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue44.or(ternaryValue46);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue48.or(ternaryValue50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue44.xor(ternaryValue50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue53.or(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue50.xor(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue43.or(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue41.or(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue39.xor(ternaryValue58);
        java.lang.String str61 = ternaryValue58.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue62.or(ternaryValue64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue66.or(ternaryValue68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = ternaryValue62.xor(ternaryValue68);
        boolean boolean72 = ternaryValue62.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue58.xor(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "false" + "'", str21, "false");
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "true" + "'", str61, "true");
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(ternaryValue73);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        boolean boolean10 = jSDocInfo0.hasParameterType("((JSDocInfo))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        com.google.javascript.rhino.Node node2 = null;
        typePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        boolean boolean7 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) (short) 10, (-1), (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((true))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((true)))" + "'", str1, "(((true)))");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        java.lang.String str10 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        boolean boolean11 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setItem("Named type with empty name component");
        int int11 = stringPosition0.getStartLine();
        int int12 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.hasParameterType("(hi!)");
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getReferences();
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        boolean boolean10 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        java.lang.String str8 = jSDocInfo0.getFileOverview();
        boolean boolean9 = jSDocInfo0.hasThisType();
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean12 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.Node node13 = null;
        jSDocInfo0.setAssociatedNode(node13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("Unknown class name");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(Unknown class name)" + "'", str1, "(Unknown class name)");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        boolean boolean11 = jSDocInfo0.hasParameterType("(((hi!)))");
        jSDocInfo0.addSuppression("((Named type with empty name component))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        stringPosition0.setItem("false");
        stringPosition0.setItem("Named type with empty name component");
        java.lang.String str10 = stringPosition0.getItem();
        int int11 = stringPosition0.getEndLine();
        int int12 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Named type with empty name component" + "'", str10, "Named type with empty name component");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        java.lang.String str7 = jSDocInfo0.getVersion();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        boolean boolean9 = jSDocInfo0.hasReturnType();
        boolean boolean10 = jSDocInfo0.hasFileOverview();
        jSDocInfo0.setDeprecated(false);
        java.lang.Class<?> wildcardClass13 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        java.lang.String str7 = jSDocInfo0.toString();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSDocInfo" + "'", str7, "JSDocInfo");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setLicense("hi!");
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(markerCollection7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) 'a', (int) (short) 0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean12 = jSDocInfo0.containsDeclaration();
        boolean boolean13 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 100, (int) (byte) 0, (int) (short) 100, (int) 'a');
        stringPosition0.setPositionInformation(32, 0, (int) 'a', (int) (short) 10);
        int int19 = stringPosition0.getPositionOnStartLine();
        int int20 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        java.util.Collection<java.lang.String> strCollection11 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.Node node12 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(strCollection11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean11 = jSDocInfo0.hasParameter("(unknown)");
        int int12 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean9 = jSDocInfo0.hasParameterType("Unknown class name");
        boolean boolean11 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getStartLine();
        int int5 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) 'a', 0, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(typePosition7);
        org.junit.Assert.assertNull(typePosition8);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        boolean boolean9 = jSDocInfo0.isHidden();
        boolean boolean10 = jSDocInfo0.hasType();
        boolean boolean11 = jSDocInfo0.isNoSideEffects();
        boolean boolean12 = jSDocInfo0.isNoAlias();
        boolean boolean13 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        boolean boolean12 = jSDocInfo0.isOverride();
        java.lang.String str13 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        java.lang.String str7 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getBaseType();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition8);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("(hi!)");
        jSDocInfo0.addSuppression("(((hi!)))");
        java.lang.String str13 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnStartLine();
        int int8 = namePosition0.getStartLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '4', 32, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getAuthors();
        java.lang.String str13 = jSDocInfo0.getBlockDescription();
        java.lang.String str14 = jSDocInfo0.toString();
        java.lang.String str15 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSDocInfo" + "'", str14, "JSDocInfo");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.isDefine();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean9 = jSDocInfo0.hasParameter("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        stringPosition0.setItem("(hi!)");
        int int12 = stringPosition0.getPositionOnEndLine();
        int int13 = stringPosition0.getStartLine();
        int int14 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getPositionOnStartLine();
        boolean boolean5 = typePosition0.hasBrackets();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str12 = ternaryValue11.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue9.and(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue0.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue19.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue15.xor(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue24.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue28.or(ternaryValue30);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue26.xor(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue33.or(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue35.xor(ternaryValue40);
        java.lang.String str42 = ternaryValue41.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue32.xor(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue44.or(ternaryValue46);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue32.xor(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue23.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue14.and(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue53.or(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue57.or(ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = ternaryValue53.xor(ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue62.or(ternaryValue64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = ternaryValue59.xor(ternaryValue65);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue52.or(ternaryValue65);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue68.or(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue72.or(ternaryValue74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue68.xor(ternaryValue74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = ternaryValue52.xor(ternaryValue76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = ternaryValue50.xor(ternaryValue52);
        boolean boolean80 = ternaryValue52.toBoolean(true);
        boolean boolean82 = ternaryValue52.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "true" + "'", str12, "true");
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "false" + "'", str42, "false");
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        java.lang.String str10 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((()))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((())))" + "'", str1, "(((())))");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean11 = booleanLiteralSet9.contains(true);
        boolean boolean13 = booleanLiteralSet9.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean17 = booleanLiteralSet15.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet15.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = booleanLiteralSet14.union(booleanLiteralSet18);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = booleanLiteralSet9.union(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanLiteralSet0.union(booleanLiteralSet9);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean26 = booleanLiteralSet24.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = booleanLiteralSet23.intersection(booleanLiteralSet24);
        boolean boolean29 = booleanLiteralSet24.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet9.union(booleanLiteralSet24);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean34 = booleanLiteralSet32.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = booleanLiteralSet31.intersection(booleanLiteralSet32);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = booleanLiteralSet9.intersection(booleanLiteralSet32);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean40 = booleanLiteralSet38.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet38.union(booleanLiteralSet41);
        boolean boolean44 = booleanLiteralSet38.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = booleanLiteralSet37.intersection(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean49 = booleanLiteralSet47.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet46.intersection(booleanLiteralSet47);
        boolean boolean52 = booleanLiteralSet47.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = booleanLiteralSet37.union(booleanLiteralSet47);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = booleanLiteralSet32.intersection(booleanLiteralSet37);
        boolean boolean56 = booleanLiteralSet54.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility3);
        java.lang.String str6 = jSDocInfo0.getDescriptionForParameter("");
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("(())");
        java.lang.String str9 = jSDocInfo0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + visibility3 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility3.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str11 = jSDocInfo0.toString();
        boolean boolean12 = jSDocInfo0.hasThisType();
        boolean boolean13 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSDocInfo" + "'", str11, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isExport();
        boolean boolean6 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.isOverride();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasParameterType("Named type with empty name component");
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean10 = jSDocInfo0.hasParameterType("true");
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        boolean boolean12 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.hasParameterType("Not declared as a type name");
        jSDocInfo0.setDeprecated(true);
        java.lang.String str7 = jSDocInfo0.toString();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        boolean boolean9 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        java.lang.String str11 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSDocInfo" + "'", str7, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        jSDocInfo0.addSuppression("()");
        java.util.Collection<java.lang.String> strCollection14 = jSDocInfo0.getReferences();
        boolean boolean15 = jSDocInfo0.hasEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList16 = jSDocInfo0.getThrownTypes();
        boolean boolean17 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isExterns();
        boolean boolean14 = jSDocInfo0.isImplicitCast();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList15);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("(Not declared as a type name)");
        boolean boolean12 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '#', 52, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        java.lang.String str4 = jSDocInfo0.toString();
        jSDocInfo0.addSuppression("(Not declared as a type name)");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean6 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet4.union(booleanLiteralSet7);
        boolean boolean10 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = booleanLiteralSet3.intersection(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean15 = booleanLiteralSet13.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet4.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = booleanLiteralSet0.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet0.intersection(booleanLiteralSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str5 = jSDocInfo0.toString();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean12 = booleanLiteralSet10.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet9.intersection(booleanLiteralSet10);
        boolean boolean15 = booleanLiteralSet10.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet0.union(booleanLiteralSet10);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet0.union(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean21 = booleanLiteralSet19.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = booleanLiteralSet19.union(booleanLiteralSet22);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet18.intersection(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean27 = booleanLiteralSet25.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet18.union(booleanLiteralSet25);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet25.intersection(booleanLiteralSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean9 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean7 = jSDocInfo0.hasParameterType("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("");
        boolean boolean12 = jSDocInfo0.hasParameterType("(())");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        java.lang.String str10 = jSDocInfo0.getDescription();
        java.lang.String str11 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        boolean boolean10 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getEndLine();
        int int8 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 100, (int) (byte) -1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(52, 0, (int) (short) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isConstructor();
        java.lang.String str10 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(((false)))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        boolean boolean12 = jSDocInfo0.hasDescriptionForParameter("(((hi!)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        boolean boolean11 = jSDocInfo0.hasEnumParameterType();
        boolean boolean12 = jSDocInfo0.isNoAlias();
        int int13 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.isDeprecated();
        java.lang.String str8 = jSDocInfo0.getReturnDescription();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        boolean boolean11 = jSDocInfo0.hasParameter("((true))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        stringPosition0.setItem("true");
        java.lang.String str9 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean13 = jSDocInfo0.isConstant();
        java.lang.String str14 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str15 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        int int8 = jSDocInfo0.getParameterCount();
        java.lang.String str9 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        int int2 = namePosition0.getStartLine();
        int int3 = namePosition0.getStartLine();
        int int4 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (byte) 10, 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 10?end-char: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasThisType();
        boolean boolean12 = jSDocInfo0.hasThisType();
        boolean boolean13 = jSDocInfo0.isExterns();
        java.lang.String str14 = jSDocInfo0.getReturnDescription();
        java.lang.String str15 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str13 = jSDocInfo12.getVersion();
        java.lang.String str14 = jSDocInfo12.getBlockDescription();
        java.lang.String str15 = jSDocInfo12.getLicense();
        boolean boolean16 = jSDocInfo12.hasType();
        boolean boolean17 = jSDocInfo12.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str19 = jSDocInfo18.getVersion();
        java.lang.String str20 = jSDocInfo18.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo18.getExtendedInterfaces();
        java.lang.String str22 = jSDocInfo18.getOriginalCommentString();
        boolean boolean23 = jSDocInfo18.isImplicitCast();
        java.lang.String str24 = jSDocInfo18.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo18.getParameterType("Unknown class name");
        boolean boolean27 = jSDocInfo18.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str29 = jSDocInfo28.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo28.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo28.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility32 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo28.setVisibility(visibility32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo28.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList36 = jSDocInfo28.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = jSDocInfo28.getVisibility();
        jSDocInfo18.setVisibility(visibility37);
        jSDocInfo12.setVisibility(visibility37);
        jSDocInfo0.setVisibility(visibility37);
        boolean boolean41 = jSDocInfo0.isConstant();
        boolean boolean42 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + visibility32 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility32.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression35);
        org.junit.Assert.assertNotNull(jSTypeExpressionList36);
        org.junit.Assert.assertTrue("'" + visibility37 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility37.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isInterface();
        boolean boolean8 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        java.lang.Class<?> wildcardClass12 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((())))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((()))))" + "'", str1, "((((()))))");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        java.lang.Class<?> wildcardClass13 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("(JSDocInfo)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isConstructor();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        int int8 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("(())");
        boolean boolean11 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node12 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) 'a', (int) ' ', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        int int5 = jSDocInfo0.getParameterCount();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        boolean boolean7 = jSDocInfo0.isHidden();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isHidden();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("(((())))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isDefine();
        boolean boolean11 = jSDocInfo0.isNoSideEffects();
        jSDocInfo0.addSuppression("unknown");
        boolean boolean14 = jSDocInfo0.isExport();
        java.util.Collection<java.lang.String> strCollection15 = jSDocInfo0.getAuthors();
        boolean boolean16 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue20.xor(ternaryValue25);
        java.lang.String str27 = ternaryValue26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue17.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue17.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue8.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str36 = ternaryValue35.toString();
        java.lang.String str37 = ternaryValue35.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue38.xor(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str50 = ternaryValue49.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue47.and(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue38.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue35.and(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue34.and(ternaryValue35);
        boolean boolean56 = ternaryValue35.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "false" + "'", str27, "false");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "false" + "'", str36, "false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "false" + "'", str37, "false");
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "true" + "'", str50, "true");
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        int int7 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        int int10 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node11 = null;
        namePosition0.setItem(node11);
        int int13 = namePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '4', 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("true");
        int int4 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (short) 0, (int) (short) 10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 10, 32, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean6 = jSDocInfo0.isDefine();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        int int8 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        boolean boolean7 = jSDocInfo0.isConstructor();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        boolean boolean9 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        boolean boolean10 = jSDocInfo0.hasThisType();
        boolean boolean11 = jSDocInfo0.isInterface();
        boolean boolean12 = jSDocInfo0.isJavaDispatch();
        boolean boolean14 = jSDocInfo0.hasParameterType("unknown");
        boolean boolean15 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("");
        boolean boolean9 = jSDocInfo0.hasTypedefType();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getEndLine();
        boolean boolean4 = typePosition0.hasBrackets();
        int int5 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node6 = null;
        typePosition0.setItem(node6);
        boolean boolean8 = typePosition0.hasBrackets();
        boolean boolean9 = typePosition0.hasBrackets();
        boolean boolean10 = typePosition0.hasBrackets();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) ' ', (int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        jSDocInfo0.setLicense("Not declared as a constructor");
        java.lang.String str10 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        boolean boolean6 = jSDocInfo0.hasParameterType("(true)");
        int int7 = jSDocInfo0.getParameterCount();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isConstant();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("(((JSDocInfo)))");
        boolean boolean12 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isDefine();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setDeprecated(false);
        java.lang.String str13 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        boolean boolean5 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue9.xor(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue15.xor(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue8.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue6.or(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue0.and(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue33.or(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue29.xor(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue35.xor(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue28.or(ternaryValue41);
        boolean boolean45 = ternaryValue41.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str49 = ternaryValue48.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue46.and(ternaryValue48);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str52 = ternaryValue51.toString();
        java.lang.String str53 = ternaryValue51.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue46.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue41.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue0.and(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue0.not();
        java.lang.Class<?> wildcardClass58 = ternaryValue0.getClass();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "true" + "'", str49, "true");
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "false" + "'", str52, "false");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "false" + "'", str53, "false");
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("(Not declared as a constructor)");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        boolean boolean4 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = typePosition0.getItem();
        com.google.javascript.rhino.Node node6 = null;
        typePosition0.setItem(node6);
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) '4', 97, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((true)))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((true))))" + "'", str1, "((((true))))");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(((((hi!)))))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isConstructor();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 1, (int) 'a', (int) (byte) 10);
        int int6 = stringPosition0.getPositionOnStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 100, (int) (byte) 0, (int) (short) 100, (int) 'a');
        java.lang.String str14 = stringPosition0.getItem();
        int int15 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        int int18 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (byte) -1, 1, (int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isExterns();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        boolean boolean12 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "(((Named type with empty name component)))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean10 = jSDocInfo0.hasParameter("false");
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        boolean boolean12 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        boolean boolean4 = jSDocInfo0.isNoAlias();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("(JSDocInfo)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("Not declared as a constructor");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str12 = jSDocInfo0.getReturnDescription();
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isInterface();
        java.lang.String str16 = jSDocInfo0.getDescriptionForParameter("(JSDocInfo)");
        boolean boolean17 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        int int10 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isNoShadow();
        java.lang.String str14 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.Node node15 = null;
        jSDocInfo0.setAssociatedNode(node15);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection17 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(nodeCollection17);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        boolean boolean11 = jSDocInfo0.hasEnumParameterType();
        boolean boolean12 = jSDocInfo0.isConstant();
        jSDocInfo0.setDeprecated(false);
        jSDocInfo0.addSuppression("(((hi!)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.setDeprecated(false);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(nodeCollection8);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean4 = booleanLiteralSet2.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean10 = booleanLiteralSet8.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = booleanLiteralSet8.union(booleanLiteralSet11);
        boolean boolean14 = booleanLiteralSet8.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet7.intersection(booleanLiteralSet8);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean18 = booleanLiteralSet16.contains(true);
        boolean boolean20 = booleanLiteralSet16.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean24 = booleanLiteralSet22.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = booleanLiteralSet22.union(booleanLiteralSet25);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = booleanLiteralSet21.union(booleanLiteralSet25);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet16.union(booleanLiteralSet21);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = booleanLiteralSet7.union(booleanLiteralSet16);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean33 = booleanLiteralSet31.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet30.intersection(booleanLiteralSet31);
        boolean boolean36 = booleanLiteralSet31.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = booleanLiteralSet16.union(booleanLiteralSet31);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean41 = booleanLiteralSet39.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet38.intersection(booleanLiteralSet39);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = booleanLiteralSet16.intersection(booleanLiteralSet39);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean47 = booleanLiteralSet45.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet48 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = booleanLiteralSet45.union(booleanLiteralSet48);
        boolean boolean51 = booleanLiteralSet45.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = booleanLiteralSet44.intersection(booleanLiteralSet45);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean56 = booleanLiteralSet54.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = booleanLiteralSet53.intersection(booleanLiteralSet54);
        boolean boolean59 = booleanLiteralSet54.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = booleanLiteralSet44.union(booleanLiteralSet54);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = booleanLiteralSet39.intersection(booleanLiteralSet44);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = booleanLiteralSet0.union(booleanLiteralSet44);
        boolean boolean64 = booleanLiteralSet62.contains(true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet44 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet44.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet48 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet48.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        boolean boolean13 = jSDocInfo0.isNoShadow();
        boolean boolean15 = jSDocInfo0.hasParameter("Named type with empty name component");
        boolean boolean16 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.Node node17 = jSDocInfo0.getAssociatedNode();
        boolean boolean18 = jSDocInfo0.isExport();
        boolean boolean19 = jSDocInfo0.isNoCompile();
        boolean boolean20 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        boolean boolean7 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean3 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.union(booleanLiteralSet4);
        boolean boolean7 = booleanLiteralSet1.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean12 = booleanLiteralSet10.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet1.intersection(booleanLiteralSet10);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet1.union(booleanLiteralSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }
}


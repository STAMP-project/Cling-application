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
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            node6.setDouble((double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            node6.setLineno((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry1.createOptionalNullableType(jSType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry4.createParameters(jSTypeArray6);
        boolean boolean9 = jSTypeRegistry4.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry4.createObjectType(objectType10);
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("", (com.google.javascript.rhino.jstype.JSType) objectType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectType11);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node6.getStaticSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        com.google.javascript.rhino.Node node8 = node4.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node8.setLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        boolean boolean20 = jSTypeRegistry15.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry15.createObjectType(objectType21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry6.createObjectType("hi!", node13, objectType22);
        java.lang.String str24 = objectType23.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        boolean boolean31 = jSTypeRegistry26.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSTypeRegistry26.createObjectType(objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry39.createParameters(jSTypeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node47 = jSTypeRegistry44.createParameters(jSTypeArray46);
        boolean boolean49 = jSTypeRegistry44.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry44.createObjectType(objectType50);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry35.createObjectType("hi!", node42, objectType51);
        java.lang.String str53 = objectType52.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node58 = jSTypeRegistry55.createParameters(jSTypeArray57);
        boolean boolean60 = jSTypeRegistry55.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSTypeRegistry55.createObjectType(objectType61);
        boolean boolean63 = objectType62.isCheckedUnknownType();
        int int64 = objectType62.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        jSTypeRegistry66.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node69 = jSTypeRegistry66.createParameters(jSTypeArray68);
        boolean boolean71 = jSTypeRegistry66.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry66.createObjectType(objectType72);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = objectType73.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] { objectType23, objectType32, objectType52, objectType62, parameterizedType74 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList76 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76, jSTypeArray75);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node78 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNull(parameterizedType74);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Unknown class name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        boolean boolean11 = objectType8.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry13.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        boolean boolean28 = jSTypeRegistry23.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry23.createObjectType(objectType29);
        boolean boolean31 = objectType30.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry13.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean33 = objectType8.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean34 = objectType8.isNumberValueType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        node4.setLineno((int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        boolean boolean14 = node13.isAssignAdd();
        boolean boolean15 = node13.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        jSTypeRegistry17.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node20 = jSTypeRegistry17.createParameters(jSTypeArray19);
        com.google.javascript.rhino.Node node22 = node20.getAncestor(8);
        boolean boolean23 = node20.isLocalResultCall();
        int int24 = node20.getChildCount();
        com.google.javascript.rhino.Node node25 = node13.useSourceInfoFromForTree(node20);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean31 = node30.isAssignAdd();
        boolean boolean32 = node30.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        jSTypeRegistry34.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node37 = jSTypeRegistry34.createParameters(jSTypeArray36);
        com.google.javascript.rhino.Node node39 = node37.getAncestor(8);
        boolean boolean40 = node37.isLocalResultCall();
        int int41 = node37.getChildCount();
        com.google.javascript.rhino.Node node42 = node30.useSourceInfoFromForTree(node37);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node42);
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = parameterizedType33.setValidator(jSTypePredicate34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        com.google.javascript.rhino.Node node8 = node4.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = node8.isNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray4 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative3 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType5 = jSTypeRegistry1.createUnionType(jSTypeNativeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(errorReporter2);
        org.junit.Assert.assertNotNull(jSTypeNativeArray4);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.FunctionType functionType3 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry14.createParameters(jSTypeArray16);
        boolean boolean19 = jSTypeRegistry14.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry14.createObjectType(objectType20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry5.createObjectType("hi!", node12, objectType21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType3, (com.google.javascript.rhino.jstype.JSType) objectType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(errorReporter2);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectType22);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType33.findPropertyType("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType38 = jSType37.unboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertNull(jSType37);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        boolean boolean15 = jSTypeRegistry10.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry10.createObjectType(objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry1.createObjectType("hi!", node8, objectType17);
        java.lang.String str19 = objectType18.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType20 = objectType18.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jSType20.isConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        boolean boolean11 = objectType8.isStringObjectType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objectType8.setValidator(jSTypePredicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry14.createParameters(jSTypeArray16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean24 = jSTypeRegistry19.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry19.createObjectType(objectType25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry10.createObjectType("hi!", node17, objectType26);
        java.lang.String str28 = objectType27.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType27.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry1.createNullableType(jSType29);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry1.getNativeType(jSTypeNative31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSType30);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        node4.setLineno((int) (short) -1);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = node4.srcref(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = objectType8.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            node6.setLength(16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "PARAM_LIST");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType6 = jSTypeRegistry1.createUnionType(jSTypeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(strComparableList0);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType33.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = objectType36.hasProperty("PARAM_LIST");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objectType36);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry50.createObjectType(objectType56);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry41.createObjectType("hi!", node48, objectType57);
        java.lang.String str59 = objectType58.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        boolean boolean66 = jSTypeRegistry61.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry61.createObjectType(objectType67);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType68.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = jSTypeRegistry38.createParameterizedType(objectType58, (com.google.javascript.rhino.jstype.JSType) objectType68);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType70.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType72 = parameterizedType70.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType70.findPropertyType("Unknown class name");
        boolean boolean75 = parameterizedType70.isInstanceType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = parameterizedType33.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType70);
        com.google.javascript.rhino.jstype.JSType jSType77 = typePair76.typeB;
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(parameterizedType70);
        org.junit.Assert.assertNull(objectType71);
        org.junit.Assert.assertNull(enumElementType72);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(typePair76);
        org.junit.Assert.assertNotNull(jSType77);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet36 = enumElementType35.getOwnPropertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node4.getExistingIntProp((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isDefaultCase();
        boolean boolean7 = node4.isSetterDef();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean74 = functionType72.hasOwnProperty("PARAM_LIST");
        com.google.javascript.rhino.Node node75 = functionType72.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType33.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = objectType36.isUnionType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objectType36);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType37 = enumElementType35.getPropertyType("()");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry10.getTypesWithProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strList8.remove((java.lang.Object) jSTypeIterable13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        boolean boolean9 = node4.isObjectLit();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.Node node16 = node14.getAncestor(8);
        boolean boolean17 = node14.isStringKey();
        boolean boolean18 = node14.isTry();
        boolean boolean19 = node14.isAssign();
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objectType8.differsFrom(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        node35.removeProp(32);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType38 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node43 = jSTypeRegistry40.createParameters(jSTypeArray42);
        com.google.javascript.rhino.Node node45 = node43.getAncestor(8);
        boolean boolean46 = node43.isLocalResultCall();
        int int47 = node43.getChildCount();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.resetForTypeCheck();
        jSTypeRegistry49.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node56 = jSTypeRegistry53.createParameters(jSTypeArray55);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry49.createParameters(jSTypeArray55);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType38, node43, node57);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        boolean boolean65 = node64.isAssignAdd();
        boolean boolean66 = node64.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        jSTypeRegistry68.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node71 = jSTypeRegistry68.createParameters(jSTypeArray70);
        com.google.javascript.rhino.Node node73 = node71.getAncestor(8);
        boolean boolean74 = node71.isLocalResultCall();
        int int75 = node71.getChildCount();
        com.google.javascript.rhino.Node node76 = node64.useSourceInfoFromForTree(node71);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        jSTypeRegistry78.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node81 = jSTypeRegistry78.createParameters(jSTypeArray80);
        boolean boolean82 = node81.isAssignAdd();
        boolean boolean83 = node81.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84);
        jSTypeRegistry85.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node88 = jSTypeRegistry85.createParameters(jSTypeArray87);
        com.google.javascript.rhino.Node node90 = node88.getAncestor(8);
        boolean boolean91 = node88.isLocalResultCall();
        int int92 = node88.getChildCount();
        com.google.javascript.rhino.Node node93 = node81.useSourceInfoFromForTree(node88);
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node((int) (byte) 1, node76, node93);
        node76.putIntProp(8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            node35.replaceChildAfter(node43, node76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node6 = jSTypeRegistry3.createParameters(jSTypeArray5);
        boolean boolean7 = node6.isAssignAdd();
        boolean boolean8 = node6.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.Node node15 = node13.getAncestor(8);
        boolean boolean16 = node13.isStringKey();
        boolean boolean17 = node13.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        com.google.javascript.rhino.Node node29 = node27.getAncestor(8);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isTry();
        boolean boolean32 = node27.isAssign();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 0, node6, node13, node22, node27, 0, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node40 = jSTypeRegistry37.createParameters(jSTypeArray39);
        com.google.javascript.rhino.Node node42 = node40.getAncestor(8);
        boolean boolean43 = node40.isLocalResultCall();
        int int44 = node40.getChildCount();
        boolean boolean45 = node40.isCase();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node50 = jSTypeRegistry47.createParameters(jSTypeArray49);
        boolean boolean51 = node50.isAssignAdd();
        boolean boolean52 = node50.isNot();
        node50.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 1, node22, node40, node50, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        boolean boolean15 = jSTypeRegistry10.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry10.createObjectType(objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry1.createObjectType("hi!", node8, objectType17);
        com.google.javascript.rhino.Node node19 = node8.getFirstChild();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isStringKey();
        boolean boolean16 = node12.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        com.google.javascript.rhino.Node node28 = node26.getAncestor(8);
        boolean boolean29 = node26.isStringKey();
        boolean boolean30 = node26.isTry();
        boolean boolean31 = node26.isAssign();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 0, node5, node12, node21, node26, 0, (int) (byte) 100);
        node34.setSourceEncodedPosition(12);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry39.createParameters(jSTypeArray41);
        boolean boolean43 = node42.isAssignAdd();
        boolean boolean44 = node42.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node49 = jSTypeRegistry46.createParameters(jSTypeArray48);
        com.google.javascript.rhino.Node node51 = node49.getAncestor(8);
        boolean boolean52 = node49.isStringKey();
        boolean boolean53 = node49.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node58 = jSTypeRegistry55.createParameters(jSTypeArray57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        com.google.javascript.rhino.Node node65 = node63.getAncestor(8);
        boolean boolean66 = node63.isStringKey();
        boolean boolean67 = node63.isTry();
        boolean boolean68 = node63.isAssign();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) 0, node42, node49, node58, node63, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            node34.removeChild(node71);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        java.lang.String str3 = assertionFunctionSpec2.getFunctionName();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        com.google.javascript.rhino.Node node18 = node16.getAncestor(8);
        boolean boolean19 = node16.isStringKey();
        boolean boolean20 = node16.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node25 = jSTypeRegistry22.createParameters(jSTypeArray24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.Node node32 = node30.getAncestor(8);
        boolean boolean33 = node30.isStringKey();
        boolean boolean34 = node30.isTry();
        boolean boolean35 = node30.isAssign();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 0, node9, node16, node25, node30, 0, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node49 = jSTypeRegistry46.createParameters(jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node54 = jSTypeRegistry51.createParameters(jSTypeArray53);
        boolean boolean56 = jSTypeRegistry51.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry51.createObjectType(objectType57);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry42.createObjectType("hi!", node49, objectType58);
        java.lang.String str60 = objectType59.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType61 = objectType59.restrictByNotNullOrUndefined();
        boolean boolean63 = jSTypeRegistry40.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType59, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec2.getAssertedType(node30, jSTypeRegistry40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node66 = node30.getChildAtIndex(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown class name" + "'", str3, "Unknown class name");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSType64);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isNot();
        boolean boolean7 = node4.isGetElem();
        java.lang.Object obj9 = node4.getProp(0);
        node4.addSuppression("JSDocInfo");
        // The following exception was thrown during execution in test generation
        try {
            double double12 = node4.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST [jsdoc_info: JSDocInfo] is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.Node node13 = node11.getAncestor(8);
        boolean boolean14 = node11.isLocalResultCall();
        int int15 = node11.getChildCount();
        com.google.javascript.rhino.Node node16 = node4.useSourceInfoFromForTree(node11);
        boolean boolean17 = node16.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isStringKey();
        boolean boolean16 = node12.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        com.google.javascript.rhino.Node node28 = node26.getAncestor(8);
        boolean boolean29 = node26.isStringKey();
        boolean boolean30 = node26.isTry();
        boolean boolean31 = node26.isAssign();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 0, node5, node12, node21, node26, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node36 = node26.getChildAtIndex((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = node36.isSwitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        com.google.javascript.rhino.Node node7 = node5.getAncestor(8);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship9 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry1.createUnionType(jSTypeArray26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType[]> jSTypeArrayList29 = com.google.common.collect.ImmutableList.of(jSTypeArray26, jSTypeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(jSType27);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters(jSTypeArray7);
        boolean boolean10 = node9.isExprResult();
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            node9.appendStringTree(appendable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.Node node16 = node14.getAncestor(8);
        boolean boolean17 = node14.isStringKey();
        boolean boolean18 = node14.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        jSTypeRegistry21.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node24 = jSTypeRegistry21.createParameters(jSTypeArray23);
        boolean boolean25 = node24.isAssignAdd();
        boolean boolean26 = node24.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry28.createParameters(jSTypeArray30);
        com.google.javascript.rhino.Node node33 = node31.getAncestor(8);
        boolean boolean34 = node31.isStringKey();
        boolean boolean35 = node31.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node40 = jSTypeRegistry37.createParameters(jSTypeArray39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = node45.getAncestor(8);
        boolean boolean48 = node45.isStringKey();
        boolean boolean49 = node45.isTry();
        boolean boolean50 = node45.isAssign();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) 0, node24, node31, node40, node45, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node54 = node14.copyInformationFromForTree(node31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createInterfaceType("PARAM_LIST", node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        boolean boolean45 = node44.isVarArgs();
        com.google.javascript.rhino.Node node46 = node44.getNext();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList8.set(53, "()");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        com.google.javascript.rhino.Node node7 = node5.getAncestor(8);
        boolean boolean8 = node5.isLocalResultCall();
        int int9 = node5.getChildCount();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        jSTypeRegistry11.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry11.createParameters(jSTypeArray17);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship20 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node19);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node5);
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry20.getTypesWithProperty("hi!");
        int int24 = strList17.indexOf((java.lang.Object) jSTypeRegistry20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = strList8.retainAll((java.util.Collection<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getNativeType(jSTypeNative25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        boolean boolean45 = node4.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = node4.getChildAtIndex(16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getType("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node39 = jSTypeRegistry36.createParameters(jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node44 = jSTypeRegistry41.createParameters(jSTypeArray43);
        boolean boolean46 = jSTypeRegistry41.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry41.createObjectType(objectType47);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry32.createObjectType("hi!", node39, objectType48);
        java.lang.String str50 = objectType49.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        jSTypeRegistry52.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node55 = jSTypeRegistry52.createParameters(jSTypeArray54);
        boolean boolean57 = jSTypeRegistry52.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry52.createObjectType(objectType58);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = objectType59.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry29.createParameterizedType(objectType49, (com.google.javascript.rhino.jstype.JSType) objectType59);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = parameterizedType61.getTypeOfThis();
        boolean boolean63 = parameterizedType61.isNoResolvedType();
        java.util.Set set64 = parameterizedType61.getOwnPropertyNames();
        boolean boolean65 = parameterizedType61.isNoType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("{proxy:{1005115907}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(parameterizedType61);
        org.junit.Assert.assertNull(objectType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getType("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node40 = jSTypeRegistry37.createParameters(jSTypeArray39);
        boolean boolean42 = jSTypeRegistry37.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry37.createObjectType(objectType43);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry28.createObjectType("hi!", node35, objectType44);
        java.lang.String str46 = objectType45.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot48 = objectType45.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType49 = objectType45.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType49, "{proxy:{2003928024}}");
        boolean boolean52 = jSType51.isNullable();
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(jSTypeStaticSlot48);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            node6.setCharno((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isGlobalThisType();
        boolean boolean38 = parameterizedType33.hasReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String[] strArray6 = new java.lang.String[] { "JSDocInfo", "{proxy:{512162719}}", "PARAM_LIST", "hi!", "PARAM_LIST", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry20.getTypesWithProperty("hi!");
        int int24 = strList17.indexOf((java.lang.Object) jSTypeRegistry20);
        boolean boolean25 = strList7.retainAll((java.util.Collection<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList17.set(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        boolean boolean13 = node12.isAssignAdd();
        boolean boolean14 = node12.isNot();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(41, node12, 44, 46);
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry1.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry1.createUnionType(jSTypeArray13);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray17 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative16 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry1.createUnionType(jSTypeNativeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNotNull(jSTypeNativeArray17);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node6.isVoid();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isBlock();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node4.isEquivalentTo(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        int int17 = strList8.size();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor27 = strList26.iterator();
        java.lang.Object obj28 = null;
        boolean boolean29 = strList26.equals(obj28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = strList8.retainAll((java.util.Collection<java.lang.String>) strList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType33.findPropertyType("Unknown class name");
        boolean boolean38 = parameterizedType33.isInstanceType();
        java.lang.Class<?> wildcardClass39 = parameterizedType33.getClass();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.io.IOException iOException1 = new java.io.IOException("{proxy:{1842039452}}");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        node17.putIntProp(8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = node17.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isStringKey();
        boolean boolean16 = node12.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        com.google.javascript.rhino.Node node28 = node26.getAncestor(8);
        boolean boolean29 = node26.isStringKey();
        boolean boolean30 = node26.isTry();
        boolean boolean31 = node26.isAssign();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 0, node5, node12, node21, node26, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            node34.setString("{proxy:{1902319341}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList8.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (35) must be less than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry1.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode10 = null;
        jSTypeRegistry1.setResolveMode(resolveMode10);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        boolean boolean11 = objectType8.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        objectType8.setJSDocInfo(jSDocInfo12);
        boolean boolean14 = jSDocInfo12.isDeprecated();
        boolean boolean16 = jSDocInfo12.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection17 = jSDocInfo12.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection18 = jSDocInfo12.getMarkers();
        java.util.Set<java.lang.String> strSet19 = jSDocInfo12.getParameterNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor29 = strList28.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = strSet19.addAll((java.util.Collection<java.lang.String>) strList28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strCollection17);
        org.junit.Assert.assertNotNull(markerCollection18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType33.getIndexType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = parameterizedType33.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType33.collapseUnion();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSDocInfo36);
        org.junit.Assert.assertNotNull(jSType37);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        int int76 = functionType75.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = functionType75.getOwnPropertyJSDocInfo("hi!");
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType75.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType81 = functionType75.getTopMostDefiningType("()");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(jSDocInfo78);
        org.junit.Assert.assertNull(jSType79);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        boolean boolean9 = node4.isObjectLit();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isLocalResultCall();
        int int25 = node21.getChildCount();
        com.google.javascript.rhino.Node node26 = node14.useSourceInfoFromForTree(node21);
        boolean boolean27 = node21.isAssignAdd();
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node21, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strList8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType33.findPropertyType("Unknown class name");
        boolean boolean38 = parameterizedType33.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType33.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType40 = jSType39.dereference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jSType39);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isTry();
        boolean boolean9 = node4.isAssign();
        boolean boolean10 = node4.isQuotedString();
        boolean boolean11 = node4.isVar();
        node4.setSourceFileForTesting("{proxy:{1370020047}}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node4.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean74 = functionType72.hasOwnProperty("PARAM_LIST");
        boolean boolean75 = functionType72.isConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot77 = functionType72.getSlot("{proxy:{2003928024}}");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = functionType72.getParameters();
        boolean boolean79 = functionType72.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(staticSlot77);
        org.junit.Assert.assertNotNull(nodeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        stringPosition0.setItem("{proxy:{1902319341}}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        com.google.javascript.rhino.Node node73 = functionType72.getParametersNode();
        boolean boolean74 = node73.isTrue();
        boolean boolean75 = node73.isBlock();
        com.google.javascript.rhino.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            node73.addChildrenToFront(node76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        boolean boolean45 = node4.isComma();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection6 = jSTypeRegistry1.getDirectImplementors(objectType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        com.google.javascript.rhino.Node node8 = node4.getFirstChild();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int0 = com.google.javascript.rhino.Node.POST_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry14.createParameters(jSTypeArray16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean24 = jSTypeRegistry19.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry19.createObjectType(objectType25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry10.createObjectType("hi!", node17, objectType26);
        java.lang.String str28 = objectType27.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType27.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry1.createNullableType(jSType29);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry1.getNativeObjectType(jSTypeNative31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSType30);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry35.createParameters(jSTypeArray37);
        boolean boolean39 = node38.isAssignAdd();
        boolean boolean40 = node38.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = node45.getAncestor(8);
        boolean boolean48 = node45.isLocalResultCall();
        int int49 = node45.getChildCount();
        com.google.javascript.rhino.Node node50 = node38.useSourceInfoFromForTree(node45);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        jSTypeRegistry56.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        jSTypeRegistry65.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node68 = jSTypeRegistry65.createParameters(jSTypeArray67);
        boolean boolean70 = jSTypeRegistry65.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSTypeRegistry65.createObjectType(objectType71);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry56.createObjectType("hi!", node63, objectType72);
        java.lang.String str74 = objectType73.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        jSTypeRegistry76.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node79 = jSTypeRegistry76.createParameters(jSTypeArray78);
        boolean boolean81 = jSTypeRegistry76.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry76.createObjectType(objectType82);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = objectType83.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry53.createParameterizedType(objectType73, (com.google.javascript.rhino.jstype.JSType) objectType83);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = parameterizedType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = parameterizedType85.toMaybeEnumElementType();
        boolean boolean88 = parameterizedType85.isCheckedUnknownType();
        boolean boolean89 = parameterizedType85.isInterface();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry1.createFromTypeNodes(node45, "unknown", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: PARAM_LIST");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(parameterizedType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNull(enumElementType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        boolean boolean9 = node4.isObjectLit();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags10 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(sideEffectFlags10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strList8.add("{proxy:{1842039452}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor18 = strList8.listIterator(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (40) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{proxy:{1842039452}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        java.lang.String str38 = parameterizedType33.toDebugHashCodeString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = parameterizedType33.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType33, "{proxy:{1099825037}}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = objectType41.isAllType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{proxy:{1392865097}}" + "'", str38, "{proxy:{1392865097}}");
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(objectType41);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = objectType34.hasDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean19 = jSDocInfo18.isExterns();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = jSDocInfo18.getTemplateTypeNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = strList20.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strList8.addAll((int) '4', (java.util.Collection<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean74 = functionType72.hasOwnProperty("PARAM_LIST");
        boolean boolean75 = functionType72.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType72.getPrototype();
        boolean boolean77 = functionType72.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType72.getInstanceType();
        java.lang.String str79 = objectType78.getDisplayName();
        boolean boolean80 = objectType78.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("()");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(())" + "'", str1, "(())");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node6 = jSTypeRegistry3.createParameters(jSTypeArray5);
        boolean boolean7 = node6.isAssignAdd();
        boolean boolean8 = node6.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.Node node15 = node13.getAncestor(8);
        boolean boolean16 = node13.isStringKey();
        boolean boolean17 = node13.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        com.google.javascript.rhino.Node node29 = node27.getAncestor(8);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isTry();
        boolean boolean32 = node27.isAssign();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 0, node6, node13, node22, node27, 0, (int) (byte) 100);
        node35.setLength((int) (short) 0);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry39.createParameters(jSTypeArray41);
        boolean boolean43 = node42.isAssignAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        boolean boolean49 = node48.isAssignAdd();
        node48.setLineno((int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node56 = jSTypeRegistry53.createParameters(jSTypeArray55);
        boolean boolean57 = node56.isAssignAdd();
        boolean boolean58 = node56.isNoSideEffectsCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node56);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        com.google.javascript.rhino.Node node66 = node64.getAncestor(8);
        boolean boolean67 = node64.isLocalResultCall();
        int int68 = node64.getChildCount();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node73 = jSTypeRegistry70.createParameters(jSTypeArray72);
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node35, node42, node48, node56, node64, node73 };
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray74);
        boolean boolean76 = node75.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        jSTypeRegistry78.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node81 = jSTypeRegistry78.createParameters(jSTypeArray80);
        boolean boolean82 = node81.isAssignAdd();
        boolean boolean83 = node81.isDefaultCase();
        boolean boolean84 = node81.hasChildren();
        boolean boolean85 = node81.hasChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = node75.removeChildAfter(node81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(staticSourceFile59);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType33.getConstructor();
        boolean boolean38 = parameterizedType33.hasProperty("Unknown class name");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType39 = parameterizedType33.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = parameterizedType39.toObjectType();
        java.lang.String str41 = objectType40.getDisplayName();
        boolean boolean42 = objectType40.isResolved();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parameterizedType39);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = functionType72.getOwnPropertyJSDocInfo("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        jSTypeRegistry79.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node82 = jSTypeRegistry79.createParameters(jSTypeArray81);
        boolean boolean83 = node82.isAssignAdd();
        boolean boolean84 = node82.isNot();
        boolean boolean85 = node82.isFromExterns();
        functionType72.setSource(node82);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.Node node88 = functionType72.getParametersNode();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType72.getTypeOfThis();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate90 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = objectType89.setValidator(jSTypePredicate90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertNull(jSDocInfo77);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(objectType89);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isExterns();
        node21.setJSDocInfo(jSDocInfo45);
        // The following exception was thrown during execution in test generation
        try {
            node21.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isExterns();
        node21.setJSDocInfo(jSDocInfo45);
        com.google.common.collect.ImmutableList<java.lang.String> strList48 = jSDocInfo45.getTemplateTypeNames();
        boolean boolean49 = strList48.isEmpty();
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor50 = strList48.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = strList48.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strItor50);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        boolean boolean11 = objectType8.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        objectType8.setJSDocInfo(jSDocInfo12);
        boolean boolean14 = jSDocInfo12.isDeprecated();
        boolean boolean16 = jSDocInfo12.hasParameterType("Not declared as a constructor");
        java.lang.String str18 = jSDocInfo12.getDescriptionForParameter("{proxy:{1295724342}}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String[] strArray13 = new java.lang.String[] { "{proxy:{1099825037}}", "hi!.<?>", "Not declared as a type name", "unknown", "Not declared as a constructor", "PARAM_LIST", "PARAM_LIST", "", "JSDocInfo", "{proxy:{1842039452}}", "hi!.<{...}>", "{proxy:{1318280203}}", "{proxy:{1370020047}}" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        jSTypeRegistry17.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node20 = jSTypeRegistry17.createParameters(jSTypeArray19);
        boolean boolean22 = jSTypeRegistry17.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry17.createObjectType(objectType23);
        boolean boolean25 = objectType24.isCheckedUnknownType();
        int int26 = objectType24.getPropertiesCount();
        boolean boolean27 = objectType24.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        objectType24.setJSDocInfo(jSDocInfo28);
        boolean boolean30 = jSDocInfo28.isDeprecated();
        boolean boolean32 = jSDocInfo28.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection33 = jSDocInfo28.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection34 = jSDocInfo28.getMarkers();
        java.util.Set<java.lang.String> strSet35 = jSDocInfo28.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream36 = strSet35.stream();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        objectType45.setJSDocInfo(jSDocInfo49);
        boolean boolean51 = jSDocInfo49.isDeprecated();
        boolean boolean53 = jSDocInfo49.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection54 = jSDocInfo49.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection55 = jSDocInfo49.getMarkers();
        java.util.Set<java.lang.String> strSet56 = jSDocInfo49.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream57 = strSet56.stream();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        jSTypeRegistry59.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node62 = jSTypeRegistry59.createParameters(jSTypeArray61);
        boolean boolean64 = jSTypeRegistry59.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry59.createObjectType(objectType65);
        boolean boolean67 = objectType66.isCheckedUnknownType();
        int int68 = objectType66.getPropertiesCount();
        boolean boolean69 = objectType66.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        objectType66.setJSDocInfo(jSDocInfo70);
        boolean boolean72 = jSDocInfo70.isDeprecated();
        boolean boolean74 = jSDocInfo70.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection75 = jSDocInfo70.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection76 = jSDocInfo70.getMarkers();
        java.util.Set<java.lang.String> strSet77 = jSDocInfo70.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream78 = strSet77.stream();
        java.lang.AutoCloseable[] autoCloseableArray79 = new java.lang.AutoCloseable[] { strStream36, strStream57, strStream78 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.AutoCloseable[] autoCloseableArray80 = strList14.toArray(autoCloseableArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(strCollection33);
        org.junit.Assert.assertNotNull(markerCollection34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(strCollection54);
        org.junit.Assert.assertNotNull(markerCollection55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strStream57);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(strCollection75);
        org.junit.Assert.assertNotNull(markerCollection76);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(strStream78);
        org.junit.Assert.assertNotNull(autoCloseableArray79);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        int int76 = functionType75.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = functionType75.getOwnPropertyJSDocInfo("hi!");
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType75.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = jSType79.isFunctionType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(jSDocInfo78);
        org.junit.Assert.assertNull(jSType79);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        java.lang.Object obj10 = null;
        boolean boolean11 = strList8.equals(obj10);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!.<?>", "Not declared as a constructor", "unknown", "{proxy:{512162719}}", "{proxy:{1370020047}}", "{proxy:{1842039452}}", "Unknown class name" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Iterator<java.lang.String> strItor22 = strList20.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        com.google.javascript.rhino.Node node29 = node27.getAncestor(8);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        jSTypeRegistry34.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node37 = jSTypeRegistry34.createParameters(jSTypeArray36);
        boolean boolean38 = node37.isAssignAdd();
        boolean boolean39 = node37.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node44 = jSTypeRegistry41.createParameters(jSTypeArray43);
        com.google.javascript.rhino.Node node46 = node44.getAncestor(8);
        boolean boolean47 = node44.isStringKey();
        boolean boolean48 = node44.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node58 = jSTypeRegistry55.createParameters(jSTypeArray57);
        com.google.javascript.rhino.Node node60 = node58.getAncestor(8);
        boolean boolean61 = node58.isStringKey();
        boolean boolean62 = node58.isTry();
        boolean boolean63 = node58.isAssign();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) 0, node37, node44, node53, node58, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node67 = node27.copyInformationFromForTree(node44);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean69 = jSDocInfo68.isExterns();
        node44.setJSDocInfo(jSDocInfo68);
        com.google.common.collect.ImmutableList<java.lang.String> strList71 = jSDocInfo68.getTemplateTypeNames();
        boolean boolean72 = strList71.isEmpty();
        boolean boolean73 = strList20.containsAll((java.util.Collection<java.lang.String>) strList71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = strList8.addAll((java.util.Collection<java.lang.String>) strList71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean11 = jSTypeRegistry6.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry6.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        boolean boolean24 = objectType23.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry6.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType23);
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType23);
        objectType23.clearResolved();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSType26);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        java.lang.String str3 = assertionFunctionSpec2.getFunctionName();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        com.google.javascript.rhino.Node node18 = node16.getAncestor(8);
        boolean boolean19 = node16.isStringKey();
        boolean boolean20 = node16.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node25 = jSTypeRegistry22.createParameters(jSTypeArray24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.Node node32 = node30.getAncestor(8);
        boolean boolean33 = node30.isStringKey();
        boolean boolean34 = node30.isTry();
        boolean boolean35 = node30.isAssign();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 0, node9, node16, node25, node30, 0, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node49 = jSTypeRegistry46.createParameters(jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node54 = jSTypeRegistry51.createParameters(jSTypeArray53);
        boolean boolean56 = jSTypeRegistry51.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry51.createObjectType(objectType57);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry42.createObjectType("hi!", node49, objectType58);
        java.lang.String str60 = objectType59.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType61 = objectType59.restrictByNotNullOrUndefined();
        boolean boolean63 = jSTypeRegistry40.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType59, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec2.getAssertedType(node30, jSTypeRegistry40);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative66 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec67 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative66);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec69 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("{proxy:{1099825037}}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative71 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec72 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative71);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec73 = null;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative75 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec76 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        jSTypeRegistry78.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node81 = jSTypeRegistry78.createParameters(jSTypeArray80);
        com.google.javascript.rhino.Node node83 = node81.getAncestor(8);
        boolean boolean84 = node81.isStringKey();
        boolean boolean85 = node81.isTry();
        java.lang.String str86 = node81.getSourceFileName();
        com.google.javascript.rhino.Node node87 = assertionFunctionSpec76.getAssertedParam(node81);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecList88 = com.google.common.collect.ImmutableList.of(assertionFunctionSpec2, assertionFunctionSpec67, assertionFunctionSpec69, assertionFunctionSpec72, assertionFunctionSpec73, assertionFunctionSpec76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 4");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown class name" + "'", str3, "Unknown class name");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 1, 53, 37);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        com.google.javascript.rhino.Node node18 = node16.getAncestor(8);
        boolean boolean19 = node16.isLocalResultCall();
        int int20 = node16.getChildCount();
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        boolean boolean27 = node26.isAssignAdd();
        boolean boolean28 = node26.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node33 = jSTypeRegistry30.createParameters(jSTypeArray32);
        com.google.javascript.rhino.Node node35 = node33.getAncestor(8);
        boolean boolean36 = node33.isLocalResultCall();
        int int37 = node33.getChildCount();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoFromForTree(node33);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 1, node21, node38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = node3.getChildBefore(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        int int17 = strList8.size();
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor27 = strList26.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = strList8.removeAll((java.util.Collection<java.lang.String>) strList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean16 = jSTypeRegistry11.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry11.createObjectType(objectType17);
        boolean boolean19 = objectType18.isCheckedUnknownType();
        int int20 = objectType18.getPropertiesCount();
        boolean boolean21 = objectType18.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        objectType18.setJSDocInfo(jSDocInfo22);
        boolean boolean24 = jSDocInfo22.isDeprecated();
        boolean boolean26 = jSDocInfo22.hasParameterType("Not declared as a constructor");
        java.util.Set<java.lang.String> strSet27 = jSDocInfo22.getModifies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = strList8.addAll(12, (java.util.Collection<java.lang.String>) strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = functionType72.canAssignTo(jSType76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!.<{...}>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean24 = jSTypeRegistry19.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry19.createObjectType(objectType25);
        boolean boolean27 = objectType26.isCheckedUnknownType();
        int int28 = objectType26.getPropertiesCount();
        boolean boolean29 = objectType26.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        objectType26.setJSDocInfo(jSDocInfo30);
        boolean boolean32 = jSDocInfo30.isDeprecated();
        boolean boolean34 = jSDocInfo30.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection35 = jSDocInfo30.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection36 = jSDocInfo30.getMarkers();
        java.util.Set<java.lang.String> strSet37 = jSDocInfo30.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream38 = strSet37.stream();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node43 = jSTypeRegistry40.createParameters(jSTypeArray42);
        boolean boolean45 = jSTypeRegistry40.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry40.createObjectType(objectType46);
        boolean boolean48 = objectType47.isCheckedUnknownType();
        int int49 = objectType47.getPropertiesCount();
        boolean boolean50 = objectType47.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        objectType47.setJSDocInfo(jSDocInfo51);
        boolean boolean53 = jSDocInfo51.isDeprecated();
        boolean boolean55 = jSDocInfo51.hasParameterType("Not declared as a constructor");
        java.util.Collection<java.lang.String> strCollection56 = jSDocInfo51.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection57 = jSDocInfo51.getMarkers();
        java.util.Set<java.lang.String> strSet58 = jSDocInfo51.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream59 = strSet58.stream();
        java.lang.AutoCloseable[] autoCloseableArray60 = new java.lang.AutoCloseable[] { strStream38, strStream59 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.AutoCloseable[] autoCloseableArray61 = strList8.toArray(autoCloseableArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strCollection35);
        org.junit.Assert.assertNotNull(markerCollection36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strStream38);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(strCollection56);
        org.junit.Assert.assertNotNull(markerCollection57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(strStream59);
        org.junit.Assert.assertNotNull(autoCloseableArray60);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        java.lang.Object obj10 = null;
        boolean boolean11 = strList8.equals(obj10);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative13 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec14 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative13);
        java.lang.String str15 = assertionFunctionSpec14.getFunctionName();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        boolean boolean22 = node21.isAssignAdd();
        boolean boolean23 = node21.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node28 = jSTypeRegistry25.createParameters(jSTypeArray27);
        com.google.javascript.rhino.Node node30 = node28.getAncestor(8);
        boolean boolean31 = node28.isLocalResultCall();
        int int32 = node28.getChildCount();
        com.google.javascript.rhino.Node node33 = node21.useSourceInfoFromForTree(node28);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry35.createParameters(jSTypeArray37);
        boolean boolean39 = node38.isAssignAdd();
        boolean boolean40 = node38.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = node45.getAncestor(8);
        boolean boolean48 = node45.isLocalResultCall();
        int int49 = node45.getChildCount();
        com.google.javascript.rhino.Node node50 = node38.useSourceInfoFromForTree(node45);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 1, node33, node50);
        boolean boolean52 = node51.isFunction();
        com.google.javascript.rhino.Node node53 = assertionFunctionSpec14.getAssertedParam(node51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node58 = jSTypeRegistry55.createParameters(jSTypeArray57);
        com.google.javascript.rhino.Node node60 = node58.getAncestor(8);
        boolean boolean61 = node58.isStringKey();
        boolean boolean62 = node58.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node63 = assertionFunctionSpec14.getAssertedParam(node58);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = strList8.remove((java.lang.Object) assertionFunctionSpec14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown class name" + "'", str15, "Unknown class name");
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        java.lang.String str38 = parameterizedType33.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = parameterizedType33.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType40 = functionType39.autobox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{proxy:{958726257}}" + "'", str38, "{proxy:{958726257}}");
        org.junit.Assert.assertNull(functionType39);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        boolean boolean20 = jSTypeRegistry15.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry15.createObjectType(objectType21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry6.createObjectType("hi!", node13, objectType22);
        java.lang.String str24 = objectType23.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = objectType23.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = objectType23.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node32 = jSTypeRegistry29.createParameters(jSTypeArray31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry1.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType23, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = functionType33.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType33.getReturnType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(jSTypeStaticSlot26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSType35);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isNoSideEffectsCall();
        node4.setLineno(1);
        boolean boolean9 = node4.isExprResult();
        boolean boolean10 = node4.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            node4.setString("{proxy:{985498762}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST 1 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        com.google.javascript.rhino.Node node6 = node4.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node6.isVar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        int int76 = functionType75.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = functionType75.getOwnPropertyJSDocInfo("hi!");
        int int79 = functionType75.getExtendedInterfacesCount();
        boolean boolean80 = functionType75.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(jSDocInfo78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int0 = com.google.javascript.rhino.Node.NO_SIDE_EFFECTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters(jSTypeArray7);
        node9.removeProp(47);
        boolean boolean12 = node9.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objectType34.isParameterizedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry28.createParameters(jSTypeArray30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry35.createParameters(jSTypeArray37);
        com.google.javascript.rhino.Node node40 = node38.getAncestor(8);
        boolean boolean41 = node38.isStringKey();
        boolean boolean42 = node38.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node47 = jSTypeRegistry44.createParameters(jSTypeArray46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node52 = jSTypeRegistry49.createParameters(jSTypeArray51);
        com.google.javascript.rhino.Node node54 = node52.getAncestor(8);
        boolean boolean55 = node52.isStringKey();
        boolean boolean56 = node52.isTry();
        boolean boolean57 = node52.isAssign();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 0, node31, node38, node47, node52, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node61 = node21.copyInformationFromForTree(node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.isExterns();
        node38.setJSDocInfo(jSDocInfo62);
        com.google.common.collect.ImmutableList<java.lang.String> strList65 = jSDocInfo62.getTemplateTypeNames();
        boolean boolean66 = strList65.isEmpty();
        boolean boolean67 = strList8.containsAll((java.util.Collection<java.lang.String>) strList65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = strList8.remove(41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node6 = jSTypeRegistry3.createParameters(jSTypeArray5);
        boolean boolean7 = node6.isAssignAdd();
        boolean boolean8 = node6.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.Node node15 = node13.getAncestor(8);
        boolean boolean16 = node13.isStringKey();
        boolean boolean17 = node13.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        com.google.javascript.rhino.Node node29 = node27.getAncestor(8);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isTry();
        boolean boolean32 = node27.isAssign();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 0, node6, node13, node22, node27, 0, (int) (byte) 100);
        node35.setLength((int) (short) 0);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node42 = jSTypeRegistry39.createParameters(jSTypeArray41);
        boolean boolean43 = node42.isAssignAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        boolean boolean49 = node48.isAssignAdd();
        node48.setLineno((int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node56 = jSTypeRegistry53.createParameters(jSTypeArray55);
        boolean boolean57 = node56.isAssignAdd();
        boolean boolean58 = node56.isNoSideEffectsCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node56);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        com.google.javascript.rhino.Node node66 = node64.getAncestor(8);
        boolean boolean67 = node64.isLocalResultCall();
        int int68 = node64.getChildCount();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node73 = jSTypeRegistry70.createParameters(jSTypeArray72);
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node35, node42, node48, node56, node64, node73 };
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray74);
        boolean boolean76 = node75.isParamList();
        // The following exception was thrown during execution in test generation
        try {
            node75.setSideEffectFlags(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(staticSourceFile59);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!.<?>", "Not declared as a constructor", "unknown", "{proxy:{512162719}}", "{proxy:{1370020047}}", "{proxy:{1842039452}}", "Unknown class name" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Iterator<java.lang.String> strItor10 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        com.google.javascript.rhino.Node node17 = node15.getAncestor(8);
        boolean boolean18 = node15.isStringKey();
        boolean boolean19 = node15.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node25 = jSTypeRegistry22.createParameters(jSTypeArray24);
        boolean boolean26 = node25.isAssignAdd();
        boolean boolean27 = node25.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node32 = jSTypeRegistry29.createParameters(jSTypeArray31);
        com.google.javascript.rhino.Node node34 = node32.getAncestor(8);
        boolean boolean35 = node32.isStringKey();
        boolean boolean36 = node32.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        jSTypeRegistry43.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry43.createParameters(jSTypeArray45);
        com.google.javascript.rhino.Node node48 = node46.getAncestor(8);
        boolean boolean49 = node46.isStringKey();
        boolean boolean50 = node46.isTry();
        boolean boolean51 = node46.isAssign();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) 0, node25, node32, node41, node46, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node55 = node15.copyInformationFromForTree(node32);
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.isExterns();
        node32.setJSDocInfo(jSDocInfo56);
        com.google.common.collect.ImmutableList<java.lang.String> strList59 = jSDocInfo56.getTemplateTypeNames();
        boolean boolean60 = strList59.isEmpty();
        boolean boolean61 = strList8.containsAll((java.util.Collection<java.lang.String>) strList59);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList59.replaceAll(strUnaryOperator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry50.createObjectType(objectType56);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry41.createObjectType("hi!", node48, objectType57);
        java.lang.String str59 = objectType58.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        boolean boolean66 = jSTypeRegistry61.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry61.createObjectType(objectType67);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType68.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = jSTypeRegistry38.createParameterizedType(objectType58, (com.google.javascript.rhino.jstype.JSType) objectType68);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType70.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType72 = parameterizedType70.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType70.findPropertyType("Unknown class name");
        boolean boolean75 = parameterizedType70.isInstanceType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = parameterizedType33.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType70);
        com.google.javascript.rhino.jstype.ObjectType.Property property78 = parameterizedType33.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType80 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType33, "()");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo81 = objectType80.getJSDocInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(parameterizedType70);
        org.junit.Assert.assertNull(objectType71);
        org.junit.Assert.assertNull(enumElementType72);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(typePair76);
        org.junit.Assert.assertNull(property78);
        org.junit.Assert.assertNull(objectType80);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = functionType72.getOwnPropertyJSDocInfo("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        jSTypeRegistry79.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node82 = jSTypeRegistry79.createParameters(jSTypeArray81);
        boolean boolean83 = node82.isAssignAdd();
        boolean boolean84 = node82.isNot();
        boolean boolean85 = node82.isFromExterns();
        functionType72.setSource(node82);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType72.getBindReturnType((int) '4');
        java.lang.Iterable iterable90 = functionType72.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator91 = iterable90.spliterator();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertNull(jSDocInfo77);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(iterable90);
        org.junit.Assert.assertNotNull(nodeSpliterator91);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node34 = jSTypeRegistry31.createParameters(jSTypeArray33);
        boolean boolean36 = jSTypeRegistry31.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry31.createObjectType(objectType37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry22.createObjectType("hi!", node29, objectType38);
        java.lang.String str40 = objectType39.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        boolean boolean47 = jSTypeRegistry42.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry42.createObjectType(objectType48);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = objectType49.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = jSTypeRegistry19.createParameterizedType(objectType39, (com.google.javascript.rhino.jstype.JSType) objectType49);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = parameterizedType51.getTypeOfThis();
        boolean boolean53 = parameterizedType51.isNoResolvedType();
        java.util.Set set54 = parameterizedType51.getOwnPropertyNames();
        boolean boolean55 = parameterizedType51.isNativeObjectType();
        boolean boolean56 = parameterizedType51.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = parameterizedType51.getCtorImplementedInterfaces();
        boolean boolean58 = strList8.contains((java.lang.Object) parameterizedType51);
        java.util.Iterator<java.lang.String> strItor59 = strList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList69 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor70 = strList69.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = strList8.addAll(15, (java.util.Collection<java.lang.String>) strList69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(parameterizedType51);
        org.junit.Assert.assertNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strItor70);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean11 = jSTypeRegistry6.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry6.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        boolean boolean24 = objectType23.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry6.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType23);
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType23);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node32 = jSTypeRegistry29.createParameters(jSTypeArray31);
        boolean boolean33 = node32.isAssignAdd();
        boolean boolean34 = node32.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        jSTypeRegistry36.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node39 = jSTypeRegistry36.createParameters(jSTypeArray38);
        com.google.javascript.rhino.Node node41 = node39.getAncestor(8);
        boolean boolean42 = node39.isLocalResultCall();
        int int43 = node39.getChildCount();
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoFromForTree(node39);
        boolean boolean45 = node44.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node50 = jSTypeRegistry47.createParameters(jSTypeArray49);
        boolean boolean51 = node50.isAssignAdd();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node50);
        com.google.javascript.rhino.Node node53 = node44.clonePropsFrom(node50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry1.createInterfaceType("{proxy:{1902319341}}", node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry4.createParameters(jSTypeArray6);
        boolean boolean8 = node7.isAssignAdd();
        com.google.javascript.rhino.InputId inputId9 = com.google.javascript.jscomp.NodeUtil.getInputId(node7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node23 = jSTypeRegistry20.createParameters(jSTypeArray22);
        boolean boolean25 = jSTypeRegistry20.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry20.createObjectType(objectType26);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry11.createObjectType("hi!", node18, objectType27);
        boolean boolean29 = node18.isNew();
        int int30 = node18.getType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(30, node1, node2, node7, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 83 + "'", int30 == 83);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        boolean boolean11 = objectType8.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry13.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        boolean boolean28 = jSTypeRegistry23.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry23.createObjectType(objectType29);
        boolean boolean31 = objectType30.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry13.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean33 = objectType8.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType30);
        boolean boolean34 = objectType8.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = objectType8.canTestForShallowEqualityWith(jSType35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        int int76 = functionType75.getExtendedInterfacesCount();
        boolean boolean77 = functionType75.hasReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType75.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        com.google.javascript.rhino.Node node7 = node5.getAncestor(8);
        boolean boolean8 = node5.isLocalResultCall();
        int int9 = node5.getChildCount();
        boolean boolean10 = node5.isCase();
        node5.setSourceEncodedPositionForTree((int) '4');
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry14.createParameters(jSTypeArray16);
        boolean boolean18 = node17.isLocalResultCall();
        boolean boolean19 = node5.isEquivalentToTyped(node17);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, node17, node20, 10, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(10);
        int int2 = sideEffectFlags1.valueOf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        boolean boolean18 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node5, 46, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node21.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ 46 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean74 = functionType72.hasOwnProperty("PARAM_LIST");
        boolean boolean75 = functionType72.isConstructor();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType72.getExtendedInterfaces();
        boolean boolean77 = functionType72.matchesUint32Context();
        com.google.javascript.rhino.Node node78 = functionType72.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node80 = node78.getChildAtIndex(15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        boolean boolean38 = parameterizedType33.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = parameterizedType33.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        jSTypeRegistry48.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node51 = jSTypeRegistry48.createParameters(jSTypeArray50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        jSTypeRegistry53.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node56 = jSTypeRegistry53.createParameters(jSTypeArray55);
        boolean boolean58 = jSTypeRegistry53.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry53.createObjectType(objectType59);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry44.createObjectType("hi!", node51, objectType60);
        java.lang.String str62 = objectType61.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry64.createParameters(jSTypeArray66);
        boolean boolean69 = jSTypeRegistry64.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry64.createObjectType(objectType70);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = objectType71.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry41.createParameterizedType(objectType61, (com.google.javascript.rhino.jstype.JSType) objectType71);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = parameterizedType73.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType75 = parameterizedType73.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType76 = functionType39.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) parameterizedType73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(functionType39);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(parameterizedType73);
        org.junit.Assert.assertNull(objectType74);
        org.junit.Assert.assertNull(enumElementType75);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        boolean boolean9 = node4.isObjectLit();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.Node node16 = node14.getAncestor(8);
        boolean boolean17 = node14.isStringKey();
        boolean boolean18 = node14.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        jSTypeRegistry21.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node24 = jSTypeRegistry21.createParameters(jSTypeArray23);
        boolean boolean25 = node24.isAssignAdd();
        boolean boolean26 = node24.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry28.createParameters(jSTypeArray30);
        com.google.javascript.rhino.Node node33 = node31.getAncestor(8);
        boolean boolean34 = node31.isStringKey();
        boolean boolean35 = node31.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node40 = jSTypeRegistry37.createParameters(jSTypeArray39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = node45.getAncestor(8);
        boolean boolean48 = node45.isStringKey();
        boolean boolean49 = node45.isTry();
        boolean boolean50 = node45.isAssign();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) 0, node24, node31, node40, node45, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node54 = node14.copyInformationFromForTree(node31);
        boolean boolean55 = node14.isThrow();
        boolean boolean56 = node14.isInc();
        com.google.javascript.rhino.Node node57 = node4.useSourceInfoFrom(node14);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildrenToBack(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isBooleanObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry15.createObjectType("hi!", node22, objectType31);
        java.lang.String str33 = objectType32.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry35.createParameters(jSTypeArray37);
        boolean boolean40 = jSTypeRegistry35.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry35.createObjectType(objectType41);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = objectType42.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType44 = jSTypeRegistry12.createParameterizedType(objectType32, (com.google.javascript.rhino.jstype.JSType) objectType42);
        boolean boolean45 = objectType32.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType46 = objectType8.forceResolve(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType32);
        boolean boolean47 = objectType32.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(parameterizedType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = parameterizedType33.toMaybeEnumElementType();
        java.util.Set<java.lang.String> strSet36 = parameterizedType33.getOwnPropertyNames();
        java.lang.Class<?> wildcardClass37 = parameterizedType33.getClass();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        boolean boolean15 = jSTypeRegistry10.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry10.createObjectType(objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry1.createObjectType("hi!", node8, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        jSTypeRegistry21.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node28 = jSTypeRegistry25.createParameters(jSTypeArray27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node33 = jSTypeRegistry30.createParameters(jSTypeArray32);
        boolean boolean35 = jSTypeRegistry30.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry30.createObjectType(objectType36);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry21.createObjectType("hi!", node28, objectType37);
        java.lang.String str39 = objectType38.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType40 = objectType38.restrictByNotNullOrUndefined();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("(())", (com.google.javascript.rhino.jstype.JSType) objectType38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jSType40);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        java.lang.Object obj10 = null;
        boolean boolean11 = strList8.equals(obj10);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strList8.addAll((java.util.Collection<java.lang.String>) strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry1.createUnionType(jSTypeArray26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(jSType27);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node6 = jSTypeRegistry3.createParameters(jSTypeArray5);
        boolean boolean7 = node6.isAssignAdd();
        boolean boolean8 = node6.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        com.google.javascript.rhino.Node node15 = node13.getAncestor(8);
        boolean boolean16 = node13.isStringKey();
        boolean boolean17 = node13.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        com.google.javascript.rhino.Node node29 = node27.getAncestor(8);
        boolean boolean30 = node27.isStringKey();
        boolean boolean31 = node27.isTry();
        boolean boolean32 = node27.isAssign();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 0, node6, node13, node22, node27, 0, (int) (byte) 100);
        java.lang.String str36 = node27.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(31, node27, (int) (byte) 0, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PARAM_LIST" + "'", str36, "PARAM_LIST");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isExterns();
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = jSDocInfo0.getTemplateTypeNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = strList2.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node23 = jSTypeRegistry20.createParameters(jSTypeArray22);
        boolean boolean25 = jSTypeRegistry20.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry20.createObjectType(objectType26);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry11.createObjectType("hi!", node18, objectType27);
        java.lang.String str29 = objectType28.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node34 = jSTypeRegistry31.createParameters(jSTypeArray33);
        boolean boolean36 = jSTypeRegistry31.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry31.createObjectType(objectType37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = objectType38.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType40 = jSTypeRegistry8.createParameterizedType(objectType28, (com.google.javascript.rhino.jstype.JSType) objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        boolean boolean47 = jSTypeRegistry42.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry42.createObjectType(objectType48);
        boolean boolean50 = objectType49.isCheckedUnknownType();
        int int51 = objectType49.getPropertiesCount();
        boolean boolean52 = objectType49.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node57 = jSTypeRegistry54.createParameters(jSTypeArray56);
        boolean boolean59 = jSTypeRegistry54.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry54.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry64.createParameters(jSTypeArray66);
        boolean boolean69 = jSTypeRegistry64.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry64.createObjectType(objectType70);
        boolean boolean72 = objectType71.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry54.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType71);
        boolean boolean74 = objectType49.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType71);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] { objectType71 };
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry6.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType38, jSTypeArray75);
        boolean boolean78 = functionType76.hasOwnProperty("PARAM_LIST");
        boolean boolean79 = functionType76.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType76.getPrototype();
        boolean boolean81 = functionType76.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = functionType76.getInstanceType();
        boolean boolean83 = functionType76.canBeCalled();
        functionType76.clearCachedValues();
        boolean boolean85 = strList3.equals((java.lang.Object) functionType76);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.String> strList88 = strList3.subList(0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (16) must not be greater than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(parameterizedType40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objectType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry28.createParameters(jSTypeArray30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isNoSideEffectsCall();
        node31.setLineno(1);
        boolean boolean36 = node31.isAdd();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry1.createInterfaceType("{proxy:{635242210}}", node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean74 = functionType72.hasOwnProperty("PARAM_LIST");
        boolean boolean76 = functionType72.isPropertyTypeDeclared("");
        boolean boolean77 = functionType72.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        boolean boolean45 = node4.isSyntheticBlock();
        boolean boolean46 = node4.isNoSideEffectsCall();
        boolean boolean47 = node4.isQuotedString();
        boolean boolean48 = node4.isNew();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        boolean boolean73 = functionType72.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType72.getBindReturnType(0);
        boolean boolean76 = functionType75.hasInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = functionType75.getParameters();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType75.getPropertyType("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80);
        jSTypeRegistry81.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node84 = jSTypeRegistry81.createParameters(jSTypeArray83);
        boolean boolean86 = jSTypeRegistry81.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType87 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry81.createObjectType(objectType87);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = objectType88.toMaybeParameterizedType();
        boolean boolean91 = objectType88.isPropertyInExterns("hi!.<{...}>");
        boolean boolean93 = objectType88.hasOwnProperty("{proxy:{454166020}}");
        jSType79.matchConstraint(objectType88);
        com.google.javascript.rhino.jstype.TemplateType templateType95 = objectType88.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(templateType95);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        boolean boolean38 = parameterizedType33.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = parameterizedType33.getCtorImplementedInterfaces();
        boolean boolean41 = parameterizedType33.hasProperty("{proxy:{411146200}}");
        boolean boolean42 = parameterizedType33.isOrdinaryFunction();
        boolean boolean43 = parameterizedType33.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node35.getJsDocBuilderForNode();
        fileLevelJsDocBuilder36.append("{proxy:{225882739}}");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder36);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.lang.Object[] objArray17 = strList8.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList8.remove(40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[, , hi!, hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[, , hi!, hi!, , hi!, hi!, hi!]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node35);
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = node35.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertNull(inputId37);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet3.intersection(booleanLiteralSet4);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.union(booleanLiteralSet4);
        boolean boolean8 = booleanLiteralSet6.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.stream.Stream<java.lang.String> strStream9 = strList8.stream();
        java.lang.String str10 = strList8.toString();
        java.util.Collection<java.lang.String> strCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strList8.addAll(32, strCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[, , hi!, hi!, , hi!, hi!, hi!]" + "'", str10, "[, , hi!, hi!, , hi!, hi!, hi!]");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        boolean boolean34 = parameterizedType33.canBeCalled();
        boolean boolean35 = parameterizedType33.isInterface();
        boolean boolean36 = parameterizedType33.isInterface();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.or(ternaryValue1);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = parameterizedType36.getTypeOfThis();
        boolean boolean38 = parameterizedType36.isNoResolvedType();
        java.util.Set set39 = parameterizedType36.getOwnPropertyNames();
        boolean boolean40 = parameterizedType36.isNativeObjectType();
        boolean boolean41 = parameterizedType36.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = parameterizedType36.getCtorImplementedInterfaces();
        boolean boolean44 = parameterizedType36.hasProperty("{proxy:{411146200}}");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.resetForTypeCheck();
        jSTypeRegistry46.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable53 = jSTypeRegistry50.getTypesWithProperty("hi!");
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray54 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry50.createUnionType(jSTypeNativeArray54);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry46.createUnionType(jSTypeNativeArray54);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        jSTypeRegistry58.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        jSTypeRegistry65.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node68 = jSTypeRegistry65.createParameters(jSTypeArray67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node73 = jSTypeRegistry70.createParameters(jSTypeArray72);
        boolean boolean75 = jSTypeRegistry70.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSTypeRegistry70.createObjectType(objectType76);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry61.createObjectType("hi!", node68, objectType77);
        java.lang.String str79 = objectType78.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80);
        jSTypeRegistry81.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node84 = jSTypeRegistry81.createParameters(jSTypeArray83);
        boolean boolean86 = jSTypeRegistry81.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType87 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry81.createObjectType(objectType87);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = objectType88.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType90 = jSTypeRegistry58.createParameterizedType(objectType78, (com.google.javascript.rhino.jstype.JSType) objectType88);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType90.getTypeOfThis();
        boolean boolean92 = parameterizedType90.isNoResolvedType();
        boolean boolean93 = parameterizedType90.isNominalType();
        com.google.javascript.rhino.jstype.FunctionType functionType94 = parameterizedType90.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType.Property property96 = parameterizedType90.getSlot("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry46.createOptionalType((com.google.javascript.rhino.jstype.JSType) parameterizedType90);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue98 = parameterizedType36.testForEquality(jSType97);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue99 = ternaryValue0.or(ternaryValue98);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNull(objectType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable53);
        org.junit.Assert.assertNotNull(jSTypeNativeArray54);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(parameterizedType90);
        org.junit.Assert.assertNull(objectType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(functionType94);
        org.junit.Assert.assertNull(property96);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertNotNull(ternaryValue98);
        org.junit.Assert.assertNotNull(ternaryValue99);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry1.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean16 = jSTypeRegistry11.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry11.createObjectType(objectType17);
        boolean boolean19 = objectType18.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType18);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean28 = node27.isAssignAdd();
        boolean boolean29 = node27.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node34 = jSTypeRegistry31.createParameters(jSTypeArray33);
        com.google.javascript.rhino.Node node36 = node34.getAncestor(8);
        boolean boolean37 = node34.isStringKey();
        boolean boolean38 = node34.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node43 = jSTypeRegistry40.createParameters(jSTypeArray42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        com.google.javascript.rhino.Node node50 = node48.getAncestor(8);
        boolean boolean51 = node48.isStringKey();
        boolean boolean52 = node48.isTry();
        boolean boolean53 = node48.isAssign();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 0, node27, node34, node43, node48, 0, (int) (byte) 100);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node56.cloneTree();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry1.createInterfaceType("{proxy:{460037998}}", node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor9 = strList8.listIterator();
        java.util.ListIterator<java.lang.String> strItor10 = strList8.listIterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor20 = strList19.listIterator();
        boolean boolean21 = strList8.containsAll((java.util.Collection<java.lang.String>) strList19);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry23.createParameters(jSTypeArray25);
        com.google.javascript.rhino.Node node28 = node26.getAncestor(8);
        boolean boolean29 = node26.isStringKey();
        boolean boolean30 = node26.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        jSTypeRegistry33.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node36 = jSTypeRegistry33.createParameters(jSTypeArray35);
        boolean boolean37 = node36.isAssignAdd();
        boolean boolean38 = node36.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node43 = jSTypeRegistry40.createParameters(jSTypeArray42);
        com.google.javascript.rhino.Node node45 = node43.getAncestor(8);
        boolean boolean46 = node43.isStringKey();
        boolean boolean47 = node43.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node52 = jSTypeRegistry49.createParameters(jSTypeArray51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node57 = jSTypeRegistry54.createParameters(jSTypeArray56);
        com.google.javascript.rhino.Node node59 = node57.getAncestor(8);
        boolean boolean60 = node57.isStringKey();
        boolean boolean61 = node57.isTry();
        boolean boolean62 = node57.isAssign();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node43, node52, node57, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node66 = node26.copyInformationFromForTree(node43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.isExterns();
        node43.setJSDocInfo(jSDocInfo67);
        com.google.common.collect.ImmutableList<java.lang.String> strList70 = jSDocInfo67.getTemplateTypeNames();
        boolean boolean71 = strList70.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = strList19.removeAll((java.util.Collection<java.lang.String>) strList70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry7.createObjectType("hi!", node14, objectType23);
        java.lang.String str25 = objectType24.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        boolean boolean32 = jSTypeRegistry27.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry27.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = objectType34.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry4.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        boolean boolean43 = jSTypeRegistry38.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry38.createObjectType(objectType44);
        boolean boolean46 = objectType45.isCheckedUnknownType();
        int int47 = objectType45.getPropertiesCount();
        boolean boolean48 = objectType45.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry50.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        jSTypeRegistry60.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry60.createParameters(jSTypeArray62);
        boolean boolean65 = jSTypeRegistry60.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry60.createObjectType(objectType66);
        boolean boolean68 = objectType67.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType67);
        boolean boolean70 = objectType45.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType67);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { objectType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry2.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType34, jSTypeArray71);
        com.google.javascript.rhino.Node node73 = functionType72.getParametersNode();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType72.cloneWithoutArrowType();
        int int75 = functionType72.getPropertiesCount();
        boolean boolean76 = functionType72.hasCachedValues();
        boolean boolean77 = functionType72.isStringValueType();
        com.google.common.collect.ImmutableList<java.lang.String> strList78 = functionType72.getTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList81 = strList78.subList(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (10) must not be greater than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(parameterizedType36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean11 = jSTypeRegistry6.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry6.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node19 = jSTypeRegistry16.createParameters(jSTypeArray18);
        boolean boolean21 = jSTypeRegistry16.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry16.createObjectType(objectType22);
        boolean boolean24 = objectType23.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry6.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType23);
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType23);
        boolean boolean27 = jSType26.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isExterns();
        node21.setJSDocInfo(jSDocInfo45);
        com.google.common.collect.ImmutableList<java.lang.String> strList48 = jSDocInfo45.getTemplateTypeNames();
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor49 = strList48.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strList48.add((int) (short) 100, "[, , hi!, hi!, , hi!, hi!, hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strItor49);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("{proxy:{1902319341}}", 35, 2147483647);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:{1371129429}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = jSTypeRegistry11.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry11.getNativeType(jSTypeNative17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(errorReporter16);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isWhile();
        java.lang.String str9 = node4.toString();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFrom(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PARAM_LIST" + "'", str9, "PARAM_LIST");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry1.getTypesWithProperty("{proxy:{1099825037}}");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.InputId inputId44 = node21.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry1.createInterfaceType("()", node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId44);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        java.lang.String str38 = parameterizedType33.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = parameterizedType33.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = functionType39.removeProperty("{proxy:{635242210}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{proxy:{1816183714}}" + "'", str38, "{proxy:{1816183714}}");
        org.junit.Assert.assertNull(functionType39);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isNoSideEffectsCall();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got PARAM_LIST");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = node2.getExistingIntProp(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 49");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = objectType8.toObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType10 = objectType9.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = enumElementType10.isVoidType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNull(enumElementType10);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = strList8.subList(39, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (39) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        com.google.javascript.rhino.jstype.JSType jSType10 = objectType8.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean11 = objectType8.isNoResolvedType();
        boolean boolean12 = objectType8.isNumber();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node14 = jSTypeRegistry11.createParameters(jSTypeArray13);
        boolean boolean15 = node14.isAssignAdd();
        boolean boolean16 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.Node node37 = node35.getAncestor(8);
        boolean boolean38 = node35.isStringKey();
        boolean boolean39 = node35.isTry();
        boolean boolean40 = node35.isAssign();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 0, node14, node21, node30, node35, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node44 = node4.copyInformationFromForTree(node21);
        boolean boolean45 = node4.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = node4.getExistingIntProp((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        com.google.javascript.rhino.Node node36 = node35.getLastSibling();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        com.google.javascript.rhino.Node node43 = node41.getAncestor(8);
        boolean boolean44 = node41.isStringKey();
        boolean boolean45 = node41.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        jSTypeRegistry48.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node51 = jSTypeRegistry48.createParameters(jSTypeArray50);
        boolean boolean52 = node51.isAssignAdd();
        boolean boolean53 = node51.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node58 = jSTypeRegistry55.createParameters(jSTypeArray57);
        com.google.javascript.rhino.Node node60 = node58.getAncestor(8);
        boolean boolean61 = node58.isStringKey();
        boolean boolean62 = node58.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry64.createParameters(jSTypeArray66);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        jSTypeRegistry69.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node72 = jSTypeRegistry69.createParameters(jSTypeArray71);
        com.google.javascript.rhino.Node node74 = node72.getAncestor(8);
        boolean boolean75 = node72.isStringKey();
        boolean boolean76 = node72.isTry();
        boolean boolean77 = node72.isAssign();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) 0, node51, node58, node67, node72, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node81 = node41.copyInformationFromForTree(node58);
        com.google.javascript.rhino.Node node82 = node36.srcref(node41);
        java.lang.String str83 = node41.getQualifiedName();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        jSTypeRegistry5.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry5.createParameters(jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node13 = jSTypeRegistry10.createParameters(jSTypeArray12);
        boolean boolean15 = jSTypeRegistry10.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry10.createObjectType(objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry1.createObjectType("hi!", node8, objectType17);
        java.lang.Object obj19 = null;
        boolean boolean20 = objectType17.equals(obj19);
        com.google.javascript.rhino.jstype.JSType jSType21 = objectType17.collapseUnion();
        com.google.javascript.rhino.jstype.UnionType unionType22 = objectType17.toMaybeUnionType();
        boolean boolean23 = objectType17.isNominalType();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNull(unionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = strList8.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor28 = strList27.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry30.getTypesWithProperty("hi!");
        int int34 = strList27.indexOf((java.lang.Object) jSTypeRegistry30);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor35 = strList27.iterator();
        java.util.Iterator<java.lang.String> strItor36 = strList27.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strList8.retainAll((java.util.Collection<java.lang.String>) strList27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(strItor36);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node5 = jSTypeRegistry2.createParameters(jSTypeArray4);
        boolean boolean6 = node5.isAssignAdd();
        boolean boolean7 = node5.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        jSTypeRegistry9.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry9.createParameters(jSTypeArray11);
        com.google.javascript.rhino.Node node14 = node12.getAncestor(8);
        boolean boolean15 = node12.isLocalResultCall();
        int int16 = node12.getChildCount();
        com.google.javascript.rhino.Node node17 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.Node node31 = node29.getAncestor(8);
        boolean boolean32 = node29.isLocalResultCall();
        int int33 = node29.getChildCount();
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node34);
        com.google.javascript.rhino.Node node36 = node35.getLastSibling();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node41 = jSTypeRegistry38.createParameters(jSTypeArray40);
        com.google.javascript.rhino.Node node43 = node41.getAncestor(8);
        boolean boolean44 = node41.isLocalResultCall();
        int int45 = node41.getChildCount();
        com.google.javascript.rhino.Node node46 = node35.copyInformationFromForTree(node41);
        // The following exception was thrown during execution in test generation
        try {
            node35.setSideEffectFlags(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry7.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry12.createParameters(jSTypeArray14);
        boolean boolean17 = jSTypeRegistry12.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry12.createObjectType(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry3.createObjectType("hi!", node10, objectType19);
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType22 = objectType20.restrictByNotNullOrUndefined();
        boolean boolean24 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType20, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry1.getType("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry32.createParameters(jSTypeArray34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node40 = jSTypeRegistry37.createParameters(jSTypeArray39);
        boolean boolean42 = jSTypeRegistry37.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry37.createObjectType(objectType43);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry28.createObjectType("hi!", node35, objectType44);
        java.lang.String str46 = objectType45.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot48 = objectType45.getOwnSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType49 = objectType45.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType49, "{proxy:{2003928024}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = objectType49.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(jSTypeStaticSlot48);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNull(parameterizedType52);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        com.google.javascript.rhino.Node node6 = node4.getAncestor(8);
        boolean boolean7 = node4.isStringKey();
        boolean boolean8 = node4.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        boolean boolean16 = strList8.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        jSTypeRegistry18.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node21 = jSTypeRegistry18.createParameters(jSTypeArray20);
        com.google.javascript.rhino.Node node23 = node21.getAncestor(8);
        boolean boolean24 = node21.isStringKey();
        boolean boolean25 = node21.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node31 = jSTypeRegistry28.createParameters(jSTypeArray30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry35.createParameters(jSTypeArray37);
        com.google.javascript.rhino.Node node40 = node38.getAncestor(8);
        boolean boolean41 = node38.isStringKey();
        boolean boolean42 = node38.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node47 = jSTypeRegistry44.createParameters(jSTypeArray46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node52 = jSTypeRegistry49.createParameters(jSTypeArray51);
        com.google.javascript.rhino.Node node54 = node52.getAncestor(8);
        boolean boolean55 = node52.isStringKey();
        boolean boolean56 = node52.isTry();
        boolean boolean57 = node52.isAssign();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 0, node31, node38, node47, node52, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node61 = node21.copyInformationFromForTree(node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.isExterns();
        node38.setJSDocInfo(jSDocInfo62);
        com.google.common.collect.ImmutableList<java.lang.String> strList65 = jSDocInfo62.getTemplateTypeNames();
        boolean boolean66 = strList65.isEmpty();
        boolean boolean67 = strList8.containsAll((java.util.Collection<java.lang.String>) strList65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = strList8.set(39, "{proxy:{479790475}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        java.lang.String str3 = assertionFunctionSpec2.getFunctionName();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        jSTypeRegistry6.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry6.createParameters(jSTypeArray8);
        boolean boolean10 = node9.isAssignAdd();
        boolean boolean11 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        com.google.javascript.rhino.Node node18 = node16.getAncestor(8);
        boolean boolean19 = node16.isStringKey();
        boolean boolean20 = node16.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node25 = jSTypeRegistry22.createParameters(jSTypeArray24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry27.createParameters(jSTypeArray29);
        com.google.javascript.rhino.Node node32 = node30.getAncestor(8);
        boolean boolean33 = node30.isStringKey();
        boolean boolean34 = node30.isTry();
        boolean boolean35 = node30.isAssign();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 0, node9, node16, node25, node30, 0, (int) (byte) 100);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        jSTypeRegistry46.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node49 = jSTypeRegistry46.createParameters(jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node54 = jSTypeRegistry51.createParameters(jSTypeArray53);
        boolean boolean56 = jSTypeRegistry51.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry51.createObjectType(objectType57);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry42.createObjectType("hi!", node49, objectType58);
        java.lang.String str60 = objectType59.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType61 = objectType59.restrictByNotNullOrUndefined();
        boolean boolean63 = jSTypeRegistry40.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType59, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec2.getAssertedType(node30, jSTypeRegistry40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = node30.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown class name" + "'", str3, "Unknown class name");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSType64);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor9 = strList8.listIterator();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        int int11 = strList8.lastIndexOf((java.lang.Object) subclassType10);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry23.getTypesWithProperty("hi!");
        int int27 = strList20.indexOf((java.lang.Object) jSTypeRegistry23);
        boolean boolean28 = strList20.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node33 = jSTypeRegistry30.createParameters(jSTypeArray32);
        com.google.javascript.rhino.Node node35 = node33.getAncestor(8);
        boolean boolean36 = node33.isStringKey();
        boolean boolean37 = node33.isUnscopedQualifiedName();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node43 = jSTypeRegistry40.createParameters(jSTypeArray42);
        boolean boolean44 = node43.isAssignAdd();
        boolean boolean45 = node43.isNoSideEffectsCall();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node50 = jSTypeRegistry47.createParameters(jSTypeArray49);
        com.google.javascript.rhino.Node node52 = node50.getAncestor(8);
        boolean boolean53 = node50.isStringKey();
        boolean boolean54 = node50.isWhile();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        jSTypeRegistry56.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node59 = jSTypeRegistry56.createParameters(jSTypeArray58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        com.google.javascript.rhino.Node node66 = node64.getAncestor(8);
        boolean boolean67 = node64.isStringKey();
        boolean boolean68 = node64.isTry();
        boolean boolean69 = node64.isAssign();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) 0, node43, node50, node59, node64, 0, (int) (byte) 100);
        com.google.javascript.rhino.Node node73 = node33.copyInformationFromForTree(node50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.isExterns();
        node50.setJSDocInfo(jSDocInfo74);
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = jSDocInfo74.getTemplateTypeNames();
        boolean boolean78 = strList77.isEmpty();
        boolean boolean79 = strList20.containsAll((java.util.Collection<java.lang.String>) strList77);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = strList8.retainAll((java.util.Collection<java.lang.String>) strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + subclassType10 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType10.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node18 = jSTypeRegistry15.createParameters(jSTypeArray17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node23 = jSTypeRegistry20.createParameters(jSTypeArray22);
        boolean boolean25 = jSTypeRegistry20.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry20.createObjectType(objectType26);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry11.createObjectType("hi!", node18, objectType27);
        java.lang.String str29 = objectType28.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node34 = jSTypeRegistry31.createParameters(jSTypeArray33);
        boolean boolean36 = jSTypeRegistry31.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry31.createObjectType(objectType37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = objectType38.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType40 = jSTypeRegistry8.createParameterizedType(objectType28, (com.google.javascript.rhino.jstype.JSType) objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        boolean boolean47 = jSTypeRegistry42.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry42.createObjectType(objectType48);
        boolean boolean50 = objectType49.isCheckedUnknownType();
        int int51 = objectType49.getPropertiesCount();
        boolean boolean52 = objectType49.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node57 = jSTypeRegistry54.createParameters(jSTypeArray56);
        boolean boolean59 = jSTypeRegistry54.hasNamespace("");
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry54.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        jSTypeRegistry64.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry64.createParameters(jSTypeArray66);
        boolean boolean69 = jSTypeRegistry64.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry64.createObjectType(objectType70);
        boolean boolean72 = objectType71.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry54.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType71);
        boolean boolean74 = objectType49.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType71);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] { objectType71 };
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry6.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType38, jSTypeArray75);
        boolean boolean78 = functionType76.hasOwnProperty("PARAM_LIST");
        boolean boolean79 = functionType76.isEnumElementType();
        jSTypeRegistry1.unregisterPropertyOnType("{proxy:{512162719}}", (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82);
        jSTypeRegistry83.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node86 = jSTypeRegistry83.createParameters(jSTypeArray85);
        boolean boolean88 = jSTypeRegistry83.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType89 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSTypeRegistry83.createObjectType(objectType89);
        boolean boolean91 = objectType90.isCheckedUnknownType();
        int int92 = objectType90.getPropertiesCount();
        boolean boolean93 = objectType90.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = new com.google.javascript.rhino.JSDocInfo();
        objectType90.setJSDocInfo(jSDocInfo94);
        boolean boolean96 = jSDocInfo94.isDeprecated();
        boolean boolean97 = jSDocInfo94.isConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression98 = jSDocInfo94.getType();
        functionType76.setPropertyJSDocInfo("{proxy:{460037998}}", jSDocInfo94);
        org.junit.Assert.assertNull(errorReporter2);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(parameterizedType40);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSTypeExpression98);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry1.createParameters(jSTypeArray3);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = jSTypeRegistry1.createObjectType(objectType7);
        boolean boolean9 = objectType8.isCheckedUnknownType();
        int int10 = objectType8.getPropertiesCount();
        objectType8.clearCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry4.createParameters(jSTypeArray6);
        com.google.javascript.rhino.Node node9 = node7.getAncestor(8);
        boolean boolean10 = node7.isStringKey();
        boolean boolean11 = node7.isTry();
        java.lang.String str12 = node7.getSourceFileName();
        com.google.javascript.rhino.Node node13 = assertionFunctionSpec2.getAssertedParam(node7);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(8, 44, (int) (short) 1);
        boolean boolean18 = node17.hasOneChild();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node23 = jSTypeRegistry20.createParameters(jSTypeArray22);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isNoSideEffectsCall();
        node23.setLineno(1);
        boolean boolean28 = node23.isAdd();
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildrenAfter(node17, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        jSTypeRegistry7.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        jSTypeRegistry10.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry14.createParameters(jSTypeArray16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry19.createParameters(jSTypeArray21);
        boolean boolean24 = jSTypeRegistry19.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry19.createObjectType(objectType25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry10.createObjectType("hi!", node17, objectType26);
        java.lang.String str28 = objectType27.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node33 = jSTypeRegistry30.createParameters(jSTypeArray32);
        boolean boolean35 = jSTypeRegistry30.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry30.createObjectType(objectType36);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = objectType37.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType39 = jSTypeRegistry7.createParameterizedType(objectType27, (com.google.javascript.rhino.jstype.JSType) objectType37);
        boolean boolean40 = objectType27.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        boolean boolean47 = jSTypeRegistry42.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry42.createObjectType(objectType48);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = objectType49.toObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType51 = objectType50.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair52 = objectType27.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) objectType50);
        boolean boolean53 = objectType50.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("{proxy:{270062691}}", (com.google.javascript.rhino.jstype.JSType) objectType50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(parameterizedType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNull(enumElementType51);
        org.junit.Assert.assertNotNull(typePair52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType33.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        jSTypeRegistry41.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry45.createParameters(jSTypeArray47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        jSTypeRegistry50.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry50.createParameters(jSTypeArray52);
        boolean boolean55 = jSTypeRegistry50.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry50.createObjectType(objectType56);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry41.createObjectType("hi!", node48, objectType57);
        java.lang.String str59 = objectType58.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        boolean boolean66 = jSTypeRegistry61.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry61.createObjectType(objectType67);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType68.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = jSTypeRegistry38.createParameterizedType(objectType58, (com.google.javascript.rhino.jstype.JSType) objectType68);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType70.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType72 = parameterizedType70.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType70.findPropertyType("Unknown class name");
        boolean boolean75 = parameterizedType70.isInstanceType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = parameterizedType33.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType70);
        int int77 = parameterizedType33.getPropertiesCount();
        boolean boolean78 = parameterizedType33.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType79 = parameterizedType33.getParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(parameterizedType70);
        org.junit.Assert.assertNull(objectType71);
        org.junit.Assert.assertNull(enumElementType72);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(typePair76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSType79);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node11 = jSTypeRegistry8.createParameters(jSTypeArray10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node16 = jSTypeRegistry13.createParameters(jSTypeArray15);
        boolean boolean18 = jSTypeRegistry13.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry13.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createObjectType("hi!", node11, objectType20);
        java.lang.String str22 = objectType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        jSTypeRegistry24.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node27 = jSTypeRegistry24.createParameters(jSTypeArray26);
        boolean boolean29 = jSTypeRegistry24.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSTypeRegistry24.createObjectType(objectType30);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = objectType31.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry1.createParameterizedType(objectType21, (com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType33.getTypeOfThis();
        boolean boolean35 = parameterizedType33.isNoResolvedType();
        java.util.Set set36 = parameterizedType33.getOwnPropertyNames();
        boolean boolean37 = parameterizedType33.isNativeObjectType();
        java.lang.String str38 = parameterizedType33.toDebugHashCodeString();
        boolean boolean39 = parameterizedType33.isNominalType();
        com.google.javascript.rhino.Node node41 = parameterizedType33.getPropertyNode("{proxy:{1371129429}}");
        boolean boolean42 = parameterizedType33.isArrayType();
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(parameterizedType33);
        org.junit.Assert.assertNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{proxy:{1872489326}}" + "'", str38, "{proxy:{1872489326}}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode0 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode1 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode2 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode4 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode5 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode6 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList7 = com.google.common.collect.ImmutableList.of(resolveMode0, resolveMode1, resolveMode2, resolveMode3, resolveMode4, resolveMode5, resolveMode6);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode8 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode9 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode10 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode11 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode12 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode13 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode14 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList15 = com.google.common.collect.ImmutableList.of(resolveMode8, resolveMode9, resolveMode10, resolveMode11, resolveMode12, resolveMode13, resolveMode14);
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor25 = strList24.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable30 = jSTypeRegistry27.getTypesWithProperty("hi!");
        int int31 = strList24.indexOf((java.lang.Object) jSTypeRegistry27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = jSTypeRegistry27.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode33 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry27.setResolveMode(resolveMode33);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode36 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode37 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode39 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode40 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode41 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode42 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList43 = com.google.common.collect.ImmutableList.of(resolveMode36, resolveMode37, resolveMode38, resolveMode39, resolveMode40, resolveMode41, resolveMode42);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode44 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode45 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode46 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode47 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode48 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode49 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode50 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList51 = com.google.common.collect.ImmutableList.of(resolveMode44, resolveMode45, resolveMode46, resolveMode47, resolveMode48, resolveMode49, resolveMode50);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode52 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode53 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode54 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode55 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode56 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode57 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode58 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode59 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList60 = com.google.common.collect.ImmutableList.of(resolveMode53, resolveMode54, resolveMode55, resolveMode56, resolveMode57, resolveMode58, resolveMode59);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList61 = com.google.common.collect.ImmutableList.of(resolveMode4, resolveMode11, resolveMode33, resolveMode35, resolveMode38, resolveMode48, resolveMode52, resolveMode58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 3");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + resolveMode0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode0.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode1 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode1.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode2 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode2.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode4 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode4.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode5 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode5.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode6 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode6.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList7);
        org.junit.Assert.assertTrue("'" + resolveMode8 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode8.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode9 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode9.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode10 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode10.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode11 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode11.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode12 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode12.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode13 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode13.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode14 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode14.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList15);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(jSTypeIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(errorReporter32);
        org.junit.Assert.assertTrue("'" + resolveMode33 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode33.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode36 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode36.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode37 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode37.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode39 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode39.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode40 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode40.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode41 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode41.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode42 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode42.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList43);
        org.junit.Assert.assertTrue("'" + resolveMode44 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode44.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode45 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode45.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode46 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode46.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode47 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode47.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode48 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode48.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode49 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode49.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode50 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode50.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList51);
        org.junit.Assert.assertTrue("'" + resolveMode52 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode52.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode53 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode53.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode54 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode54.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode55 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode55.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode56 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode56.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode57 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode57.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode58 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode58.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertTrue("'" + resolveMode59 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode59.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(resolveModeList60);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "", "hi!", "hi!", "", "hi!", "hi!", "hi!");
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        jSTypeRegistry11.resetForTypeCheck();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry11.getTypesWithProperty("hi!");
        int int15 = strList8.indexOf((java.lang.Object) jSTypeRegistry11);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor16 = strList8.iterator();
        java.util.Iterator<java.lang.String> strItor17 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry26.createParameters(jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node34 = jSTypeRegistry31.createParameters(jSTypeArray33);
        boolean boolean36 = jSTypeRegistry31.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry31.createObjectType(objectType37);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry22.createObjectType("hi!", node29, objectType38);
        java.lang.String str40 = objectType39.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        jSTypeRegistry42.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry42.createParameters(jSTypeArray44);
        boolean boolean47 = jSTypeRegistry42.hasNamespace("");
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry42.createObjectType(objectType48);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = objectType49.toObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = jSTypeRegistry19.createParameterizedType(objectType39, (com.google.javascript.rhino.jstype.JSType) objectType49);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = parameterizedType51.getTypeOfThis();
        boolean boolean53 = parameterizedType51.isNoResolvedType();
        java.util.Set set54 = parameterizedType51.getOwnPropertyNames();
        boolean boolean55 = parameterizedType51.isNativeObjectType();
        boolean boolean56 = parameterizedType51.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = parameterizedType51.getCtorImplementedInterfaces();
        boolean boolean58 = strList8.contains((java.lang.Object) parameterizedType51);
        java.util.Iterator<java.lang.String> strItor59 = strList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node64 = jSTypeRegistry61.createParameters(jSTypeArray63);
        com.google.javascript.rhino.Node node66 = node64.getAncestor(8);
        boolean boolean67 = node64.isStringKey();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        jSTypeRegistry69.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node72 = jSTypeRegistry69.createParameters(jSTypeArray71);
        boolean boolean73 = node72.isAssignAdd();
        boolean boolean74 = node72.isNot();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        jSTypeRegistry76.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node79 = jSTypeRegistry76.createParameters(jSTypeArray78);
        com.google.javascript.rhino.Node node81 = node79.getAncestor(8);
        boolean boolean82 = node79.isLocalResultCall();
        int int83 = node79.getChildCount();
        com.google.javascript.rhino.Node node84 = node72.useSourceInfoFromForTree(node79);
        boolean boolean85 = node72.isAssignAdd();
        boolean boolean86 = node64.hasChild(node72);
        boolean boolean87 = node72.isNew();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = strList8.remove((java.lang.Object) node72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(parameterizedType51);
        org.junit.Assert.assertNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }
}

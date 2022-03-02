import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0401");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.hasThisType();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean7 = jSDocInfo0.hasParameterType("Function.<Function>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0402");
        java.lang.reflect.Type type0 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        boolean boolean3 = jSDocInfo1.hasTypedefType();
        java.lang.String str5 = jSDocInfo1.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass6 = jSDocInfo1.getClass();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        node13.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(10, node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry8.createFunctionType(jSType9, node17);
        int int19 = functionType18.getMinArguments();
        boolean boolean20 = functionType18.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType18.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType18.getTemplateTypeNames();
        java.lang.Class<?> wildcardClass23 = functionType18.getClass();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node26.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection33 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node26);
        boolean boolean34 = node26.isCatch();
        java.lang.Class<?> wildcardClass35 = node26.getClass();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList37 = com.google.common.collect.ImmutableList.of(booleanLiteralSet36);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = booleanLiteralSet36.union(booleanLiteralSet38);
        java.lang.Class<?> wildcardClass40 = booleanLiteralSet38.getClass();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        node47.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = node47.cloneTree();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(10, node50);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry42.createFunctionType(jSType43, node51);
        int int53 = functionType52.getMinArguments();
        boolean boolean54 = functionType52.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType52.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = functionType52.getTemplateTypeNames();
        java.lang.Class<?> wildcardClass57 = functionType52.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        java.lang.String str62 = jSDocInfo58.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass63 = jSDocInfo58.getClass();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList65 = com.google.common.collect.ImmutableList.of(booleanLiteralSet64);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet66 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet67 = booleanLiteralSet64.union(booleanLiteralSet66);
        java.lang.Class<?> wildcardClass68 = booleanLiteralSet66.getClass();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean72 = node71.isObjectLit();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node76 = node71.copyInformationFromForTree(node75);
        boolean boolean77 = node71.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection78 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node71);
        boolean boolean79 = node71.isCatch();
        java.lang.Class<?> wildcardClass80 = node71.getClass();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList82 = com.google.common.collect.ImmutableList.of(booleanLiteralSet81);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet83 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = booleanLiteralSet81.union(booleanLiteralSet83);
        java.lang.Class<?> wildcardClass85 = booleanLiteralSet83.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean87 = jSDocInfo86.isNoCompile();
        boolean boolean88 = jSDocInfo86.hasTypedefType();
        java.lang.String str90 = jSDocInfo86.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass91 = jSDocInfo86.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList92 = com.google.common.collect.ImmutableList.of(type0, (java.lang.reflect.Type) wildcardClass6, (java.lang.reflect.Type) wildcardClass23, (java.lang.reflect.Type) wildcardClass35, (java.lang.reflect.Type) wildcardClass40, (java.lang.reflect.Type) wildcardClass57, (java.lang.reflect.Type) wildcardClass63, (java.lang.reflect.Type) wildcardClass68, (java.lang.reflect.Type) wildcardClass80, (java.lang.reflect.Type) wildcardClass85, (java.lang.reflect.Type) wildcardClass91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList37);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList65);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet66 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet66.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet67 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet67.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(nodeCollection78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList82);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet83 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet83.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0403");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = functionType11.getPossibleToBooleanOutcomes();
        int int21 = functionType11.getPropertiesCount();
        boolean boolean22 = functionType11.matchesNumberContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType11.getAllImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable24 = functionType11.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(objectTypeIterable24);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0404");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0405");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node25.isTrue();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(41, node3, node15, node25);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = node25.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0406");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.lang.Object[] objArray12 = serializableList8.toArray();
        java.lang.Object obj13 = null;
        int int14 = serializableList8.indexOf(obj13);
        java.util.ListIterator<java.io.Serializable> serializableItor16 = serializableList8.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor18 = serializableList8.listIterator(40960);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (40960) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(serializableItor16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0407");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo17.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = jSDocInfo17.getThisType();
        boolean boolean23 = jSDocInfo17.isImplicitCast();
        boolean boolean25 = jSDocInfo17.hasParameterType("INSTANCEOF 49\n    OR \n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertNull(jSTypeExpression22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0408");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "(INSTANCEOF 49\n    OR \n)");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0409");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getAllImplementedInterfaces();
        boolean boolean20 = functionType17.isEmptyType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        int int33 = functionType32.getMinArguments();
        int int34 = functionType32.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType32.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        node42.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node45 = node42.cloneTree();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node45);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry37.createFunctionType(jSType38, node46);
        int int48 = functionType47.getMinArguments();
        boolean boolean49 = functionType32.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType47);
        boolean boolean50 = functionType32.isNoType();
        boolean boolean51 = functionType32.isUnknownType();
        boolean boolean52 = functionType17.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType17.getTypeOfThis();
        boolean boolean54 = functionType17.matchesObjectContext();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0410");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.util.Iterator<java.io.Serializable> serializableItor12 = serializableList11.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        node19.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node22 = node19.cloneTree();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node22);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry14.createFunctionType(jSType15, node23);
        int int25 = functionType24.getMinArguments();
        boolean boolean26 = functionType24.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getImplementedInterfaces();
        java.lang.Iterable iterable28 = functionType24.getCtorImplementedInterfaces();
        boolean boolean29 = functionType24.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.isNoCompile();
        boolean boolean32 = jSDocInfo30.hasTypedefType();
        functionType24.setJSDocInfo(jSDocInfo30);
        com.google.javascript.rhino.jstype.ObjectType.Property property35 = functionType24.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType24.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType24.getTemplateTypeNames();
        boolean boolean38 = serializableList11.contains((java.lang.Object) functionType24);
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType24.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = functionType24.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNotNull(iterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(property35);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNotNull(objectType40);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0411");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        boolean boolean97 = enumElementType96.matchesStringContext();
        int int98 = enumElementType96.getPropertiesCount();
        boolean boolean99 = enumElementType96.matchesObjectContext();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0412");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0413");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node33, "INSTANCEOF 49\n    OR \n");
        boolean boolean37 = node33.isQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0414");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        boolean boolean56 = functionType54.matchesStringContext();
        boolean boolean57 = functionType54.isNumberObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        node65.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node65.cloneTree();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(10, node68);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry60.createFunctionType(jSType61, node69);
        int int71 = functionType70.getMinArguments();
        int int72 = functionType70.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType70.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType70.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType70.autobox();
        boolean boolean76 = functionType70.isOrdinaryFunction();
        boolean boolean78 = functionType70.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        int int82 = node81.getLineno();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean86 = node85.isObjectLit();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node90 = node85.copyInformationFromForTree(node89);
        boolean boolean91 = node89.isObjectLit();
        boolean boolean92 = node89.isLabelName();
        com.google.javascript.rhino.Node node93 = node81.srcrefTree(node89);
        boolean boolean94 = node93.isFromExterns();
        boolean boolean95 = node93.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType70, node93);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable97 = functionType96.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(objectTypeIterable97);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0415");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node25.isTrue();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(41, node3, node15, node25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0416");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getAllImplementedInterfaces();
        boolean boolean20 = functionType17.isEmptyType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        int int33 = functionType32.getMinArguments();
        int int34 = functionType32.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType32.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        node42.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node45 = node42.cloneTree();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node45);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry37.createFunctionType(jSType38, node46);
        int int48 = functionType47.getMinArguments();
        boolean boolean49 = functionType32.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType47);
        boolean boolean50 = functionType32.isNoType();
        boolean boolean51 = functionType32.isUnknownType();
        boolean boolean52 = functionType17.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType32.getIndexType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(jSType53);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0417");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable10 = node2.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor11 = ancestorIterable10.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor12 = ancestorIterable10.iterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(ancestorIterable10);
        org.junit.Assert.assertNotNull(nodeItor11);
        org.junit.Assert.assertNotNull(nodeItor12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0418");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList16 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue24);
        boolean boolean26 = serializableList16.containsAll((java.util.Collection<java.io.Serializable>) serializableList25);
        int int28 = serializableList16.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node54.isTrue();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(41, node32, node44, node54);
        int int57 = serializableList16.lastIndexOf((java.lang.Object) node54);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder58 = serializableCollectionBuilder3.add((java.util.Collection<java.io.Serializable>) serializableList16);
        java.util.Collection<java.io.Serializable> serializableCollection59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder60 = serializableCollectionBuilder3.add(serializableCollection59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(serializableCollectionBuilder58);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0419");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        boolean boolean20 = node19.isRegExp();
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        boolean boolean30 = node28.isAdd();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        int int34 = node33.getLineno();
        boolean boolean35 = node33.isLabelName();
        boolean boolean36 = node33.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList37 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node19, (java.lang.Cloneable) node28, (java.lang.Cloneable) node33);
        jSDocInfo0.setAssociatedNode(node33);
        boolean boolean39 = jSDocInfo0.isOverride();
        java.lang.String str40 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cloneableList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0420");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isInc();
        int int9 = node2.getLineno();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            node2.appendStringTree(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0421");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node7);
        boolean boolean12 = node7.isDec();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node15.isComma();
        java.lang.String str22 = node15.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isFromExterns();
        boolean boolean42 = node38.wasEmptyNode();
        boolean boolean43 = node38.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node30, node38);
        boolean boolean45 = node38.hasMoreThanOneChild();
        boolean boolean46 = node38.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(35, node7, node15, node38);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType48 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = node51.copyInformationFromForTree(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = node59.copyInformationFromForTree(node63);
        boolean boolean65 = node63.isObjectLit();
        boolean boolean66 = node63.isFromExterns();
        boolean boolean67 = node63.wasEmptyNode();
        boolean boolean68 = node63.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship69 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType48, node55, node63);
        boolean boolean70 = node63.isTypeOf();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node71 = node38.removeChildAfter(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OR \n" + "'", str22, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType23 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType23.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + subclassType48 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType48.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0422");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        node14.setJSDocInfo(jSDocInfo16);
        boolean boolean19 = node14.getBooleanProp((int) (short) -1);
        java.lang.Object obj21 = node14.getProp(36);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node14.setStaticSourceFile(staticSourceFile22);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = node35.copyInformationFromForTree(node39);
        boolean boolean41 = node39.isObjectLit();
        boolean boolean42 = node39.isFromExterns();
        boolean boolean43 = node39.wasEmptyNode();
        boolean boolean44 = node39.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship45 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType24, node31, node39);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = node48.copyInformationFromForTree(node52);
        boolean boolean54 = node52.isObjectLit();
        boolean boolean55 = node52.isSwitch();
        boolean boolean56 = node39.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = node59.copyInformationFromForTree(node63);
        boolean boolean65 = node64.isTrue();
        node52.addChildToFront(node64);
        com.google.javascript.rhino.Node node67 = node14.copyInformationFrom(node52);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags69 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags69.clearSideEffectFlags();
        sideEffectFlags69.setAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node52.setSideEffectFlags(sideEffectFlags69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + subclassType24 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType24.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0423");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        int int17 = node16.getLineno();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isLabelName();
        com.google.javascript.rhino.Node node28 = node16.srcrefTree(node24);
        com.google.javascript.rhino.jstype.JSType jSType29 = node28.getJSType();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(44, node28, node32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        int int48 = functionType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = functionType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType46.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType46.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry1.createObjectType("", node34, (com.google.javascript.rhino.jstype.ObjectType) functionType46);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType46.getAllExtendedInterfaces();
        java.lang.String str55 = functionType46.getDisplayName();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        int int59 = node58.getLineno();
        boolean boolean60 = node58.isTypeOf();
        functionType46.setSource(node58);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope62 = functionType46.getParentScope();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope62);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0424");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue28);
        boolean boolean31 = serializableList29.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList32 = serializableList29.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = serializableList17.addAll((java.util.Collection<java.io.Serializable>) serializableList32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(serializableList32);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0425");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        node14.setSourceEncodedPosition(45);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean22 = node21.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node26.isTry();
        node26.setOptionalArg(false);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = node37.copyInformationFromForTree(node41);
        boolean boolean43 = node37.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection44 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node37);
        com.google.javascript.rhino.Node node45 = node26.clonePropsFrom(node37);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(36, node23, node45);
        com.google.javascript.rhino.Node node47 = node14.useSourceInfoIfMissingFrom(node46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = node47.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeCollection44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0426");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        boolean boolean29 = node28.isIf();
        boolean boolean30 = node28.isAssign();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0427");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0428");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node46.isTrue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(41, node24, node36, node46);
        int int49 = serializableList8.lastIndexOf((java.lang.Object) node46);
        boolean boolean50 = node46.isGetProp();
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0429");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        java.lang.String str11 = node2.getSourceFileName();
        boolean boolean12 = node2.isSetterDef();
        boolean boolean13 = node2.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0430");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0431");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        boolean boolean67 = parameterizedType63.isNullable();
        java.lang.Iterable iterable68 = parameterizedType63.getCtorImplementedInterfaces();
        java.lang.String str69 = parameterizedType63.getReferenceName();
        boolean boolean70 = parameterizedType63.isAllType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0432");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        java.lang.Object obj30 = null;
        boolean boolean31 = serializableList27.contains(obj30);
        java.lang.Object[] objArray32 = serializableList27.toArray();
        java.lang.Object[] objArray33 = serializableList27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            serializableList27.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str9, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(serializableList18);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0433");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node3.isTry();
        node3.setLength(4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node3.getJsDocBuilderForNode();
        boolean boolean13 = node3.isFor();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str20 = node16.checkTreeEquals(node19);
        boolean boolean21 = node16.hasOneChild();
        java.util.Set<java.lang.String> strSet22 = node16.getDirectives();
        node3.addChildToBack(node16);
        boolean boolean24 = node16.isFor();
        node16.addSuppression("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = node33.copyInformationFromForTree(node37);
        boolean boolean39 = node33.isTry();
        node33.setLength(4);
        java.util.Set<java.lang.String> strSet42 = node33.getDirectives();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        int int46 = node45.getLineno();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node53.isObjectLit();
        boolean boolean56 = node53.isLabelName();
        com.google.javascript.rhino.Node node57 = node45.srcrefTree(node53);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node57.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = null;
        node57.setJSDocInfo(jSDocInfo59);
        boolean boolean62 = node57.getBooleanProp((int) (short) -1);
        java.lang.Object obj64 = node57.getProp(36);
        com.google.javascript.rhino.Node node65 = node33.useSourceInfoIfMissingFromForTree(node57);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(42, node16, node30, node33, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0434");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumElementType97.autoboxesTo();
        boolean boolean99 = enumElementType97.isObject();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0435");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry16.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry16.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        int int35 = functionType33.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType33.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = objectType36.getCtorExtendedInterfaces();
        boolean boolean39 = objectType36.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        int int52 = functionType51.getMinArguments();
        boolean boolean53 = functionType51.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType51.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] { jSType54 };
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry16.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType36, jSTypeArray55);
        boolean boolean57 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType69.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = functionType69.getTemplateTypeNames();
        boolean boolean75 = functionType69.isPropertyTypeDeclared("(INSTANCEOF 49\n    OR \n)");
        boolean boolean76 = functionType56.hasEqualCallType(functionType69);
        boolean boolean77 = functionType69.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = functionType69.toMaybeFunctionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(functionType78);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0436");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        int int17 = node16.getLineno();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isLabelName();
        com.google.javascript.rhino.Node node28 = node16.srcrefTree(node24);
        com.google.javascript.rhino.jstype.JSType jSType29 = node28.getJSType();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(44, node28, node32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        int int48 = functionType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = functionType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType46.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType46.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry1.createObjectType("", node34, (com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        node60.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node63 = node60.cloneTree();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(10, node63);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry55.createFunctionType(jSType56, node64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        node72.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node75 = node72.cloneTree();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(10, node75);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry67.createFunctionType(jSType68, node76);
        int int78 = functionType77.getMinArguments();
        int int79 = functionType77.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType77.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        node87.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node90 = node87.cloneTree();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(10, node90);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry82.createFunctionType(jSType83, node91);
        int int93 = functionType92.getMinArguments();
        boolean boolean94 = functionType77.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType92);
        com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry55.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType92);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = objectType53.testForEquality(jSType95);
        boolean boolean97 = objectType53.isTemplateType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objectType80);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(ternaryValue96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0437");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType17.getExtendedInterfaces();
        boolean boolean23 = functionType17.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0438");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        boolean boolean98 = enumElementType96.isObject();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType99 = enumElementType96.toMaybeEnumElementType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(enumElementType99);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0439");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        java.lang.Object obj30 = null;
        boolean boolean31 = serializableList27.contains(obj30);
        java.lang.Object[] objArray32 = serializableList27.toArray();
        java.lang.Object[] objArray33 = serializableList27.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList43 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList52 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue51);
        boolean boolean53 = serializableList43.containsAll((java.util.Collection<java.io.Serializable>) serializableList52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = serializableList27.addAll((int) (short) 1, (java.util.Collection<java.io.Serializable>) serializableList43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str9, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(serializableList18);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(serializableList43);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0440");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry1.createAnonymousObjectType();
        java.lang.String str21 = objectType20.getNormalizedReferenceName();
        boolean boolean22 = objectType20.isStringObjectType();
        boolean boolean23 = objectType20.hasAnyTemplate();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0441");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        com.google.javascript.rhino.Node node5 = node2.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node5.cloneNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0442");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Not declared as a type name", "Function", "Not declared as a constructor", "Unknown class name", "Not declared as a constructor", "Not declared as a constructor" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = jSTypeRegistry23.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType38.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry23.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType42 = objectType41.unboxesTo();
        boolean boolean43 = strSet20.equals((java.lang.Object) objectType41);
        java.util.Iterator<java.lang.String> strItor44 = strSet20.iterator();
        java.util.Iterator<java.lang.String> strItor45 = strSet20.iterator();
        node2.setDirectives((java.util.Set<java.lang.String>) strSet20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList55 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue54);
        java.lang.String str56 = serializableList55.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList65 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList74 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue73);
        boolean boolean75 = serializableList65.containsAll((java.util.Collection<java.io.Serializable>) serializableList74);
        boolean boolean76 = serializableList55.containsAll((java.util.Collection<java.io.Serializable>) serializableList74);
        boolean boolean77 = strSet20.removeAll((java.util.Collection<java.io.Serializable>) serializableList55);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        boolean boolean80 = node79.isContinue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = serializableList55.add((java.io.Serializable) boolean80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(serializableList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str56, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(serializableList65);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(serializableList74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0443");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0444");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        boolean boolean10 = serializableList8.isEmpty();
        java.util.ListIterator<java.io.Serializable> serializableItor11 = serializableList8.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        boolean boolean25 = functionType23.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType23.getImplementedInterfaces();
        java.lang.Iterable iterable27 = functionType23.getCtorImplementedInterfaces();
        int int28 = serializableList8.lastIndexOf((java.lang.Object) iterable27);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableItor11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertNotNull(iterable27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0445");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        node3.detachChildren();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node3.copyInformationFrom(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0446");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        com.google.javascript.rhino.Node node5 = node2.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node5.setLength(37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0447");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.lang.String str6 = jSDocInfo0.toString();
        java.lang.String str7 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSDocInfo" + "'", str7, "JSDocInfo");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0448");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType11.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType11);
        java.lang.String str17 = null; // flaky: functionType11.toAnnotationString();
        boolean boolean18 = functionType11.isUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(objectType16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Function" + "'", str17, "Function");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0449");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Named type with empty name component", (int) '#', (-1));
        boolean boolean4 = node3.isDo();
        boolean boolean5 = node3.isNull();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0450");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        java.lang.Iterable iterable78 = functionType69.getCtorImplementedInterfaces();
        boolean boolean79 = functionType69.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ObjectType.Property property81 = functionType69.getSlot("JSDocInfo");
        boolean boolean82 = functionType69.isNativeObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(iterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(property81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0451");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isArrayLit();
        node2.setLength((int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node29.isTry();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = node38.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        int int47 = node46.getLineno();
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node14, node17, node21, node29, node42, node46 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, nodeArray48);
        node49.setWasEmptyNode(true);
        boolean boolean52 = node2.isEquivalentToTyped(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        int int56 = node55.getLineno();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = node59.copyInformationFromForTree(node63);
        boolean boolean65 = node63.isObjectLit();
        boolean boolean66 = node63.isLabelName();
        com.google.javascript.rhino.Node node67 = node55.srcrefTree(node63);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = node2.clonePropsFrom(node67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0452");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0453");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = parameterizedType63.getOwnerFunction();
        com.google.javascript.rhino.jstype.UnionType unionType67 = parameterizedType63.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = parameterizedType63.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNull(unionType67);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0454");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        com.google.javascript.rhino.Node node10 = node6.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node10.isAdd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0455");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        boolean boolean67 = parameterizedType63.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType68 = parameterizedType63.toMaybeUnionType();
        boolean boolean69 = parameterizedType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.collapseUnion();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(unionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType70);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0456");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType38.dereference();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = objectType42.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.TemplateType templateType44 = objectType42.toMaybeTemplateType();
        boolean boolean46 = objectType42.removeProperty("JSDocInfo");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(templateType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0457");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        boolean boolean20 = jSDocInfo15.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str22 = jSDocInfo21.getDeprecationReason();
        boolean boolean23 = jSDocInfo21.hasFileOverview();
        boolean boolean24 = jSDocInfo21.isExterns();
        boolean boolean25 = jSDocInfo21.isImplicitCast();
        int int26 = jSDocInfo21.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility27 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo21.setVisibility(visibility27);
        jSDocInfo15.setVisibility(visibility27);
        boolean boolean30 = jSDocInfo15.hasModifies();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + visibility27 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility27.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0458");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType14.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet16 = objectType14.getOwnPropertyNames();
        strSet16.clear();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList26 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList35 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue34);
        boolean boolean36 = serializableList26.containsAll((java.util.Collection<java.io.Serializable>) serializableList35);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList38 = com.google.common.collect.ImmutableList.of(booleanLiteralSet37);
        boolean boolean39 = serializableList35.equals((java.lang.Object) booleanLiteralSet37);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList40 = serializableList35.asList();
        java.lang.String str41 = serializableList40.toString();
        boolean boolean42 = strSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableList40);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        int int56 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        int int61 = jSDocInfo58.getImplementedInterfaceCount();
        functionType54.setPropertyJSDocInfo("", jSDocInfo58);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = functionType54.getPossibleToBooleanOutcomes();
        int int64 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property66 = functionType54.getSlot("true");
        com.google.javascript.rhino.Node node67 = functionType54.getRootNode();
        boolean boolean68 = functionType54.isNoObjectType();
        boolean boolean69 = serializableList40.contains((java.lang.Object) boolean68);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(serializableList26);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(serializableList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str41, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(property66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0459");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.InputId inputId3 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str4 = inputId3.toString();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        boolean boolean22 = node20.isObjectLit();
        boolean boolean23 = node20.isFromExterns();
        boolean boolean24 = node20.wasEmptyNode();
        boolean boolean25 = node20.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship26 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node12, node20);
        com.google.javascript.rhino.Node node27 = node20.cloneNode();
        java.lang.Object obj29 = null;
        node27.putProp(100, obj29);
        boolean boolean31 = node27.hasMoreThanOneChild();
        boolean boolean32 = inputId3.equals((java.lang.Object) node27);
        com.google.javascript.rhino.InputId inputId34 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str35 = inputId34.getIdName();
        java.lang.String str36 = inputId34.toString();
        com.google.javascript.rhino.InputId inputId38 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str39 = inputId38.toString();
        com.google.javascript.rhino.InputId inputId41 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str42 = inputId41.toString();
        com.google.javascript.rhino.InputId inputId44 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean49 = node48.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node58 = node53.copyInformationFromForTree(node57);
        boolean boolean59 = node53.isTry();
        node53.setOptionalArg(false);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node69 = node64.copyInformationFromForTree(node68);
        boolean boolean70 = node64.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection71 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node64);
        com.google.javascript.rhino.Node node72 = node53.clonePropsFrom(node64);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(36, node50, node72);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean77 = node76.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newExpr(node76);
        com.google.javascript.rhino.Node node79 = node73.clonePropsFrom(node78);
        com.google.javascript.rhino.InputId inputId81 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        node79.setInputId(inputId81);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList83 = com.google.common.collect.ImmutableList.of(inputId1, inputId3, inputId34, inputId38, inputId41, inputId44, inputId81);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) '4', node87, 49, 45);
        boolean boolean91 = node90.isVar();
        java.lang.Object obj93 = node90.getProp(4);
        boolean boolean94 = node90.isFunction();
        boolean boolean95 = inputId38.equals((java.lang.Object) boolean94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str4, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + subclassType5 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType5.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str35, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str36, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str39, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str42, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(nodeCollection71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(inputIdList83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0460");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node14.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node41.isTrue();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(41, node19, node31, node41);
        com.google.javascript.rhino.Node node44 = node14.srcref(node41);
        boolean boolean45 = node41.isFor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0461");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        boolean boolean97 = enumElementType96.matchesStringContext();
        int int98 = enumElementType96.getPropertiesCount();
        boolean boolean99 = enumElementType96.matchesNumberContext();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0462");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getOriginalCommentString();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0463");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isFromExterns();
        boolean boolean11 = node7.wasEmptyNode();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isObjectLit();
        boolean boolean31 = node28.isFromExterns();
        boolean boolean32 = node28.wasEmptyNode();
        boolean boolean33 = node28.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType13, node20, node28);
        com.google.javascript.rhino.Node node35 = node28.cloneNode();
        java.lang.Object obj37 = null;
        node35.putProp(100, obj37);
        node35.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node35);
        com.google.javascript.rhino.Node node43 = node7.srcrefTree(node35);
        java.lang.String str44 = node35.getSourceFileName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        int int48 = node47.getLineno();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = node51.copyInformationFromForTree(node55);
        boolean boolean57 = node55.isObjectLit();
        boolean boolean58 = node55.isLabelName();
        com.google.javascript.rhino.Node node59 = node47.srcrefTree(node55);
        boolean boolean60 = node59.isRegExp();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node69 = node64.copyInformationFromForTree(node68);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean73 = node72.isObjectLit();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node77 = node72.copyInformationFromForTree(node76);
        boolean boolean78 = node76.isObjectLit();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean82 = node81.isObjectLit();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node86 = node81.copyInformationFromForTree(node85);
        boolean boolean87 = node86.isTrue();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(41, node64, node76, node86);
        com.google.javascript.rhino.Node node89 = node59.srcref(node86);
        boolean boolean90 = node59.isString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(38, node35, node59, 40, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0464");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        node3.setVarArgs(false);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node3.new FileLevelJsDocBuilder();
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0465");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean30 = functionType11.hasProperty("OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0466");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        boolean boolean7 = node6.isVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0467");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType17.getCtorExtendedInterfaces();
        boolean boolean21 = functionType17.isInstanceType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0468");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType11.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType11);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        node23.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node23.cloneTree();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(10, node26);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry18.createFunctionType(jSType19, node27);
        int int29 = functionType28.getMinArguments();
        int int30 = functionType28.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isNoCompile();
        boolean boolean34 = jSDocInfo32.hasTypedefType();
        int int35 = jSDocInfo32.getImplementedInterfaceCount();
        functionType28.setPropertyJSDocInfo("", jSDocInfo32);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType28.getImplicitPrototype();
        boolean boolean39 = functionType11.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType40 = functionType28.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0469");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = null;
        functionType17.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo21);
        boolean boolean23 = functionType17.hasCachedValues();
        boolean boolean24 = functionType17.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType17.getBindReturnType(1);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType38.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType38);
        boolean boolean42 = functionType26.hasReferenceName();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0470");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setReturnsTainted();
        int int3 = sideEffectFlags1.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags7 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags7.setMutatesThis();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str11 = inputId10.getIdName();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags13 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        boolean boolean14 = sideEffectFlags13.areAllFlagsSet();
        sideEffectFlags13.setMutatesArguments();
        boolean boolean16 = inputId10.equals((java.lang.Object) sideEffectFlags13);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList17 = com.google.common.collect.ImmutableList.of(sideEffectFlags1, sideEffectFlags5, sideEffectFlags7, sideEffectFlags13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str11, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sideEffectFlagsList17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0471");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        node2.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isSwitch();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node13);
        boolean boolean18 = node13.isDec();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node21.isComma();
        java.lang.String str28 = node21.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType29 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        boolean boolean47 = node44.isFromExterns();
        boolean boolean48 = node44.wasEmptyNode();
        boolean boolean49 = node44.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship50 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType29, node36, node44);
        boolean boolean51 = node44.hasMoreThanOneChild();
        boolean boolean52 = node44.isThis();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(35, node13, node21, node44);
        com.google.javascript.rhino.Node node54 = node53.getLastChild();
        boolean boolean55 = node5.isEquivalentToTyped(node53);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node63 = node58.copyInformationFromForTree(node62);
        boolean boolean64 = node58.isTry();
        boolean boolean65 = node58.hasMoreThanOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node66 = node53.getChildBefore(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OR \n" + "'", str28, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType29 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType29.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0472");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean2 = node1.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType3 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = node14.copyInformationFromForTree(node18);
        boolean boolean20 = node18.isObjectLit();
        boolean boolean21 = node18.isFromExterns();
        boolean boolean22 = node18.wasEmptyNode();
        boolean boolean23 = node18.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship24 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType3, node10, node18);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isSetterDef();
        boolean boolean34 = node31.isString();
        com.google.javascript.rhino.Node node35 = node18.useSourceInfoIfMissingFrom(node31);
        boolean boolean36 = node1.isEquivalentTo(node18);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = node18.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + subclassType3 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType3.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0473");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair57 = objectType14.getTypesUnderEquality(jSType56);
        boolean boolean58 = jSType56.isNullable();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(typePair57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0474");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        stringPosition0.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) '4', 16, 51, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: 51");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0475");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = node30.copyInformationFromForTree(node34);
        boolean boolean36 = node34.isObjectLit();
        boolean boolean37 = node34.isSwitch();
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node34);
        boolean boolean39 = node34.isDec();
        boolean boolean40 = serializableList8.equals((java.lang.Object) boolean39);
        boolean boolean41 = serializableList8.isEmpty();
        java.lang.Object obj42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = serializableList8.remove(obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0476");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        java.lang.String str5 = jSDocInfo0.getLicense();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        boolean boolean7 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0477");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isSwitch();
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node6);
        int int11 = node6.getLength();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList20 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue28);
        boolean boolean30 = serializableList20.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        int int32 = serializableList20.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node49 = node44.copyInformationFromForTree(node48);
        boolean boolean50 = node48.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node58 = node53.copyInformationFromForTree(node57);
        boolean boolean59 = node58.isTrue();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(41, node36, node48, node58);
        int int61 = serializableList20.lastIndexOf((java.lang.Object) node58);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = null;
        node58.setStaticSourceFile(staticSourceFile62);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean67 = node66.isObjectLit();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = node66.copyInformationFromForTree(node70);
        boolean boolean72 = node70.isObjectLit();
        boolean boolean73 = node70.isLabelName();
        node70.setSourceFileForTesting("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildBefore(node58, node70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(serializableList20);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0478");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isDo();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        boolean boolean20 = node19.isRegExp();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node46.isTrue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(41, node24, node36, node46);
        com.google.javascript.rhino.Node node49 = node19.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        boolean boolean52 = node51.isInc();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder53 = node51.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean58 = node57.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node67 = node62.copyInformationFromForTree(node66);
        boolean boolean68 = node62.isTry();
        node62.setOptionalArg(false);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean74 = node73.isObjectLit();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node78 = node73.copyInformationFromForTree(node77);
        boolean boolean79 = node73.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection80 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node73);
        com.google.javascript.rhino.Node node81 = node62.clonePropsFrom(node73);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(36, node59, node81);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean86 = node85.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newExpr(node85);
        com.google.javascript.rhino.Node node88 = node82.clonePropsFrom(node87);
        node51.addChildrenToFront(node88);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(52, node3, node19, node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node91 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(nodeCollection80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0479");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        int int5 = node2.getLength();
        boolean boolean6 = node2.isInc();
        node2.setLength((int) (short) 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node34.isTrue();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(41, node12, node24, node34);
        node24.setLineno((int) (byte) 10);
        boolean boolean39 = node24.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildToFront(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0480");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node7);
        boolean boolean12 = node7.isDec();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node15.isComma();
        java.lang.String str22 = node15.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isFromExterns();
        boolean boolean42 = node38.wasEmptyNode();
        boolean boolean43 = node38.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node30, node38);
        boolean boolean45 = node38.hasMoreThanOneChild();
        boolean boolean46 = node38.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(35, node7, node15, node38);
        boolean boolean48 = node7.isIn();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node7.children();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OR \n" + "'", str22, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType23 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType23.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeIterable49);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0481");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType11.autobox();
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        boolean boolean19 = functionType11.isFunctionType();
        boolean boolean20 = functionType11.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0482");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean12 = node3.isThis();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        java.lang.String str14 = node3.toStringTree();
        boolean boolean15 = node3.isOnlyModifiesThisCall();
        boolean boolean16 = node3.wasEmptyNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo17 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OR  [source_file: ]\n" + "'", str14, "OR  [source_file: ]\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0483");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        boolean boolean97 = enumElementType96.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumElementType96.getPropertyType("Not declared as a constructor");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0484");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        boolean boolean67 = functionType66.isNumberObjectType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot69 = functionType66.getSlot("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType66.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSlot69);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0485");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList22 = functionType17.getSubTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType17.getCtorImplementedInterfaces();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = functionType17.setValidator(jSTypePredicate24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionTypeList22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0486");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = node30.copyInformationFromForTree(node34);
        boolean boolean36 = node34.isObjectLit();
        boolean boolean37 = node34.isSwitch();
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node34);
        boolean boolean39 = node34.isDec();
        boolean boolean40 = serializableList8.equals((java.lang.Object) boolean39);
        boolean boolean41 = serializableList8.isEmpty();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = serializableList8.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        boolean boolean56 = functionType54.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = functionType54.getImplementedInterfaces();
        java.lang.Iterable iterable58 = functionType54.getCtorImplementedInterfaces();
        boolean boolean59 = functionType54.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean61 = jSDocInfo60.isNoCompile();
        boolean boolean62 = jSDocInfo60.hasTypedefType();
        functionType54.setJSDocInfo(jSDocInfo60);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList64 = jSDocInfo60.getImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = serializableList8.add((java.io.Serializable) jSDocInfo60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertNotNull(iterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList64);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0487");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        boolean boolean35 = node34.isRegExp();
        boolean boolean36 = node34.isNull();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean41 = node40.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean46 = node45.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = node45.copyInformationFromForTree(node49);
        boolean boolean51 = node45.isTry();
        node45.setOptionalArg(false);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean57 = node56.isObjectLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node61 = node56.copyInformationFromForTree(node60);
        boolean boolean62 = node56.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection63 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node56);
        com.google.javascript.rhino.Node node64 = node45.clonePropsFrom(node56);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(36, node42, node64);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean69 = node68.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node68);
        com.google.javascript.rhino.Node node71 = node65.clonePropsFrom(node70);
        boolean boolean72 = node71.isRegExp();
        com.google.javascript.rhino.Node node73 = node34.clonePropsFrom(node71);
        boolean boolean74 = node73.isIn();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable75 = node73.getAncestors();
        boolean boolean76 = node73.isArrayLit();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(nodeCollection63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(ancestorIterable75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0488");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = functionType11.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        boolean boolean35 = functionType33.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        node42.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node45 = node42.cloneTree();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node45);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry37.createFunctionType(jSType38, node46);
        int int48 = functionType47.getMinArguments();
        int int49 = functionType47.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = functionType47.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        boolean boolean64 = functionType47.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean65 = functionType33.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = objectType21.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType33.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType67.getExtendedInterfaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(typePair66);
        org.junit.Assert.assertNull(functionType67);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0489");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.unboxesTo();
        boolean boolean95 = enumType91.hasCachedValues();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0490");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        java.lang.Object obj21 = null;
        boolean boolean22 = serializableList17.equals(obj21);
        java.lang.Object[] objArray23 = serializableList17.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList32 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList41 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue40);
        boolean boolean42 = serializableList32.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        boolean boolean44 = serializableList41.equals((java.lang.Object) 16);
        java.lang.Object obj45 = null;
        boolean boolean46 = serializableList41.equals(obj45);
        boolean boolean47 = serializableList17.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable49 = serializableList41.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(serializableList32);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0491");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry15.createFunctionType(jSType16, node24);
        int int26 = functionType25.getMinArguments();
        int int27 = functionType25.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType25.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        node35.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node35.cloneTree();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry30.createFunctionType(jSType31, node39);
        int int41 = functionType40.getMinArguments();
        boolean boolean42 = functionType25.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean43 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType40);
        java.util.Set<java.lang.String> strSet44 = functionType11.getOwnPropertyNames();
        boolean boolean45 = functionType11.hasImplementedInterfaces();
        com.google.javascript.rhino.Node node46 = functionType11.getRootNode();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType11.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType11.getOwnPropertyJSDocInfo("unknown");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNull(jSDocInfo49);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0492");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType11.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType11.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        node30.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node33 = node30.cloneTree();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(10, node33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry25.createFunctionType(jSType26, node34);
        int int36 = functionType35.getMinArguments();
        int int37 = functionType35.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isNoCompile();
        boolean boolean41 = jSDocInfo39.hasTypedefType();
        int int42 = jSDocInfo39.getImplementedInterfaceCount();
        functionType35.setPropertyJSDocInfo("", jSDocInfo39);
        boolean boolean44 = functionType11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType35);
        java.lang.Iterable iterable45 = functionType35.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType35.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = functionType35.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType35.collapseUnion();
        boolean boolean50 = functionType35.isPropertyTypeDeclared("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType35.getSlot("OR  [length: OR ]\n");
        boolean boolean53 = functionType35.matchesObjectContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterable45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0493");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        boolean boolean67 = parameterizedType63.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType68 = parameterizedType63.toMaybeUnionType();
        boolean boolean69 = parameterizedType63.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.collapseUnion();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(unionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType70);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0494");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType38.dereference();
        java.util.Set<java.lang.String> strSet43 = functionType38.getPropertyNames();
        boolean boolean44 = functionType38.canBeCalled();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0495");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        int int65 = parameterizedType63.getPropertiesCount();
        boolean boolean66 = parameterizedType63.isUnionType();
        boolean boolean67 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean68 = parameterizedType63.isNoObjectType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0496");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.collapseUnion();
        boolean boolean43 = jSType42.isNominalConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0497");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0498");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        boolean boolean78 = functionType69.isInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType69.getTopMostDefiningType("Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0499");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        node3.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        int int7 = node3.getLineno();
        boolean boolean8 = node3.isReturn();
        node3.setQuotedString();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node17.isTrue();
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node23.copyInformationFromForTree(node27);
        boolean boolean29 = node27.isObjectLit();
        boolean boolean30 = node27.isFromExterns();
        boolean boolean31 = node27.isExprResult();
        boolean boolean32 = node27.isInstanceOf();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0, node27, 0, (-1));
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) '4', node39, 49, 45);
        com.google.javascript.rhino.InputId inputId43 = null;
        node39.setInputId(inputId43);
        node39.setSourceFileForTesting("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = new com.google.javascript.rhino.JSTypeExpression(node39, "OR  [source_file: ]\n");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-2147483648), node3, node17, node35, node39, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0500");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isLabelName();
        node7.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(35, node7);
        boolean boolean14 = node13.isGetElem();
        com.google.javascript.rhino.Node node15 = node13.getParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0501");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean5 = node4.isObjectLit();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = node4.copyInformationFromForTree(node8);
        boolean boolean10 = node8.isObjectLit();
        boolean boolean11 = node8.isSwitch();
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node8);
        boolean boolean13 = node8.isDec();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        boolean boolean22 = node16.isComma();
        java.lang.String str23 = node16.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType24 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = node35.copyInformationFromForTree(node39);
        boolean boolean41 = node39.isObjectLit();
        boolean boolean42 = node39.isFromExterns();
        boolean boolean43 = node39.wasEmptyNode();
        boolean boolean44 = node39.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship45 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType24, node31, node39);
        boolean boolean46 = node39.hasMoreThanOneChild();
        boolean boolean47 = node39.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(35, node8, node16, node39);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        int int52 = node51.getLineno();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean56 = node55.isObjectLit();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node60 = node55.copyInformationFromForTree(node59);
        boolean boolean61 = node59.isObjectLit();
        boolean boolean62 = node59.isLabelName();
        com.google.javascript.rhino.Node node63 = node51.srcrefTree(node59);
        boolean boolean64 = node51.isFromExterns();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        int int68 = node67.getLineno();
        boolean boolean69 = node67.isCall();
        java.lang.String str73 = node67.toString(false, true, false);
        boolean boolean74 = node67.isGetElem();
        com.google.javascript.rhino.Node node75 = node67.removeFirstChild();
        boolean boolean76 = node67.isIf();
        com.google.javascript.rhino.Node node77 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) '4', node16, node51, node67, node77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OR \n" + "'", str23, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType24 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType24.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "OR " + "'", str73, "OR ");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0502");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList12 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList21 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue20);
        boolean boolean22 = serializableList12.containsAll((java.util.Collection<java.io.Serializable>) serializableList21);
        int int24 = serializableList12.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node40.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean46 = node45.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = node45.copyInformationFromForTree(node49);
        boolean boolean51 = node50.isTrue();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(41, node28, node40, node50);
        int int53 = serializableList12.lastIndexOf((java.lang.Object) node50);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = null;
        node50.setStaticSourceFile(staticSourceFile54);
        com.google.javascript.rhino.Node node56 = node2.useSourceInfoIfMissingFromForTree(node50);
        int int57 = node50.getChildCount();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(serializableList12);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(serializableList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0503");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass5 = jSDocInfo0.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isNoCompile();
        boolean boolean8 = jSDocInfo6.hasTypedefType();
        java.lang.String str10 = jSDocInfo6.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass11 = jSDocInfo6.getClass();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = node14.copyInformationFromForTree(node18);
        boolean boolean20 = node14.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        boolean boolean22 = node14.isCatch();
        java.lang.Class<?> wildcardClass23 = node14.getClass();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList24 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass11, (java.lang.reflect.Type) wildcardClass23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node27.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection34 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node27);
        boolean boolean35 = node27.isCatch();
        java.lang.Class<?> wildcardClass36 = node27.getClass();
        java.lang.Class<?> wildcardClass37 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.isNoCompile();
        boolean boolean40 = jSDocInfo38.hasTypedefType();
        java.lang.String str42 = jSDocInfo38.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass43 = jSDocInfo38.getClass();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = node46.copyInformationFromForTree(node50);
        boolean boolean52 = node46.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection53 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node46);
        boolean boolean54 = node46.isCatch();
        java.lang.Class<?> wildcardClass55 = node46.getClass();
        com.google.common.collect.ImmutableList<java.lang.reflect.Type> typeList56 = com.google.common.collect.ImmutableList.of((java.lang.reflect.Type) wildcardClass43, (java.lang.reflect.Type) wildcardClass55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isNoCompile();
        boolean boolean59 = jSDocInfo57.hasTypedefType();
        java.lang.String str61 = jSDocInfo57.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass62 = jSDocInfo57.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.isNoCompile();
        boolean boolean65 = jSDocInfo63.hasTypedefType();
        java.lang.String str67 = jSDocInfo63.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass68 = jSDocInfo63.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.isNoCompile();
        boolean boolean71 = jSDocInfo69.hasTypedefType();
        java.lang.String str73 = jSDocInfo69.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass74 = jSDocInfo69.getClass();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean76 = jSDocInfo75.isNoCompile();
        boolean boolean77 = jSDocInfo75.hasTypedefType();
        java.lang.String str79 = jSDocInfo75.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Class<?> wildcardClass80 = jSDocInfo75.getClass();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        node87.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node90 = node87.cloneTree();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(10, node90);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry82.createFunctionType(jSType83, node91);
        int int93 = functionType92.getMinArguments();
        boolean boolean94 = functionType92.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = functionType92.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList96 = functionType92.getTemplateTypeNames();
        java.lang.Class<?> wildcardClass97 = functionType92.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Class<?>> wildcardClassList98 = com.google.common.collect.ImmutableList.of(wildcardClass5, wildcardClass23, wildcardClass36, wildcardClass37, wildcardClass43, wildcardClass62, wildcardClass68, wildcardClass74, wildcardClass80, wildcardClass97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 3");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeList24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeCollection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeCollection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0504");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        java.lang.Iterable iterable29 = functionType11.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType11.getPropertyType("JSDocInfo");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = jSType31.setValidator(jSTypePredicate32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterable29);
        org.junit.Assert.assertNotNull(jSType31);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0505");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = parameterizedType63.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType63.getPropertyType("");
        boolean boolean69 = parameterizedType63.isNoResolvedType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0506");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        node3.setVarArgs(false);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
        boolean boolean10 = node3.isGetElem();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0507");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean3 = node2.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        int int22 = node21.getLineno();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = node25.copyInformationFromForTree(node29);
        boolean boolean31 = node29.isObjectLit();
        boolean boolean32 = node29.isLabelName();
        com.google.javascript.rhino.Node node33 = node21.srcrefTree(node29);
        com.google.javascript.rhino.jstype.JSType jSType34 = node33.getJSType();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(44, node33, node37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        int int52 = functionType51.getMinArguments();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType51.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType51.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType51.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry6.createObjectType("", node39, (com.google.javascript.rhino.jstype.ObjectType) functionType51);
        node4.addChildrenToBack(node39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo60 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(staticSlot57);
        org.junit.Assert.assertNotNull(objectType58);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0508");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        boolean boolean78 = functionType69.isUnionType();
        boolean boolean79 = functionType69.isInterface();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0509");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        boolean boolean35 = node33.isAdd();
        boolean boolean36 = node33.isGetElem();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0510");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean5 = node4.isObjectLit();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = node4.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node16.isObjectLit();
        boolean boolean19 = node16.isFromExterns();
        boolean boolean20 = node16.wasEmptyNode();
        boolean boolean21 = node16.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship22 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node8, node16);
        com.google.javascript.rhino.Node node23 = node16.cloneNode();
        java.lang.Object obj25 = null;
        node23.putProp(100, obj25);
        node23.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = node23.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0511");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean29 = functionType11.isNoType();
        boolean boolean30 = functionType11.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType11.getReturnType();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType11.getBindReturnType(46);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertNotNull(functionType33);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0512");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        boolean boolean17 = functionType11.isEmptyType();
        boolean boolean18 = functionType11.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry20.createFunctionType(jSType21, node29);
        int int31 = functionType30.getMinArguments();
        int int32 = functionType30.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.isNoCompile();
        boolean boolean36 = jSDocInfo34.hasTypedefType();
        int int37 = jSDocInfo34.getImplementedInterfaceCount();
        functionType30.setPropertyJSDocInfo("", jSDocInfo34);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = functionType30.getPossibleToBooleanOutcomes();
        boolean boolean40 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean41 = functionType11.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType11.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0513");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        int int12 = serializableList8.size();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableList8.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str15 = jSDocInfo14.getOriginalCommentString();
        boolean boolean16 = jSDocInfo14.hasBaseType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = serializableList8.add((java.io.Serializable) jSDocInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0514");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.autobox();
        boolean boolean95 = enumType91.matchesObjectContext();
        boolean boolean97 = enumType91.removeProperty("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = enumType91.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumType91.unboxesTo();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSDocInfo98);
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0515");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        boolean boolean20 = functionType11.isUnknownType();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        int int24 = node23.getLineno();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isObjectLit();
        boolean boolean34 = node31.isLabelName();
        com.google.javascript.rhino.Node node35 = node23.srcrefTree(node31);
        boolean boolean36 = node35.isRegExp();
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        boolean boolean46 = node44.isAdd();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        int int50 = node49.getLineno();
        boolean boolean51 = node49.isLabelName();
        boolean boolean52 = node49.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList53 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node35, (java.lang.Cloneable) node44, (java.lang.Cloneable) node49);
        boolean boolean54 = node44.isAssignAdd();
        boolean boolean55 = node44.isCall();
        functionType11.setSource(node44);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType11.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cloneableList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0516");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        jSTypeRegistry1.identifyNonNullableName("Named type with empty name component");
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList30 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue29);
        boolean boolean32 = serializableList30.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = serializableList30.asList();
        java.util.Iterator<java.io.Serializable> serializableItor34 = serializableList33.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        boolean boolean48 = functionType46.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType46.getImplementedInterfaces();
        java.lang.Iterable iterable50 = functionType46.getCtorImplementedInterfaces();
        boolean boolean51 = functionType46.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.isNoCompile();
        boolean boolean54 = jSDocInfo52.hasTypedefType();
        functionType46.setJSDocInfo(jSDocInfo52);
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = functionType46.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType46.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList59 = functionType46.getTemplateTypeNames();
        boolean boolean60 = serializableList33.contains((java.lang.Object) functionType46);
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType46.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.getType("OR ");
        boolean boolean66 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(serializableList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertNotNull(serializableItor34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNotNull(iterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(property57);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0517");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "STRING Not declared as a type name 32\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0518");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isDo();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = new com.google.javascript.rhino.Node.SideEffectFlags(51);
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags(sideEffectFlags5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0519");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        int int14 = node13.getLineno();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isObjectLit();
        boolean boolean24 = node21.isLabelName();
        com.google.javascript.rhino.Node node25 = node13.srcrefTree(node21);
        node6.addChildrenToFront(node13);
        boolean boolean27 = node6.isRegExp();
        java.util.Set<java.lang.String> strSet28 = node6.getDirectives();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str35 = node31.checkTreeEquals(node34);
        boolean boolean36 = node34.isCall();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        int int41 = node40.getLineno();
        boolean boolean42 = node40.isLabelName();
        boolean boolean43 = node40.isNumber();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node40 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, nodeArray44, 12, 41);
        java.lang.Object obj49 = node47.getProp(8);
        com.google.javascript.jscomp.CodingConvention.Bind bind50 = new com.google.javascript.jscomp.CodingConvention.Bind(node6, node34, node47);
        boolean boolean51 = node34.isSyntheticBlock();
        boolean boolean52 = node34.isAdd();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0520");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        jSTypeRegistry67.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = jSTypeRegistry67.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        jSTypeRegistry67.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType83);
        java.lang.String str85 = null; // flaky: functionType83.toString();
        boolean boolean86 = functionType83.isFunctionPrototypeType();
        boolean boolean87 = parameterizedType63.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        int int88 = parameterizedType63.getPropertiesCount();
        boolean boolean90 = parameterizedType63.isPropertyTypeDeclared("java.io.IOException: Named type with empty name component");
        boolean boolean91 = parameterizedType63.isOrdinaryFunction();
        boolean boolean92 = parameterizedType63.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType.Property property94 = parameterizedType63.getSlot("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType95 = parameterizedType63.getTypeOfThis();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType96 = parameterizedType63.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(property94);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNotNull(parameterizedType96);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0521");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType11.autobox();
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        boolean boolean20 = functionType11.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType11.restrictByNotNullOrUndefined();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType11.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = functionType11.isSubtype(jSType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0522");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        java.util.ListIterator<java.io.Serializable> serializableItor11 = serializableList8.listIterator();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean17 = node16.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node21.isTry();
        node21.setOptionalArg(false);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node32.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection39 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node32);
        com.google.javascript.rhino.Node node40 = node21.clonePropsFrom(node32);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(36, node18, node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean45 = node44.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newExpr(node44);
        com.google.javascript.rhino.Node node47 = node41.clonePropsFrom(node46);
        boolean boolean48 = node47.isRegExp();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable49 = serializableList8.set(4095, (java.io.Serializable) node47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableItor11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeCollection39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0523");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        java.lang.String str5 = jSDocInfo0.getLicense();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean11 = node10.isObjectLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = node10.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node23 = node18.copyInformationFromForTree(node22);
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node32.isTrue();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(41, node10, node22, node32);
        boolean boolean35 = strSet6.contains((java.lang.Object) 41);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0524");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isFromExterns();
        boolean boolean19 = node15.wasEmptyNode();
        boolean boolean20 = node15.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node7, node15);
        com.google.javascript.rhino.Node node22 = node15.cloneNode();
        java.lang.Object obj24 = null;
        node22.putProp(100, obj24);
        java.lang.String str26 = node22.getString();
        int int27 = node22.getLength();
        node22.putIntProp(8, 51);
        com.google.javascript.rhino.InputId inputId31 = node22.getInputId();
        boolean boolean32 = node22.isAdd();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0525");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0526");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0527");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node14.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node41.isTrue();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(41, node19, node31, node41);
        com.google.javascript.rhino.Node node44 = node14.srcref(node41);
        boolean boolean45 = node14.isString();
        boolean boolean46 = node14.isScript();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0528");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean29 = functionType11.isNoType();
        boolean boolean30 = functionType11.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType11.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean34 = functionType11.hasProperty("java.io.IOException: Function");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType11.getOwnImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0529");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Not declared as a type name", "Function", "Not declared as a constructor", "Unknown class name", "Not declared as a constructor", "Not declared as a constructor" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = jSTypeRegistry12.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        boolean boolean29 = functionType27.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry12.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        com.google.javascript.rhino.jstype.JSType jSType31 = objectType30.unboxesTo();
        boolean boolean32 = strSet9.equals((java.lang.Object) objectType30);
        boolean boolean34 = objectType30.hasProperty("hi!");
        java.util.Set<java.lang.String> strSet35 = objectType30.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strSet35.add("OR \n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0530");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        boolean boolean78 = functionType69.isUnionType();
        boolean boolean79 = functionType69.isReturnTypeInferred();
        boolean boolean80 = functionType69.canBeCalled();
        boolean boolean81 = functionType69.canBeCalled();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0531");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.new FileLevelJsDocBuilder();
        node19.setSourceEncodedPosition(45);
        java.lang.String str26 = node19.toString(false, true, false);
        int int27 = node19.getLineno();
        boolean boolean28 = node19.isOr();
        jSDocInfo0.setAssociatedNode(node19);
        boolean boolean30 = jSDocInfo0.isOverride();
        java.lang.String str31 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OR " + "'", str26, "OR ");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0532");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        int int9 = node8.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node16.isObjectLit();
        boolean boolean19 = node16.isLabelName();
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node16);
        com.google.javascript.rhino.jstype.JSType jSType21 = node20.getJSType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        boolean boolean35 = functionType33.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType33.getImplementedInterfaces();
        java.lang.Iterable iterable37 = functionType33.getCtorImplementedInterfaces();
        boolean boolean38 = functionType33.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isNoCompile();
        boolean boolean41 = jSDocInfo39.hasTypedefType();
        functionType33.setJSDocInfo(jSDocInfo39);
        com.google.javascript.rhino.jstype.ObjectType.Property property44 = functionType33.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType33.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        node52.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node52.cloneTree();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(10, node55);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry47.createFunctionType(jSType48, node56);
        int int58 = functionType57.getMinArguments();
        int int59 = functionType57.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isNoCompile();
        boolean boolean63 = jSDocInfo61.hasTypedefType();
        int int64 = jSDocInfo61.getImplementedInterfaceCount();
        functionType57.setPropertyJSDocInfo("", jSDocInfo61);
        boolean boolean66 = functionType33.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry1.createObjectType("JSDocInfo", node20, (com.google.javascript.rhino.jstype.ObjectType) functionType57);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative68 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(iterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(property44);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectType67);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0533");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        int int18 = functionType17.getMinArguments();
        int int19 = functionType17.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        int int33 = functionType32.getMinArguments();
        boolean boolean34 = functionType17.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean35 = functionType17.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType17);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        boolean boolean47 = node44.isLabelName();
        node44.setSourceFileForTesting("hi!");
        node44.setType(1);
        node44.setSourceEncodedPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry1.createInterfaceType("Function.<Function>", node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0534");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable6 = jSTypeRegistry1.getTypesWithProperty("");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry1.createInterfaceType("Not declared as a constructor", node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeIterable6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0535");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation((int) ' ', 54, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0536");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = functionType11.getPossibleToBooleanOutcomes();
        int int21 = functionType11.getPropertiesCount();
        java.lang.String str22 = functionType11.getNormalizedReferenceName();
        boolean boolean23 = functionType11.isInstanceType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0537");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        boolean boolean28 = serializableList8.isEmpty();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        int int32 = node31.getLineno();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = node35.copyInformationFromForTree(node39);
        boolean boolean41 = node39.isObjectLit();
        boolean boolean42 = node39.isLabelName();
        com.google.javascript.rhino.Node node43 = node31.srcrefTree(node39);
        boolean boolean44 = node43.isRegExp();
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node43);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = new com.google.javascript.rhino.JSTypeExpression(node43, "OR  [source_file: ]\n");
        boolean boolean48 = node43.isNot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = serializableList8.remove((java.lang.Object) boolean48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0538");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        boolean boolean20 = node19.isRegExp();
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        boolean boolean30 = node28.isAdd();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        int int34 = node33.getLineno();
        boolean boolean35 = node33.isLabelName();
        boolean boolean36 = node33.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList37 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node19, (java.lang.Cloneable) node28, (java.lang.Cloneable) node33);
        jSDocInfo0.setAssociatedNode(node33);
        boolean boolean39 = jSDocInfo0.isOverride();
        int int40 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cloneableList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0539");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0540");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        java.lang.Object obj22 = null;
        int int23 = serializableList8.lastIndexOf(obj22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList32 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue31);
        java.lang.String str33 = serializableList32.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList51 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue50);
        boolean boolean52 = serializableList42.containsAll((java.util.Collection<java.io.Serializable>) serializableList51);
        boolean boolean53 = serializableList32.containsAll((java.util.Collection<java.io.Serializable>) serializableList51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList62 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue61);
        java.lang.String str63 = serializableList62.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList72 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue71);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList81 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue80);
        boolean boolean82 = serializableList72.containsAll((java.util.Collection<java.io.Serializable>) serializableList81);
        boolean boolean83 = serializableList62.containsAll((java.util.Collection<java.io.Serializable>) serializableList81);
        boolean boolean84 = serializableList51.equals((java.lang.Object) boolean83);
        boolean boolean85 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList51);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean89 = node88.isObjectLit();
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node93 = node88.copyInformationFromForTree(node92);
        boolean boolean94 = node88.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection95 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node88);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable96 = node88.getAncestors();
        boolean boolean97 = node88.isCase();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = serializableList51.add((java.io.Serializable) node88);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(serializableItor21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(serializableList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str33, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(serializableList62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str63, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(serializableList72);
        org.junit.Assert.assertNotNull(ternaryValue80);
        org.junit.Assert.assertNotNull(serializableList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(nodeCollection95);
        org.junit.Assert.assertNotNull(ancestorIterable96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0541");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = functionType11.getPossibleToBooleanOutcomes();
        int int21 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType11.getSlot("true");
        com.google.javascript.rhino.Node node24 = functionType11.getRootNode();
        boolean boolean25 = functionType11.isFunctionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0542");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        int int4 = node3.getLineno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node7.copyInformationFromForTree(node11);
        boolean boolean13 = node11.isObjectLit();
        boolean boolean14 = node11.isLabelName();
        com.google.javascript.rhino.Node node15 = node3.srcrefTree(node11);
        com.google.javascript.rhino.jstype.JSType jSType16 = node15.getJSType();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(44, node15, node19);
        boolean boolean22 = node19.isNumber();
        java.lang.String str26 = node19.toString(true, true, false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OR " + "'", str26, "OR ");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0543");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            node2.appendStringTree(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0544");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList10 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList19 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue18);
        boolean boolean20 = serializableList10.containsAll((java.util.Collection<java.io.Serializable>) serializableList19);
        boolean boolean22 = serializableList19.equals((java.lang.Object) 16);
        java.lang.Object obj23 = null;
        boolean boolean24 = serializableList19.equals(obj23);
        java.lang.Object[] objArray25 = serializableList19.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator26 = serializableList19.spliterator();
        boolean boolean27 = strSet1.containsAll((java.util.Collection<java.io.Serializable>) serializableList19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = strSet1.add("OR  [source_file: ]\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(serializableList10);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0545");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0546");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList16 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue15);
        boolean boolean17 = serializableList16.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder18 = serializableCollectionBuilder6.add((java.util.Collection<java.io.Serializable>) serializableList16);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator19 = serializableList16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.io.Serializable> serializableList22 = serializableList16.subList(4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (32) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder18);
        org.junit.Assert.assertNotNull(serializableSpliterator19);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0547");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0548");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        boolean boolean2 = node1.isContinue();
        boolean boolean3 = node1.isCall();
        boolean boolean4 = node1.isQualifiedName();
        boolean boolean5 = node1.isLocalResultCall();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0549");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        boolean boolean7 = node6.isVar();
        com.google.javascript.rhino.Node node9 = node6.getAncestor((int) (byte) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isSwitch();
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node17);
        boolean boolean22 = node17.isDec();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = node25.copyInformationFromForTree(node29);
        boolean boolean31 = node25.isComma();
        java.lang.String str32 = node25.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node49 = node44.copyInformationFromForTree(node48);
        boolean boolean50 = node48.isObjectLit();
        boolean boolean51 = node48.isFromExterns();
        boolean boolean52 = node48.wasEmptyNode();
        boolean boolean53 = node48.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship54 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType33, node40, node48);
        boolean boolean55 = node48.hasMoreThanOneChild();
        boolean boolean56 = node48.isThis();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(35, node17, node25, node48);
        java.lang.String str58 = node25.getSourceFileName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node59 = node9.getChildBefore(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "OR \n" + "'", str32, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType33 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType33.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0550");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0551");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("?");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0552");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.collapseUnion();
        com.google.javascript.rhino.Node node44 = functionType38.getPropertyNode("JSDocInfo");
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType38.getTypeOfThis();
        boolean boolean46 = objectType45.isEnumElementType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0553");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList10 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList19 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue18);
        boolean boolean20 = serializableList10.containsAll((java.util.Collection<java.io.Serializable>) serializableList19);
        boolean boolean22 = serializableList19.equals((java.lang.Object) 16);
        java.lang.Object obj23 = null;
        boolean boolean24 = serializableList19.equals(obj23);
        java.lang.Object[] objArray25 = serializableList19.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator26 = serializableList19.spliterator();
        boolean boolean27 = strSet1.containsAll((java.util.Collection<java.io.Serializable>) serializableList19);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        jSTypeRegistry29.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = jSTypeRegistry29.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        int int45 = functionType44.getMinArguments();
        boolean boolean46 = functionType44.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry29.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType44);
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType44.restrictByNotNullOrUndefined();
        boolean boolean50 = functionType44.hasOwnProperty("Function");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType44.getSlot("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = jSTypeRegistry54.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        node65.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node65.cloneTree();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(10, node68);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry60.createFunctionType(jSType61, node69);
        jSTypeRegistry54.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair72 = functionType44.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean73 = strSet1.remove((java.lang.Object) functionType70);
        strSet1.clear();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(serializableList10);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(typePair72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0554");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        jSTypeRegistry39.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        node52.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node52.cloneTree();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(10, node55);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry47.createFunctionType(jSType48, node56);
        int int58 = functionType57.getMinArguments();
        boolean boolean59 = functionType57.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType57.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType57.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry39.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType57, "Function", "Not declared as a constructor", 31, 51);
        com.google.javascript.rhino.jstype.TemplateType templateType68 = functionType57.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = templateType68.isString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNull(templateType68);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0555");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isInc();
        node2.setString("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = node2.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0556");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        java.lang.String str20 = jSDocInfo15.getDescription();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0557");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        node7.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node10 = node7.cloneTree();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(10, node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry2.createFunctionType(jSType3, node11);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry2.getTypesWithProperty("hi!");
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        jSTypeRegistry17.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = jSTypeRegistry17.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry17.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        node29.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = node29.cloneTree();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(10, node32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry24.createFunctionType(jSType25, node33);
        int int35 = functionType34.getMinArguments();
        int int36 = functionType34.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = functionType34.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = objectType37.getCtorExtendedInterfaces();
        boolean boolean40 = objectType37.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        node47.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = node47.cloneTree();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(10, node50);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry42.createFunctionType(jSType43, node51);
        int int53 = functionType52.getMinArguments();
        boolean boolean54 = functionType52.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType52.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] { jSType55 };
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry17.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType37, jSTypeArray56);
        com.google.javascript.rhino.Node node58 = jSTypeRegistry2.createParameters(jSTypeArray56);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(37, node58);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 12);
        java.lang.Object obj65 = node63.getProp(51);
        node63.setWasEmptyNode(false);
        // The following exception was thrown during execution in test generation
        try {
            node59.addChildAfter(node61, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0558");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("hi!", throwable3);
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("hi!", throwable6);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException("");
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList17 = com.google.common.collect.ImmutableList.of(iOException1, iOException4, iOException7, iOException10, iOException13, iOException16);
        java.lang.Throwable[] throwableArray18 = iOException13.getSuppressed();
        org.junit.Assert.assertNotNull(iOExceptionList17);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0559");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.restrictByNotNullOrUndefined();
        boolean boolean22 = functionType16.hasOwnProperty("Function");
        com.google.javascript.rhino.jstype.ObjectType.Property property24 = functionType16.getSlot("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = jSTypeRegistry26.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        node37.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = node37.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry32.createFunctionType(jSType33, node41);
        jSTypeRegistry26.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair44 = functionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.ObjectType.Property property46 = functionType42.getSlot("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType42.getReturnType();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType42.unboxesTo();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(property24);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(typePair44);
        org.junit.Assert.assertNull(property46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNull(jSType48);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0560");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        boolean boolean67 = functionType66.isNumberObjectType();
        boolean boolean68 = functionType66.isObject();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0561");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumElementType97.autoboxesTo();
        boolean boolean99 = enumElementType97.isNominalType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0562");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        java.lang.Object obj3 = node1.getProp(51);
        node1.setWasEmptyNode(false);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node1.appendStringTree(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0563");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.autobox();
        java.lang.String str95 = enumType91.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType96 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = enumType91.isSubtype(jSType96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}" + "'", str95, "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0564");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        int int18 = functionType16.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = functionType16.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = functionType16.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType16.autobox();
        boolean boolean22 = functionType16.isOrdinaryFunction();
        boolean boolean24 = functionType16.isPropertyInExterns("Named type with empty name component");
        boolean boolean26 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType16, "");
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0565");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        java.lang.String str2 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0566");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        boolean boolean78 = functionType69.isUnionType();
        boolean boolean79 = functionType69.isReturnTypeInferred();
        boolean boolean80 = functionType69.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0567");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0568");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        boolean boolean9 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0569");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node33, "INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable50 = jSTypeRegistry38.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        int int64 = functionType62.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isNoCompile();
        boolean boolean68 = jSDocInfo66.hasTypedefType();
        int int69 = jSDocInfo66.getImplementedInterfaceCount();
        functionType62.setPropertyJSDocInfo("", jSDocInfo66);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = functionType62.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        int int84 = functionType83.getMinArguments();
        boolean boolean85 = functionType83.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType83.getImplementedInterfaces();
        java.lang.Iterable iterable87 = functionType83.getCtorImplementedInterfaces();
        boolean boolean88 = functionType83.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean90 = jSDocInfo89.isNoCompile();
        boolean boolean91 = jSDocInfo89.hasTypedefType();
        functionType83.setJSDocInfo(jSDocInfo89);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry38.createFunctionTypeWithNewReturnType(functionType62, (com.google.javascript.rhino.jstype.JSType) functionType83);
        boolean boolean94 = jSTypeExpression36.equals((java.lang.Object) functionType93);
        com.google.javascript.rhino.Node node95 = jSTypeExpression36.getRoot();
        boolean boolean96 = jSTypeExpression36.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(jSTypeIterable50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertNotNull(iterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0570");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0571");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = jSTypeRegistry45.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        int int61 = functionType60.getMinArguments();
        boolean boolean62 = functionType60.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry45.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType60.restrictByNotNullOrUndefined();
        boolean boolean66 = functionType60.removeProperty("Unknown class name");
        boolean boolean68 = jSTypeRegistry39.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType60, "");
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        jSTypeRegistry70.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable73 = jSTypeRegistry70.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        node81.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node84 = node81.cloneTree();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node84);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry76.createFunctionType(jSType77, node85);
        jSTypeRegistry70.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType86);
        java.lang.String str88 = null; // flaky: functionType86.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo90 = null;
        functionType86.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo90);
        boolean boolean92 = functionType86.hasCachedValues();
        boolean boolean93 = functionType86.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeRegistry39.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType86, "Function", "unknown", 16, 45);
        jSTypeRegistry39.resetForTypeCheck();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable73);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType86);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Function" + "'", str88, "Function");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jSType98);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0572");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Named type with empty name component");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0573");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry15.createFunctionType(jSType16, node24);
        int int26 = functionType25.getMinArguments();
        int int27 = functionType25.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType25.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        node35.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node35.cloneTree();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry30.createFunctionType(jSType31, node39);
        int int41 = functionType40.getMinArguments();
        boolean boolean42 = functionType25.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean43 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType40);
        java.util.Set<java.lang.String> strSet44 = functionType11.getOwnPropertyNames();
        boolean boolean45 = functionType11.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType11.collapseUnion();
        boolean boolean47 = jSType46.matchesUint32Context();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0574");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(1, "");
        boolean boolean3 = node2.isDo();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputId4);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0575");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList13 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList22 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue21);
        boolean boolean23 = serializableList13.containsAll((java.util.Collection<java.io.Serializable>) serializableList22);
        int int25 = serializableList13.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor26 = serializableList13.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList13.iterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableList13.stream();
        boolean boolean29 = serializableList13.isEmpty();
        boolean boolean30 = strSet4.removeAll((java.util.Collection<java.io.Serializable>) serializableList13);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isSwitch();
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node38);
        boolean boolean43 = node38.isDec();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = node46.copyInformationFromForTree(node50);
        boolean boolean52 = node46.isComma();
        java.lang.String str53 = node46.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType54 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.isObjectLit();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node62 = node57.copyInformationFromForTree(node61);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean66 = node65.isObjectLit();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node70 = node65.copyInformationFromForTree(node69);
        boolean boolean71 = node69.isObjectLit();
        boolean boolean72 = node69.isFromExterns();
        boolean boolean73 = node69.wasEmptyNode();
        boolean boolean74 = node69.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship75 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType54, node61, node69);
        boolean boolean76 = node69.hasMoreThanOneChild();
        boolean boolean77 = node69.isThis();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(35, node38, node46, node69);
        com.google.javascript.rhino.Node node79 = node78.getLastChild();
        boolean boolean80 = node79.isSyntheticBlock();
        boolean boolean81 = strSet4.equals((java.lang.Object) boolean80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(serializableList13);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(serializableItor26);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(serializableStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "OR \n" + "'", str53, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType54 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType54.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0576");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        java.util.Set<java.lang.String> strSet94 = enumType91.getElements();
        com.google.javascript.rhino.jstype.JSType jSType95 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = enumType91.testForEquality(jSType95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(strSet94);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0577");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean10 = node2.isCatch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        node13.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        int int17 = node13.getLineno();
        boolean boolean18 = node13.isReturn();
        node13.setType(31);
        boolean boolean21 = node13.isVoid();
        node2.addChildrenToBack(node13);
        java.lang.String str23 = node13.getSourceFileName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0578");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node7);
        boolean boolean12 = node7.isDec();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node15.isComma();
        java.lang.String str22 = node15.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isFromExterns();
        boolean boolean42 = node38.wasEmptyNode();
        boolean boolean43 = node38.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node30, node38);
        boolean boolean45 = node38.hasMoreThanOneChild();
        boolean boolean46 = node38.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(35, node7, node15, node38);
        boolean boolean48 = node7.isVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OR \n" + "'", str22, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType23 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType23.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0579");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType97 = enumType91.getPropertyType("true");
        com.google.javascript.rhino.jstype.FunctionType functionType98 = enumType91.getConstructor();
        boolean boolean99 = enumType91.matchesStringContext();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertNull(functionType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0580");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isArrayLit();
        boolean boolean4 = node2.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0581");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.EnumType enumType20 = objectType19.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = enumType20.isResolved();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNull(enumType20);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0582");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = null;
        functionType17.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo21);
        boolean boolean23 = functionType17.hasCachedValues();
        boolean boolean24 = functionType17.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType17.getBindReturnType(1);
        boolean boolean27 = functionType17.hasDisplayName();
        functionType17.clearCachedValues();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType17.getConstructor();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionType29);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0583");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        java.lang.Iterable iterable67 = parameterizedType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType63.collapseUnion();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterable67);
        org.junit.Assert.assertNotNull(jSType68);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0584");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        boolean boolean2 = node1.isInc();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder3 = node1.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean8 = node7.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node12.isTry();
        node12.setOptionalArg(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node23.copyInformationFromForTree(node27);
        boolean boolean29 = node23.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection30 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node23);
        com.google.javascript.rhino.Node node31 = node12.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(36, node9, node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean36 = node35.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newExpr(node35);
        com.google.javascript.rhino.Node node38 = node32.clonePropsFrom(node37);
        node1.addChildrenToFront(node38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = node1.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 1.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeCollection30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0585");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        boolean boolean14 = functionType11.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        int int28 = functionType26.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType26.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        int int42 = functionType41.getMinArguments();
        boolean boolean43 = functionType26.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType41);
        boolean boolean44 = functionType26.isNoType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        node51.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node54 = node51.cloneTree();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(10, node54);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry46.createFunctionType(jSType47, node55);
        int int57 = functionType56.getMinArguments();
        int int58 = functionType56.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType56.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        node66.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node69 = node66.cloneTree();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(10, node69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry61.createFunctionType(jSType62, node70);
        int int72 = functionType71.getMinArguments();
        boolean boolean73 = functionType56.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope74 = functionType71.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType26.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean76 = functionType11.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType77 = functionType11.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0586");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType98 = enumElementType96.toMaybeEnumElementType();
        boolean boolean99 = enumElementType96.hasReferenceName();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNotNull(enumElementType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0587");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType98 = enumElementType96.toMaybeEnumElementType();
        boolean boolean99 = enumElementType96.matchesNumberContext();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNotNull(enumElementType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0588");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0589");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        java.lang.Iterable iterable78 = functionType69.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType69.getCtorImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType69.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(iterable78);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0590");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        java.lang.Object obj21 = null;
        boolean boolean22 = serializableList17.equals(obj21);
        java.lang.Object[] objArray23 = serializableList17.toArray();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec25 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry28.getTypesWithProperty("hi!");
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType42 = assertionFunctionSpec25.getAssertedType(node26, jSTypeRegistry28);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = jSTypeRegistry44.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        jSTypeRegistry44.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        node68.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node71 = node68.cloneTree();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(10, node71);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry63.createFunctionType(jSType64, node72);
        int int74 = functionType73.getMinArguments();
        boolean boolean75 = functionType73.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType73.getImplementedInterfaces();
        java.lang.Iterable iterable77 = functionType73.getCtorImplementedInterfaces();
        boolean boolean78 = functionType73.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.isNoCompile();
        boolean boolean81 = jSDocInfo79.hasTypedefType();
        functionType73.setJSDocInfo(jSDocInfo79);
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = functionType73.getSlot("hi!");
        boolean boolean85 = functionType73.isInstanceType();
        boolean boolean86 = functionType73.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry28.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType60, (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = parameterizedType87.getTypeOfThis();
        boolean boolean89 = parameterizedType87.isCheckedUnknownType();
        boolean boolean90 = parameterizedType87.isNoObjectType();
        boolean boolean91 = parameterizedType87.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType92 = parameterizedType87.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType93 = parameterizedType87.getOwnerFunction();
        boolean boolean94 = serializableList17.contains((java.lang.Object) parameterizedType87);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor96 = serializableList17.listIterator(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (40) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(iterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(property84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(parameterizedType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(unionType92);
        org.junit.Assert.assertNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0591");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList16 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue15);
        boolean boolean17 = serializableList16.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder18 = serializableCollectionBuilder6.add((java.util.Collection<java.io.Serializable>) serializableList16);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean24 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        int int37 = functionType36.getMinArguments();
        int int38 = functionType36.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = functionType36.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        int int52 = functionType51.getMinArguments();
        boolean boolean53 = functionType36.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType51);
        boolean boolean54 = functionType36.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry20.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType36.toObjectType();
        boolean boolean57 = functionType36.isCheckedUnknownType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList58 = com.google.common.collect.ImmutableList.of(functionType36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = serializableList16.remove((java.lang.Object) functionType36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionTypeList58);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0592");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        node7.setSourceEncodedPosition(50);
        boolean boolean13 = node7.isInc();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean18 = node17.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = node22.copyInformationFromForTree(node26);
        boolean boolean28 = node22.isTry();
        node22.setOptionalArg(false);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = node33.copyInformationFromForTree(node37);
        boolean boolean39 = node33.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection40 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node33);
        com.google.javascript.rhino.Node node41 = node22.clonePropsFrom(node33);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(36, node19, node41);
        boolean boolean43 = node41.isEmpty();
        com.google.javascript.rhino.Node node44 = node41.getFirstChild();
        boolean boolean45 = node41.isHook();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 0, 7, 29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(45, node7, node41, node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeCollection40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0593");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        boolean boolean14 = functionType11.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType26.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType26.getImplementedInterfaces();
        java.lang.Iterable iterable30 = functionType26.getCtorImplementedInterfaces();
        boolean boolean31 = functionType26.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isNoCompile();
        boolean boolean34 = jSDocInfo32.hasTypedefType();
        functionType26.setJSDocInfo(jSDocInfo32);
        com.google.javascript.rhino.jstype.ObjectType.Property property37 = functionType26.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType26.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        node45.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node48 = node45.cloneTree();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, node48);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry40.createFunctionType(jSType41, node49);
        int int51 = functionType50.getMinArguments();
        int int52 = functionType50.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isNoCompile();
        boolean boolean56 = jSDocInfo54.hasTypedefType();
        int int57 = jSDocInfo54.getImplementedInterfaceCount();
        functionType50.setPropertyJSDocInfo("", jSDocInfo54);
        boolean boolean59 = functionType26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType50);
        java.lang.Iterable iterable60 = functionType50.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType50.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType50.getTemplateTypeNames();
        boolean boolean63 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType11, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node64 = functionType50.getRootNode();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean69 = node68.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean74 = node73.isObjectLit();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node78 = node73.copyInformationFromForTree(node77);
        boolean boolean79 = node73.isTry();
        node73.setOptionalArg(false);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean85 = node84.isObjectLit();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node89 = node84.copyInformationFromForTree(node88);
        boolean boolean90 = node84.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection91 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node84);
        com.google.javascript.rhino.Node node92 = node73.clonePropsFrom(node84);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(36, node70, node92);
        boolean boolean94 = node93.isThis();
        functionType50.setSource(node93);
        boolean boolean96 = node93.isRegExp();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(iterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(property37);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(iterable60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(nodeCollection91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0594");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        int int4 = node3.getLineno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node7.copyInformationFromForTree(node11);
        boolean boolean13 = node11.isObjectLit();
        boolean boolean14 = node11.isLabelName();
        com.google.javascript.rhino.Node node15 = node3.srcrefTree(node11);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 100, node15, node16, node17, 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0595");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        java.util.Set<java.lang.String> strSet94 = enumType91.getElements();
        boolean boolean95 = enumType91.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = enumType91.getOwnerFunction();
        java.util.Set<java.lang.String> strSet97 = enumType91.getElements();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(functionType96);
        org.junit.Assert.assertNotNull(strSet97);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0596");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setMutatesArguments();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0597");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType14.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet16 = objectType14.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean18 = strSet16.remove((java.lang.Object) ternaryValue17);
        int int19 = strSet16.size();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0598");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node33, "INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable50 = jSTypeRegistry38.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        int int64 = functionType62.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isNoCompile();
        boolean boolean68 = jSDocInfo66.hasTypedefType();
        int int69 = jSDocInfo66.getImplementedInterfaceCount();
        functionType62.setPropertyJSDocInfo("", jSDocInfo66);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = functionType62.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        int int84 = functionType83.getMinArguments();
        boolean boolean85 = functionType83.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType83.getImplementedInterfaces();
        java.lang.Iterable iterable87 = functionType83.getCtorImplementedInterfaces();
        boolean boolean88 = functionType83.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean90 = jSDocInfo89.isNoCompile();
        boolean boolean91 = jSDocInfo89.hasTypedefType();
        functionType83.setJSDocInfo(jSDocInfo89);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry38.createFunctionTypeWithNewReturnType(functionType62, (com.google.javascript.rhino.jstype.JSType) functionType83);
        boolean boolean94 = jSTypeExpression36.equals((java.lang.Object) functionType93);
        com.google.javascript.rhino.Node node95 = jSTypeExpression36.getRoot();
        boolean boolean96 = node95.isLocalResultCall();
        boolean boolean97 = node95.isQualifiedName();
        boolean boolean98 = node95.isNew();
        boolean boolean99 = node95.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(jSTypeIterable50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertNotNull(iterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0599");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Named type with empty name component", (int) '#', (-1));
        boolean boolean4 = node3.isDo();
        boolean boolean5 = node3.isFunction();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test0600");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) '4', node4, 49, 45);
        boolean boolean8 = node7.isVar();
        java.lang.String str9 = node7.toStringTree();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isSwitch();
        node17.setSourceEncodedPosition(50);
        boolean boolean23 = node17.isInc();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(8, node17, 30, (int) 'a');
        boolean boolean27 = node17.isExprResult();
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node17, node28, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "INSTANCEOF 49\n    OR \n" + "'", str9, "INSTANCEOF 49\n    OR \n");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }
}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0201");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable29 = node28.getAncestors();
        // The following exception was thrown during execution in test generation
        try {
            node28.setSideEffectFlags(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(ancestorIterable29);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0202");
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
        java.lang.String str40 = node38.getQualifiedName();
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
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0203");
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
        boolean boolean23 = node22.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node22, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags27 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        // The following exception was thrown during execution in test generation
        try {
            node22.setSideEffectFlags(sideEffectFlags27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0204");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str2 = inputId1.toString();
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
        com.google.javascript.rhino.Node node25 = node18.cloneNode();
        java.lang.Object obj27 = null;
        node25.putProp(100, obj27);
        boolean boolean29 = node25.hasMoreThanOneChild();
        boolean boolean30 = inputId1.equals((java.lang.Object) node25);
        boolean boolean32 = inputId1.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str2, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0205");
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
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(100, "");
        node54.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node57 = node54.cloneTree();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(10, node57);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry49.createFunctionType(jSType50, node58);
        int int60 = functionType59.getMinArguments();
        int int61 = functionType59.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType59.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = objectType62.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = objectType62.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        int int78 = functionType76.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType79 = functionType76.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable80 = objectType79.getCtorExtendedInterfaces();
        objectType62.matchConstraint(objectType79);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = serializableList41.add((java.io.Serializable) objectType62);
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
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertNull(functionType64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(objectTypeIterable80);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0206");
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
        boolean boolean77 = functionType69.canBeCalled();
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0207");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder8 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder9 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder10 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder11 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder12 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder13 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder14 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList15 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder8, serializableCollectionBuilder9, serializableCollectionBuilder10, serializableCollectionBuilder11, serializableCollectionBuilder12, serializableCollectionBuilder13, serializableCollectionBuilder14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList24 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue32);
        boolean boolean34 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList33);
        int int36 = serializableList24.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = node48.copyInformationFromForTree(node52);
        boolean boolean54 = node52.isObjectLit();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.isObjectLit();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node62 = node57.copyInformationFromForTree(node61);
        boolean boolean63 = node62.isTrue();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(41, node40, node52, node62);
        int int65 = serializableList24.lastIndexOf((java.lang.Object) node62);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder66 = serializableCollectionBuilder11.add((java.util.Collection<java.io.Serializable>) serializableList24);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder67 = serializableCollectionBuilder4.add((java.util.Collection<java.io.Serializable>) serializableList24);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList15);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(serializableList24);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(serializableCollectionBuilder66);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder67);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0208");
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
        boolean boolean57 = functionType53.isArrayType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType53.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumType enumType59 = functionType53.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType60 = enumType59.autobox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertNull(enumType59);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0209");
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
        java.util.Spliterator<java.lang.String> strSpliterator44 = strSet43.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator44);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0210");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        java.lang.String str4 = ternaryValue0.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0211");
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
        boolean boolean17 = functionType11.isNumberObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry19.createFunctionType(jSType20, node28);
        int int30 = functionType29.getMinArguments();
        int int31 = functionType29.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType29.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        int int45 = functionType44.getMinArguments();
        boolean boolean46 = functionType29.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType44);
        java.lang.Iterable iterable47 = functionType29.getCtorImplementedInterfaces();
        boolean boolean48 = functionType11.hasEqualCallType(functionType29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType50 = functionType11.getTopMostDefiningType("hi!");
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(iterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0212");
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
        com.google.javascript.rhino.jstype.FunctionType functionType98 = enumType91.getOwnerFunction();
        com.google.javascript.rhino.jstype.EnumType enumType99 = enumType91.toMaybeEnumType();
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
        org.junit.Assert.assertNull(functionType98);
        org.junit.Assert.assertNotNull(enumType99);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0213");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isNoCompile();
        boolean boolean31 = jSDocInfo29.hasTypedefType();
        int int32 = jSDocInfo29.getImplementedInterfaceCount();
        functionType25.setPropertyJSDocInfo("", jSDocInfo29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = functionType25.getPossibleToBooleanOutcomes();
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
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType25, (com.google.javascript.rhino.jstype.JSType) functionType46);
        java.lang.String str57 = functionType46.getDisplayName();
        boolean boolean58 = functionType46.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
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
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0214");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Function");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0215");
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
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        boolean boolean25 = node23.isAdd();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        int int29 = node28.getLineno();
        boolean boolean30 = node28.isLabelName();
        boolean boolean31 = node28.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList32 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14, (java.lang.Cloneable) node23, (java.lang.Cloneable) node28);
        java.lang.Appendable appendable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            node14.appendStringTree(appendable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cloneableList32);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0216");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        boolean boolean37 = serializableList27.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        int int39 = serializableList27.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList27.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor41 = serializableList27.iterator();
        node14.putProp(54, (java.lang.Object) serializableList27);
        // The following exception was thrown during execution in test generation
        try {
            serializableList27.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor41);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0217");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = node2.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0218");
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
        boolean boolean25 = node17.hasChildren();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "[10, 1, 4, -1, a, 100.0, 100.0, true]", 44, 42);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(38, node17, node30, node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean41 = node40.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node40);
        com.google.javascript.rhino.Node node43 = null;
        node17.addChildrenAfter(node42, node43);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(36, node17, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0219");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isLabelName();
        node6.setSourceFileForTesting("hi!");
        node6.setType(1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        node17.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node20 = node17.cloneTree();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node20);
        boolean boolean22 = node20.isDo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = node6.clonePropsFrom(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0220");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        node29.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = node29.cloneTree();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(10, node32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry24.createFunctionType(jSType25, node33);
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
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        node56.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node59 = node56.cloneTree();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(10, node59);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry51.createFunctionType(jSType52, node60);
        int int62 = functionType61.getMinArguments();
        boolean boolean63 = functionType46.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry24.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        int int78 = functionType76.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry24.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = jSTypeRegistry24.getErrorReporter();
        jSTypeRegistry24.forwardDeclareType("true");
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.add(38, (java.io.Serializable) jSTypeRegistry24);
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNull(errorReporter80);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0221");
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
        functionType38.clearResolved();
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = functionType38.canTestForShallowEqualityWith(jSType43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0222");
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
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType56.toMaybeFunctionType();
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
        org.junit.Assert.assertNull(functionType57);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0223");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.lang.String str6 = jSDocInfo0.toString();
        boolean boolean7 = jSDocInfo0.isExpose();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0224");
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
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createInterfaceType("INSTANCEOF 49\n    OR \n", node45);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node48 = jSTypeRegistry39.createParameters(jSTypeList47);
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
        org.junit.Assert.assertNotNull(functionType46);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0225");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        boolean boolean2 = node1.isContinue();
        boolean boolean3 = node1.isString();
        boolean boolean4 = node1.isTry();
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0226");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0227");
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
        java.util.stream.Stream<java.io.Serializable> serializableStream42 = serializableList8.stream();
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
        org.junit.Assert.assertNotNull(serializableStream42);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0228");
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
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType46.getPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        node61.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node64 = node61.cloneTree();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry56.createFunctionType(jSType57, node65);
        int int67 = functionType66.getMinArguments();
        int int68 = functionType66.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = objectType69.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = objectType69.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        int int84 = functionType83.getMinArguments();
        int int85 = functionType83.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = functionType83.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable87 = objectType86.getCtorExtendedInterfaces();
        objectType69.matchConstraint(objectType86);
        boolean boolean89 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) objectType54, (com.google.javascript.rhino.jstype.JSType) objectType69);
        com.google.javascript.rhino.JSDocInfo jSDocInfo91 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str92 = jSDocInfo91.getDeprecationReason();
        boolean boolean93 = jSDocInfo91.hasFileOverview();
        boolean boolean94 = jSDocInfo91.isExterns();
        boolean boolean95 = jSDocInfo91.isImplicitCast();
        int int96 = jSDocInfo91.getParameterCount();
        objectType69.setPropertyJSDocInfo("JSDocInfo", jSDocInfo91);
        com.google.javascript.rhino.jstype.FunctionType functionType98 = objectType69.getConstructor();
        java.util.Set<java.lang.String> strSet99 = functionType98.getOwnPropertyNames();
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
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(functionType71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNotNull(objectTypeIterable87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(functionType98);
        org.junit.Assert.assertNotNull(strSet99);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0229");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0230");
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
        com.google.javascript.rhino.Node node27 = functionType17.getParametersNode();
        boolean boolean28 = node27.hasOneChild();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0231");
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
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str35 = node31.checkTreeEquals(node34);
        boolean boolean36 = node34.isCall();
        boolean boolean37 = node34.isRegExp();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable38 = serializableList8.set(41, (java.io.Serializable) boolean37);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0232");
        java.io.IOException iOException1 = new java.io.IOException("Function");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: Function" + "'", str3, "java.io.IOException: Function");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0233");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesThis();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0234");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getReferences();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0235");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = parameterizedType63.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0236");
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
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        node30.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node33 = node30.cloneTree();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(10, node33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry25.createFunctionType(jSType26, node34);
        int int36 = functionType35.getMinArguments();
        boolean boolean37 = functionType35.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType35.getImplementedInterfaces();
        java.lang.Iterable iterable39 = functionType35.getCtorImplementedInterfaces();
        boolean boolean40 = functionType17.hasEqualCallType(functionType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType35.restrictByNotNullOrUndefined();
        functionType35.clearCachedValues();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertNotNull(iterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType41);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0237");
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
        boolean boolean23 = functionType11.isInstanceType();
        java.util.Set<java.lang.String> strSet24 = functionType11.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue41);
        boolean boolean43 = serializableList33.containsAll((java.util.Collection<java.io.Serializable>) serializableList42);
        boolean boolean45 = serializableList42.equals((java.lang.Object) 16);
        java.lang.Object obj46 = null;
        boolean boolean47 = serializableList42.equals(obj46);
        java.lang.Object[] objArray48 = serializableList42.toArray();
        boolean boolean49 = strSet24.retainAll((java.util.Collection<java.io.Serializable>) serializableList42);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition50 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition51 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition52 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition53 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList54 = com.google.common.collect.ImmutableList.of(typePosition50, typePosition51, typePosition52, typePosition53);
        typePosition53.setPositionInformation(0, 2, 10, (int) '4');
        com.google.javascript.rhino.Node node60 = typePosition53.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition61 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition62 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition63 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition64 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList65 = com.google.common.collect.ImmutableList.of(typePosition61, typePosition62, typePosition63, typePosition64);
        com.google.javascript.rhino.Node node66 = typePosition62.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition67 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition67.setPositionInformation(2, 45, 46, 10);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition73 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition74 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition75 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition76 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList77 = com.google.common.collect.ImmutableList.of(typePosition73, typePosition74, typePosition75, typePosition76);
        typePosition76.setPositionInformation(0, 2, 10, (int) '4');
        com.google.javascript.rhino.Node node83 = typePosition76.getItem();
        boolean boolean84 = typePosition76.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition85 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition86 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition87 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition88 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList89 = com.google.common.collect.ImmutableList.of(typePosition85, typePosition86, typePosition87, typePosition88);
        typePosition88.setPositionInformation(0, 2, 10, (int) '4');
        com.google.javascript.rhino.Node node95 = typePosition88.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray96 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition53, typePosition62, typePosition67, typePosition76, typePosition88 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray97 = serializableList42.toArray(typePositionArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typePositionList54);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(typePositionList65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(typePositionList77);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(typePositionList89);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertNotNull(typePositionArray96);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0238");
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
        boolean boolean68 = functionType57.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0239");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getOriginalCommentString();
        boolean boolean10 = jSDocInfo8.hasBaseType();
        node2.setJSDocInfo(jSDocInfo8);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec13 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = node25.copyInformationFromForTree(node29);
        boolean boolean31 = node29.isObjectLit();
        boolean boolean32 = node29.isFromExterns();
        boolean boolean33 = node29.wasEmptyNode();
        boolean boolean34 = node29.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship35 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node21, node29);
        boolean boolean36 = node29.isTypeOf();
        com.google.javascript.rhino.Node node37 = assertionFunctionSpec13.getAssertedParam(node29);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        node44.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType53 = assertionFunctionSpec13.getAssertedType(node44, jSTypeRegistry51);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        boolean boolean56 = node55.isContinue();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildrenAfter(node44, node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0240");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isDec();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0241");
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
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node58 = node53.copyInformationFromForTree(node57);
        boolean boolean59 = node57.isObjectLit();
        boolean boolean60 = node57.isSwitch();
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node57);
        boolean boolean62 = node57.isDec();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean66 = node65.isObjectLit();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node70 = node65.copyInformationFromForTree(node69);
        boolean boolean71 = node65.isComma();
        java.lang.String str72 = node65.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType73 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node81 = node76.copyInformationFromForTree(node80);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean85 = node84.isObjectLit();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node89 = node84.copyInformationFromForTree(node88);
        boolean boolean90 = node88.isObjectLit();
        boolean boolean91 = node88.isFromExterns();
        boolean boolean92 = node88.wasEmptyNode();
        boolean boolean93 = node88.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship94 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType73, node80, node88);
        boolean boolean95 = node88.hasMoreThanOneChild();
        boolean boolean96 = node88.isThis();
        com.google.javascript.rhino.Node node97 = new com.google.javascript.rhino.Node(35, node57, node65, node88);
        int int98 = serializableList8.lastIndexOf((java.lang.Object) node97);
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
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "OR \n" + "'", str72, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType73 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType73.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0242");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        int int6 = node5.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.srcrefTree(node13);
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node17);
        com.google.javascript.rhino.Node node20 = null;
        node2.addChildAfter(node17, node20);
        node2.setVarArgs(false);
        boolean boolean24 = node2.isCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0243");
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
        boolean boolean17 = functionType11.removeProperty("OR \n");
        boolean boolean19 = functionType11.isPropertyTypeDeclared("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0244");
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
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("OR \n");
        com.google.javascript.rhino.Node node49 = node46.srcrefTree(node48);
        boolean boolean50 = strSet44.equals((java.lang.Object) node49);
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
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0245");
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
        java.lang.String str17 = null; // flaky: functionType11.toString();
        boolean boolean18 = functionType11.hasImplementedInterfaces();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0246");
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
        com.google.javascript.rhino.jstype.JSType jSType96 = enumType91.getPropertyType("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.jstype.ObjectType objectType97 = enumType91.getImplicitPrototype();
        boolean boolean98 = enumType91.isNativeObjectType();
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
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0247");
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
        int int18 = node14.getType();
        int int19 = node14.getLineno();
        boolean boolean20 = node14.isDebugger();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildrenToBack(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0248");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str6 = node2.checkTreeEquals(node5);
        boolean boolean7 = node5.isCall();
        boolean boolean8 = node5.isNew();
        boolean boolean9 = node5.wasEmptyNode();
        node5.setSourceFileForTesting("Function");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0249");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        int int5 = node2.getLength();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0250");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setReturnsTainted();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0251");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        int int5 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getAuthors();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0252");
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
        boolean boolean99 = enumType91.matchesNumberContext();
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0253");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType26.getTopMostDefiningType("Function");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0254");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot17 = functionType11.getSlot("true");
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = functionType11.getTemplateTypeNames();
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
        java.lang.String str38 = null; // flaky: functionType36.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = null;
        functionType36.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo40);
        boolean boolean42 = functionType36.hasCachedValues();
        boolean boolean43 = functionType36.matchesObjectContext();
        boolean boolean44 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType36.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(staticSlot17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Function" + "'", str38, "Function");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0255");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 12, 37);
        boolean boolean5 = node4.isAssign();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType6 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isObjectLit();
        boolean boolean24 = node21.isFromExterns();
        boolean boolean25 = node21.wasEmptyNode();
        boolean boolean26 = node21.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship27 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType6, node13, node21);
        com.google.javascript.rhino.Node node28 = node21.cloneNode();
        java.lang.Object obj30 = null;
        node28.putProp(100, obj30);
        node28.putBooleanProp(0, true);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType36 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean40 = node39.isObjectLit();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node44 = node39.copyInformationFromForTree(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node52 = node47.copyInformationFromForTree(node51);
        boolean boolean53 = node51.isObjectLit();
        boolean boolean54 = node51.isFromExterns();
        boolean boolean55 = node51.wasEmptyNode();
        boolean boolean56 = node51.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship57 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType36, node43, node51);
        boolean boolean58 = node51.isTypeOf();
        boolean boolean59 = node51.hasChildren();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(45, "[10, 1, 4, -1, a, 100.0, 100.0, true]", 44, 42);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(38, node51, node64, node70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0, node4, node28, node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + subclassType6 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType6.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + subclassType36 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType36.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0256");
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
        boolean boolean17 = functionType11.isNumberValueType();
        boolean boolean18 = functionType11.isNullable();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0257");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList4 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3);
        int int5 = typePosition3.getPositionOnEndLine();
        int int6 = typePosition3.getStartLine();
        org.junit.Assert.assertNotNull(typePositionList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0258");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        int int31 = serializableList27.lastIndexOf((java.lang.Object) (-1.0f));
        java.util.stream.Stream<java.io.Serializable> serializableStream32 = serializableList27.parallelStream();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(serializableStream32);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0259");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        com.google.javascript.rhino.Node node9 = node3.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node9.getExistingIntProp(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0260");
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
        boolean boolean43 = functionType38.isTemplateType();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0261");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        node2.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        node5.removeProp((-1));
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0262");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) '4', node22, 49, 45);
        boolean boolean26 = node25.isVar();
        com.google.javascript.rhino.Node node28 = node25.getAncestor((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = serializableList17.add((java.io.Serializable) node28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0263");
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
        boolean boolean68 = node20.isCatch();
        boolean boolean69 = node20.isThrow();
        boolean boolean70 = node20.hasOneChild();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0264");
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
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node73);
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
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0265");
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
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        jSTypeRegistry27.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = jSTypeRegistry27.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        node37.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = node37.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry32.createFunctionType(jSType33, node41);
        int int43 = functionType42.getMinArguments();
        boolean boolean44 = functionType42.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry27.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType42.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        boolean boolean48 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType46, jSType47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = serializableList23.add((java.io.Serializable) boolean48);
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
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0266");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        jSTypeRegistry32.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = jSTypeRegistry32.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        jSTypeRegistry32.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType48);
        java.lang.String str50 = null; // flaky: functionType48.toString();
        boolean boolean51 = functionType48.isFunctionPrototypeType();
        boolean boolean52 = functionType48.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType48.getExtendedInterfaces();
        com.google.javascript.rhino.Node node54 = functionType48.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType48.getPropertyType("INSTANCEOF 49\n    OR \n");
        // The following exception was thrown during execution in test generation
        try {
            serializableList27.add((int) ' ', (java.io.Serializable) "INSTANCEOF 49\n    OR \n");
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
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Function" + "'", str50, "Function");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0267");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 4);
        java.lang.Object obj3 = node1.getProp(0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0268");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getOriginalCommentString();
        boolean boolean2 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0269");
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
        com.google.javascript.rhino.Node node27 = functionType17.getParametersNode();
        java.lang.String str28 = functionType17.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = jSTypeRegistry31.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        boolean boolean48 = functionType46.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry31.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry31.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        boolean boolean64 = functionType62.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        boolean boolean78 = functionType76.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType76.getImplementedInterfaces();
        java.lang.Iterable iterable80 = functionType76.getCtorImplementedInterfaces();
        boolean boolean81 = functionType76.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean83 = jSDocInfo82.isNoCompile();
        boolean boolean84 = jSDocInfo82.hasTypedefType();
        functionType76.setJSDocInfo(jSDocInfo82);
        com.google.javascript.rhino.jstype.ObjectType.Property property87 = functionType76.getSlot("hi!");
        boolean boolean88 = functionType76.isInstanceType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry31.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType62, (com.google.javascript.rhino.jstype.JSType) functionType76);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType90 = functionType17.resolve(errorReporter29, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertNotNull(iterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(parameterizedType89);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0270");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        int int6 = node5.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.srcrefTree(node13);
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node17);
        com.google.javascript.rhino.Node node20 = null;
        node2.addChildAfter(node17, node20);
        node2.setLength((int) '#');
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0271");
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
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType38.getPropertyType("Not declared as a type name");
        boolean boolean45 = jSType44.isInterface();
        boolean boolean46 = jSType44.isFunctionType();
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
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0272");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str17 = null; // flaky: functionType15.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry19.createFunctionType(jSType20, node28);
        int int30 = functionType29.getMinArguments();
        int int31 = functionType29.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType29.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        int int45 = functionType44.getMinArguments();
        boolean boolean46 = functionType29.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean47 = functionType29.isNoType();
        boolean boolean48 = functionType29.isConstructor();
        boolean boolean49 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean50 = functionType29.isUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Function" + "'", str17, "Function");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0273");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean3 = node2.isGetterDef();
        node2.setString("Function");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0274");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        // The following exception was thrown during execution in test generation
        try {
            node6.setDouble(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: INSTANCEOF 49 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0275");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        boolean boolean11 = node2.isNull();
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
        node2.putProp((int) '4', (java.lang.Object) node35);
        boolean boolean37 = node35.isInc();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0276");
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
        boolean boolean45 = functionType11.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isNoCompile();
        boolean boolean49 = jSDocInfo47.hasTypedefType();
        java.lang.String str50 = jSDocInfo47.getBlockDescription();
        boolean boolean51 = jSDocInfo47.isNoShadow();
        int int52 = jSDocInfo47.getParameterCount();
        jSDocInfo47.setLicense("");
        functionType11.setPropertyJSDocInfo("[10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo47);
        jSDocInfo47.setLicense("");
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = jSDocInfo47.getTemplateTypeNames();
        boolean boolean59 = jSDocInfo47.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet60 = jSDocInfo47.getModifies();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        jSTypeRegistry62.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = jSTypeRegistry62.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        node73.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node76 = node73.cloneTree();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(10, node76);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry68.createFunctionType(jSType69, node77);
        jSTypeRegistry62.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType78);
        java.lang.String str80 = null; // flaky: functionType78.toString();
        boolean boolean81 = functionType78.isFunctionPrototypeType();
        boolean boolean82 = functionType78.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType78.getExtendedInterfaces();
        boolean boolean84 = functionType78.isReturnTypeInferred();
        boolean boolean85 = functionType78.isConstructor();
        boolean boolean86 = functionType78.isRecordType();
        boolean boolean87 = strSet60.equals((java.lang.Object) boolean86);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(functionType78);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Function" + "'", str80, "Function");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0277");
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
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        jSTypeRegistry23.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = jSTypeRegistry23.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        node34.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node37 = node34.cloneTree();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(10, node37);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry29.createFunctionType(jSType30, node38);
        jSTypeRegistry23.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.lang.String str41 = null; // flaky: functionType39.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = null;
        functionType39.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo43);
        boolean boolean45 = functionType39.hasCachedValues();
        boolean boolean46 = functionType39.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType39.getBindReturnType(1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        int int61 = functionType60.getMinArguments();
        boolean boolean62 = functionType60.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = functionType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType60);
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType60.getPropertyType("(INSTANCEOF 49\n    OR \n)");
        node7.setJSType(jSType65);
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
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(functionType39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Function" + "'", str41, "Function");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(jSType65);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0278");
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
        boolean boolean37 = node34.isNumber();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder38 = node34.getJsDocBuilderForNode();
        fileLevelJsDocBuilder38.append("Unknown class name");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder38);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0279");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node2.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0280");
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
        java.lang.String str48 = node14.toString();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "OR " + "'", str48, "OR ");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0281");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        node3.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(10, node6);
        boolean boolean8 = node6.isNull();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0282");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        java.lang.String str11 = node2.getSourceFileName();
        node2.setLength(32);
        boolean boolean14 = node2.isNumber();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0283");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Unknown class name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0284");
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
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        boolean boolean28 = node6.isSwitch();
        // The following exception was thrown during execution in test generation
        try {
            node6.setSideEffectFlags((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0285");
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
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        int int30 = node29.getLineno();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = node33.copyInformationFromForTree(node37);
        boolean boolean39 = node37.isObjectLit();
        boolean boolean40 = node37.isLabelName();
        com.google.javascript.rhino.Node node41 = node29.srcrefTree(node37);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = null;
        node41.setJSDocInfo(jSDocInfo43);
        boolean boolean46 = node41.getBooleanProp((int) (short) -1);
        boolean boolean47 = node41.isIf();
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
        com.google.javascript.rhino.jstype.JSType jSType91 = functionType87.collapseUnion();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable92 = functionType87.getParameters();
        boolean boolean93 = functionType87.isNoObjectType();
        int int94 = functionType87.getMaxArguments();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry1.createFromTypeNodes(node41, "Unknown class name", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: OR ");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
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
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertNotNull(nodeIterable92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0286");
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
        com.google.javascript.rhino.Node node96 = enumType91.getPropertyNode("true");
        boolean boolean98 = enumType91.isPropertyInExterns("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.jstype.FunctionType functionType99 = enumType91.getConstructor();
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
        org.junit.Assert.assertNull(node96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNull(functionType99);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0287");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        int int5 = jSDocInfo0.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0288");
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
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        node63.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node66 = node63.cloneTree();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry58.createFunctionType(jSType59, node67);
        int int69 = functionType68.getMinArguments();
        boolean boolean70 = functionType68.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType68.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType68.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean75 = functionType68.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType76 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = functionType53.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType53.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = jSType78.isParameterizedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNull(jSType78);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0289");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0290");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0291");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        boolean boolean9 = node2.isThrow();
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0292");
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
        int int26 = node17.getChildCount();
        com.google.javascript.rhino.Node node27 = node17.getParent();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0293");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("OR \n", 0, 35);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0294");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = node25.copyInformationFromForTree(node29);
        boolean boolean31 = node29.isObjectLit();
        boolean boolean32 = node29.isSwitch();
        boolean boolean33 = node16.isEquivalentToTyped(node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node41.isTrue();
        node29.addChildToFront(node41);
        com.google.javascript.rhino.jstype.JSType jSType44 = node41.getJSType();
        boolean boolean45 = node41.isDefaultCase();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        int int49 = node48.getLineno();
        boolean boolean50 = node48.isCall();
        java.lang.String str54 = node48.toString(false, true, false);
        boolean boolean55 = node48.isGetElem();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(51, node41, node48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "OR " + "'", str54, "OR ");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0295");
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
        node22.putBooleanProp(0, true);
        // The following exception was thrown during execution in test generation
        try {
            node22.setDouble((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0296");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        int int5 = node4.getLineno();
        boolean boolean6 = node4.isLabelName();
        boolean boolean7 = node4.isNumber();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(49, nodeArray8, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0297");
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
        boolean boolean28 = serializableItor27.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0298");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        jSDocInfo0.addSuppression("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str8 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0299");
        int int0 = com.google.javascript.rhino.Node.FLAG_GLOBAL_STATE_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0300");
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
        java.util.ListIterator<java.io.Serializable> serializableItor27 = serializableList8.listIterator();
        java.lang.Object[] objArray28 = serializableList8.toArray();
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
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = functionType70.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0302");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        jSDocInfo0.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0303");
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
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType46.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType46.getPropertyType("java.io.IOException: Named type with empty name component");
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
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0304");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry16.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        node26.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node29 = node26.cloneTree();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node29);
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry21.createFunctionType(jSType22, node30);
        int int32 = functionType31.getMinArguments();
        boolean boolean33 = functionType31.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry16.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType31);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean39 = node38.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newExpr(node38);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean44 = node43.isObjectLit();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node48 = node43.copyInformationFromForTree(node47);
        boolean boolean49 = node43.isTry();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean55 = node54.isObjectLit();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node59 = node54.copyInformationFromForTree(node58);
        boolean boolean60 = node54.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection61 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node54);
        com.google.javascript.rhino.Node node62 = node43.clonePropsFrom(node54);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(36, node40, node62);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean67 = node66.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newExpr(node66);
        com.google.javascript.rhino.Node node69 = node63.clonePropsFrom(node68);
        boolean boolean70 = node68.isAdd();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType31, node68);
        boolean boolean72 = functionType31.isUnknownType();
        boolean boolean73 = functionType31.hasCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeCollection61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0305");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        java.lang.String str7 = jSDocInfo0.getLicense();
        boolean boolean8 = jSDocInfo0.hasThisType();
        boolean boolean9 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0306");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean17 = functionType15.hasInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = functionType15.getOwnPropertyJSDocInfo("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo19);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0307");
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.io.Serializable>> serializableCollectionList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(serializableCollectionList0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0308");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Not declared as a constructor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0309");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "Not declared as a constructor", "JSDocInfo", "JSDocInfo", "OR ", "hi!", "Not declared as a type name", "Not declared as a constructor", "", "", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Function", "OR \n", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList28);
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.setLastGeneration(true);
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
        boolean boolean49 = functionType46.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        node56.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node59 = node56.cloneTree();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(10, node59);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry51.createFunctionType(jSType52, node60);
        int int62 = functionType61.getMinArguments();
        boolean boolean63 = functionType61.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType61.getImplementedInterfaces();
        java.lang.Iterable iterable65 = functionType61.getCtorImplementedInterfaces();
        boolean boolean66 = functionType61.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.isNoCompile();
        boolean boolean69 = jSDocInfo67.hasTypedefType();
        functionType61.setJSDocInfo(jSDocInfo67);
        com.google.javascript.rhino.jstype.ObjectType.Property property72 = functionType61.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable73 = functionType61.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        node80.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node83 = node80.cloneTree();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(10, node83);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry75.createFunctionType(jSType76, node84);
        int int86 = functionType85.getMinArguments();
        int int87 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean90 = jSDocInfo89.isNoCompile();
        boolean boolean91 = jSDocInfo89.hasTypedefType();
        int int92 = jSDocInfo89.getImplementedInterfaceCount();
        functionType85.setPropertyJSDocInfo("", jSDocInfo89);
        boolean boolean94 = functionType61.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.Iterable iterable95 = functionType85.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable96 = functionType85.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList97 = functionType85.getTemplateTypeNames();
        boolean boolean98 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType46, (com.google.javascript.rhino.jstype.JSType) functionType85);
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("unknown", (com.google.javascript.rhino.jstype.JSType) functionType85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNotNull(iterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(property72);
        org.junit.Assert.assertNotNull(objectTypeIterable73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(objectTypeIterable96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0310");
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
        boolean boolean68 = parameterizedType63.hasOwnProperty("true");
        com.google.javascript.rhino.jstype.FunctionType functionType69 = parameterizedType63.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType71 = functionType69.getRestrictedTypeGivenToBooleanOutcome(false);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionType69);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0311");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str6 = node2.checkTreeEquals(node5);
        boolean boolean7 = node2.hasOneChild();
        java.util.Set<java.lang.String> strSet8 = node2.getDirectives();
        node2.detachChildren();
        node2.setType(0);
        boolean boolean12 = node2.isBreak();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0312");
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
        java.lang.String str42 = assertionFunctionSpec1.getFunctionName();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "INSTANCEOF 49\n    OR \n" + "'", str42, "INSTANCEOF 49\n    OR \n");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0313");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = node15.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0314");
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
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        node63.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node66 = node63.cloneTree();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry58.createFunctionType(jSType59, node67);
        int int69 = functionType68.getMinArguments();
        boolean boolean70 = functionType68.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType68.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType68.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean75 = functionType68.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType76 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = functionType53.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType53.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = functionType53.getJSDocInfo();
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
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNull(jSDocInfo79);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0315");
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
        boolean boolean68 = parameterizedType63.hasOwnProperty("true");
        com.google.javascript.rhino.jstype.FunctionType functionType69 = parameterizedType63.getOwnerFunction();
        boolean boolean70 = parameterizedType63.isCheckedUnknownType();
        boolean boolean72 = parameterizedType63.hasProperty("Function.<Function>");
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType63.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType73);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0316");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor43 = serializableList8.listIterator(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (30) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0317");
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
        boolean boolean16 = node14.isIn();
        java.lang.String str17 = node14.toStringTree();
        java.lang.String str18 = node14.getString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OR \n" + "'", str17, "OR \n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0318");
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
        com.google.javascript.rhino.jstype.EnumType enumType94 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.EnumType> enumTypeList95 = com.google.common.collect.ImmutableList.of(enumType91, enumType94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 1");
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
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0319");
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
        boolean boolean70 = jSTypeRegistry39.isForwardDeclaredType("OR ");
        boolean boolean72 = jSTypeRegistry39.hasNamespace("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative73 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry39.getNativeType(jSTypeNative73);
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0320");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList9 = serializableList8.reverse();
        int int10 = serializableList8.size();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        node17.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node20 = node17.cloneTree();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node20);
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry12.createFunctionType(jSType13, node21);
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
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType34.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry12.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        node59.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node62 = node59.cloneTree();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(10, node62);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry54.createFunctionType(jSType55, node63);
        int int65 = functionType64.getMinArguments();
        int int66 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry12.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.isNoCompile();
        boolean boolean71 = jSDocInfo69.hasTypedefType();
        jSDocInfo69.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList74 = jSDocInfo69.getExtendedInterfaces();
        functionType64.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo69);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = functionType64.getBindReturnType((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = serializableList8.remove((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList74);
        org.junit.Assert.assertNotNull(functionType77);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0321");
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
        boolean boolean43 = jSType42.isNoType();
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0322");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.xor(ternaryValue3);
        boolean boolean6 = ternaryValue0.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0323");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Function.<Function>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0324");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        int int5 = jSDocInfo0.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility6);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0325");
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
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node14, "OR  [source_file: ]\n");
        boolean boolean19 = jSTypeExpression18.isOptionalArg();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0326");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node19.isObjectLit();
        boolean boolean22 = node19.isLabelName();
        node19.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(35, node19);
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
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        node47.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = node47.cloneTree();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(10, node50);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry42.createFunctionType(jSType43, node51);
        int int53 = functionType52.getMinArguments();
        int int54 = functionType52.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType52.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        node62.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node65 = node62.cloneTree();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(10, node65);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry57.createFunctionType(jSType58, node66);
        int int68 = functionType67.getMinArguments();
        boolean boolean69 = functionType52.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType67);
        boolean boolean70 = functionType38.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType67);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope71 = functionType67.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry1.createFromTypeNodes(node19, "Named type with empty name component", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: OR  [source_file: hi!]");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope71);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0327");
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
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType11.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jSType22.isRecordType();
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
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0328");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        node3.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(10, node6);
        boolean boolean8 = node6.isDo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0329");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.getType("");
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
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType25.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType25.autobox();
        functionType25.clearCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry34.getTypesWithProperty("hi!");
        jSTypeRegistry34.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        jSTypeRegistry49.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = jSTypeRegistry49.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry49.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        node61.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node64 = node61.cloneTree();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry56.createFunctionType(jSType57, node65);
        int int67 = functionType66.getMinArguments();
        int int68 = functionType66.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = objectType69.getCtorExtendedInterfaces();
        boolean boolean72 = objectType69.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(100, "");
        node79.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node82 = node79.cloneTree();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(10, node82);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry74.createFunctionType(jSType75, node83);
        int int85 = functionType84.getMinArguments();
        boolean boolean86 = functionType84.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType84.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { jSType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry49.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType69, jSTypeArray88);
        com.google.javascript.rhino.Node node90 = jSTypeRegistry34.createParameters(jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType25, false, jSTypeArray88);
        jSTypeRegistry1.incrementGeneration();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType91);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0330");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isNoCompile();
        boolean boolean8 = jSDocInfo6.hasTypedefType();
        java.lang.String str9 = jSDocInfo6.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo6.getAuthors();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasThisType();
        int int13 = jSDocInfo11.getParameterCount();
        boolean boolean14 = jSDocInfo11.hasThisType();
        boolean boolean15 = jSDocInfo11.hasReturnType();
        boolean boolean17 = jSDocInfo11.hasParameter("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean19 = jSDocInfo18.hasThisType();
        boolean boolean20 = jSDocInfo18.isConstant();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet22 = jSDocInfo21.getModifies();
        int int23 = jSDocInfo21.getImplementedInterfaceCount();
        java.lang.String str24 = jSDocInfo21.getBlockDescription();
        boolean boolean25 = jSDocInfo21.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray26 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo0, jSDocInfo6, jSDocInfo11, jSDocInfo18, jSDocInfo21 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList27 = com.google.common.collect.ImmutableList.of(jSDocInfoArray26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoArray26);
        org.junit.Assert.assertNotNull(jSDocInfoList27);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0331");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList34 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue33);
        boolean boolean35 = serializableList25.containsAll((java.util.Collection<java.io.Serializable>) serializableList34);
        int int37 = serializableList25.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node63 = node58.copyInformationFromForTree(node62);
        boolean boolean64 = node63.isTrue();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(41, node41, node53, node63);
        int int66 = serializableList25.lastIndexOf((java.lang.Object) node63);
        boolean boolean67 = strSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableList25);
        java.util.stream.Stream<java.io.Serializable> serializableStream68 = serializableList25.parallelStream();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(serializableStream68);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0332");
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
            node90.setDouble((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: INSTANCEOF is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0333");
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
        com.google.javascript.rhino.jstype.FunctionType functionType21 = functionType16.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = functionType21.getReferenceName();
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
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNull(functionType21);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0334");
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
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        node50.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node53 = node50.cloneTree();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(10, node53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry45.createFunctionType(jSType46, node54);
        int int56 = functionType55.getMinArguments();
        int int57 = functionType55.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str65 = node61.checkTreeEquals(node64);
        boolean boolean66 = objectType42.defineInferredProperty("true", (com.google.javascript.rhino.jstype.JSType) functionType55, node61);
        boolean boolean67 = node61.isLocalResultCall();
        java.lang.String str71 = node61.toString(false, false, false);
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
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "OR " + "'", str71, "OR ");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0335");
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
        java.util.Collection<java.io.Serializable> serializableCollection86 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = serializableList51.removeAll(serializableCollection86);
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0336");
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
        boolean boolean99 = functionType86.isInterface();
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0337");
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
        boolean boolean56 = functionType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot58 = functionType46.getSlot("");
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(staticSlot58);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0338");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getOriginalCommentString();
        boolean boolean11 = jSDocInfo9.hasBaseType();
        node3.setJSDocInfo(jSDocInfo9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean16 = node15.isGetterDef();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        int int20 = node19.getLineno();
        boolean boolean21 = node19.isCall();
        java.lang.String str25 = node19.toString(false, true, false);
        boolean boolean26 = node19.isGetElem();
        com.google.javascript.rhino.Node node27 = node19.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(30, node3, node15, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OR " + "'", str25, "OR ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0339");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean4 = node3.isOr();
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
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node33.isSetterDef();
        boolean boolean36 = node33.isString();
        com.google.javascript.rhino.Node node37 = node20.useSourceInfoIfMissingFrom(node33);
        boolean boolean38 = node3.isEquivalentTo(node20);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec40 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType41 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node49 = node44.copyInformationFromForTree(node48);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node57 = node52.copyInformationFromForTree(node56);
        boolean boolean58 = node56.isObjectLit();
        boolean boolean59 = node56.isFromExterns();
        boolean boolean60 = node56.wasEmptyNode();
        boolean boolean61 = node56.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship62 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType41, node48, node56);
        boolean boolean63 = node56.isTypeOf();
        com.google.javascript.rhino.Node node64 = assertionFunctionSpec40.getAssertedParam(node56);
        int int65 = node56.getChildCount();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean69 = node68.isObjectLit();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node73 = node68.copyInformationFromForTree(node72);
        boolean boolean74 = node72.isObjectLit();
        boolean boolean75 = node72.isLabelName();
        node72.setSourceFileForTesting("hi!");
        node72.setType(1);
        boolean boolean80 = node72.isReturn();
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node72);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 0, node20, node56, node72, (int) '#', 10);
        com.google.javascript.rhino.Node[] nodeArray85 = new com.google.javascript.rhino.Node[] { node56 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(49, nodeArray85, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + subclassType41 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType41.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(nodeArray85);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0340");
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
        boolean boolean42 = functionType26.isNativeObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType26.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0341");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setReturnsTainted();
        int int3 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.clearAllFlags();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0342");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray7 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry1.createUnionType(jSTypeNativeArray7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry1.createUnionType(jSTypeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray7);
        org.junit.Assert.assertNotNull(jSType8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0343");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0344");
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
        boolean boolean19 = functionType11.isPropertyInExterns("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType11.getTopMostDefiningType("java.io.IOException: Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0345");
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
        com.google.javascript.rhino.jstype.FunctionType functionType77 = functionType56.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            int int78 = functionType77.getMinArguments();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(functionType77);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0346");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        java.lang.String str4 = jSDocInfo0.getDeprecationReason();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0347");
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
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.getPropertyType("Named type with empty name component");
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
        org.junit.Assert.assertNotNull(jSType98);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0348");
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
        boolean boolean35 = functionType11.isUnionType();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0349");
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
        jSTypeRegistry1.identifyNonNullableName("");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        node45.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node48 = node45.cloneTree();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, node48);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry40.createFunctionType(jSType41, node49);
        int int51 = functionType50.getMinArguments();
        boolean boolean52 = functionType50.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType50.getImplementedInterfaces();
        java.lang.Iterable iterable54 = functionType50.getCtorImplementedInterfaces();
        boolean boolean55 = functionType50.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.isNoCompile();
        boolean boolean58 = jSDocInfo56.hasTypedefType();
        functionType50.setJSDocInfo(jSDocInfo56);
        com.google.javascript.rhino.jstype.ObjectType.Property property61 = functionType50.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = functionType50.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        node69.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node72 = node69.cloneTree();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(10, node72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry64.createFunctionType(jSType65, node73);
        int int75 = functionType74.getMinArguments();
        int int76 = functionType74.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean79 = jSDocInfo78.isNoCompile();
        boolean boolean80 = jSDocInfo78.hasTypedefType();
        int int81 = jSDocInfo78.getImplementedInterfaceCount();
        functionType74.setPropertyJSDocInfo("", jSDocInfo78);
        boolean boolean83 = functionType50.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString(100, "");
        node90.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node93 = node90.cloneTree();
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(10, node93);
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry85.createFunctionType(jSType86, node94);
        int int96 = functionType95.getMinArguments();
        boolean boolean97 = functionType95.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType98 = functionType95.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType99 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType74, (com.google.javascript.rhino.jstype.JSType) functionType95);
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
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(iterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(property61);
        org.junit.Assert.assertNotNull(objectTypeIterable62);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(objectType98);
        org.junit.Assert.assertNotNull(functionType99);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0350");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean3 = node2.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("OR \n");
        com.google.javascript.rhino.Node node9 = node6.srcrefTree(node8);
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        int int14 = node13.getLineno();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isObjectLit();
        boolean boolean24 = node21.isLabelName();
        com.google.javascript.rhino.Node node25 = node13.srcrefTree(node21);
        com.google.javascript.rhino.jstype.JSType jSType26 = node25.getJSType();
        int int27 = node9.getIndexOfChild(node25);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0351");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(1, "");
        node3.removeProp(4095);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isArrayLit();
        node11.setLength((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node23 = node18.copyInformationFromForTree(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node30.isObjectLit();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = node35.copyInformationFromForTree(node39);
        boolean boolean41 = node40.isTrue();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(41, node18, node30, node40);
        com.google.javascript.jscomp.CodingConvention.Bind bind43 = new com.google.javascript.jscomp.CodingConvention.Bind(node8, node11, node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node7, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0352");
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
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isSetterDef();
        boolean boolean31 = node28.isString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoIfMissingFrom(node28);
        boolean boolean33 = node28.isString();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0353");
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
        java.util.AbstractSet[] abstractSetArray48 = new java.util.AbstractSet[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray49 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray48;
        strSetArray49[0] = strSet20;
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList52 = com.google.common.collect.ImmutableList.of(strSetArray49);
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
        org.junit.Assert.assertNotNull(abstractSetArray48);
        org.junit.Assert.assertNotNull(strSetArray49);
        org.junit.Assert.assertNotNull(strSetList52);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0354");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str94 = jSDocInfo93.getOriginalCommentString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList95 = jSDocInfo93.getThrownTypes();
        enumType91.setPropertyJSDocInfo("[10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo93);
        boolean boolean97 = jSDocInfo93.isConstructor();
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
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(jSTypeExpressionList95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0355");
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
        java.util.stream.Stream<java.io.Serializable> serializableStream33 = serializableList27.parallelStream();
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
        org.junit.Assert.assertNotNull(serializableStream33);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0356");
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
        com.google.javascript.rhino.Node node96 = enumType91.getPropertyNode("true");
        boolean boolean98 = enumType91.isPropertyInExterns("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean99 = enumType91.matchesNumberContext();
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
        org.junit.Assert.assertNull(node96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0357");
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
        int int99 = enumElementType96.getPropertiesCount();
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
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0358");
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
        com.google.javascript.rhino.jstype.JSType jSType99 = enumElementType96.findPropertyType("Not declared as a type name");
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
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0359");
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
        java.lang.String str26 = node17.getString();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        node17.addChildrenToFront(node29);
        boolean boolean31 = node29.isNot();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0360");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node7.copyInformationFromForTree(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node29.isTrue();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(41, node7, node19, node29);
        node19.setString("hi!");
        typePosition0.setItem(node19);
        boolean boolean35 = node19.isReturn();
        node19.setLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0361");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = functionType11.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType11.getOwnerFunction();
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
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(functionType25);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0362");
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
        java.lang.String str26 = node17.getString();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        boolean boolean28 = node17.isLabelName();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0363");
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
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType60.getImplicitPrototype();
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
        org.junit.Assert.assertNotNull(objectType69);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0364");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("hi!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0365");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(10, (-1), 40960);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0366");
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
        boolean boolean99 = enumElementType96.hasProperty("Not declared as a constructor");
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0367");
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
        boolean boolean70 = parameterizedType63.isNoResolvedType();
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0368");
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
        java.lang.String str99 = enumElementType96.getReferenceName();
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
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str99, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0369");
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
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node49 = node44.copyInformationFromForTree(node48);
        boolean boolean50 = node44.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection51 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node44);
        com.google.javascript.rhino.Node node52 = assertionFunctionSpec1.getAssertedParam(node44);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        node60.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node63 = node60.cloneTree();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(10, node63);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry55.createFunctionType(jSType56, node64);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable67 = jSTypeRegistry55.getTypesWithProperty("hi!");
        java.lang.String[] strArray81 = new java.lang.String[] { "Not declared as a constructor", "JSDocInfo", "JSDocInfo", "OR ", "hi!", "Not declared as a type name", "Not declared as a constructor", "", "", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Function", "OR \n", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        jSTypeRegistry55.setTemplateTypeNames((java.util.List<java.lang.String>) strList82);
        jSTypeRegistry55.incrementGeneration();
        com.google.javascript.rhino.jstype.JSType jSType86 = assertionFunctionSpec1.getAssertedType(node53, jSTypeRegistry55);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative87 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry55.getNativeObjectType(jSTypeNative87);
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
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeCollection51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(jSTypeIterable67);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(jSType86);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0370");
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
        boolean boolean95 = enumType91.hasOwnProperty("(INSTANCEOF 49\n    OR \n)");
        java.lang.Iterable iterable96 = enumType91.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.getPropertyType("OR ");
        com.google.javascript.rhino.jstype.EnumType enumType99 = enumType91.toMaybeEnumType();
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(iterable96);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNotNull(enumType99);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0371");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        boolean boolean13 = node6.hasChild(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node17.getLastChild();
        boolean boolean19 = node17.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceChild(node14, node17);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0372");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0373");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean12 = node3.isThis();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
        // The following exception was thrown during execution in test generation
        try {
            node3.setDouble((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  [source_file: ] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0374");
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
        boolean boolean45 = functionType11.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isNoCompile();
        boolean boolean49 = jSDocInfo47.hasTypedefType();
        java.lang.String str50 = jSDocInfo47.getBlockDescription();
        boolean boolean51 = jSDocInfo47.isNoShadow();
        int int52 = jSDocInfo47.getParameterCount();
        jSDocInfo47.setLicense("");
        functionType11.setPropertyJSDocInfo("[10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo47);
        jSDocInfo47.setLicense("");
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = jSDocInfo47.getTemplateTypeNames();
        boolean boolean59 = jSDocInfo47.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet60 = jSDocInfo47.getModifies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = strSet60.add("OR ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0375");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        java.lang.Object obj4 = node2.getProp(30);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(40, node2, (int) (short) -1, 31);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags9 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags9.setReturnsTainted();
        // The following exception was thrown during execution in test generation
        try {
            node7.setSideEffectFlags(sideEffectFlags9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0376");
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
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = parameterizedType63.setValidator(jSTypePredicate65);
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
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0377");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        int int6 = node5.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.srcrefTree(node13);
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node17);
        com.google.javascript.rhino.Node node20 = null;
        node2.addChildAfter(node17, node20);
        node2.setVarArgs(false);
        java.lang.String str24 = node2.toStringTree();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "BITXOR \n    OR \n" + "'", str24, "BITXOR \n    OR \n");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0378");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("OR  [source_file: ]\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0379");
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
        java.lang.String str42 = functionType38.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        boolean boolean56 = functionType54.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType54.restrictByNotNullOrUndefined();
        functionType38.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType54);
        boolean boolean59 = functionType54.isFunctionPrototypeType();
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0380");
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
        boolean boolean96 = enumType91.removeProperty("(INSTANCEOF 49\n    OR \n)");
        boolean boolean97 = enumType91.isNativeObjectType();
        com.google.javascript.rhino.Node node99 = enumType91.getPropertyNode("Unknown class name");
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(node99);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0381");
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
        functionType24.clearCachedValues();
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
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0382");
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
        boolean boolean55 = functionType46.hasCachedValues();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0383");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        int int31 = serializableList27.lastIndexOf((java.lang.Object) (-1.0f));
        java.util.stream.Stream<java.io.Serializable> serializableStream32 = serializableList27.parallelStream();
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = serializableList27.add((java.io.Serializable) node58);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(serializableStream32);
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
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0384");
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
        java.io.IOException iOException19 = new java.io.IOException("");
        java.lang.Throwable throwable21 = null;
        java.io.IOException iOException22 = new java.io.IOException("hi!", throwable21);
        java.lang.Throwable throwable24 = null;
        java.io.IOException iOException25 = new java.io.IOException("hi!", throwable24);
        java.io.IOException iOException27 = new java.io.IOException("");
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.io.IOException iOException33 = new java.io.IOException("");
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList35 = com.google.common.collect.ImmutableList.of(iOException19, iOException22, iOException25, iOException28, iOException31, iOException34);
        iOException1.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray38 = iOException19.getSuppressed();
        org.junit.Assert.assertNotNull(iOExceptionList17);
        org.junit.Assert.assertNotNull(iOExceptionList35);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0385");
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
        com.google.javascript.rhino.Node node27 = functionType17.getParametersNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot29 = functionType17.getOwnSlot("Not declared as a constructor");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        node37.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = node37.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry32.createFunctionType(jSType33, node41);
        int int43 = functionType42.getMinArguments();
        boolean boolean44 = functionType42.isUnknownType();
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
        boolean boolean74 = functionType42.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType42.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType76 = functionType17.resolve(errorReporter30, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(jSTypeStaticSlot29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(jSType75);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0386");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node2.getJSDocInfo();
        boolean boolean10 = node2.isQuotedString();
        com.google.javascript.rhino.Node node11 = node2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            node11.setWasEmptyNode(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0387");
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
        com.google.javascript.rhino.jstype.TemplateType templateType69 = parameterizedType63.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = templateType69.isFunctionType();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(unionType68);
        org.junit.Assert.assertNull(templateType69);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0388");
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
            com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry1.getNativeType(jSTypeNative29);
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0389");
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
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType11.getImplicitPrototype();
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
        org.junit.Assert.assertNotNull(objectType46);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0390");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "JSDocInfo", 32, 39);
        java.lang.String str5 = node4.getQualifiedName();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0391");
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
        boolean boolean64 = jSType63.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType63.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSType65);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0392");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot59 = functionType56.getSlot("Named type with empty name component");
        com.google.javascript.rhino.jstype.StaticSlot staticSlot61 = functionType56.getSlot("Not declared as a constructor");
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
        org.junit.Assert.assertNull(staticSlot59);
        org.junit.Assert.assertNull(staticSlot61);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0393");
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
        com.google.javascript.rhino.Node node55 = node48.cloneNode();
        boolean boolean56 = serializableList27.contains((java.lang.Object) node48);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        node63.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node66 = node63.cloneTree();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry58.createFunctionType(jSType59, node67);
        int int69 = functionType68.getMinArguments();
        boolean boolean70 = functionType68.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType68.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType68.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType68);
        java.lang.String str74 = null; // flaky: functionType68.toAnnotationString();
        boolean boolean75 = functionType68.isVoidType();
        boolean boolean76 = functionType68.hasImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = serializableList27.add((java.io.Serializable) functionType68);
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
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(objectType73);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Function" + "'", str74, "Function");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0394");
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        fileLevelJsDocBuilder26.append("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
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
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0395");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("InputId: Not declared as a constructor");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(InputId: Not declared as a constructor)" + "'", str1, "(InputId: Not declared as a constructor)");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0396");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isNoCompile();
        boolean boolean31 = jSDocInfo29.hasTypedefType();
        int int32 = jSDocInfo29.getImplementedInterfaceCount();
        functionType25.setPropertyJSDocInfo("", jSDocInfo29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = functionType25.getPossibleToBooleanOutcomes();
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
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType25, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        int int71 = functionType69.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean74 = jSDocInfo73.isNoCompile();
        boolean boolean75 = jSDocInfo73.hasTypedefType();
        int int76 = jSDocInfo73.getImplementedInterfaceCount();
        functionType69.setPropertyJSDocInfo("", jSDocInfo73);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = functionType69.getPossibleToBooleanOutcomes();
        int int79 = functionType69.getPropertiesCount();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean83 = node82.isUnscopedQualifiedName();
        node82.setSourceFileForTesting("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType69, node82);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType87 = functionType86.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
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
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(errorReporter57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType86);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0397");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node2);
        java.lang.String str9 = node2.toString(false, false, true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OR " + "'", str9, "OR ");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0398");
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
        boolean boolean42 = jSType41.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = jSType41.canAssignTo(jSType43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0399");
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
        boolean boolean98 = node95.isFromExterns();
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
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0400");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }
}
